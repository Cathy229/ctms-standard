package com.sinotrans.oms.businessrequest.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EobrManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEorb2EosrManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoBookingService;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeService;
import com.sinotrans.oms.businessrequest.service.EoRequestSendEmailService;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.tool.SendMailUtil;
import com.sinotrans.oms.common.util.DateUtil;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.fileupload.manager.EbFileManager;
import com.sinotrans.oms.fileupload.model.EbFileModel;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsUserModel;

import aj.org.objectweb.asm.Label;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Alignment;
import jxl.format.VerticalAlignment;
import jxl.read.biff.BiffException;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WriteException;
import jxl.write.WritableFont.FontName;
import jxl.write.biff.RowsExceededException;

/**  
* Title: EoRequestSendEmailServiceImpl  
* Description:  业务请求下达时，发送委托书给联系人，异步线程处理
* @author Shoven.Jiang  
* @date 2018年10月26日  
* @version 1.0  
*/
@Service
public class EoRequestSendEmailServiceImpl extends BaseAspect implements EoRequestSendEmailService {

	@Autowired
	private EoRequestTrailerService eoRequestTrailerService;
	@Autowired
	private EoBookingService eoBookingService;
	@Autowired
	private EoRequestDeclarationDeputeService eoRequestDeclarationDeputeService;
	@Autowired
	private EoRequestTrailerManager eoRequestTrailerManager;
	@Autowired
	private EoRequestDeclarationDeputeManager eoRequestDeclarationDeputeManager;
	@Autowired
	private EoRequestBookingManager eoRequestBookingManager;
	@Autowired
	private EoEooc2EoetManager eoEooc2EoetManager;
	@Autowired
	private EoEoom2EoetManager eoEoom2EoetManager;
	@Autowired
	private EoOrderManager eoOrderManage;
	@Autowired
	private EsUserManager esUserManager;
	@Autowired
	private EoEorb2EosrManager eoEorb2EosrManager;
	@Autowired
	private EoEoom2EobrManager eoEoom2EobrManager;
	@Autowired
	private EbCustomerManager ebCustomerManager;
	@Autowired
	private EbFileManager ebFileManager;
	@Autowired
	private EsControlParamManager esControlParamManager;
	
	
	@Override
	@Async("threadPoolBean")
	public void assembleIssuedTrailerEntrust(Long[] eoetIds, Long userId) throws WriteException, IOException {
		Map<String, Object> entrustTrailerMap = new HashMap<>();
		for (int i = 0; i < eoetIds.length; i++) {
			EsUserModel esUserModel = new EsUserModel();
			Long eoetId = eoetIds[i];
			EoRequestTrailerModel eoRequestTrailerModel = new EoRequestTrailerModel();
			EoOrderModel eoOrderModel = new EoOrderModel();
			eoRequestTrailerModel = this.eoRequestTrailerManager.get(eoetId);
			//拖车箱查询
			List<FilterCondition> eootCondition = new ArrayList<>();
			eootCondition.add(new FilterCondition("eootEoetId", eoetId, "="));
			List<EoEooc2EoetModel> eoEooc2EoetModels = this.eoEooc2EoetManager.findByCondition(eootCondition);
			//拖车物料查询
			List<FilterCondition> eomtCondition = new ArrayList<>();
			eomtCondition.add(new FilterCondition("eomtEoetId", eoetId, "="));
			List<EoEoom2EoetModel> eoEoom2EoetModels = this.eoEoom2EoetManager.findByCondition(eomtCondition);
			//订舱信息
			List<EoRequestBookingModel> eoRequestBookingModels = new ArrayList<>();
			if (null != eoRequestTrailerModel) {
				Long eoorId = eoRequestTrailerModel.getEoetEoorId();
				List<FilterCondition> eorbCondition = new ArrayList<>();
				eorbCondition.add(new FilterCondition("eorbEoorId", eoorId, "="));
				eoRequestBookingModels = this.eoRequestBookingManager.findByCondition(eorbCondition);
				//订单信息
				eoOrderModel = this.eoOrderManage.get(eoorId);
			}
			if (null != userId) {
				esUserModel = this.esUserManager.get(userId);
			}
			//获取拖车公司邮箱getEbCustomerContactEmailbyEoetId(eoetId)
			String email = getEbCustomerContactEmailbyEoetId(eoetId);
			
			entrustTrailerMap = this.assembleTrailerEntrust(eoOrderModel, eoRequestBookingModels, eoRequestTrailerModel, eoEooc2EoetModels, eoEoom2EoetModels, esUserModel,email);
			//将组装好的拖车委托书信息保存到excel中
			this.sendEmailAfterIssuedTrailer(entrustTrailerMap);
		}
	}

