package com.sinotrans.oms.businessrequest.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.basicdata.manager.EbCodeMasterManager;
import com.sinotrans.oms.basicdata.model.EbCodeMasterModel;
import com.sinotrans.oms.businessrequest.manager.EoEoddBillManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EobrManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EodmManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEorb2EosrManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoBookingService;
import com.sinotrans.oms.businessrequest.service.EoRequestBookingSendEmailService;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeSendEmailService;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeService;
import com.sinotrans.oms.businessrequest.service.EoRequestSendEmailService;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.tool.SendMailUtil;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.fileupload.manager.EbFileManager;
import com.sinotrans.oms.fileupload.model.EbFileModel;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsUserModel;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.VerticalAlignment;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**  
* Title: EoRequestSendEmailServiceImpl  
* Description:  业务请求下达时，发送委托书给联系人，异步线程处理
* @author Colley.Bai
* @date 2018年10月30日  
* @version 1.0  
*/
@Service
public class EoRequestDeclarationDeputeSendEmailServiceImpl extends BaseAspect implements EoRequestDeclarationDeputeSendEmailService {

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
	private EoEoom2EodmManager eoEoom2EodmManager;//物料
	@Autowired
	private EoEooc2EoddManager eoEooc2EoddManager;//集装箱
	@Autowired
	private EoEoddBillManager eoEoddBillManager;//随附单据
	@Autowired
	private EbCodeMasterManager ebCodeMasterManager;//
	@Autowired
	private EbCustomerManager ebCustomerManager;
	@Autowired
	private EbFileManager ebFileManager;
	@Autowired
	private EsControlParamManager esControlParamManager;
	
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
		WritableFont writableFont = new  WritableFont(WritableFont.ARIAL, 12);
		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);

		//		label.setCellFormat(cellFormat);//将修改后的单元格的格式设定成跟原来一样(合并的单元格格式无法加载到单个的单元格上面)
		try {
			writableCellFormat.setWrap(true);//自动换行
			writableCellFormat.setBorder(jxl.format.Border.LEFT,jxl.format.BorderLineStyle.THIN);	//设置右边框
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
	 * @param eoddId  报关主键
	 */
	private void createEmailFileByExcel(ByteArrayOutputStream byteArrayOutputStream, String emailTitle, String enclosureName, String emailContent, String email ,String eoddId) {
		String[] emails = null;
		if (null != eoddId) {
			emails = this.getEbCustomerContactEmailsbyEoddId(Long.valueOf(eoddId));
		}
		DataSource dataSource = null;
		SendMailUtil sendMailUtil = new SendMailUtil();
//		sendMailUtil.setAddress("lmsupport@sinotrans.com",email, emailTitle);
		sendMailUtil.addAddress("lmsupport@sinotrans.com",emails, emailTitle);
		sendMailUtil.setAffix("", enclosureName);
		Map<String,String> contentMap = new HashMap<String, String>();
		contentMap.put("date", emailContent);
		contentMap.put("customerName", "1111");
		contentMap.put("address", "详细内容请见附件！");
		contentMap.put("contact", "22222");
		//拼接文件ids
		StringBuilder eoddIdServicerIds = new StringBuilder();
		List<FilterCondition> eoddFilterCondition = new ArrayList<>();
		eoddFilterCondition.add(new FilterCondition("ebflSubstr3", eoddId ,"="));
		List<EbFileModel> ebFileModelList = ebFileManager.findByCondition(eoddFilterCondition);
		if (EmptyUtils.isNotEmpty(ebFileModelList)) {
			for (EbFileModel ebFileModel : ebFileModelList) {
				eoddIdServicerIds.append(ebFileModel.getEbflServicerId()).append(",");
			}
		}
		if (EmptyUtils.isNotEmpty(eoddIdServicerIds.toString())) {
			String fileServiceUrlZip = this.getServiceUrl(Constants.FILE_SERVICE_URL_ZIP);//服务器地址-压缩
			contentMap.put("servicerIds", fileServiceUrlZip + "?ids="+eoddIdServicerIds.toString());
			contentMap.put("servicerAffixName", "报关资料.zip");
		}
		sendMailUtil.sendEmailByFileTypeStreamFroms(contentMap, byteArrayOutputStream);				  
		
	}
	@Override
	@Async("threadPoolBean")
	public void assembleIssuedDeclarationDeputeEntrust(Long[] eoddIds, Long userId) throws WriteException, IOException {
		Map<String, Object> entrustDeclarationDeputeMap = new HashMap<>();
		for (int i = 0; i < eoddIds.length; i++) {
			EsUserModel esUserModel = new EsUserModel();
			Long eoddId = eoddIds[i];
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel = eoRequestDeclarationDeputeManager.get(eoddId);
			
			//报关集装箱查询
			List<FilterCondition> eocdCondition = new ArrayList<>();
			eocdCondition.add(new FilterCondition("eocdEoddId", eoddId, "="));
			List<EoEooc2EoddModel> eoEooc2EoddList = this.eoEooc2EoddManager.findByCondition(eocdCondition);

			//报关物料查询
			List<FilterCondition> eodmCondition = new ArrayList<>();
			eodmCondition.add(new FilterCondition("eodmEoddId", eoddId, "="));
			List<EoEoom2EodmModel> eoEoom2EodmList = this.eoEoom2EodmManager.findByCondition(eodmCondition);
			
			//报关随附单据查询
			List<FilterCondition> eoebCondition = new ArrayList<>();
			eoebCondition.add(new FilterCondition("eoebEoddId", eoddId, "="));
			List<EoEoddBillModel> eoEoddBillList = this.eoEoddBillManager.findByCondition(eoebCondition);
			
			if (null != userId) {
				esUserModel = this.esUserManager.get(userId);
			}
			
			String email = getEbCustomerContactEmailbyEoddId(eoddId);
			
			entrustDeclarationDeputeMap = this.assembleDeclarationDeputeEntrust(eoRequestDeclarationDeputeModel, eoEooc2EoddList, eoEoom2EodmList, eoEoddBillList, esUserModel);
			//将组装好的拖车委托书信息保存到excel中
			this.sendEmailAfterIssuedDeclarationDepute(entrustDeclarationDeputeMap, email);
		}
		
	}

	/**
	 * @deprecated:组装报关委托书信息
	 * @author Colley.Bai  
	 * @date 2018年10月30日 下午04:12:23 
	 * @param eoRequestDeclarationDeputeModel 报关
	 * @param eoEooc2EoddList 集装箱
	 * @param eoEoom2EodmList 物料
	 * @param eoEoddBillList 随附单据
	 * @param esUserModel 用户
	 * @return
	 */
	private Map<String, Object> assembleDeclarationDeputeEntrust(
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel, List<EoEooc2EoddModel> eoEooc2EoddList,
			List<EoEoom2EodmModel> eoEoom2EodmList, List<EoEoddBillModel> eoEoddBillList, EsUserModel esUserModel) {
		Map<String, Object> declarationDeputeEntrust = new HashMap<>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		EoRequestBookingModel eoRequestBookingModel = new EoRequestBookingModel();
		Date eoddRequiredTime = null;// 要求报关时间
		//报关
		if (null != eoRequestDeclarationDeputeModel) {
			Long eoorId = eoRequestDeclarationDeputeModel.getEoddEoorId();
			eoddRequiredTime = eoRequestDeclarationDeputeModel.getEoddRequiredTime();
			if (null != eoorId) {
				List<FilterCondition> eorbCondition = new ArrayList<>();
				eorbCondition.add(new FilterCondition("eorbEoorId", eoorId, "="));
				List<EoRequestBookingModel> eoRequestBookingModels = this.eoRequestBookingManager.findByCondition(eorbCondition);
				if (EmptyUtils.isNotEmpty(eoRequestBookingModels)) {
					eoRequestBookingModel = eoRequestBookingModels.get(0);
				}
			}
			String eoddDeclareCustom  = eoRequestDeclarationDeputeModel.getEoddDeclareCustom();//海关编码  
			String eoddBusinessUnitName  = eoRequestDeclarationDeputeModel.getEoddBusinessUnitName();//境内发货人 
			
			String eoddPortCode  = eoRequestDeclarationDeputeModel.getEoddPortCode();//出境关别
			List<FilterCondition> eoddPortCodeCondition = new ArrayList<>();
			eoddPortCodeCondition.add(new FilterCondition("ebcdCode",eoddPortCode,"="));
			List<EbCodeMasterModel> eoddPortCodes = ebCodeMasterManager.findByCondition(eoddPortCodeCondition);
			
			Date eoddIeDate  = eoRequestDeclarationDeputeModel.getEoddIeDate();//出口日期  
			String eoddIeDateFormatter = "";
			if (null != eoddIeDate) {
				eoddIeDateFormatter = formatter.format(eoddIeDate);
			}
			
			Date eoddFilingDate  = eoRequestDeclarationDeputeModel.getEoddFilingDate();//申报日期   
			String eoddFilingDateFormatter = "";
			if (null != eoddFilingDate) {
				eoddFilingDateFormatter = formatter.format(eoddFilingDate);
			}
			String eoddRecordNumber  = eoRequestDeclarationDeputeModel.getEoddRecordNumber();//备案号 
			String eoddOverseasConsigneeName  = eoRequestDeclarationDeputeModel.getEoddOverseasConsigneeName();//境外收货人
			
			String eoddOverseasConsigneeCode  = eoRequestDeclarationDeputeModel.getEoddOverseasConsigneeCode();//运输方式
			List<FilterCondition> eoddOverseasConsigneeCodeCondition = new ArrayList<>();
			eoddOverseasConsigneeCodeCondition.add(new FilterCondition("ebcdCode",eoddOverseasConsigneeCode,"="));
			List<EbCodeMasterModel> eoddOverseasConsigneeCodeConditions = ebCodeMasterManager.findByCondition(eoddOverseasConsigneeCodeCondition);
			
			String eoddTransportName  = eoRequestDeclarationDeputeModel.getEoddTransportName();//运输工具
			String eoddBlNo  = eoRequestDeclarationDeputeModel.getEoddBlNo();//提运单号
			String eoddShipperUnitName  = eoRequestDeclarationDeputeModel.getEoddShipperUnitName();//生产销售单位
			
			String eoddTradeTerms  = eoRequestDeclarationDeputeModel.getEoddTradeTerms();//监管方式
			List<FilterCondition> eoddTradeTermsCondition = new ArrayList<>();
			eoddTradeTermsCondition.add(new FilterCondition("ebcdCode",eoddTradeTerms,"="));
			List<EbCodeMasterModel> eoddTradeTermsConditions = ebCodeMasterManager.findByCondition(eoddTradeTermsCondition);
			
			String eoddCutMode  = eoRequestDeclarationDeputeModel.getEoddCutMode();//征免性质
			List<FilterCondition> eoddCutModeCondition = new ArrayList<>();
			eoddCutModeCondition.add(new FilterCondition("ebcdCode",eoddCutMode,"="));
			List<EbCodeMasterModel> eoddCutModeConditions = ebCodeMasterManager.findByCondition(eoddCutModeCondition);
			
			String eoddLicenseNo  = eoRequestDeclarationDeputeModel.getEoddLicenseNo();//许可证号
			String eoddContractNo  = eoRequestDeclarationDeputeModel.getEoddContractNo();//合同协议号
			String eoddTradeCountryName  = eoRequestDeclarationDeputeModel.getEoddTradeCountryName();//贸易国
			String eoddCountryOfDestination  = eoRequestDeclarationDeputeModel.getEoddCountryOfDestination();//运抵国
			String eoddFinalDestinationName  = eoRequestDeclarationDeputeModel.getEoddFinalDestinationName();//指运港
			
			String eoddDepartureProt  = eoRequestDeclarationDeputeModel.getEoddDepartureProt();//离境口岸
			List<FilterCondition> eoddDepartureProtCondition = new ArrayList<>();
			eoddDepartureProtCondition.add(new FilterCondition("ebcdCode",eoddDepartureProt,"="));
			List<EbCodeMasterModel> eoddDepartureProtas = ebCodeMasterManager.findByCondition(eoddDepartureProtCondition);
			
			String eoddPackageType  = eoRequestDeclarationDeputeModel.getEoddPackageType();//包装种类
			List<FilterCondition> eoddPackageTypeCondition = new ArrayList<>();
			eoddPackageTypeCondition.add(new FilterCondition("ebcdCode",eoddPackageType,"="));
			List<EbCodeMasterModel> eoddPackageTypes = ebCodeMasterManager.findByCondition(eoddPackageTypeCondition);
			
			Double eoddGrossWeight  = eoRequestDeclarationDeputeModel.getEoddGrossWeight();//毛重
			Double eoddNetWeight  = eoRequestDeclarationDeputeModel.getEoddNetWeight() == null ? 0.00 : eoRequestDeclarationDeputeModel.getEoddNetWeight();//净重
			
			String eoddTransactionMode  = eoRequestDeclarationDeputeModel.getEoddTransactionMode();//成交方式
			List<FilterCondition> eoddTransactionModeCondition = new ArrayList<>();
			eoddTransactionModeCondition.add(new FilterCondition("ebcdCode",eoddTransactionMode,"="));
			List<EbCodeMasterModel> eoddTransactionModes = ebCodeMasterManager.findByCondition(eoddTransactionModeCondition);
			
			Double eoddFee  = eoRequestDeclarationDeputeModel.getEoddFee();//运费
			Double eoddInsurFee  = eoRequestDeclarationDeputeModel.getEoddInsurFee();//保费
			Double eoddOtherFee  = eoRequestDeclarationDeputeModel.getEoddOtherFee();//杂费
			
			Long eoddQuantity  = eoRequestDeclarationDeputeModel.getEoddQuantity();//件数
			
			Long eoddId  = eoRequestDeclarationDeputeModel.getEoddId();//件数
			
			declarationDeputeEntrust.put("eoddId", eoddId);
			declarationDeputeEntrust.put("eoddDeclareCustom", eoddDeclareCustom);
			declarationDeputeEntrust.put("eoddBusinessUnitName", eoddBusinessUnitName);
			if (EmptyUtils.isNotEmpty(eoddPortCodes)) {
				declarationDeputeEntrust.put("eoddPortCode", eoddPortCodes.get(0).getEbcdNameCn());
			} else {
				declarationDeputeEntrust.put("eoddPortCode", eoddPortCode);
			}
			declarationDeputeEntrust.put("eoddIeDateFormatter", eoddIeDateFormatter);
			declarationDeputeEntrust.put("eoddFilingDateFormatter", eoddFilingDateFormatter);
			declarationDeputeEntrust.put("eoddRecordNumber", eoddRecordNumber);
			declarationDeputeEntrust.put("eoddOverseasConsigneeName", eoddOverseasConsigneeName);
			if (EmptyUtils.isNotEmpty(eoddOverseasConsigneeCodeConditions)) {
				declarationDeputeEntrust.put("eoddOverseasConsigneeCode", eoddOverseasConsigneeCodeConditions.get(0).getEbcdNameCn());
			} else {
				declarationDeputeEntrust.put("eoddOverseasConsigneeCode", eoddOverseasConsigneeCode);
			}
			declarationDeputeEntrust.put("eoddTransportName", eoddTransportName);
			declarationDeputeEntrust.put("eoddBlNo", eoddBlNo);
			declarationDeputeEntrust.put("eoddShipperUnitName", eoddShipperUnitName);
			if (EmptyUtils.isNotEmpty(eoddTradeTermsConditions)) {
				declarationDeputeEntrust.put("eoddTradeTerms", eoddTradeTermsConditions.get(0).getEbcdNameCn());
			} else {
				declarationDeputeEntrust.put("eoddTradeTerms", eoddTradeTerms);
				
			}
			if (EmptyUtils.isNotEmpty(eoddCutModeConditions)) {
				declarationDeputeEntrust.put("eoddCutMode", eoddCutModeConditions.get(0).getEbcdNameCn());
			} else {
				declarationDeputeEntrust.put("eoddCutMode", eoddCutMode);
			}
			
			Double aftereoddNetWeight  = eoRequestDeclarationDeputeModel.getEoddNetWeight()==null?1.0:eoRequestDeclarationDeputeModel.getEoddNetWeight();//净重用来做计算

			declarationDeputeEntrust.put("eoddQuantityAndNetWeight", Math.floor(aftereoddNetWeight/250));
			declarationDeputeEntrust.put("eoddLicenseNo", eoddLicenseNo);
			declarationDeputeEntrust.put("eoddContractNo", eoddContractNo);
			declarationDeputeEntrust.put("eoddTradeCountryName", eoddTradeCountryName);
			declarationDeputeEntrust.put("eoddCountryOfDestination", eoddCountryOfDestination);
			declarationDeputeEntrust.put("eoddFinalDestinationName", eoddFinalDestinationName);
			if (EmptyUtils.isNotEmpty(eoddDepartureProtas)) {
				declarationDeputeEntrust.put("eoddDepartureProt", eoddDepartureProtas.get(0).getEbcdNameCn());
			} else {
				declarationDeputeEntrust.put("eoddDepartureProt", eoddDepartureProt);
			}
			if (EmptyUtils.isNotEmpty(eoddPackageTypes)) {
				declarationDeputeEntrust.put("eoddPackageType", eoddPackageTypes.get(0).getEbcdNameCn());
			} else {
				declarationDeputeEntrust.put("eoddPackageType", eoddPackageType);
			}
			declarationDeputeEntrust.put("eoddGrossWeight", eoddGrossWeight);
			declarationDeputeEntrust.put("eoddNetWeight", eoddNetWeight);
			if (EmptyUtils.isNotEmpty(eoddTransactionModes)) {
				declarationDeputeEntrust.put("eoddTransactionMode", eoddTransactionModes.get(0).getEbcdNameCn());
			} else {
				declarationDeputeEntrust.put("eoddTransactionMode", eoddTransactionMode);
			}
			declarationDeputeEntrust.put("eoddFee", eoddFee);
			declarationDeputeEntrust.put("eoddInsurFee", eoddInsurFee);
			declarationDeputeEntrust.put("eoddOtherFee", eoddOtherFee);
			
			declarationDeputeEntrust.put("eoddMark", eoRequestDeclarationDeputeModel.getEoddMark());//备注
			declarationDeputeEntrust.put("eoddMarkNo", eoRequestDeclarationDeputeModel.getEoddMarkNo());
		}
		declarationDeputeEntrust.put("eoEoom2EodmList", eoEoom2EodmList);
		//集装箱
		if (EmptyUtils.isNotEmpty(eoEooc2EoddList)) {
			
		}
		
		//物料
		if (EmptyUtils.isNotEmpty(eoEoom2EodmList)) {
			String eodmMaterialNo = "";
			for (EoEoom2EodmModel eoEoom2EodmModel : eoEoom2EodmList) {
				eodmMaterialNo = eoEoom2EodmModel.getEodmMaterialNo();
			}
		}
		
		//随附单据
		if (EmptyUtils.isNotEmpty(eoEoddBillList)) {
			declarationDeputeEntrust.put("eoEoddBillList", eoEoddBillList);
		}
		//用户信息
		if (null != esUserModel) {
			Long esusEscoId = esUserModel.getEsusEscoId();
			declarationDeputeEntrust.put("esusEscoId",esusEscoId);
		}
		//邮件标题 || 邮件内容
		Date etd = null;
		String eorbVesselName = "";//船名
		String eorbVoyage = "";//船次
		String eorbBulkBillNo = "";//提单号
		String eorbEtdFormat = "";//预计开航时间
		String eoddRequiredDate = "";//要求报关时间
		if (null != eoRequestBookingModel) {
			etd = eoRequestBookingModel.getEorbEtd();
			Date eorbEtd = eoRequestBookingModel.getEorbEtd();//预计开航日期
			if (null != eorbEtd) {
				eorbEtdFormat = formatter.format(eorbEtd);
			}
			eorbVesselName = EmptyUtils.isEmpty(eoRequestBookingModel.getEorbVesselName()) ? "" : eoRequestBookingModel.getEorbVesselName();//船名
			eorbVoyage = EmptyUtils.isEmpty(eoRequestBookingModel.getEorbVoyage()) ? "" : eoRequestBookingModel.getEorbVoyage();//航次
			eorbBulkBillNo = EmptyUtils.isEmpty(eoRequestBookingModel.getEorbBulkBillNo()) ? "" : eoRequestBookingModel.getEorbBulkBillNo();//提单号
			//add by Colley.Bai 如果订舱没有，直接赋值报关任务的
			eorbVesselName = EmptyUtils.isEmpty(eorbVesselName) ? EmptyUtils.isEmpty(eoRequestDeclarationDeputeModel.getEoddVessel()) ? "" : eoRequestDeclarationDeputeModel.getEoddVessel() : eorbVesselName;//船名
			eorbVoyage = EmptyUtils.isEmpty(eorbVoyage) ? EmptyUtils.isEmpty(eoRequestDeclarationDeputeModel.getEoddVoyage()) ? "" : eoRequestDeclarationDeputeModel.getEoddVoyage() : eorbVoyage;//航次
			eorbBulkBillNo = EmptyUtils.isEmpty(eorbBulkBillNo) ? EmptyUtils.isEmpty(eoRequestDeclarationDeputeModel.getEoddBlNo()) ? "" : eoRequestDeclarationDeputeModel.getEoddBlNo()  : eorbBulkBillNo;//提单号
			
		}
		String emailTitle = "ETD：" + eorbEtdFormat + " 船名：" + eorbVesselName + " 航次：" + eorbVoyage + " 提单号：" + eorbBulkBillNo + " 报关资料";
		String emailContent = "";//邮件正文
		if (null != eoddRequiredTime) {
			eoddRequiredDate = formatter.format(eoddRequiredTime);
			emailContent = "请安排" + eoddRequiredDate + "报关。";
		} else {
			emailContent = "请等通知！";
		}
		declarationDeputeEntrust.put("emailTitle", emailTitle);
		declarationDeputeEntrust.put("emailContent", emailContent);
		return declarationDeputeEntrust;
	}
	//判断字符串为空的
	public String isNotNull(String name){
		if(EmptyUtils.isEmpty(name)){
			return "";
		} else {
			return name;
		}
		
	}
	@Override
	@SuppressWarnings("unchecked")
	public void sendEmailAfterIssuedDeclarationDepute(Map<String, Object> entrustDeclarationDeputeMap, String email) throws WriteException, IOException {
		//创建Excel路径
//	    String path = EoRequestDeclarationDeputeSendEmailServiceImpl.class.getClassLoader().getResource("com/sinotrans/oms/file/depart.xls").getPath();
	    String path = "com/sinotrans/oms/file/depart.xls";
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
                
                String eoddDeclareCustom = (String) entrustDeclarationDeputeMap.get("eoddDeclareCustom");
                
                WritableFont writableFont = new  WritableFont(WritableFont.ARIAL, 12);
        		WritableCellFormat writable = new WritableCellFormat(writableFont);
        		writable.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.THIN);
                sheet.addCell(new Label(0, 1, "预录入编号："                                                                   
                								+"                                                                                                    "
                								+ "海关编号："+                                                
                								this.isNotNull(eoddDeclareCustom)
                								+"                                                                                                     "
                								+ "页码/页数：", writable));
                this.updateExcelContent(3, 0, entrustDeclarationDeputeMap.get("eoddBusinessUnitName"), sheet);//境内发货人 
                this.updateExcelContent(3, 2, entrustDeclarationDeputeMap.get("eoddPortCode"), sheet);//出境关别 
                this.updateExcelContent(3, 4, entrustDeclarationDeputeMap.get("eoddIeDateFormatter"), sheet);//出口日期
                this.updateExcelContent(3, 6, entrustDeclarationDeputeMap.get("eoddFilingDateFormatter"), sheet);//申报日期
                
                this.updateExcelContent(3, 7, entrustDeclarationDeputeMap.get("eoddRecordNumber"), sheet);//备案号
                
                this.updateExcelContent(5, 0, entrustDeclarationDeputeMap.get("eoddOverseasConsigneeName"), sheet);//境外发货人
                this.updateExcelContent(5, 2, entrustDeclarationDeputeMap.get("eoddOverseasConsigneeCode"), sheet);//运输方式
                this.updateExcelContent(5, 4, entrustDeclarationDeputeMap.get("eoddTransportName"), sheet);//运输工具
                this.updateExcelContent(5, 6, entrustDeclarationDeputeMap.get("eoddBlNo"), sheet);//提运单号
                this.updateExcelContent(7, 0, entrustDeclarationDeputeMap.get("eoddShipperUnitName"), sheet);//生产销售单位
                this.updateExcelContent(7, 2, entrustDeclarationDeputeMap.get("eoddTradeTerms"), sheet);//监管方式
                this.updateExcelContent(7, 4, entrustDeclarationDeputeMap.get("eoddCutMode"), sheet);//征免性质
                this.updateExcelContent(7, 6, entrustDeclarationDeputeMap.get("eoddLicenseNo"), sheet);//许可证号
                this.updateExcelContent(9, 0, entrustDeclarationDeputeMap.get("eoddContractNo"), sheet);//合同协议号
                this.updateExcelContent(9, 2, entrustDeclarationDeputeMap.get("eoddTradeCountryName"), sheet);//贸易国
                this.updateExcelContent(9, 4, entrustDeclarationDeputeMap.get("eoddCountryOfDestination"), sheet);//运抵国
                this.updateExcelContent(9, 6, entrustDeclarationDeputeMap.get("eoddFinalDestinationName"), sheet);//指运港
                this.updateExcelContent(9, 7, entrustDeclarationDeputeMap.get("eoddDepartureProt"), sheet);//离境口岸
                this.updateExcelContent(11, 0, entrustDeclarationDeputeMap.get("eoddPackageType"), sheet);//包装种类
                this.updateExcelContent(11, 2, entrustDeclarationDeputeMap.get("eoddQuantityAndNetWeight"), sheet);
                Double eoddQuantityAndNetWeight = (Double) entrustDeclarationDeputeMap.get("eoddQuantityAndNetWeight");//件数
        		WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
        		writableCellFormat.setBorder(jxl.format.Border.RIGHT,jxl.format.BorderLineStyle.THIN);
                sheet.addCell(new Label(2, 11, eoddQuantityAndNetWeight.toString(), writableCellFormat));
                Double eoddGrossWeight = (Double) entrustDeclarationDeputeMap.get("eoddGrossWeight");//毛重
                if (null != eoddGrossWeight) {
                	sheet.addCell(new Label(3, 11, eoddGrossWeight.toString(), writableCellFormat));
                } else {
                	sheet.addCell(new Label(3, 11, "", writableCellFormat));
                }
                Double eoddNetWeight = (Double) entrustDeclarationDeputeMap.get("eoddNetWeight");//净重
                if (null != eoddNetWeight) {
                	sheet.addCell(new Label(4, 11, eoddNetWeight.toString(), writableCellFormat));
                } else {
                	sheet.addCell(new Label(4, 11, "", writableCellFormat));
                }
                String eoddTransactionMode = (String) entrustDeclarationDeputeMap.get("eoddTransactionMode");
                sheet.addCell(new Label(5, 11, eoddTransactionMode, writableCellFormat));
                Double eoddFee = (Double) entrustDeclarationDeputeMap.get("eoddFee");//运费
                if (null != eoddFee) {
                	sheet.addCell(new Label(6, 11, eoddFee.toString(), writableCellFormat));
                } else {
                	sheet.addCell(new Label(6, 11, "", writableCellFormat));
                }
                Double eoddInsurFee = (Double) entrustDeclarationDeputeMap.get("eoddInsurFee");//保费
                if (null != eoddInsurFee) {
                	sheet.addCell(new Label(7, 11, eoddInsurFee.toString(), writableCellFormat));
                } else {
                	sheet.addCell(new Label(7, 11, "", writableCellFormat));
                }
                Double eoddOtherFee = (Double) entrustDeclarationDeputeMap.get("eoddOtherFee");//杂费
                if (null != eoddInsurFee) {
                	sheet.addCell(new Label(8, 11, eoddOtherFee.toString(), writableCellFormat));
                } else {
                	sheet.addCell(new Label(8, 11, "", writableCellFormat));
                }
                
                String eoddMark = (String) entrustDeclarationDeputeMap.get("eoddMark");
                String eoddMarkNo = (String) entrustDeclarationDeputeMap.get("eoddMarkNo");
                WritableFont   wf   =   new   WritableFont(WritableFont.ARIAL,12);
                WritableCellFormat   wcf   =   new   WritableCellFormat(wf); 
                wcf.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.THIN);
                wcf.setWrap(true);//自动换行
                wcf.setVerticalAlignment(VerticalAlignment.TOP);   //设置居中对齐 
                sheet.addCell(new Label(0,13,"标记唛码   "+ ( EmptyUtils.isNotEmpty(eoddMarkNo) ? eoddMarkNo : "" )+"\n"+ "备注   " + ( EmptyUtils.isNotEmpty(eoddMark) ? eoddMark : "" ),wcf));
                //放数据之前清空17到18 start
                clearEodmExcel(sheet);
                //放数据之前清空17到18 end
                
				List<EoEoddBillModel> eoEoddBillModelList = (List<EoEoddBillModel>) entrustDeclarationDeputeMap.get("eoEoddBillList");
                this.updateExcelContenteoEbll(eoEoddBillModelList,sheet);
                
                Long esusEscoId = (Long) entrustDeclarationDeputeMap.get("esusEscoId");
				List<EoEoom2EodmModel> eoEoom2EodmList =  (List<EoEoom2EodmModel>) entrustDeclarationDeputeMap.get("eoEoom2EodmList");
				
