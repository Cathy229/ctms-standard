package com.sinotrans.oms.businessrequest.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.basicdata.manager.EbCodeMasterManager;
import com.sinotrans.oms.basicdata.model.EbCodeMasterModel;
import com.sinotrans.oms.businessrequest.manager.EoBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EobrManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEorb2EosrManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.service.EoBookingService;
import com.sinotrans.oms.businessrequest.service.EoRequestBookingExportService;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeService;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.cache.redis.RedisTemplateUtil;
import com.sinotrans.oms.common.tool.SendMailUtil;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.manager.EbProjectManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.datainteraction.service.EdiBookingService;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.fileupload.manager.EbFileManager;
import com.sinotrans.oms.fileupload.model.EbFileModel;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsUserModel;

import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Alignment;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**  
* Title: EoRequestBookingExportServiceImpl  
* Description:  导出功能，下载委托书，发送邮件
* @author Colley.Bai
* @date 2018年12月28日  
* @version 1.0  
*/
@Service
public class EoRequestBookingExportServiceImpl extends BaseAspect implements EoRequestBookingExportService {

	@Autowired
	private EoRequestTrailerService eoRequestTrailerService;
	@Autowired
	private EoBookingService eoBookingService;
	@Autowired
	private EoBookingManager eoBookingManager;
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
	private EdiBookingService ediBookingService;
	@Autowired
	private EbCodeMasterManager ebCodeMasterManager;
	@Autowired
	private EbCustomerManager ebCustomerManager;//项目执行计划作业步骤表
	@Autowired
	private EsControlParamManager esControlParamManager;//控制参数
	@Autowired
	private RedisTemplateUtil redisTemplateUtil;
	@Autowired
	private EbFileManager ebFileManager;
	@Autowired
	private EbProjectManager ebProjectManager;
	
	
	
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
		WritableFont writableFont = new  WritableFont(WritableFont.ARIAL, 8);
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
		try {
			writableCellFormat.setWrap(true);//自动换行
			writableCellFormat.setVerticalAlignment(VerticalAlignment.TOP);   //设置居中对齐
			writableCellFormat.setBorder(jxl.format.Border.RIGHT,jxl.format.BorderLineStyle.MEDIUM);	//设置右边框
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
	
	
	@Override
	public Map<String,String> assembleExportBookingEntrust(Long[] eorbIds, Long userId) throws WriteException, IOException {
		Map<String,String> map = new HashMap<>();
		Map<String, Object> entrustBookingMap = new HashMap<>();
		for (int i = 0; i < eorbIds.length; i++) {
			EsUserModel esUserModel = new EsUserModel();
			Long eorbId = eorbIds[i];
			EoRequestBookingModel eoRequestBookingModel = eoRequestBookingManager.get(eorbId);
			EoOrderModel eoOrderModel = new EoOrderModel();
			if (null != eoRequestBookingModel) {
				//订单查询
				List<FilterCondition> eoorCondition = new ArrayList<>();
				eoorCondition.add(new FilterCondition("eoorId", eoRequestBookingModel.getEorbEoorId(), "="));
				List<EoOrderModel> eoOrderModels = this.eoOrderManage.findByCondition(eoorCondition);
				if (EmptyUtils.isNotEmpty(eoOrderModels)) {
					eoOrderModel = eoOrderModels.get(0);
				}
			}
			//订舱箱查询
			List<FilterCondition> eobtCondition = new ArrayList<>();
			eobtCondition.add(new FilterCondition("eobtEorbId", eorbId, "="));
			List<EoEorb2EosrModel> EoEorb2EosrModelList = this.eoEorb2EosrManager.findByCondition(eobtCondition);

			//订舱物料查询
			List<FilterCondition> eobmCondition = new ArrayList<>();
			eobmCondition.add(new FilterCondition("eobmEorbId", eorbId, "="));
			List<EoEoom2EobrModel> eoEoom2EobrModelList = this.eoEoom2EobrManager.findByCondition(eobmCondition);
			if (null != userId) {
				esUserModel = this.esUserManager.get(userId);
			}
			String email =  getEbCustomerContactEmailbyEorbId(eorbId);
			entrustBookingMap = this.assembleBookingEntrust(eoRequestBookingModel, EoEorb2EosrModelList, eoEoom2EobrModelList, esUserModel, eoOrderModel ,email);
			//增加判断，是否是华东订舱网，如果是则发邮件，并对接EDI，如果不是只发送邮件
			String ebcuCustomerNo = eoRequestBookingModel.getEorbBookingAgentCode();//查询出订舱代理的值
			String sendToEdiBookingEbcuCode = this.esControlParamManager.getIsCompanyValue("SEND_TO_EDI_BOOKING_EBCU_CODE");
			if (EmptyUtils.isNotEmpty(ebcuCustomerNo) && EmptyUtils.isNotEmpty(sendToEdiBookingEbcuCode) && sendToEdiBookingEbcuCode.equals(ebcuCustomerNo)) {//订舱代理的客户代码与系统中配置的控制参数一致，则认为是华东订舱网
				//将组装好的拖车委托书信息保存到excel中并发送邮件
				map = this.sendEmailAfterExportBooking(entrustBookingMap);
			} else {//如果不是华东订舱网则直接发送邮件，不对接EDI
				//将组装好的拖车委托书信息保存到excel中并发送邮件
				map = this.sendEmailAfterExportBooking(entrustBookingMap);
			}
		}
		return map;
	}

	/**
	 * @deprecated:组装订舱委托书信息
	 * @author Colley.Bai  
	 * @date 2018年10月29日 下午03:50:23 
	 * @param eoRequestBookingModel 订舱
	 * @param eoEorb2EosrModelList 箱
	 * @param eoEoom2EobrModelList 物料
	 * @param esUserModel 用户
	 * @return
	 */
	private Map<String, Object> assembleBookingEntrust(EoRequestBookingModel eoRequestBookingModel,
			List<EoEorb2EosrModel> eoEorb2EosrModelList, List<EoEoom2EobrModel> eoEoom2EobrModelList, EsUserModel esUserModel, EoOrderModel eoOrderModel ,String email) {
		Map<String, Object> bookingEntrust = new HashMap<>();
		Boolean flag = false;//判断订舱物料是否有危化品   普货：true 危化品：false
		/****订舱信息*****/
		if (null != eoRequestBookingModel) {
			String eorbCarrierName = eoRequestBookingModel.getEorbCarrierName();//创建人
			Date eorbEtd = eoRequestBookingModel.getEorbEtd();//预计开航日期
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String eorbEtdFormat = "";
			if (null != eorbEtd) {
				eorbEtdFormat = formatter.format(eorbEtd);
			}
			String eorbShipper = eoRequestBookingModel.getEorbShipper();//发货人
			String eorbShipperDetail = eoRequestBookingModel.getEorbShipperDetail();//发货人详细描述
			String eorbShipperDetailFirst = eorbShipper;
			String eorbConsignee = eoRequestBookingModel.getEorbConsignee();//收货人
			String eorbConsigneeDetail = eoRequestBookingModel.getEorbConsigneeDetail();//收货人详细描述
			String eorbConsigneeDetailFirst = eorbConsignee;
			
			String eorbNotify = eoRequestBookingModel.getEorbNotify();//第一通知人
			String eorbNotifierDetail = eoRequestBookingModel.getEorbNotifierDetail();//第一通知人详细描述
			String eorbNotifierDetailFirst = eorbNotify;
			
			String eorbBookingRemark = eoRequestBookingModel.getEorbBookingRemark();//备注
			String eorbFreightClauseName = eoRequestBookingModel.getEorbFreightClauseName();//运输条款
			String eorbDeliveryPlaceName = eoRequestBookingModel.getEorbDeliveryPlaceName();//装箱地点
			String eorbLoadPortName = eoRequestBookingModel.getEorbLoadPortName();//装货港名称
			String eorbTransferPortName = eoRequestBookingModel.getEorbReceiptPlaceName();//卸货地名称
			String eorbDischargePortName = eoRequestBookingModel.getEorbDischargePortName();//卸货港名称
			String eorbPaymentMethod = eoRequestBookingModel.getEorbPaymentMethod();//预付/到付
			String eorbBookingContractNo = eoRequestBookingModel.getEorbBookingContractNo();//预付/到付
			String eorbConsignorEbcuName = eoRequestBookingModel.getEorbConsignorEbcuName();//委托方
			String eorbEbrtName = eoRequestBookingModel.getEorbEbrtName();//航线
			String eorbCarrierBookingNo = eoRequestBookingModel.getEorbEbrtName();//订舱号
			Long eorbEbpjId = eoRequestBookingModel.getEorbEbpjId();
			List<FilterCondition> filterCondition = new ArrayList<>();
			filterCondition.add(new FilterCondition("ebpjId", eorbEbpjId,"="));
			List<EbProjectModel> ebProjectModelList = ebProjectManager.findByCondition(filterCondition);
			if (EmptyUtils.isNotEmpty(ebProjectModelList)) {
				bookingEntrust.put("ebpjProjectName", ebProjectModelList.get(0).getEbpjProjectName());
			}
			
			Long eorbId = eoRequestBookingModel.getEorbId();//航线
			bookingEntrust.put("eorbId", eorbId);
			Long eorbEscoId = eoRequestBookingModel.getEorbEscoId();//公司id
			bookingEntrust.put("eorbEscoId", eorbEscoId);
			bookingEntrust.put("eorbCarrierBookingNo", eorbCarrierBookingNo);
			
			//将查询到的信息放到map中
			bookingEntrust.put("eorbCarrierName", eorbCarrierName);
			bookingEntrust.put("eorbEtdFormat", eorbEtdFormat);
			
			bookingEntrust.put("eorbBookingContractNo", eorbBookingContractNo);
			
			bookingEntrust.put("eorbShipperDetailFirst", eorbShipperDetailFirst);
			bookingEntrust.put("eorbShipperDetail", eorbShipperDetail);

			bookingEntrust.put("eorbConsigneeDetailFirst", eorbConsigneeDetailFirst);
			bookingEntrust.put("eorbConsigneeDetail", eorbConsigneeDetail);

			bookingEntrust.put("eorbNotifierDetailFirst", eorbNotifierDetailFirst);
			bookingEntrust.put("eorbNotifierDetail", eorbNotifierDetail);

			bookingEntrust.put("eorbConsigneeDetail", eorbConsigneeDetail);
			bookingEntrust.put("eorbNotifierDetail", eorbNotifierDetail);
			bookingEntrust.put("eorbBookingRemark", eorbBookingRemark);
			bookingEntrust.put("eorbFreightClauseName", eorbFreightClauseName);
			bookingEntrust.put("eorbDeliveryPlaceName", eorbDeliveryPlaceName);
			bookingEntrust.put("eorbLoadPortName", eorbLoadPortName);
			bookingEntrust.put("eorbDischargePortName", eorbDischargePortName);
			bookingEntrust.put("eorbTransferPortName", eorbTransferPortName);
			bookingEntrust.put("eorbPaymentMethod", eorbPaymentMethod);
			bookingEntrust.put("eorbConsignorEbcuName", eorbConsignorEbcuName);
			bookingEntrust.put("eorbEbrtName", eorbEbrtName);
			
			if (null != eoOrderModel) {
				bookingEntrust.put("eoOrderNo", eoOrderModel.getEoorOrderNo());
			}
		}
		/****箱信息*****/
		if (EmptyUtils.isNotEmpty(eoEorb2EosrModelList)) {
			String boxSize = "";//箱型*箱量
			for (EoEorb2EosrModel eoEorb2EosrModel : eoEorb2EosrModelList) {
				boxSize = eoEorb2EosrModel.getEobtCtnNumber() + "*" + eoEorb2EosrModel.getEobtCntCustomized() + "'" +eoEorb2EosrModel.getEobtCntCustomizedSize();
			}
			//将查询到的信息放到map中
			bookingEntrust.put("boxSize", boxSize);
		}
		/****物料信息*****/
		if (EmptyUtils.isNotEmpty(eoEoom2EobrModelList)) {
			bookingEntrust.put("eoEoom2EobrModelList", eoEoom2EobrModelList);
			
			for (EoEoom2EobrModel eoEoom2EobrModel : eoEoom2EobrModelList) {
				if (EmptyUtils.isNotEmpty(eoEoom2EobrModel.getEobmType()) && Constants.MATERIAL_ORDINARY_CARGO.equals(eoEoom2EobrModel.getEobmType())) {
					flag = true;//普货
					break;
				}
				if (EmptyUtils.isNotEmpty(eoEoom2EobrModel.getEobmType()) && Constants.MATERIAL_GENERAL_CARGO.equals(eoEoom2EobrModel.getEobmType())) {
					flag = true;//普货
					break;
				}
			}
			bookingEntrust.put("eobmType", flag);
		}
		/****当前登录人信息*****/
		if (null != esUserModel) {
			String mobile = esUserModel.getEsusTel();//电话
			if (EmptyUtils.isEmpty(mobile)) {
//				mobile = esUserModel.getEsusMobile();//手机
				mobile = "";//手机
			}
			String uesrEmail = esUserModel.getEsusEmail();
			String esusUserNameCn = esUserModel .getEsusUserNameCn();
			bookingEntrust.put("mobile", "Fm:"+esusUserNameCn + "   "+ uesrEmail + "   "+ mobile);
		}
		bookingEntrust.put("email", email);
		return bookingEntrust;
	}
	
	@Override
	public Map<String,String> sendEmailAfterExportBooking(Map<String, Object> entrustBookingMap) throws WriteException, IOException {
		Map<String, String> map = new HashMap<>();
		//创建Excel路径
	    String path = "com/sinotrans/oms/file/booking.XLS";
        File file = new File(path);
        String excelpath = path;//file.getAbsolutePath();
        //创建一个workbook对象
        jxl.Workbook wb =null; 
        InputStream is = null;
        jxl.write.WritableWorkbook wbe = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try {
			is = new ClassPathResource(path).getInputStream();
			wb = Workbook.getWorkbook(is);                        //将文件流写入到workbook对象
			//jxl.Workbook 对象是只读的，所以如果要修改Excel，需要创建一个可读的副本，副本指向原Excel文件
			WorkbookSettings settings = new WorkbookSettings ();
			settings.setWriteAccess(null);
            wbe = Workbook.createWorkbook(byteArrayOutputStream, wb, settings);//创建workbook的副本
            int sheet_size = wbe.getNumberOfSheets(); //获取excel中的总sheet页数
            for (int i = 0; i < sheet_size; i++) {
    			
                WritableSheet sheet  = wbe.getSheet(i); // 每个页签创建一个Sheet对象  
                
                WritableFont   wf   =   new   WritableFont(WritableFont.ARIAL,8);
                WritableCellFormat   wcf   =   new   WritableCellFormat(wf);
                wcf.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.MEDIUM); 
            	this.updateExcelContent(1, 1, entrustBookingMap.get("eorbCarrierName"), sheet);//创建人
            	this.updateExcelContent(2, 1, entrustBookingMap.get("eorbEtdFormat"), sheet);//预计开航日期
            	String mobile=  (String) entrustBookingMap.get("mobile");
            	

            	Long eorbEscoId = (Long) entrustBookingMap.get("eorbEscoId");
            	
            	WritableCellFormat   wcfRight   =   new   WritableCellFormat(wf);
            	wcfRight.setBorder(jxl.format.Border.RIGHT,jxl.format.BorderLineStyle.MEDIUM); 
            	sheet.addCell(new Label(2,1,mobile,wcfRight));//当前登录人+电话
            	
            	String eoOrderNo = (String) entrustBookingMap.get("eoOrderNo");
            	sheet.addCell(new Label(5,1, "订单号:" + eoOrderNo,wcfRight));//订单号
            	sheet.addCell(new Label(4,2, "",wcfRight));//
            	sheet.addCell(new Label(4,3, "",wcfRight));//

            	String eorbBookingContractNo = (String) entrustBookingMap.get("eorbBookingContractNo");
            	String eorbCarrierBookingNo = (String) entrustBookingMap.get("eorbCarrierBookingNo");
                Label labelTo =   new   Label(2,4,eorbBookingContractNo,wcf); //订舱协议号
                sheet.addCell(labelTo);
            	
            	String eorbShipperDetailFirst = (String) entrustBookingMap.get("eorbShipperDetailFirst");
            	Label label =   new   Label(1,5,eorbShipperDetailFirst,wcf); 
            	sheet.addCell(label);
            	
            	this.updateExcelContent(6, 1, entrustBookingMap.get("eorbShipperDetail"), sheet);//发货人详细描述
                
            	String eorbConsigneeDetailFirst = (String) entrustBookingMap.get("eorbConsigneeDetailFirst");
                Label labelcf =   new   Label(1,10,eorbConsigneeDetailFirst,wcf); 
                sheet.addCell(labelcf);
                
            	this.updateExcelContent(11, 1, entrustBookingMap.get("eorbConsigneeDetail"), sheet);//收货人详细描述
            	
            	String eorbNotifierDetailFirst = (String) entrustBookingMap.get("eorbNotifierDetailFirst");
                Label labelcfEorbNotifierDetailFirst =   new   Label(1,15,eorbNotifierDetailFirst,wcf); 
                sheet.addCell(labelcfEorbNotifierDetailFirst);
                
            	this.updateExcelContent(16, 1, entrustBookingMap.get("eorbNotifierDetail"), sheet);//第一通知人详细描述
            	
            	this.updateExcelContent(5, 6, entrustBookingMap.get("eorbFreightClauseName"), sheet);//运输条款
            	this.updateExcelContent(7, 6, entrustBookingMap.get("eorbDeliveryPlaceName"), sheet);//装箱地点
            	this.updateExcelContent(11, 5, entrustBookingMap.get("eorbLoadPortName"), sheet);//装货港名称
            	this.updateExcelContent(14, 5, entrustBookingMap.get("eorbDischargePortName"), sheet);//卸货港名称
            	this.updateExcelContent(17, 5, entrustBookingMap.get("eorbTransferPortName"), sheet);//卸货地名称
            	
            	String eorbPaymentMethod = (String) entrustBookingMap.get("eorbPaymentMethod");
                if (EmptyUtils.isNotEmpty(eorbPaymentMethod)) {
                	List<FilterCondition> eorbPaymentMethodFilterCondition = new ArrayList<>();
                	eorbPaymentMethodFilterCondition.add(new FilterCondition("ebcdCode",eorbPaymentMethod,"="));
                	eorbPaymentMethodFilterCondition.add(new FilterCondition("ebcdDictionaryType","ORG_PAY_TYPE","="));
                	eorbPaymentMethodFilterCondition.add(new FilterCondition("ebcdEscoId",eorbEscoId,"="));
                 	List<EbCodeMasterModel> eorbDeliveryPlaceNames = ebCodeMasterManager.findByCondition(eorbPaymentMethodFilterCondition);
                 	if (EmptyUtils.isNotEmpty(eorbDeliveryPlaceNames)) {
                 		sheet.addCell(new Label(1 ,20,eorbDeliveryPlaceNames.get(0).getEbcdNameCn(),wcf));//付款方式
         			} 
                } else {
             		sheet.addCell(new Label(1 ,20,"",wcf));//付款方式
                }
            	this.updateExcelContent(6, 6, entrustBookingMap.get("boxSize"), sheet);//箱型箱量
            	
            	String eorbBookingRemark = (String) entrustBookingMap.get("eorbBookingRemark");
            	

            	
            	@SuppressWarnings("unchecked")
				List<EoEoom2EobrModel> eoEoom2EobrModelList = (List<EoEoom2EobrModel>) entrustBookingMap.get("eoEoom2EobrModelList");
        		updateExcelContenteoEoom(eoEoom2EobrModelList, sheet ,eorbBookingRemark,eorbEscoId);
            	
            }
            wbe.write();//将修改保存到workbook
		} catch (Exception e) {
			e.printStackTrace();
			log.error("excel修改失败：" + e.getMessage());
		} finally {
            is.close();
            wb.close();
            wbe.close();//关闭workbook，释放内存 
            String email = (String) entrustBookingMap.get("email");
            Boolean flag = false;
            if (null != entrustBookingMap.get("eobmType")) {
            	flag = (Boolean) entrustBookingMap.get("eobmType");
            }
            //订舱邮件头信息 DG是危险品 NDG是普货
            String emailTitle = (null == entrustBookingMap.get("ebpjProjectName") ? "" : entrustBookingMap.get("ebpjProjectName").toString() + " ETD:" + (null == entrustBookingMap.get("eorbEtdFormat") ? "" : entrustBookingMap.get("eorbEtdFormat")) + " " + (null == entrustBookingMap.get("eorbLoadPortName") ? "" : entrustBookingMap.get("eorbLoadPortName").toString()) + " " + (null == entrustBookingMap.get("eorbDischargePortName") ? "" : entrustBookingMap.get("eorbDischargePortName").toString())  + " 箱型量 :" + (null == entrustBookingMap.get("boxSize") ? "" : entrustBookingMap.get("boxSize")) + " 订舱"+ " " +(flag ? "NDG":"DG") + "");
            String emailContent = "请安排订舱, " + (null == entrustBookingMap.get("eorbEtdFormat") ? "" : entrustBookingMap.get("eorbEtdFormat")) + " 船, 航线:" + (null == entrustBookingMap.get("eorbEbrtName") ? "" : entrustBookingMap.get("eorbEbrtName").toString());
            Long eorbId = (Long) entrustBookingMap.get("eorbId");
            map.put("file", Base64Utils.encodeToString(byteArrayOutputStream.toByteArray()));
            map.put("fileName", "订舱委托书.xls");
            //订舱邮件内容
            this.createEmailFileByExcel(byteArrayOutputStream, emailTitle, "订舱委托书.xls", emailContent, email ,eorbId.toString());
		}
		return map;
	}
	
