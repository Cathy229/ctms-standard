package com.sinotrans.oms.datainteraction.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.io.OutputFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrule.manager.EbRegionManager;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.businessrule.model.EbRegionModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.service.EdiByHttpPostService;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.FtpUtil;
import com.sinotrans.oms.common.util.OmportBookingTxtOpraterUnit;
import com.sinotrans.oms.datainteraction.dto.EdiBookingDto;
import com.sinotrans.oms.datainteraction.manager.EdiBookingFeesManager;
import com.sinotrans.oms.datainteraction.manager.EdiBookingManager;
import com.sinotrans.oms.datainteraction.manager.EdiBookingMaterialManager;
import com.sinotrans.oms.datainteraction.manager.EdiBookingPrecontainerManager;
import com.sinotrans.oms.datainteraction.model.EaiOutExceptionModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingContinerModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeesModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingMaterialModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingPrecontainerModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingSealModel;
import com.sinotrans.oms.datainteraction.service.EdiBookingService;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;

/**  
* <p>Title: EdiBookingServiceImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月4日  
* @version 1.0  
*/
@Service
public class EdiBookingServiceImpl extends BaseAspect implements EdiBookingService{

	/**
	 * 时间格式
	 */
	private static DateFormat dateFormat = new SimpleDateFormat(Constants.DATA_FORMAT);
	@Autowired
	private EdiBookingManager ediBookingManager;
	@Autowired
	private EdiBookingMaterialManager ediBookingMaterialManager;
	@Autowired
	private EdiBookingManager ediBookingServiceImpl;//订舱接口表
	@Autowired
	private EoRequestBookingManager eoRequestBookingManager;//订舱任务manager
	@Autowired
	private EdiBookingPrecontainerManager ediBookingPrecontainerManager;
	@Autowired
	private EdiBookingFeesManager ediBookingFeesManager;
	@Autowired
	private EdiByHttpPostService ediByHttpPostService;
	@Autowired
	private EsControlParamManager esControlParamManager;
	@Autowired
	private EoOrderManager eoOrderManager;
	@Autowired
	private EbRegionManager ebRegionManager;
	
	
	@Override
	public void sendBookingBRToEAI(Long eorbId) {
		String sender = null;//发送方代码
		String receiver = null;//接收方代码
		String messageType = null;//报文类型
		String fileName = null;//报文名称
		String isZip = null;
		String isBase64 = null;
		String encoding = null;
		String subStr1 = null;
		String subStr2 = null;
		String subStr3 = null;
		//生成TXT格式字符串
		String txtString = null;
		String edboType=null;//请求类型，1为订舱下达，2为提单下达
		// 第一步：将具体的中间表数据全部查询,处理标识为0的（涉及的表有）
        EdiBookingModel ediBookingModel = new EdiBookingModel();// 订舱请求查询条件对象
        List<FilterCondition> conditions = new ArrayList<FilterCondition>();
        if (null != eorbId) {
        	conditions.add(new FilterCondition("edboEorbId",eorbId,"="));
        }
        conditions.add(new FilterCondition("edboFlag",Constants.EDI_FLAG_NEGATIVE_ONE,"="));
        List<EdiBookingModel> ediBookingModelList = this.ediBookingServiceImpl.findByCondition(conditions);
        if (EmptyUtils.isNotEmpty(ediBookingModelList)) {
        	List<EaiOutExceptionModel> eaiOutExceptionModels = new ArrayList<EaiOutExceptionModel>();
        	ediBookingModel = ediBookingModelList.get(0);
        	sender = Constants.BOOKING_SENDER;//发送方代码
			receiver = ediBookingModel.getEdboRcCode();//接收方代码
			messageType = ediBookingModel.getEdboFileType();//报文类型  BOSE01
			edboType = ediBookingModel.getEdboType();//请求类型，1为订舱下达，2为提单下达
			Date date = new Date();
			fileName = sender+"_" + receiver + "_" + messageType + "_" + dateFormat.format(date) + ".txt";//文件名称
			if(Constants.EDI_EODB_TWO.equals(edboType)){//提单下达
				fileName = "SI_" + sender + "_" + receiver + "_" + messageType + "_" + dateFormat.format(date) + ".txt";//文件名称
			}
			if(Constants.EDI_EODB_ONE.equals(edboType)){// 订舱下达
				fileName = "BK_" + sender + "_" + receiver + "_"+messageType + "_" + dateFormat.format(date) + ".txt";//文件名称
			}
			isZip = Constants.NO;
			isBase64 = Constants.NO;
			encoding = Constants.ENCODING_GBK;
			//Tep1:组装ediBookingDto的值
			EdiBookingDto ediBookingDto = this.assembleEdiBookingDto(ediBookingModel);
			//Tep2:组装订舱下达的报文
			txtString = this.assembleIssuedBookingTxt(ediBookingDto, sender, receiver);
			//Tep3:将组装的报文上传到FTP服务器
			//this.issuedBookingTxtToFtp(txtString, FileName);
			//TEP4:将组装的报文保存到报文表中
			//IgnoreLoginController.ignoreLogin();// 暂时用虚拟登录，因为没有虚拟登录报文信息无法保存到数据中，到后来在完善
			UserDetails userDetails = SessionContext.getUser();
			//为了防止老系统原本订舱下达的定时器跑现在新系统的数据，所以在订舱下达的时候将flag赋值为-1，完成之后重新修改为1
			ediBookingModel.setEdboFlag("1");
			this.ediBookingManager.save(ediBookingModel);
			try {
				ediByHttpPostService.sendEDIByHttpPost(sender, receiver, messageType, fileName, txtString , userDetails.getOrgId(),eorbId);
			} catch (Exception e) {
				e.printStackTrace();
				log.info("订舱下达调用的EDI最新的接口" + "http:(" + Constants.EOBOOKING_REQUEST_EDI_URL + ") " + "fileName:" + fileName);
			} finally {
				//调用service层处理业务逻辑
				IgnoreLoginController.cancelIgnore();// 退出虚拟登录
			}
        }
	}
	