	@Override
	public void sendEmailAfterIssuedTrailer(Map entrustTrailerMap) throws WriteException, IOException {
		//创建Excel路径
//	    String path = EoRequestSendEmailServiceImpl.class.getClassLoader().getResource("com/sinotrans/oms/file/trailer.xls").getPath();
	    String path = "com/sinotrans/oms/file/trailer.xls";
        File file = new File(path);
        String excelpath = path;//file.getAbsolutePath();
        //创建一个workbook对象
        jxl.Workbook wb =null; 
        InputStream is = null;
        jxl.write.WritableWorkbook wbe = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try {
			is = new ClassPathResource(path).getInputStream();
//			is = new FileInputStream(excelpath);				  //创建一个文件流，读入Excel文件
			wb = Workbook.getWorkbook(is);                        //将文件流写入到workbook对象
			//jxl.Workbook 对象是只读的，所以如果要修改Excel，需要创建一个可读的副本，副本指向原Excel文件
			WorkbookSettings settings = new WorkbookSettings ();
			settings.setWriteAccess(null);
            wbe = Workbook.createWorkbook(byteArrayOutputStream, wb, settings);//创建workbook的副本
            int sheet_size = wbe.getNumberOfSheets(); //获取excel中的总sheet页数
            for (int i = 0; i < sheet_size; i++) {
                WritableSheet sheet  = wbe.getSheet(i); // 每个页签创建一个Sheet对象  
            	this.updateExcelContent(1, 1, entrustTrailerMap.get("eorbVesselName"), sheet);//船名
            	this.updateExcelContent(1, 4, entrustTrailerMap.get("eorbVoyage"), sheet);//船次
            	String eorbBulkBillNo = "";
            	eorbBulkBillNo =  entrustTrailerMap.get("eorbBulkBillNo") == null ? "" : entrustTrailerMap.get("eorbBulkBillNo").toString();
            	if (EmptyUtils.isEmpty(eorbBulkBillNo)) {
            		eorbBulkBillNo = entrustTrailerMap.get("eoetBlNo") == null ? "" : entrustTrailerMap.get("eoetBlNo").toString();
            	}
            	this.updateExcelContent(4, 1, eorbBulkBillNo , sheet);//提单号
            	this.updateExcelContent(1, 7, entrustTrailerMap.get("eorbEtd"), sheet);//开船日期
            	this.updateExcelContent(4, 6, entrustTrailerMap.get("eoetCyInCode"), sheet);//进港代码
            	this.updateExcelContent(4, 7, entrustTrailerMap.get("eorbFinalDestination"), sheet);//目的港
            	this.updateExcelContent(4, 0, entrustTrailerMap.get("eoorOrderNo"), sheet);//系统订单号
            	this.updateExcelContent(4, 2, entrustTrailerMap.get("eoorSoNo"), sheet);//so号
            	this.updateExcelContent(4, 3, entrustTrailerMap.get("eomtQuantity"), sheet);//件数
            	this.updateExcelContent(4, 4, entrustTrailerMap.get("eomtWeight"), sheet);//毛重
            	this.updateExcelContent(4, 5, entrustTrailerMap.get("eomtVolume"), sheet);//体积
            	
            	String eoetDeliveryPlaceAddress = (String) entrustTrailerMap.get("eoetDeliveryPlaceAddress");
            	WritableFont writableFont = new  WritableFont(WritableFont.COURIER, 12,WritableFont.BOLD);
        		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
        		//writableCellFormat.setAlignment(Alignment.CENTRE);
        		writableCellFormat.setWrap(true);//自动换行
        		writableCellFormat.setVerticalAlignment(VerticalAlignment.TOP);   //设置居中对齐 
        		writableCellFormat.setBorder(jxl.format.Border.RIGHT,jxl.format.BorderLineStyle.MEDIUM);	//设置右边框
        		sheet.addCell(new jxl.write.Label(9,4,eoetDeliveryPlaceAddress,writableCellFormat));
        		
        		WritableCellFormat writableCellTop = new WritableCellFormat(writableFont);
        		writableCellTop.setBorder(jxl.format.Border.TOP,jxl.format.BorderLineStyle.MEDIUM);	//设置下边框
        		sheet.addCell(new jxl.write.Label(9,8,"",writableCellTop));
        		
        		WritableCellFormat writableCellLeft = new WritableCellFormat(writableFont);
        		writableCellLeft.setBorder(jxl.format.Border.LEFT,jxl.format.BorderLineStyle.MEDIUM);	//设置下边框
        		sheet.addCell(new jxl.write.Label(10,8,"",writableCellLeft));
        		
            	this.updateExcelContent(8, 1, entrustTrailerMap.get("eoetReqDeliveryDate"), sheet);//装箱时间
            	
            	//this.updateExcelContent(11, 1, entrustTrailerMap.get("eoetRemark"), sheet);//备注
            	String eoetRemark = (null == entrustTrailerMap.get("eoetRemark") ? "" : entrustTrailerMap.get("eoetRemark").toString());
            	sheet.addCell(new jxl.write.Label(1,11,"1."+eoetRemark ,writableCellFormat));//备注
            	
            	String eoetBoxsealBackTime = (String) entrustTrailerMap.get("eoetBoxsealBackTime");
            	if (EmptyUtils.isNotEmpty(eoetBoxsealBackTime)) {
            		sheet.addCell(new jxl.write.Label(1,13,"3.请在"+eoetBoxsealBackTime+"日前提供箱封号给我司!" ,writableCellFormat));
            	} else {
            		sheet.addCell(new jxl.write.Label(1,13,"3." ,writableCellFormat));
            		
            	}
            	
            	String eootSetPostTime = (String) entrustTrailerMap.get("eootSetPostTime");
            	WritableCellFormat writableCellFormatBottom = new WritableCellFormat(writableFont);
//           	writableCellFormat.setAlignment(Alignment.CENTRE);
            	writableCellFormatBottom.setVerticalAlignment(VerticalAlignment.CENTRE);   //设置居中对齐
            	writableCellFormatBottom.setAlignment(Alignment.CENTRE);//设置居中对齐
            	writableCellFormatBottom.setBorder(jxl.format.Border.BOTTOM,jxl.format.BorderLineStyle.MEDIUM);	//设置下边框
            	sheet.addCell(new jxl.write.Label(1,9,eootSetPostTime,writableCellFormatBottom));
            	
            	
            	WritableCellFormat writableCellFormatAll = new WritableCellFormat(writableFont);
            	writableCellFormatAll.setVerticalAlignment(VerticalAlignment.CENTRE);   //设置居中对齐
            	writableCellFormatAll.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.MEDIUM);	//设置下边框
            	
            	
            	this.updateExcelContent(4, 8, entrustTrailerMap.get("boxSize"), sheet);//箱型*箱量
            	this.updateExcelContent(20, 1, entrustTrailerMap.get("userName"), sheet);//登录人信息
            }
            wbe.write();//将修改保存到workbook
		} catch (Exception e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		} finally {
			wbe.write();
            is.close();
            wb.close();
            wbe.close();//关闭workbook，释放内存 
            
            String email = (String) entrustTrailerMap.get("email");
            String emailConntent = "";//邮件附件
            if (null != entrustTrailerMap.get("emailContent")) {
            	emailConntent = entrustTrailerMap.get("emailContent").toString();
            }
            String eamilTitle = "";//邮件标题
            String eorbVesselName = "";//船名
            String eorbVoyage = "";//航次
            String eoetBlNo = "";//提单号
            String eoetDoNo = "";//do
            String eoetEbrgNameCn = "";//船靠码头
            Boolean flag = true;
            if (null != entrustTrailerMap.get("eorbVoyage")) {
            	eorbVoyage = " 航次：" + entrustTrailerMap.get("eorbVoyage").toString();
            }
            if (null != entrustTrailerMap.get("eorbVesselName")) {
            	eorbVesselName = " 船名：" + entrustTrailerMap.get("eorbVesselName").toString();
            }
            if (null != entrustTrailerMap.get("eomtTypeCode")) {
            	flag = (Boolean) entrustTrailerMap.get("eomtTypeCode");
            }
            if (null != entrustTrailerMap.get("eoetEbrgNameCn")) {
            	eoetEbrgNameCn = " 船靠码头：" + entrustTrailerMap.get("eoetEbrgNameCn");
            } else {
            	eoetEbrgNameCn = " 船靠码头：";
            }
            if (null != entrustTrailerMap.get("eorbBulkBillNo")) {
            	eoetBlNo = entrustTrailerMap.get("eorbBulkBillNo").toString();
            } else {
            	eoetBlNo = entrustTrailerMap.get("eoetBlNo").toString();
            }
            if (null != entrustTrailerMap.get("eoetDoNo")) {
            	eoetDoNo = " DO: " + entrustTrailerMap.get("eoetDoNo").toString();
            }
            
            eamilTitle = "拖车信息 — "+" 提单号："+eoetBlNo + eoetDoNo + eorbVesselName  + eorbVoyage + " (" +(flag ? "普货":"危险品") + ")" + " "+ eoetEbrgNameCn ;
            
            Long eoetId = (Long) entrustTrailerMap.get("eoetId");
            this.createEmailFileByExcel(byteArrayOutputStream, eamilTitle, "拖车委托书.xls", emailConntent ,email , eoetId.toString());
		}
        
	}

	/**
	 * 将修改的内容写入到具体的单元格内
	 * @author Shoven.Jiang  
	 * @date 2018年10月27日
	 * @param lineNumber  excel第几行
	 * @param columnsNumber  excel第几列
	 * @param content excel内容
	 * @param sheet sheet页
	 */
	private void updateExcelContent(int lineNumber, int columnNumber, Object content, WritableSheet sheet) {
		String cellContent = sheet.getCell(columnNumber, lineNumber).getContents();//根据lineNumber和columnNumber来获取第几列第几行excel中的内容
		WritableCell cell = sheet.getWritableCell(columnNumber, lineNumber); //根据lineNumber和columnNumber来获取第几列第几行excel中的单元格
		jxl.format.CellFormat cellFormat = cell.getCellFormat();//获取excel中的单元格格式
 		WritableFont writableFont = new  WritableFont(WritableFont.COURIER, 12,WritableFont.BOLD);
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
		
//		label.setCellFormat(cellFormat);//将修改后的单元格的格式设定成跟原来一样(合并的单元格格式无法加载到单个的单元格上面)
		try {
			writableCellFormat.setWrap(true);//自动换行
			writableCellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);   //设置居中对齐
			writableCellFormat.setAlignment(Alignment.CENTRE);
			jxl.write.Label label = new jxl.write.Label(columnNumber, lineNumber, content == null ? "":content.toString(),writableCellFormat);//根据lineNumber和columnNumber来修改excel中单元格内容
			sheet.addCell(label);//将改过的单元格保存到sheet
		} catch (RowsExceededException e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		} catch (WriteException e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		}                             
	}
	
	/**
	 * 
	 * @author Shoven.Jiang  
	 * @date 2018年10月27日
	 * @param wb
	 * @return
	 */
	/**
	 * 查询委托书的Excel附件
	 * @author Shoven.Jiang  
	 * @date 2018年10月29日
	 * @param filePath  文件存放地址
	 * @param emailTitle 邮件名称
	 * @param enclosureName 附件名称
	 * @param emailContent  邮件内容
	 * @param email  邮件接收人
	 * @param eoetId 拖车主键
	 */
	private void createEmailFileByExcel(ByteArrayOutputStream byteArrayOutputStream, String emailTitle, String enclosureName, String emailContent,String email,String eoetId) {
		String[] emails = null;
		if (null != eoetId) {
			emails = this.getEbCustomerContactEmailsbyEoetId(Long.valueOf(eoetId));
		}
		DataSource dataSource = null;
		SendMailUtil sendMailUtil = new SendMailUtil();
//		sendMailUtil.setAddress("lmsupport@sinotrans.com", email, emailTitle);
		sendMailUtil.addAddress("lmsupport@sinotrans.com", emails, emailTitle);
		sendMailUtil.setAffix("", enclosureName);
		Map<String,String> contentMap = new HashMap<String, String>();
		contentMap.put("date", emailContent);
		contentMap.put("customerName", "1111");
		contentMap.put("address", "详细内容请见附件！");
		contentMap.put("contact", "22222");
		//拼接文件ids
		StringBuilder servicerIds = new StringBuilder();
		List<FilterCondition> eoddFilterCondition = new ArrayList<>();
		eoddFilterCondition.add(new FilterCondition("ebflSubstr4", eoetId ,"="));
		List<EbFileModel> ebFileModelList = ebFileManager.findByCondition(eoddFilterCondition);
		if (EmptyUtils.isNotEmpty(ebFileModelList)) {
			for (EbFileModel ebFileModel : ebFileModelList) {
				servicerIds.append(ebFileModel.getEbflServicerId()).append(",");
			}
		}
		if (EmptyUtils.isNotEmpty(servicerIds.toString())) {
			String fileServiceUrlZip = this.getServiceUrl(Constants.FILE_SERVICE_URL_ZIP);//服务器地址-压缩
			contentMap.put("servicerIds", fileServiceUrlZip + "?ids="+servicerIds.toString());
			contentMap.put("servicerAffixName", "拖车资料.zip");
		}
		sendMailUtil.sendEmailByFileTypeStreamFroms(contentMap, byteArrayOutputStream);				  
		
	}
	/**
	 * 组装拖车委托书信息
	 * @author Shoven.Jiang  
	 * @date 2018年10月26日
	 * @param eoOrderModel 订单信息
	 * @param eoRequestBookingModels 订舱信息
	 * @param eoRequestTrailerModel  拖车信息
	 * @param eoEooc2EoetModels  拖车集装箱
	 * @param eoEoom2EoetModels  拖车物料信息
	 * @return Map<String, Object> trailerEntrust
	 */
	private Map<String, Object> assembleTrailerEntrust(EoOrderModel eoOrderModel, List<EoRequestBookingModel> eoRequestBookingModels, 
			EoRequestTrailerModel eoRequestTrailerModel, List<EoEooc2EoetModel> eoEooc2EoetModels, List<EoEoom2EoetModel> eoEoom2EoetModels, EsUserModel esUserModel,String email) {
		Map<String, Object> trailerEntrust = new HashMap<>();
		Boolean flag = false;//判断拖车物料是否有危化品   普货：true 危化品：false
		Date eoetBoxselBackTime = null;
		/****订舱信息*****/
		if (EmptyUtils.isNotEmpty(eoRequestBookingModels)) {
			EoRequestBookingModel eoRequestBookingModel = eoRequestBookingModels.get(0);
			String eorbVesselName = eoRequestBookingModel.getEorbVesselName();//船名
			String eorbVoyage = eoRequestBookingModel.getEorbVoyage();//船次
			String eorbBulkBillNo = eoRequestBookingModel.getEorbBulkBillNo();//提单号
			Date eorbEtd = eoRequestBookingModel.getEorbEtd();//开船日期
			String eorbEtdFormat = "";
			if (null != eorbEtd) {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				eorbEtdFormat =formatter.format(eorbEtd);
			}
			String eorbTransferPortName = eoRequestBookingModel.getEorbTransferPortName();//中转港
			String eorbFinalDestination = eoRequestBookingModel.getEorbFinalDestination();//目的港
			
			if (EmptyUtils.isEmpty(eorbVesselName)) {
				eorbVesselName = eoRequestTrailerModel.getEoetVessel();
			}
			if (EmptyUtils.isEmpty(eorbVoyage)) {
				eorbVoyage = eoRequestTrailerModel.getEoetVoyage();
			}
			//将查询到的信息放到map中
			trailerEntrust.put("eorbVesselName", eorbVesselName);
			trailerEntrust.put("eorbVoyage", eorbVoyage);
			trailerEntrust.put("eorbBulkBillNo", eorbBulkBillNo);
			trailerEntrust.put("eorbEtd", eorbEtdFormat);
			trailerEntrust.put("eorbTransferPortName", eorbTransferPortName);
			trailerEntrust.put("eorbFinalDestination", eorbFinalDestination);
		}
		/****订单信息*****/
		if (null != eoOrderModel) {
			String eoorOrderNo = eoOrderModel.getEoorOrderNo();//系统订单号
			String eoorSoNo = eoOrderModel.getEoorSoNo();//so号
			//将查询到的信息放到map中
			trailerEntrust.put("eoorOrderNo", eoorOrderNo);
			trailerEntrust.put("eoorSoNo", eoorSoNo);
		}
		/****物料信息*****/
		if (EmptyUtils.isNotEmpty(eoEoom2EoetModels)) {
			Long eomtQuantity = 0L;
			Double eomtWeight = 0.00;
			Double eomtVolume = 0.00;
			for (EoEoom2EoetModel eoEoom2EoetModel : eoEoom2EoetModels) {
				eomtQuantity += eoEoom2EoetModel.getEomtQuantity();//件数
				eomtWeight += eoEoom2EoetModel.getEomtWeight();//毛重
				eomtVolume += eoEoom2EoetModel.getEomtVolume();//体积
			}
			//将查询到的信息放到map中
			trailerEntrust.put("eomtQuantity", eomtQuantity);
			trailerEntrust.put("eomtWeight", eomtWeight);
			trailerEntrust.put("eomtVolume", eomtVolume);
			/**** 拖车下达标题 ****/
			//判断拖车下的物料是否是普货，普货为true  危化品：false   只要有危化品就算危化品
			for (EoEoom2EoetModel eoEoom2EoetModel : eoEoom2EoetModels) {
				if (EmptyUtils.isNotEmpty(eoEoom2EoetModel.getEomtTypeCode()) && Constants.MATERIAL_ORDINARY_CARGO.equals(eoEoom2EoetModel.getEomtTypeCode())) {
					flag = true;//普货
					break;
				}
				if (EmptyUtils.isNotEmpty(eoEoom2EoetModel.getEomtTypeCode()) && Constants.MATERIAL_GENERAL_CARGO.equals(eoEoom2EoetModel.getEomtTypeCode())) {
					flag = true;//普货
					break;
				}
			}
			trailerEntrust.put("eomtTypeCode", flag);
		}
		/****拖车信息*****/
		if (null != eoRequestTrailerModel) {
			eoetBoxselBackTime = eoRequestTrailerModel.getEoetBoxsealBackTime();
			String eoetDeliveryPlaceAddress = eoRequestTrailerModel.getEoetDeliveryPlaceAddress();//装箱地址
			trailerEntrust.put("eoetDeliveryPlaceAddress", eoetDeliveryPlaceAddress);
			Date eoetReqDeliveryDate = eoRequestTrailerModel.getEoetReqDeliveryDate();//装箱时间
			String eoetReqDeliveryDateFormat = "";
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			if (null != eoetReqDeliveryDate) {
				eoetReqDeliveryDateFormat = formatter.format(eoetReqDeliveryDate);
			}
			String eoetBoxsealBackTimeFormat = "";
			if (null != eoetBoxselBackTime) {
				eoetBoxsealBackTimeFormat = formatter.format(eoetBoxselBackTime);
			}
			String eoetRemark = eoRequestTrailerModel.getEoetRemark();//备注
			String eoetCyInCode = eoRequestTrailerModel.getEoetCyInCode();//进港代码
			String eoetEbrgNameCn = eoRequestTrailerModel.getEoetEbrgNameCn();//场站
			//将查询到的信息放到map中
			
			trailerEntrust.put("eoetReqDeliveryDate", eoetReqDeliveryDateFormat);
			trailerEntrust.put("eoetRemark", eoetRemark);
			trailerEntrust.put("eoetBoxsealBackTime", eoetBoxsealBackTimeFormat);
			trailerEntrust.put("eoetId", eoRequestTrailerModel.getEoetId());
			trailerEntrust.put("eoetDoNo", eoRequestTrailerModel.getEoetDoNo());
			trailerEntrust.put("eoetBlNo", eoRequestTrailerModel.getEoetBlNo());
			trailerEntrust.put("eoetCyInCode", eoetCyInCode);
			trailerEntrust.put("eoetEbrgNameCn", eoetEbrgNameCn);
		}
		/****拖车集装箱信息*****/
		if (EmptyUtils.isNotEmpty(eoEooc2EoetModels)) {
			Date eootSetPostTime = eoEooc2EoetModels.get(0).getEootSetPostTime();//截港时间
			String eootSetPostTimeFormat = "";
			if (null != eootSetPostTime) {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				eootSetPostTimeFormat = formatter.format(eootSetPostTime);
				
			}
			String boxSize = "1*" + eoEooc2EoetModels.get(0).getEootSize() + "*" +eoEooc2EoetModels.get(0).getEootStandard();//箱型*箱量
			//将查询到的信息放到map中
			trailerEntrust.put("eootSetPostTime", eootSetPostTimeFormat);
			trailerEntrust.put("boxSize", boxSize);
			//String eootDeliveryPlaceAddress = eoEooc2EoetModels.get(0).getEootDeliveryPlaceAddress();//装箱地址
			//trailerEntrust.put("eoetDeliveryPlaceAddress", eootDeliveryPlaceAddress);
		}
		/****当前登录人信息*****/
		if (null != esUserModel) {
			String mobile = esUserModel.getEsusTel();//电话
			if (EmptyUtils.isEmpty(mobile)) {
//				mobile = esUserModel.getEsusMobile();//手机
				mobile = "";//手机
			}
			String uesrEmail = esUserModel.getEsusEmail();//邮箱
			String userName = esUserModel.getEsusUserNameCn();
			trailerEntrust.put("userName", userName+ "   "+ uesrEmail+ "   "+ mobile);
		}
		trailerEntrust.put("email", email);
		/**** 邮件正文****/
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
		if (null != eoetBoxselBackTime) {
			eoetBoxselBackTime = DateUtil.getDateFormat(eoetBoxselBackTime, "yyyy-MM-dd");
			String eorbEtdFormat = formatter2.format(eoetBoxselBackTime);
			trailerEntrust.put("emailContent", "请于" + eorbEtdFormat + "前提供箱封号，截单。");
		} else {
			trailerEntrust.put("emailContent", "请等通知！");
		}
		return trailerEntrust;
	}
	
	/**
	 * @deprecated:根据拖车任务获取分供商邮件地址
	 * @author Colley.Bai  
	 * @date 2018年11月19日
	 * @param eoetId
	 * @return
	 */
	public String getEbCustomerContactEmailbyEoetId(Long eoetId){
    	String email = "";
    	String ebccIsDefault = "";
		if (null != eoetId){
			EoRequestTrailerModel eoRequestTrailerModel = eoRequestTrailerManager.get(eoetId);
			if (null != eoRequestTrailerModel.getEoetTrailerCompanyId()) {
				List<EbCustomerContactModel> ebCustomerContactList = ebCustomerManager.getEbCustomerContactByEbcuId(eoRequestTrailerModel.getEoetTrailerCompanyId());
				for (int i=0;i<ebCustomerContactList.size();i++) {
					ebccIsDefault = ebCustomerContactList.get(i).getEbccIsDefault();
					if (EmptyUtils.isNotEmpty(ebccIsDefault) && Constants.YES.equals(ebccIsDefault) && EmptyUtils.isNotEmpty(ebCustomerContactList.get(i).getEbccEmail())) {
						email += ebCustomerContactList.get(i).getEbccEmail();
						break;
					}
					if (EmptyUtils.isNotEmpty(ebCustomerContactList.get(i).getEbccEmail())) {
						email +=  ebCustomerContactList.get(i).getEbccEmail();
						break;
					}
				}
			}
		}
		return email;
	}
	/**
	 * @deprecated:根据拖车任务获取分供商邮件地址（多人）
	 * @author Colley.Bai  
	 * @date 2018年11月19日
	 * @param eoetId
	 * @return
	 */
	public String[] getEbCustomerContactEmailsbyEoetId(Long eoetId){
		String[] email = null;
		String ebccIsDefault = "";
		if (null != eoetId){
			EoRequestTrailerModel eoRequestTrailerModel = eoRequestTrailerManager.get(eoetId);
			if (null != eoRequestTrailerModel.getEoetTrailerCompanyId()) {
				List<EbCustomerContactModel> ebCustomerContactList = ebCustomerManager.getEbCustomerContactByEbcuId(eoRequestTrailerModel.getEoetTrailerCompanyId());
				email = new String[ebCustomerContactList.size()];
				for (int i=0;i<ebCustomerContactList.size();i++) {
					ebccIsDefault = ebCustomerContactList.get(i).getEbccIsDefault();
//					if (EmptyUtils.isNotEmpty(ebCustomerContactList.get(i).getEbccEmail()) && (EmptyUtils.isEmpty(ebccIsDefault) || Constants.NO.equals(ebccIsDefault)) ) {
//						email[i] = ebCustomerContactList.get(i).getEbccEmail();
//					}
					if (EmptyUtils.isNotEmpty(ebCustomerContactList.get(i).getEbccEmail())) {
						email[i] =  ebCustomerContactList.get(i).getEbccEmail();
					}
				}
			}
		}
		return email;
	}
	
	/**
	 * @deprecated:获取服务器下载地址
	 * @author Colley.Bai  
	 * @date 2018年12月18日
	 * @param type
	 * @return
	 */
	private String getServiceUrl(String type) {
		Map<String, Object> esParam = new HashMap<>();
		String url = "";
		esParam = this.esControlParamManager.getControlParamValues(type);
		if (null != esParam) {
			url = esParam.get(type) == null ? "":esParam.get(type).toString();
		}
		return url;
	}
	
}