	/**
	 * @deprecated:组装物料数据
	 * @author Colley.Bai  
	 * @date 2018年12月8日
	 * @param eoEoom2EobrModelList
	 * @param sheet
	 * @param eorbBookingRemark
	 */
	public void updateExcelContenteoEoom(List<EoEoom2EobrModel> eoEoom2EobrModelList,WritableSheet sheet, String eorbBookingRemark ,Long eorbEscoId){
		this.clearExcel(sheet);
		int count = 0;
		Double eobmGrossWeightTotal = 0.00;
		Double eobmNetWeightTotal = 0.00;
		Double eobmVolumeTotal = 0.00;
		WritableFont wfPublic = new  WritableFont(WritableFont.ARIAL, 8);
		WritableCellFormat titleLeft = new WritableCellFormat(wfPublic);
		WritableCellFormat wcfButtom = new   WritableCellFormat(wfPublic); 
		WritableCellFormat wcfRight = new   WritableCellFormat(wfPublic); 
		WritableCellFormat wcfRightAndRightAlignment = new   WritableCellFormat(wfPublic); 
		WritableCellFormat wcfAll = new   WritableCellFormat(wfPublic);
		
		WritableFont writableFont = new  WritableFont(WritableFont.ARIAL, 8,WritableFont.BOLD);
		WritableCellFormat wcfRightMedium = new   WritableCellFormat(writableFont);
		try {
		wcfRight.setWrap(true);//自动换行
		wcfRight.setAlignment(Alignment.CENTRE);
		wcfRight.setVerticalAlignment(VerticalAlignment.CENTRE);
		wcfRightAndRightAlignment.setWrap(true);//自动换行
		wcfRightAndRightAlignment.setAlignment(Alignment.LEFT);
		wcfRightAndRightAlignment.setVerticalAlignment(VerticalAlignment.TOP);
		titleLeft.setWrap(true);//自动换行
		wcfButtom.setWrap(true);//自动换行
		wcfButtom.setAlignment(Alignment.CENTRE);
		wcfRight.setBorder(jxl.format.Border.RIGHT,jxl.format.BorderLineStyle.MEDIUM);	//设置右边框
		wcfRightAndRightAlignment.setBorder(jxl.format.Border.RIGHT,jxl.format.BorderLineStyle.MEDIUM);	//设置右边框
		titleLeft.setBorder(jxl.format.Border.LEFT,jxl.format.BorderLineStyle.MEDIUM);//设置左边框
	    wcfButtom.setBorder(jxl.format.Border.BOTTOM,jxl.format.BorderLineStyle.MEDIUM);//设置下边框
	    wcfAll.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.MEDIUM);//设置下边框
	    wcfRightMedium.setBorder(jxl.format.Border.RIGHT, jxl.format.BorderLineStyle.MEDIUM);
	    /**
	     * start
	     */
        sheet.addCell(new  Label(0,1,"CARRIER:",wcfRightMedium));
        sheet.addCell(new  Label(0,2,"ETD:",wcfRightMedium));
        sheet.addCell(new  Label(4,5,"",wcfRight));
        sheet.addCell(new  Label(4,10,"",wcfRight));
        sheet.addCell(new  Label(4,15,"",wcfRight));
        sheet.addCell(new  Label(2,19,"",wcfButtom));
	    /**
	     * end
	     */
        CellView cellView = new CellView();  
        cellView.setAutosize(true); //设置自动大小
        
        if (EmptyUtils.isNotEmpty(eoEoom2EobrModelList)) {
        	for (int i=0; i < eoEoom2EobrModelList.size() ; i++) {
        		count ++ ;//记录一共有多少条物料
        		//构造表头，合并单元格，第一个参数是起始列，第二个参数是起始行，第三个参数是终止列，第四个参数是终止行
        		sheet.mergeCells(1, 22+i, 2, 22+i);
        		Label labelEobmMark =   new  Label(0,22+i,eoEoom2EobrModelList.get(i).getEobmMark(),wcfRightAndRightAlignment); //N/M
        		sheet.addCell(labelEobmMark);
        		Label eobmMaterialDescCn =   new  Label(1,22+i,eoEoom2EobrModelList.get(i).getEobmMaterialDescCn(),wcfRightAndRightAlignment); //货物描述
        		
        		int length = 230;
        		if (EmptyUtils.isNotEmpty(eoEoom2EobrModelList.get(i).getEobmMaterialDescCn())){
        			String[] len = eoEoom2EobrModelList.get(i).getEobmMaterialDescCn().split("\n");
        			length = length * len.length;
        		}
        		sheet.setRowView(22+i,length,false);
        		sheet.addCell(eobmMaterialDescCn);
        		Label labelEobmEbmaNameCn =   new  Label(3,22+i,eoEoom2EobrModelList.get(i).getEobmEbmaNameCn(),wcfRight); //货物中文名
        		sheet.addCell(labelEobmEbmaNameCn);
        		
        		List<FilterCondition> filterCondition = new ArrayList<>();
        		filterCondition.add(new FilterCondition("ebcdCode",eoEoom2EobrModelList.get(i).getEobmEbtpPackage(),"="));
        		filterCondition.add(new FilterCondition("ebcdDictionaryType","ORG_PACKAGE","="));
        		filterCondition.add(new FilterCondition("ebcdEscoId",eorbEscoId,"="));
        		List<EbCodeMasterModel> ebCodeMasterModelList = ebCodeMasterManager.findByCondition(filterCondition);
        		if (EmptyUtils.isNotEmpty(ebCodeMasterModelList)) {
        			Label labelEobmQuantity =   new  Label(4,22+i,eoEoom2EobrModelList.get(i).getEobmQuantity()+"  "+ ebCodeMasterModelList.get(0).getEbcdNameCn(),wcfRight); //件数及包装
        			sheet.addCell(labelEobmQuantity);
        		} else {
        			Label labelEobmQuantity =   new  Label(4,22+i,eoEoom2EobrModelList.get(i).getEobmQuantity()+"  ",wcfRight); //件数及包装
        			sheet.addCell(labelEobmQuantity);
        		}
        		Label labelEobmGrossWeight =   new  Label(5,22+i,eoEoom2EobrModelList.get(i).getEobmGrossWeight().toString(),wcfRight); //毛重
        		sheet.addCell(labelEobmGrossWeight);
        		Label labelEobmNetWeight =   new  Label(6,22+i,eoEoom2EobrModelList.get(i).getEobmNetWeight().toString(),wcfRight); //净重
        		sheet.addCell(labelEobmNetWeight);
        		Label labelEobmVolume =   new  Label(7,22+i,eoEoom2EobrModelList.get(i).getEobmVolume().toString(),wcfRight); //体积
        		sheet.addCell(labelEobmVolume);
        		eobmGrossWeightTotal += eoEoom2EobrModelList.get(i).getEobmGrossWeight() == null ? 0.00 : eoEoom2EobrModelList.get(i).getEobmGrossWeight();
        		eobmNetWeightTotal += eoEoom2EobrModelList.get(i).getEobmNetWeight() == null ? 0.00 : eoEoom2EobrModelList.get(i).getEobmNetWeight();
        		eobmVolumeTotal += eoEoom2EobrModelList.get(i).getEobmVolume() == null ? 0.00 : eoEoom2EobrModelList.get(i).getEobmVolume();
        		//构造表头，合并单元格，第一个参数是起始列，第二个参数是起始行，第三个参数是终止列，第四个参数是终止行
        		sheet.mergeCells(1, 22+i, 2, 22+i);
        	}
        } else {
        	count += 1;
        	sheet.mergeCells(1, 22, 2, 22);
    		Label labelEobmMark =   new  Label(0,22,"",wcfAll); //N/M
    		sheet.addCell(labelEobmMark);
    		Label labelEobmEbmaNameEn =   new  Label(1,22,"",wcfAll); //货名规格及货号
    		sheet.addCell(labelEobmEbmaNameEn);
    		Label labelEobmQuantity =   new  Label(4,22,"",wcfAll); //件数及包装
    		sheet.addCell(labelEobmQuantity);
    		Label labelEobmGrossWeight =   new  Label(5,22,"",wcfAll); //毛重
    		sheet.addCell(labelEobmGrossWeight);
    		Label labelEobmNetWeight =   new  Label(6,22,"",wcfAll); //净重
    		sheet.addCell(labelEobmNetWeight);
    		Label labelEobmVolume =   new  Label(7,22,"",wcfAll); //体积
    		sheet.addCell(labelEobmVolume);
    		//构造表头，合并单元格，第一个参数是起始列，第二个参数是起始行，第三个参数是终止列，第四个参数是终止行
    		sheet.mergeCells(1, 22, 2, 22);
        }
		
		//WritableFont.ARIAL（字体） 8号  WritableFont.BOLD加粗
		WritableFont wf = new  WritableFont(WritableFont.ARIAL, 8, WritableFont.BOLD);
        WritableCellFormat wcf = new   WritableCellFormat(wf); 
		wcf.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.MEDIUM);
		//Total
		Label labelTotal1 = new Label(0,22+count,"Total",wcf); 
		sheet.addCell(labelTotal1);
		Label labelTotal2 = new Label(1,22+count,"",wcf); 
		sheet.addCell(labelTotal2);
		Label labelTotal3 = new Label(2,22+count,"",wcf); 
		sheet.addCell(labelTotal3);
		Label labelTotal4 = new Label(3,22+count,"",wcf); 
		sheet.addCell(labelTotal4);
		Label labelTotal5 = new Label(4,22+count,"",wcf); 
		sheet.addCell(labelTotal5);
		sheet.mergeCells(1, 22+count, 3, 22+count);
        