//				Double eoddNetWeight = (Double) entrustDeclarationDeputeMap.get("eoddNetWeight");
				if (EmptyUtils.isNotEmpty(eoEoom2EodmList)) {
                	this.updateExcelContenteoEodm(eoEoom2EodmList, sheet, esusEscoId ,eoddNetWeight);
                }
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
            String emailContent = (null == entrustDeclarationDeputeMap.get("emailContent") ? "" : entrustDeclarationDeputeMap.get("emailContent").toString());
            String emailTitle = (null == entrustDeclarationDeputeMap.get("emailTitle") ? "" : entrustDeclarationDeputeMap.get("emailTitle").toString());
            Long eoddId = (Long) entrustDeclarationDeputeMap.get("eoddId");
            this.createEmailFileByExcel(byteArrayOutputStream, emailTitle, "报关委托书.xls", emailContent, email ,eoddId.toString());
		}
	}
	
	/**
	 * @deprecated:组装随附单据数据
	 * @author Colley.Bai  
	 * @date 2018年12月10日
	 * @param eoEoddBillModelList
	 * @param sheet
	 */
	public void updateExcelContenteoEbll(List<EoEoddBillModel> eoEoddBillModelList,WritableSheet sheet){
		String eoEoddBill = "";
		if (EmptyUtils.isNotEmpty(eoEoddBill)) {
			for (EoEoddBillModel eoEoddBillModel : eoEoddBillModelList) {
				eoEoddBill += eoEoddBillModel.getEoebBillName() +" 及 "+ eoEoddBillModel.getEoebBillNo() + "\n";
			}
		}
		WritableFont   wf   =   new   WritableFont(WritableFont.ARIAL,12);
        WritableCellFormat   wcf   =   new   WritableCellFormat(wf); 
        try {
			wcf.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.THIN);
			wcf.setWrap(true);//自动换行
			wcf.setVerticalAlignment(VerticalAlignment.TOP);   //设置居中对齐
			sheet.addCell(new Label(0,12,"随附单证及编号\n"+eoEoddBill,wcf));
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @deprecated:组装物料数据
	 * @author Colley.Bai  
	 * @date 2018年12月10日
	 * @param eoEoom2EodmList
	 * @param sheet
	 * @param esusEscoId
	 * @param eoddNetWeight
	 */
	public void updateExcelContenteoEodm(List<EoEoom2EodmModel> eoEoom2EodmList,WritableSheet sheet,Long esusEscoId,Double eoddNetWeight){
		WritableFont wfPublic = new  WritableFont(WritableFont.ARIAL, 12);
		WritableCellFormat titleLeft = new WritableCellFormat(wfPublic);
		WritableCellFormat wcfButtom = new WritableCellFormat(wfPublic); 
		WritableCellFormat wcfRight = new  WritableCellFormat(wfPublic);
		WritableCellFormat wcfAll = new  WritableCellFormat(wfPublic);
		WritableCellFormat wcfTop = new  WritableCellFormat(wfPublic);
		try {
			wcfRight.setWrap(true);
			titleLeft.setWrap(true);//自动换行
			wcfButtom.setWrap(true);//自动换行
			wcfAll.setWrap(true);//自动换行
			wcfRight.setBorder(jxl.format.Border.RIGHT,jxl.format.BorderLineStyle.THIN);	//设置右边框
			titleLeft.setBorder(jxl.format.Border.LEFT,jxl.format.BorderLineStyle.THIN);//设置左边框
			wcfButtom.setBorder(jxl.format.Border.BOTTOM,jxl.format.BorderLineStyle.THIN);//设置下边框
			wcfAll.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.THIN);//设置所有边框
			wcfTop.setBorder(jxl.format.Border.TOP,jxl.format.BorderLineStyle.THIN);//设置所上边框
			wcfAll.setVerticalAlignment(VerticalAlignment.TOP);   //设置居中对齐
			
			sheet.addCell(new Label(9 ,11,"",titleLeft));
			sheet.addCell(new Label(1 ,11,"",wcfRight));

			int count = 0;
			for (int i=0; i < eoEoom2EodmList.size() ; i++) {
				count ++;
				sheet.setRowView(17+i,650,false);
		        sheet.addCell(new Label(0 ,17+i, (i+1) +  "            |    "+eoEoom2EodmList.get(i).getEodmMaterialNo(),wcfButtom));//商品编码
		        sheet.addCell(new Label(1 ,17+i,eoEoom2EodmList.get(i).getEodmEbmaNameCn()+"及"+ eoEoom2EodmList.get(i).getEodmEbtpModel(),wcfButtom));////商品名称及规格
		        if (null != eoddNetWeight) {
		        	sheet.addCell(new Label(2 ,17+i,eoddNetWeight.toString(),wcfButtom));//净重
		        } else {
		        	sheet.addCell(new Label(2 ,17+i,"",wcfButtom));//净重
		        }
		        //成交单位
		        List<FilterCondition> eodmLegalQuantityUnitCondition = new ArrayList<>();
                String eodmLegalQuantityUnit = eoEoom2EodmList.get(i).getEodmLegalQuantityUnit();
                if (EmptyUtils.isNotEmpty(eoEoom2EodmList.get(i).getEodmLegalQuantityUnit())) {
                	eodmLegalQuantityUnitCondition.add(new FilterCondition("ebcdCode",eodmLegalQuantityUnit,"="));
                	eodmLegalQuantityUnitCondition.add(new FilterCondition("ebcdDictionaryType","ORG_QUANTITY_UNIT","="));
                	eodmLegalQuantityUnitCondition.add(new FilterCondition("ebcdEscoId",esusEscoId,"="));
                	List<EbCodeMasterModel> eodmLegalQuantityUnits = ebCodeMasterManager.findByCondition(eodmLegalQuantityUnitCondition);
                	if (EmptyUtils.isNotEmpty(eodmLegalQuantityUnits)) {
                		sheet.addCell(new Label(3 ,17+i,isNotNull(eodmLegalQuantityUnits.get(0).getEbcdNameCn()),wcfButtom));//成交单位
        			} 
                } else {
            		sheet.addCell(new Label(3 ,17+i,isNotNull(eoEoom2EodmList.get(i).getEodmLegalQuantityUnit()),wcfButtom));//成交单位
                }
                //单价
                Double eodmDealUnitPrice = eoEoom2EodmList.get(i).getEodmDealUnitPrice() == null ? 0.00 : eoEoom2EodmList.get(i).getEodmDealUnitPrice();
        		sheet.addCell(new Label(4 ,17+i,isNotNull(eodmDealUnitPrice.toString()),wcfButtom));
        		//总价
        		Double  totalPrice = eoddNetWeight * eodmDealUnitPrice;
        		
        		BigDecimal bigDecimal = new BigDecimal(totalPrice);  
        		Double  total = bigDecimal.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
        		
        		sheet.addCell(new Label(5 ,17+i, total.toString() ,wcfButtom));
        		
        		List<FilterCondition> eodmCurrencySystemCondition = new ArrayList<>();
                String eodmCurrencySystem = eoEoom2EodmList.get(i).getEodmCurrencySystem();
                if (EmptyUtils.isNotEmpty(eodmCurrencySystem)) {
                	eodmCurrencySystemCondition.add(new FilterCondition("ebcdCode",eodmCurrencySystem,"="));
                	eodmCurrencySystemCondition.add(new FilterCondition("ebcdDictionaryType","ORG_CURRENCY","="));
                	eodmCurrencySystemCondition.add(new FilterCondition("ebcdEscoId",esusEscoId,"="));
                	List<EbCodeMasterModel> eodmCurrencySystems = ebCodeMasterManager.findByCondition(eodmCurrencySystemCondition);
                	if (EmptyUtils.isNotEmpty(eodmCurrencySystems)) {
                		sheet.addCell(new Label(6 ,17+i,isNotNull(eodmCurrencySystems.get(0).getEbcdNameCn())+"   "+isNotNull(eoEoom2EodmList.get(i).getEodmCountryOfOriginName()),wcfButtom));//币制原产国
                	}
                } else {
            		sheet.addCell(new Label(6 ,17+i,isNotNull(eoEoom2EodmList.get(i).getEodmCurrencySystem()),wcfButtom));//币制原产国
    			}
        		sheet.addCell(new Label(7 ,17+i,isNotNull(eoEoom2EodmList.get(i).getEodmDestinationCountryName()),wcfButtom));//最终目的国
        		List<FilterCondition> eodmLevyTaxReliefCondition = new ArrayList<>();
                String eodmLevyTaxRelief = eoEoom2EodmList.get(i).getEodmLevyTaxRelief();
                if (EmptyUtils.isNotEmpty(eoEoom2EodmList.get(i).getEodmLevyTaxRelief())) {
                	eodmLevyTaxReliefCondition.add(new FilterCondition("ebcdCode", eodmLevyTaxRelief,"="));
                 	eodmLevyTaxReliefCondition.add(new FilterCondition("ebcdDictionaryType","ORG_LEVYMODE","="));
                 	eodmLevyTaxReliefCondition.add(new FilterCondition("ebcdEscoId",esusEscoId,"="));
                 	List<EbCodeMasterModel> eodmLevyTaxReliefs = ebCodeMasterManager.findByCondition(eodmLevyTaxReliefCondition);
                 	if (EmptyUtils.isNotEmpty(eodmLevyTaxReliefs)) {
                		sheet.addCell(new Label(8 ,17+i,isNotNull(eoEoom2EodmList.get(i).getEodmOriginalPlaceGoods())+"                                      "+isNotNull(eodmLevyTaxReliefs.get(0).getEbcdNameCn()),wcfButtom));//境内货源地 征免
         			}
                } else {
                	sheet.addCell(new Label(8 ,17+i,"               " +isNotNull(eoEoom2EodmList.get(i).getEodmOriginalPlaceGoods()),wcfButtom));//境内货源地 征免
                }
                sheet.addCell(new Label(9 ,17+i,"",titleLeft));//最后一列增加左边框
			}
			
			String eodmEbtpModel = eoEoom2EodmList.get(0).getEodmEbtpModel();
			if (EmptyUtils.isNotEmpty(eoEoom2EodmList)) {
				String[] eodmEbtpModels = eodmEbtpModel.split("|");
				sheet.setRowView(17+count,500,false);
	            sheet.addCell(new Label(0 ,17+count,"品牌类型:",wcfAll));//出口
	            List<FilterCondition> declareBrandTypeCondition = new ArrayList<>();
	            declareBrandTypeCondition.add(new FilterCondition("ebcdCode", eodmEbtpModels[0],"="));
	            declareBrandTypeCondition.add(new FilterCondition("ebcdDictionaryType","ORG_DECLARE_BRAND_TYPE","="));
	            
	            List<EbCodeMasterModel> declareBrandTypes = ebCodeMasterManager.findByCondition(declareBrandTypeCondition);
	            if (EmptyUtils.isNotEmpty(declareBrandTypes)) {
					sheet.addCell(new Label(1 ,17+count,declareBrandTypes.get(0).getEbcdNameCn(),wcfAll));//品牌类型
				}else {
					sheet.addCell(new Label(1 ,17+count,"境外品牌（其他）",wcfAll));//品牌类型
				}
	            sheet.addCell(new Label(2 ,17+count,"出口享惠情况:",wcfAll));//出口
	            List<FilterCondition> exportBenefitTypeCondition = new ArrayList<>();
	            if (eodmEbtpModels.length > 2) {
	            	 if (EmptyUtils.isNotEmpty(eodmEbtpModels[2])) {
	 	            	exportBenefitTypeCondition.add(new FilterCondition("ebcdCode", eodmEbtpModels[2],"="));
	 	 	            exportBenefitTypeCondition.add(new FilterCondition("ebcdDictionaryType","ORG_EXPORT_BENEFIT_TYPE","="));
	 	 	            exportBenefitTypeCondition.add(new FilterCondition("ebcdEscoId",esusEscoId,"="));
	 	            }	
	            } else {
	            	exportBenefitTypeCondition.add(new FilterCondition("ebcdCode", null ,"="));
 	 	            exportBenefitTypeCondition.add(new FilterCondition("ebcdDictionaryType","ORG_EXPORT_BENEFIT_TYPE","="));
 	 	            exportBenefitTypeCondition.add(new FilterCondition("ebcdEscoId",esusEscoId,"="));
	            }
	            List<EbCodeMasterModel> exportBenefitTypes = ebCodeMasterManager.findByCondition(exportBenefitTypeCondition);
	            if (EmptyUtils.isNotEmpty(exportBenefitTypes)) {
					sheet.addCell(new Label(3 ,17+count,exportBenefitTypes.get(0).getEbcdNameCn(),wcfAll));//出口
				}else{
					sheet.addCell(new Label(3 ,17+count,"不享受优惠关税",wcfAll));//出口
				}
			} else {
				sheet.addCell(new Label(1 ,17+count,"境外品牌（其他）",wcfAll));//品牌类型
				sheet.addCell(new Label(3 ,17+count,"不享受优惠关税",wcfAll));//出口
			}
            
            sheet.addCell(new Label(4 ,17+count,"",wcfAll));//出口
            sheet.addCell(new Label(5 ,17+count,"",wcfAll));//出口
            sheet.addCell(new Label(6 ,17+count,"",wcfAll));//出口
            sheet.addCell(new Label(7 ,17+count,"",wcfAll));//出口
            sheet.addCell(new Label(8 ,17+count,"",wcfAll));//出口
            sheet.setRowView(18+count,500,false);
            sheet.mergeCells(0, 18+count, 8, 18+count);//和并单元格
			sheet.addCell(new Label(0 ,18+count,"特殊关系确认：1-有                                                             价格影响确认： 0-无                                             支付特许权使用费确认：0-无",wcfAll));//出口
			
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @deprecated:清空Excel的物料信息
	 * @author Colley.Bai  
	 * @date 2018年10月31日
	 * @param sheet
	 */
	public void clearEodmExcel(WritableSheet sheet){
		for (int i =0 ;i <= 30;i++) {
			sheet.removeRow(22+i);//移除一行
			sheet.insertRow(22+i);//增加一行
		}
	}
	
	/**
	 * @deprecated:根据报关任务获取分供商邮件地址
	 * @author Colley.Bai  
	 * @date 2018年12月3日
	 * @param eoddId
	 * @return
	 */
	public String getEbCustomerContactEmailbyEoddId(Long eoddId){
    	String email = "";
    	String ebccIsDefault = "";
		if (null != eoddId){
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel = eoRequestDeclarationDeputeManager.get(eoddId);
			if (null != eoRequestDeclarationDeputeModel.getEoddCustomsBrokerId()) {
				List<EbCustomerContactModel> ebCustomerContactList = ebCustomerManager.getEbCustomerContactByEbcuId(eoRequestDeclarationDeputeModel.getEoddCustomsBrokerId());
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
	 * @param eoddId
	 * @return
	 */
	public String[] getEbCustomerContactEmailsbyEoddId(Long eoddId){
		String[] email = null;
    	String ebccIsDefault = "";
    	if (null != eoddId){
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel = eoRequestDeclarationDeputeManager.get(eoddId);
			if (null != eoRequestDeclarationDeputeModel.getEoddCustomsBrokerId()) {
				List<EbCustomerContactModel> ebCustomerContactList = ebCustomerManager.getEbCustomerContactByEbcuId(eoRequestDeclarationDeputeModel.getEoddCustomsBrokerId());
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