	/**
	 * 组装ediBookingDto的值
	 * @author Shoven.Jiang  
	 * @date 2018年9月6日
	 * @return ediBookingDto
	 */
	private EdiBookingDto assembleEdiBookingDto(EdiBookingModel ediBookingModel) {
		EdiBookingDto ediBookingDto = new EdiBookingDto();
		Long eorbId = ediBookingModel.getEdboEorbId();
		String subStr1 = null;
		String subStr2 = null;
		String subStr3 = null;
		if (null != eorbId && null != ediBookingModel) {
			EoRequestBookingModel eoRequestBookingModel = this.eoRequestBookingManager.get(eorbId);
			if (null != eoRequestBookingModel) {
				ediBookingDto.setEoRequestBookingModel(eoRequestBookingModel);
			}
			subStr1 = eoRequestBookingModel.getEorbEscoId()+"";//公司主键
			subStr2 = eoRequestBookingModel.getEorbEbpjId()+"";//项目主键
			subStr3 = ediBookingModel.getEdboId()+"";//中间表主键
			try {
				BeanUtils.copyProperties(ediBookingDto, ediBookingModel);
				//根据订舱接口表主键，查询物料信息
				List<FilterCondition> edbmConditions = new ArrayList<>();
				edbmConditions.add(new FilterCondition("edbmEdboId", ediBookingModel.getEdboId(), "="));
				List<EdiBookingMaterialModel> ediBookingMaterialModels = this.ediBookingMaterialManager.findByCondition(edbmConditions);
				if (EmptyUtils.isNotEmpty(ediBookingMaterialModels)) {
					ediBookingDto.setEdiBookingMaterialModel(ediBookingMaterialModels);
				}
				//根据订舱接口表主键，查询预配箱信息
				List<FilterCondition> edbpConditions = new ArrayList<>();
				edbpConditions.add(new FilterCondition("edbpEdboId", ediBookingModel.getEdboId(), "="));
				List<EdiBookingPrecontainerModel> ediBookingPrecontainerModels = this.ediBookingPrecontainerManager.findByCondition(edbpConditions);
				if (EmptyUtils.isNotEmpty(ediBookingPrecontainerModels)) {
					ediBookingDto.setEdiBookingPrecontainerModel(ediBookingPrecontainerModels);
				}
				//根据订舱接口表主键，查询订舱费用信息
				List<FilterCondition> edbfConditions = new ArrayList<>();
				edbfConditions.add(new FilterCondition("edbfEdboId", ediBookingModel.getEdboId(), "="));
				List<EdiBookingFeesModel> ediBookingFeesModels = this.ediBookingFeesManager.findByCondition(edbfConditions);
				if (EmptyUtils.isNotEmpty(ediBookingFeesModels)) {
					ediBookingDto.setEdiBookingFeesModel(ediBookingFeesModels);
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		return ediBookingDto;
	}
	
	/**
	 * 组装订舱下达的报文，上传到FTP服务器并保存到报文表中
	 * @author Shoven.Jiang  
	 * @date 2018年9月6日
	 * @param ediBookingDto
	 * @param sender
	 * @param receiver
	 * @return
	 */
	private String assembleIssuedBookingTxt(EdiBookingDto ediBookingDto, String sender, String receiver) {
		//生成TXT格式字符串
		String txtString = null;
		StringBuffer bookingTxt = new StringBuffer();
		EoRequestBookingModel eoRequestBookingModel = ediBookingDto.getEoRequestBookingModel();
		String GRO_CARRIER = "ORG_CARRIER_" + eoRequestBookingModel.getEorbCarrierCode();
		//控制参数
		String sendToEdiCarrierEbcuCode = this.esControlParamManager.getIsCompanyValue(GRO_CARRIER);
		if (null != eoRequestBookingModel) {
			EoOrderModel eoOrderModel = eoOrderManager.get(eoRequestBookingModel.getEorbEoorId());
			//发货方区域id
			Long eoorShipperEbrgId = eoOrderModel.getEoorShipperEbrgId();
			if (null != eoorShipperEbrgId) {
				List<FilterCondition> filterCondition = new ArrayList<>();
				filterCondition.add(new FilterCondition("ebrgId", eoorShipperEbrgId, "="));
				List<EbRegionModel> ebRegionModels = ebRegionManager.findByCondition(filterCondition);
				if (EmptyUtils.isNotEmpty(ebRegionModels)) {
					EbRegionModel ebRegionModel = ebRegionModels.get(0);
					ediBookingDto.setEbRegionModelShipper(ebRegionModel);
				}
			}
			//收货方区域id
			Long eoorConsigneeEbrgId = eoOrderModel.getEoorConsigneeEbrgId();
			if (null != eoorConsigneeEbrgId) {
				List<FilterCondition> filterCondition = new ArrayList<>();
				filterCondition.add(new FilterCondition("ebrgId", eoorConsigneeEbrgId, "="));
				List<EbRegionModel> ebRegionModels = ebRegionManager.findByCondition(filterCondition);
				if (EmptyUtils.isNotEmpty(ebRegionModels)) {
					EbRegionModel ebRegionModel = ebRegionModels.get(0);
					ediBookingDto.setEbRegionModelConsignee(ebRegionModel);
				}
			}
		}
		
		
		//记录订舱报文节点数总数 Colley.Bai 2019年4月24日
		int i = 0;
		/*
		 * 报文头记录
		 */
		String handTxt = OmportBookingTxtOpraterUnit.setHandTxtMsg(ediBookingDto,sender,receiver);
		if(EmptyUtils.isNotEmpty(handTxt)){
			i ++ ;
			bookingTxt.append(handTxt);
		}
		
		/*
		 * 订舱信息 提单信息 船舶信息 地点信息 可选港信息 运费条款
		 */
		String bookingMessageTxt = OmportBookingTxtOpraterUnit.setBookingMessageTxtMsg(ediBookingDto,sender,receiver,sendToEdiCarrierEbcuCode);
		if(EmptyUtils.isNotEmpty(bookingMessageTxt)){
			i += 5;
			bookingTxt.append(bookingMessageTxt);
		}
		
		/*
		 * 运费及费用细目
		 */
//		List<EdiBookingFeesModel> ediBookingFeesModel = ediBookingDto.getEdiBookingFeesModel();
//		if(EmptyUtils.isNotEmpty(ediBookingFeesModel)){
//			String feesTxt = OmportBookingTxtOpraterUnit.setBookingFeesTxtMsg(ediBookingFeesModel);
//			if(EmptyUtils.isNotEmpty(feesTxt)){
//				bookingTxt.append(feesTxt);
//			}
//		}
		
		/*
		 * 其他信息 发货人信息 收货人信息 通知人信息 第二通知人信息 第三通知人信息 
		 * 中间承运人信息 货物交付目的地信息
		 */
		String otherTxt = OmportBookingTxtOpraterUnit.setOtherTxtMsg(ediBookingDto, sendToEdiCarrierEbcuCode);
		if(EmptyUtils.isNotEmpty(otherTxt)){
			i += 6;
			bookingTxt.append(otherTxt);
		}
		
		/*
		 * 订舱预配箱 
		 */
		List<EdiBookingPrecontainerModel> ediBookingPrecontainerModel = ediBookingDto.getEdiBookingPrecontainerModel();
		if(EmptyUtils.isNotEmpty(ediBookingPrecontainerModel)){
			String precontainerTxt = OmportBookingTxtOpraterUnit.setBookingPrecontainerTxtMsg(ediBookingPrecontainerModel);
			if(EmptyUtils.isNotEmpty(precontainerTxt)){
				i++;
				bookingTxt.append(precontainerTxt);
			}
		}
		/*
		 * 订舱货物 唯一托运编号 危险品,冷藏和超标信息  唛头  货物描述
		 */
		List<EdiBookingMaterialModel> ediBookingMaterialModel = ediBookingDto.getEdiBookingMaterialModel();
		if(EmptyUtils.isNotEmpty(ediBookingMaterialModel)){
			String materialTxt = OmportBookingTxtOpraterUnit.setBookingMaterialTxtMsg(ediBookingDto,ediBookingMaterialModel, eoRequestBookingModel, sendToEdiCarrierEbcuCode);
			if(materialTxt != null){
				i += 4;
				bookingTxt.append(materialTxt);
			}
		}
		
		/*
		 * 已知箱号的集装箱细目
		 */
		List<EdiBookingContinerModel> ediBookingContinerModel = ediBookingDto.getEdiBookingContinerModel();
		List<EdiBookingSealModel> eEdiBookingSealModel = ediBookingDto.getEdiBookingSealModel();
		if(EmptyUtils.isNotEmpty(ediBookingContinerModel)){
			String continerTxt = OmportBookingTxtOpraterUnit.setBookingContinerTxtMsg(ediBookingContinerModel,eEdiBookingSealModel);
			if(continerTxt != null){
				i++;
				bookingTxt.append(continerTxt);
			}
		}
		
		/*
		 *   集装箱铅封信息 更改原因
		 */
//		List<EdiBookingSealModel> eEdiBookingSealModel = entity.getEdiBookingSealModel();
//		if(EmptyUtils.isNotEmpty(eEdiBookingSealModel)){
//			String sealTxt = OmportBookingTxtOpraterUnit.setBookingSealTxtMsg(eEdiBookingSealModel);
//			if(sealTxt != null){
//				bookingTxt.append(sealTxt);
//			}
//		}
		
		/*
		 * 更改标识 报文尾
		 */
		String endTxt = OmportBookingTxtOpraterUnit.setEndETxtMsg(i);
		if(EmptyUtils.isNotEmpty(endTxt)){
			bookingTxt.append(endTxt);
		}
		
		if(bookingTxt.length()>0){
			return bookingTxt.toString();
		}else{
			return null;
		}
	}
	
	/**
	 * 正常单下发时异常处理方法
	 * @author Shoven.Jiang  
	 * @date 2018年9月6日
	 * @param subStr1
	 * @param subStr2
	 * @param tableName
	 * @param bytes
	 * @param edseId
	 * @param sender
	 * @param receiver
	 * @param FileNM
	 * @param isBase64
	 * @param isZip
	 * @param messageType
	 * @param encoding
	 * @param exceptionType
	 * @param description
	 * @return
	 */
	private EaiOutExceptionModel sendException(String subStr1,String subStr2,String tableName,byte[] bytes,Long edseId,String sender,String receiver,
			String FileNM,String isBase64,String isZip,String messageType,String encoding,String exceptionType,String description){
		//异常处理，写到异常表
		EaiOutExceptionModel outExceptionModel=new EaiOutExceptionModel();
		outExceptionModel.setEaioEscoId(subStr1);//公司
		outExceptionModel.setEaioEbpjId(subStr2);//项目
		outExceptionModel.setEaioTablename(tableName);//表名
		outExceptionModel.setEaioContent(bytes);//原报文数据
		outExceptionModel.setEaioItemid(edseId);//接口表主键
		outExceptionModel.setEaioETime(new Date());//异常反馈时间
		outExceptionModel.setEaioSender(sender);//发送方
		outExceptionModel.setEaioReceiver(receiver);//接收方
		outExceptionModel.setEaioFileName(FileNM);//文件名
		outExceptionModel.setEaioIsBase64(Constants.NO);//赋值为不是64位，20121227
		outExceptionModel.setEaioIsZip(Constants.NO);//赋值为不是压缩 20121227
		outExceptionModel.setEaioMessageType(messageType);//报文类型
		outExceptionModel.setEaioEncoding(encoding);//编码
		outExceptionModel.setEaioIsResend(Constants.NO);//是否重发，否
		outExceptionModel.setEaioType(exceptionType);//调用EAI出现异常
		outExceptionModel.setEaioDescription(description);
		return outExceptionModel;
	}
	
	/**
	 * 订舱下达将报文上传到ftp服务器上
	 * @author Shoven.Jiang  
	 * @date 2018年9月6日
	 * @param txtString
	 */
	public void issuedBookingTxtToFtp(String txtString, String fileName) {
		if (EmptyUtils.isNotEmpty(txtString)) {
			OutputFormat format = OutputFormat.createPrettyPrint();
	        format.setEncoding("UTF-8");
			try {
				String sourcePath = "D:/b/";
				String ftpPath = "/app/b"; //ftp文件存放物理路径
	            FileOutputStream fileOutputStream = new FileOutputStream(sourcePath + fileName + ".txt");	
	            fileOutputStream.write(txtString.getBytes());
	            fileOutputStream.close();
	            System.out.print("生成订舱报文文件成功");
	            FileInputStream input = new FileInputStream(new File(sourcePath + File.separatorChar + fileName + ".txt"));
	            FtpUtil.uploadFile(ftpPath, fileName + ".txt", input);
	        } catch (IOException e) {
	            System.out.print("生成XML文件失败");
	            e.printStackTrace();
	        }
		}    
	}
}