        WritableCellFormat wcfTotal = new   WritableCellFormat(wfPublic);
        wcfTotal.setVerticalAlignment(VerticalAlignment.CENTRE);
        wcfTotal.setAlignment(Alignment.CENTRE);
        wcfTotal.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.MEDIUM);
        //总价
        BigDecimal afterEobmGrossWeightTotal = new BigDecimal(eobmGrossWeightTotal);  
		Double  afterEobmGrossWeightTotalTotal = afterEobmGrossWeightTotal.setScale(3,   BigDecimal.ROUND_HALF_UP).doubleValue();
        sheet.addCell(new  Label(5,22+count,afterEobmGrossWeightTotalTotal.toString(),wcfTotal));
        BigDecimal afterEobmNetWeight = new BigDecimal(eobmNetWeightTotal);  
		Double  afterEobmNetWeightTotal = afterEobmNetWeight.setScale(3,   BigDecimal.ROUND_HALF_UP).doubleValue();
        sheet.addCell(new  Label(6,22+count,afterEobmNetWeightTotal.toString(),wcfTotal));
        BigDecimal afterEobmVolume = new BigDecimal(eobmVolumeTotal);  
		Double  afterEobmVolumeTotal = afterEobmVolume.setScale(3,   BigDecimal.ROUND_HALF_UP).doubleValue();
        sheet.addCell(new  Label(7,22+count, afterEobmVolumeTotal.toString(),wcfTotal));
        //备注
        Label labelTotalRemarks =   new   Label(0,23+count,"Remarks",wcfRightMedium); 
        sheet.addCell(labelTotalRemarks);
        
        //给备注和并的单元格增加左右边框
        for (int k = 0;k< 6;k++) {
        	sheet.addCell(new Label(7,23+count+k,"",wcfRight));
        	sheet.addCell(new Label(4,23+count+k,"",titleLeft));
        	sheet.addCell(new Label(1,23+count+k,"",titleLeft));
        }
        
    	WritableCellFormat titleFormat2 = new WritableCellFormat(wfPublic);
    	titleFormat2.setVerticalAlignment(VerticalAlignment.TOP);   //设置居中对齐 
        titleFormat2.setWrap(true);
        sheet.addCell(new Label(1,23+count,eorbBookingRemark,titleFormat2));
    	
        //增加下边框
		sheet.addCell(new Label(0,28+count,"",wcfButtom));
		sheet.addCell(new Label(4,28+count,"",wcfButtom));
		sheet.addCell(new Label(5,28+count,"",wcfButtom));
		sheet.addCell(new Label(6,28+count,"",wcfButtom));
		sheet.addCell(new Label(7,28+count,"",wcfButtom));
		sheet.addCell(new Label(1,28+count,"",wcfTotal));
		sheet.addCell(new Label(2,28+count,"",wcfButtom));
		sheet.addCell(new Label(3,28+count,"",wcfTotal));
		sheet.addCell(new Label(8,28+count,"",titleLeft));
		
		sheet.mergeCells(1, 23+count, 3, 28+count);
		} catch (WriteException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * @deprecated:清除物料数据
	 * @author Colley.Bai  
	 * @date 2018年12月8日
	 * @param sheet
	 */
	public void clearExcel(WritableSheet sheet){
		for (int i =0 ;i <= 30;i++) {
			sheet.removeRow(22+i);//移除一行
			sheet.insertRow(22+i);//增加一行
		}
	}
	
	/**
	 * 查询委托书的Excel附件
	 * @author Shoven.Jiang  
	 * @date 2018年10月29日
	 * @param filePath  文件存放地址
	 * @param emailTitle 邮件名称
	 * @param enclosureName 附件名称
	 * @param emailContent  邮件内容
	 */
	private void createEmailFileByExcel(ByteArrayOutputStream byteArrayOutputStream, String emailTitle, String enclosureName, String emailContent,String email,String eorbId) {
		String[] emails = null ;
		if (null != eorbId) {
			emails =  this.getEbCustomerContactEmailsbyEorbId(Long.valueOf(eorbId));
		}
		DataSource dataSource = null;
		SendMailUtil sendMailUtil = new SendMailUtil();
		//注： 如果有主从发送邮件启用
//		sendMailUtil.setAddress("lmsupport@sinotrans.com", email, emailTitle);
		sendMailUtil.addAddress("lmsupport@sinotrans.com", emails, emailTitle);
		sendMailUtil.setAffix("", enclosureName);
		//主发送人（多人）
		Map<String,String> contentMap = new HashMap<String, String>();
		contentMap.put("date", emailContent);
		contentMap.put("customerName", "1111");
		contentMap.put("address", "详细内容请见附件！");
		contentMap.put("contact", "22222");
		//拼接文件ids
		StringBuilder servicerIds = new StringBuilder();
		List<FilterCondition> eoddFilterCondition = new ArrayList<>();
		eoddFilterCondition.add(new FilterCondition("ebflSubstr5", eorbId ,"="));
		List<EbFileModel> ebFileModelList = ebFileManager.findByCondition(eoddFilterCondition);
		if (EmptyUtils.isNotEmpty(ebFileModelList)) {
			for (EbFileModel ebFileModel : ebFileModelList) {
				servicerIds.append(ebFileModel.getEbflServicerId()).append(",");
			}
		}
		if (EmptyUtils.isNotEmpty(servicerIds.toString())) {
			String fileServiceUrlZip = this.getServiceUrl(Constants.FILE_SERVICE_URL_ZIP);//服务器地址-压缩
			contentMap.put("servicerIds", fileServiceUrlZip + "?ids="+servicerIds.toString());
			contentMap.put("servicerAffixName", "订舱资料.zip");
		}
		if (EmptyUtils.isNotEmpty(emails)) {
			sendMailUtil.sendEmailByFileTypeStreamFroms(contentMap, byteArrayOutputStream);				  
		}
		
	}
	
	/**
	 * @deprecated:根据订舱任务获取分供商邮件地址（默认联系人）
	 * @author Colley.Bai  
	 * @date 2018年11月19日
	 * @param eorbId
	 * @return
	 */
	public String getEbCustomerContactEmailbyEorbId(Long eorbId){
    	String email = "";
    	String ebccIsDefault = "";
		if (null != eorbId){
			EoRequestBookingModel eoRequestBookingModel = eoBookingManager.get(eorbId);
			if (null != eoRequestBookingModel.getEorbBookingAgentId()) {//订舱代理ID
				List<EbCustomerContactModel> ebCustomerContactList = ebCustomerManager.getEbCustomerContactByEbcuId(eoRequestBookingModel.getEorbBookingAgentId());
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
	 * @deprecated:组装多个收件人（除默认联系人之外）
	 * @author Colley.Bai  
	 * @date 2018年12月27日
	 * @param eorbId
	 * @return
	 */
	public String[] getEbCustomerContactEmailsbyEorbId(Long eorbId){
		String[] email = null;
    	String ebccIsDefault = "";
		if (null != eorbId){
			EoRequestBookingModel eoRequestBookingModel = eoBookingManager.get(eorbId);
			if (null != eoRequestBookingModel.getEorbBookingAgentId()) {//订舱代理ID
				List<EbCustomerContactModel> ebCustomerContactList = ebCustomerManager.getEbCustomerContactByEbcuId(eoRequestBookingModel.getEorbBookingAgentId());
				email = new String[ebCustomerContactList.size()];
				for (int i=0;i<ebCustomerContactList.size();i++) {
					ebccIsDefault = ebCustomerContactList.get(i).getEbccIsDefault();
//					if (EmptyUtils.isNotEmpty(ebCustomerContactList.get(i).getEbccEmail()) && (EmptyUtils.isEmpty(ebccIsDefault) || Constants.NO.equals(ebccIsDefault)) ) {
//						email[i] = ebCustomerContactList.get(i).getEbccEmail();
//					}
					if (EmptyUtils.isNotEmpty(ebCustomerContactList.get(i).getEbccEmail())) {
						email[i] = ebCustomerContactList.get(i).getEbccEmail();
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
