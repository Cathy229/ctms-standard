package com.sinotrans.oms.businessrequest.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoDeclarationDeputeDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestDeclarationDeputeModelDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestGoodsDto;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.manager.EoEoddBillManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EodmManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeSendEmailService;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeService;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.impl.ProcedureManagerImpl;
import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;
import com.sinotrans.oms.common.service.InvokHttpClientService;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.ChangeChar;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.JsonUtils;
import com.sinotrans.oms.contract.manager.ElProtocolCostConManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostFeelManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostManager;
import com.sinotrans.oms.contract.manager.ElProtocolManager;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;
import com.sinotrans.oms.contract.model.ElProtocolModel;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.manager.EoOrderPrecontainerManager;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.fees.manager.EbExchangeRateManager;
import com.sinotrans.oms.fees.model.EbExchangeRateModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.model.EsCompanyModel;

import jxl.write.WriteException;
/**
 * 
 * 
 * <p>Description:  委托报关服务实现类
 *    
 * </p>
 *
 * @author Richard
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 2018年8月8日下午6:46:37   Richard       	               创建
 * 
 * 
 * </pre>
 */
@Service
public class EoRequestDeclarationDeputeServiceImpl  extends BaseAspect implements EoRequestDeclarationDeputeService {

	@Autowired
	private EoRequestDeclarationDeputeManager eoRequestDeclarationDeputeManager;//报关
	@Autowired
	private EoEoom2EodmManager eoEoom2EodmManager;//物料
	@Autowired
	private EoEooc2EoddManager eoEooc2EoddManager;//集装箱
	@Autowired
	private EoEoddBillManager eoEoddBillManager;//随附单据
	@Autowired
	private EsControlParamManager esControlParamManager;
	@Autowired
	private InvokHttpClientService invokHttpClientService;
	@Autowired
	private EoRequestDeclarationDeputeSendEmailService eoRequestDeclarationDeputeSendEmailService;
	@Autowired
	private ProcedureManagerImpl procedureManagerImpl;
	@Autowired
	private ElProtocolManager elProtocolManager;//协议
	@Autowired
	private ElProtocolCostManager elProtocolCostManager;//协议明细
	@Autowired
	private ElProtocolCostConManager elProtocolCostConManager;//协议分类
	@Autowired
	private ElProtocolCostFeelManager elProtocolCostFeelManager;//计算方式
	@Autowired
	private EfbfBusinessFeesService efbfBusinessFeesService;//费用
	@Autowired
	private EoOrderManager eoOrderManager;//订单
	@Autowired
	private EoOrderExpandAgencyManager eoOrderExpandAgencyManager;//订单代理扩展
	@Autowired
	private EoOrderPrecontainerManager eoOrderPrecontainerManager;
	@Autowired
	private EsCompanyManager esCompanyManager;//获取平台
	@Autowired 
	private EbExchangeRateManager ebExchangeRateManager;//汇率表手工维护
	@Autowired
	private DpInTrackManager dpInTrackManager;
	@Override
	public ResponseData<EoRequestDeclarationDeputeModel> saveDeclarationDepute(
			EoRequestDeclarationDeputeModelDto eoRequestDeclarationDeputeModelDto) {
		ResponseData<EoRequestDeclarationDeputeModel> responseData=new ResponseData<EoRequestDeclarationDeputeModel>();
		/*String msg = baseSaveDeclarationDepute(eoRequestDeclarationDeputeModel);
		if(msg != ""){
			responseData.setCode(Constants.NO);
			responseData.setMsg(msg);
			return responseData;
		}*/
		
		EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel = new EoRequestDeclarationDeputeModel();
		BlukInsertUtils.copyPropertiesNonNull(eoRequestDeclarationDeputeModel, eoRequestDeclarationDeputeModelDto);
		
		//报关请求编号 生成规则
		if (EmptyUtils.isEmpty(eoRequestDeclarationDeputeModel.getEoddNo())) {
            String eoddNo = NOGeneratorUtil.currentValue(Constants.EODD_NO_REQUEST);
            eoRequestDeclarationDeputeModel.setEoddNo(eoddNo);
        }
		
		EoRequestDeclarationDeputeModel requestDeclarationDeputeModel = eoRequestDeclarationDeputeManager.save(eoRequestDeclarationDeputeModel);
		
		if (null == requestDeclarationDeputeModel) {
			responseData.setData(eoRequestDeclarationDeputeModelDto);
			responseData.setCode(Constants.NO);
			responseData.setMsg("报关信息保存失败，请重试！");
			return responseData;
		}
		//add by Colley.Bai 记录内部状态时间节点
		if (EmptyUtils.isNotEmpty(requestDeclarationDeputeModel.getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(requestDeclarationDeputeModel.getEoddStatus())) {
			this.eoRequestDeclarationDeputeManager.saveDpInTrack(requestDeclarationDeputeModel);
		}
		
		if (Constants.REC_VER == eoRequestDeclarationDeputeModel.getRecVer() || null == eoRequestDeclarationDeputeModel.getRecVer()) {
			this.saveNewDeclarationDpInTrack(requestDeclarationDeputeModel);
		}
		//请求保存后，根据 作业步骤表记录id 获取 作业事件来调用存储过程 
		String errm = this.procedureManagerImpl.invokeAfterSaveBrEvent(requestDeclarationDeputeModel.getEoddEbtkId(),Constants.TASK_TYPE_DELEGATE_DECLARATION, requestDeclarationDeputeModel.getEoddId());
		if (EmptyUtils.isNotEmpty(errm)) {
			responseData.setMsg(errm);
		}
		responseData.setData(requestDeclarationDeputeModel);
		return responseData;
	}
	
	/**
	 * @deprecated:报关保存校验
	 * @author Colley.Bai  
	 * @date 2018年9月27日 下午12:53:23
	 * @param eoRequestDeclarationDeputeModel
	 * @return
	 */
	public String baseSaveDeclarationDepute(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel){
		String msg = "";
		if(null != eoRequestDeclarationDeputeModel.getEoddStatus()){
			if(null == eoRequestDeclarationDeputeModel.getEoddCustomsBroker() || "".equals(eoRequestDeclarationDeputeModel.getEoddCustomsBroker())){
				msg += "报关行不能为空";
			}else if(null == eoRequestDeclarationDeputeModel.getEoddTradeCountryName() || "".equals(eoRequestDeclarationDeputeModel.getEoddTradeCountryName())){
				msg += "贸易国不能为空";
			}else if(null == eoRequestDeclarationDeputeModel.getEoddBusinessUnitName() || "".equals(eoRequestDeclarationDeputeModel.getEoddBusinessUnitName())){
				msg += "境内收发货人不能为空";
			}else if(null == eoRequestDeclarationDeputeModel.getEoddShipperUnitName() || "".equals(eoRequestDeclarationDeputeModel.getEoddShipperUnitName())){
				msg += "生产销售单位不能为空";
			}else if(null == eoRequestDeclarationDeputeModel.getEoddTradeCountryName() || "".equals(eoRequestDeclarationDeputeModel.getEoddTradeCountryName())){
				msg += "运抵国不能为空";
			}else if(null == eoRequestDeclarationDeputeModel.getEoddFinalDestinationName() || "".equals(eoRequestDeclarationDeputeModel.getEoddFinalDestinationName())){
				msg += "指运港不能为空";
			}else if(null == eoRequestDeclarationDeputeModel.getEoddTransportName() || "".equals(eoRequestDeclarationDeputeModel.getEoddTransportName())){
				msg += "运输工具名称不能为空";
			}else if(null == eoRequestDeclarationDeputeModel.getEoddGrossWeight() || "".equals(eoRequestDeclarationDeputeModel.getEoddGrossWeight())){
				msg += "毛重不能为空";
			}else if(null == eoRequestDeclarationDeputeModel.getEoddQuantity() || "".equals(eoRequestDeclarationDeputeModel.getEoddQuantity())){
				msg += "件数不能为空";
			}
		}
		return msg;
	}

	@Override
	public ResponseData<EoDeclarationDeputeDto> saveDeclarationDeputeAndMaterial(
			EoDeclarationDeputeDto eoDeclarationDeputeDto) {
		ResponseData<EoDeclarationDeputeDto> responseData = new ResponseData<EoDeclarationDeputeDto>();
		EoDeclarationDeputeDto afterDeclarationDeputeDto = eoRequestDeclarationDeputeManager.saveDeclarationDeputeAndMaterial(eoDeclarationDeputeDto);
		if (EmptyUtils.isNotEmpty(afterDeclarationDeputeDto.getErrm())) {
			responseData.setCode(Constants.NO);
			responseData.setMsg(afterDeclarationDeputeDto.getErrm());
		}
		responseData.setData(afterDeclarationDeputeDto);
		return responseData;
	}

	@Override
	public ResponseData<List<EoEoom2EodmModel>> saveDeclarationDeputeMaterial(
			List<EoEoom2EodmModel> eoEoom2EodmModelList) {
		List<EoEoom2EodmModel> afterEoEoom2EodmModelList = eoEoom2EodmManager.saveAll(eoEoom2EodmModelList);
		ResponseData<List<EoEoom2EodmModel>> responseData=new ResponseData<List<EoEoom2EodmModel>>();
		responseData.setData(afterEoEoom2EodmModelList);
		return responseData;
	}

	@Override
	public ResponseData<List<EoEooc2EoddModel>> saveDeclarationDeputeContainer(
			List<EoEooc2EoddModel> eoEooc2EoddModelList) {
		ResponseData<List<EoEooc2EoddModel>> responseData=new ResponseData<List<EoEooc2EoddModel>>();
		String msg  = "";
		for (EoEooc2EoddModel eoEooc2EoddModels : eoEooc2EoddModelList) {
			msg = getKeyString(eoEooc2EoddModels.getEocdContainerNo());
		}
		if (msg != ""){
			responseData.setCode(Constants.NO);
			responseData.setMsg(msg);
			return responseData;
		}
		List<EoEooc2EoddModel> afterEoEooc2EoddModelList = eoEooc2EoddManager.saveAll(eoEooc2EoddModelList);
		responseData.setData(afterEoEooc2EoddModelList);
		return responseData;
	}

	@Override
	public ResponseData<List<EoEoddBillModel>> saveDeclarationDeputeBill(List<EoEoddBillModel> eoEoddBillModelList) {
		List<EoEoddBillModel> afterEoEoddBillModelList = eoEoddBillManager.saveAll(eoEoddBillModelList);
		ResponseData<List<EoEoddBillModel>> responseData=new ResponseData<List<EoEoddBillModel>>();
		responseData.setData(afterEoEoddBillModelList);
		return responseData;
	}

	@Override
	public ResponseData issuedDeclarationDepute(Long[] eoddIds) {
		ResponseData responseData=new ResponseData();
		//校验是否可下达
		String errorMessage=this.checkBeforeIssuedDeclarationDepute(eoddIds);
		if(null==errorMessage){
			String result=eoRequestDeclarationDeputeManager.issuedDeclarationDepute(eoddIds);
			if(null==result){
				try {
					UserDetails user = SessionContext.getUser();
					Long userId = null;
					if (null != user) {
						userId = Long.valueOf(user.getUserId());
					}
					this.eoRequestDeclarationDeputeSendEmailService.assembleIssuedDeclarationDeputeEntrust(eoddIds, userId);
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					log.error("报关下达操作Excel失败" + e.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				responseData.setCode(Constants.YES);
				responseData.setMsg("下达成功");
			}else{
				responseData.setCode(Constants.NO);
				responseData.setMsg(result);
			}
		}else{
			responseData.setCode(Constants.NO);
			responseData.setMsg(errorMessage);
		}
		return responseData;
	}
	/**
	 * 
	 * @date 2018年8月10日 下午6:22:17  
	 * @author Richard 
	 * Description:根据报关请求id查询是否为未下达状态，拼接错误信息返回
	 * @param eoetIds
	 * @return
	 */
	private String checkBeforeIssuedDeclarationDepute(Long[] eoddIds){
		String errorMessagge=null;
		StringBuffer errorEoetNos=new StringBuffer();
		if(null!=eoddIds && eoddIds.length>0){
			for (Long eoddId : eoddIds) {
				if(null!=eoddId){
					EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel=eoRequestDeclarationDeputeManager.get(eoddId);
					if(null!=eoRequestDeclarationDeputeModel){
						if(!Constants.SYS_TMS_STATUS_UNISSUED.equals(eoRequestDeclarationDeputeModel.getEoddStatus())){
							errorEoetNos.append(eoRequestDeclarationDeputeModel.getEoddNo()+"\n");
						}
					}
				}
			}
			if(null!=errorEoetNos && errorEoetNos.length()>0){
				errorMessagge="已下达，请勿再次下达";
			}
		}
		return errorMessagge;
	}

	@Override
	public ResponseData<QueryData> queryDeclarationDeputeByCondition(
			QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData eoDeclarationDeputeList = eoRequestDeclarationDeputeManager.getDeclarationDeputeByCondition(queryInfo);
		responseData.setData(eoDeclarationDeputeList);
		return responseData;
	}

	@Override
	public ResponseData<EoDeclarationDeputeDto> getDeclarationDeputeAndMaterialById(Long eoddId) {
		ResponseData<EoDeclarationDeputeDto> responseData=new ResponseData<EoDeclarationDeputeDto>();
		EoDeclarationDeputeDto eoDeclarationDeputeDto=eoRequestDeclarationDeputeManager.getDeclarationDeputeAndMaterialById(eoddId);
		responseData.setData(eoDeclarationDeputeDto);
		return responseData;
	}

	@Override
	public ResponseData<EoRequestDeclarationDeputeModel> getDeclarationDeputeByEoddBlNoAndEoddEoorId(
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		ResponseData<EoRequestDeclarationDeputeModel> responseData = new ResponseData<EoRequestDeclarationDeputeModel>();
		responseData = eoRequestDeclarationDeputeManager.getDeclarationDeputeByEoddBlNoAndEoddEoorId(eoRequestDeclarationDeputeModel);
		return responseData;
	}

	@Override
	public ResponseData<List<EoRequestGoodsDto>> getDeclareRequestGoodsInfo(Map<String, Object> paramMap) {
		ResponseData<List<EoRequestGoodsDto>> responseData = new ResponseData<List<EoRequestGoodsDto>>();
		JSONObject jsonObject = new JSONObject(paramMap);
		//获取json数据
		String goodsCode = jsonObject.getString("goodsCode");
		String goodsName = jsonObject.getString("goodsName");
		String paramType = jsonObject.getString("paramType");
		String constantUrl = null; 
		if ("GOODSHISTORY".equals(paramType)) {
			constantUrl = "HISTORY";
		}
		//接收数据
		String json = getReadyToSend(goodsCode, goodsName,paramType,constantUrl);
		if ("urlIsNull".equals(json)) {
			responseData.setMsg("请求地址为空，请在控制参数中维护");
			responseData.setCode(Constants.NO);
		}
		//接收json格式商品信息转换成集合格式
		List<EoRequestGoodsDto> eoRequestGoodsDto = JsonUtils.json2List(json, EoRequestGoodsDto.class);
		responseData.setData(eoRequestGoodsDto);
		return responseData;
	}
	/**
	 * @deprecated:组装数据，发送请求
	 * @author Colley.Bai  
	 * @date 2018年9月20日 下午8:50:13
	 * @param eoddBusinessUnitsCode
	 * @param goodsCode
	 * @param requestType
	 * @param constantUrl
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private String getReadyToSend(String eoddBusinessUnitsCode,String goodsCode,String requestType,String constantUrl){
		 if (org.apache.commons.lang.StringUtils.isEmpty(goodsCode)) {
			 goodsCode = "";
		 }
		 if (org.apache.commons.lang.StringUtils.isEmpty(eoddBusinessUnitsCode)) {
			 eoddBusinessUnitsCode = "";
		 }
		 String requestUrl = esControlParamManager.getIsCompanyValue("DECLARE_CUSTOMS_REQUEST_URL");
		 if (org.apache.commons.lang.StringUtils.isEmpty(requestUrl)) {
			 return "urlIsNull";
		 }
		 String strURL = requestUrl+"SelectCodeQuery-"+requestType;
	     String params = "";
		 if ("HISTORY".equals(constantUrl)) {
			 params = "{'selectCode':'"+requestType+"','queryInfo':{'queryFields':[{'fieldName':'CDT_name','fieldStringValue':'"+goodsCode+"','fieldType':'String'},{'fieldName':'CDT_code','fieldStringValue':'"+eoddBusinessUnitsCode+"','fieldType':'String'}],'fieldCodeTypes':null}}";
		 } else {
	    	 params = "{'selectCode':'"+requestType+"','queryInfo':{'pagingInfo':{'pageSize':10,'currentPage':1},'queryFields':[{'fieldName':'CDT_code','fieldStringValue':'"+eoddBusinessUnitsCode+"','fieldType':'String'}],'fieldCodeTypes':null}}";
	     }
		 //获取返回的数据
	     String result = invokHttpClientService.executeHttpPost(strURL, params);
	     //把字符串装成map
	     Map<String,Object> resultMaps = (Map<String,Object>)JSON.parse(result); 
	     //把map转成json
	     JSONObject jsonObject = new JSONObject(resultMaps);
	     //提取data对象数据
	     String data =  jsonObject.getString("data");
	     //把data字符串准成map
	     Map<String,Object> mapsDataList = (Map<String,Object>)JSON.parse(data); 
	     //把map转成json格式
	     JSONObject jsonObjectDatlist = new JSONObject(mapsDataList);
	     //提取dataList数据
	     String dataList =  jsonObjectDatlist.getString("dataList");
	     return dataList;
	}
	
	/**
	 * 校验集装箱号
	 * @author Colley.Bai  
	 * @date 2018年10月8日 下午5:58:23
	 * @param containerNoStr
	 * @return
	 */
	public static String getKeyString(String containerNoStr) {
		String msg = "";
		/*if (EmptyUtils.isNotEmpty(containerNoStr)) {*/
			Integer[] num = new Integer[11];
		    for (int i=0;i<11;i++) {
		    	num[i]=new Integer(0);
		    }
			if (containerNoStr.length() != 11) {
				msg +="请重新输入11位的集装箱号！";
				return msg;
			} else {
				String a = "^[a-zA-Z]{4}[0-9]{7}";
				Pattern p =Pattern .compile(a);
				Matcher  m = p.matcher(containerNoStr);
				if (m.matches()) {
					//序列号
					String char1=containerNoStr.substring(0,1);
					String char2=containerNoStr.substring(1,2);
					String char3=containerNoStr.substring(2,3);
					String char4=containerNoStr.substring(3,4);
					String char5=containerNoStr.substring(4,5);
					String char6=containerNoStr.substring(5,6);
					String char7=containerNoStr.substring(6,7);
					String char8=containerNoStr.substring(7,8);
					String char9=containerNoStr.substring(8,9);
					String char10=containerNoStr.substring(9,10);
					String char11=containerNoStr.substring(10,11);
					//箱号前面4个字母
					num[0]= ChangeChar.changeChar(char1);
			        num[1]= ChangeChar.changeChar(char2);
			        num[2]= ChangeChar.changeChar(char3);
			        num[3]= ChangeChar.changeChar(char4);
			        //箱号中间7个数字
			        num[4]= ChangeChar.changeChar(char5);
			        num[5]= ChangeChar.changeChar(char6);
			        num[6]= ChangeChar.changeChar(char7);
			        num[7]= ChangeChar.changeChar(char8);
			        num[8]= ChangeChar.changeChar(char9);
			        num[9]= ChangeChar.changeChar(char10);
			        //校验数字
			        num[10]= ChangeChar.changeChar(char11);
			        Integer sum=num[0]+num[1]*2+num[2]*4+num[3]*8+num[4]*16+num[5]*32+num[6]*64+num[7]*128+num[8]*256+num[9]*512;
			        int intSum = sum.intValue();
			        Integer result=intSum%11;
			        if(result == 10){
			        	result = result%10;
			        }
			        if (!result.equals(num[10])) {
			        	//msg += "集装箱号校验错误！正确的校验码为:" + result;
						return msg;
			        } else {
						return msg;
			        }
				} else{ 
					msg +="集装箱号格式不正确，前四位应为字母，后七位为数字，请重新输入！";
					return msg;
				}
			}
		/*} else {
			msg +="集装箱号不能为空！";
			return msg;
		}*/
	}

	@Override
	public ResponseData<EoDeclarationDeputeDto> getDeclarationDeputeAndMaterialByEoordId(Long eoorId) {
		ResponseData<EoDeclarationDeputeDto> responseData=new ResponseData<EoDeclarationDeputeDto>();
		EoDeclarationDeputeDto eoDeclarationDeputeDto=eoRequestDeclarationDeputeManager.getDeclarationDeputeAndMaterialByEoordId(eoorId);
		responseData.setData(eoDeclarationDeputeDto);
		return responseData;
	}

	@Override
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEoddDeclaration(Long[] eoddIds) {
		ResponseData<List<ElProtocolCostFeelModel>> responseData = new ResponseData<List<ElProtocolCostFeelModel>>();
		if (eoddIds.length > 0) {
			for (Long eoddId : eoddIds) {
				EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel = this.eoRequestDeclarationDeputeManager.get(eoddId);
				if (null != eoRequestDeclarationDeputeModel) {
					//2.组装匹配协议
					List<FilterCondition> eoRequestDeclarationDeputeFilterCondition = new ArrayList<>();
					//2.1 公司
					eoRequestDeclarationDeputeFilterCondition.add(new FilterCondition("elplEscoId",eoRequestDeclarationDeputeModel.getEoddEscoId(),"="));
					eoRequestDeclarationDeputeFilterCondition.add(new FilterCondition("elplEbpjId",eoRequestDeclarationDeputeModel.getEoddEbpjId(),"="));
					//2.2 报关行
					eoRequestDeclarationDeputeFilterCondition.add(new FilterCondition("elplCustomerEbcuId",eoRequestDeclarationDeputeModel.getEoddCustomsBrokerId(),"="));
					//3.获取报关匹配的协议（拖报关行匹配协议的客商名称）
					List<ElProtocolModel> elProtocolModelList = elProtocolManager.findByCondition(eoRequestDeclarationDeputeFilterCondition);
					
					if (EmptyUtils.isNotEmpty(elProtocolModelList)) {
						this.getEoDeclarationAndElProtocol(eoRequestDeclarationDeputeModel,elProtocolModelList);
					}
				} else {
					responseData.setCode(Constants.NO);
					responseData.setMsg("报关信息为空");
				}
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("报关ID为空");
		}
		return responseData;
	}

	/**
	 * @deprecated:根据报关的报关行匹配的协议的客商名称找到的协议
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eoRequestDeclarationDeputeModel
	 * @param elProtocolModelList
	 */
	public void getEoDeclarationAndElProtocol(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel,List<ElProtocolModel> elProtocolModelList){
		for (ElProtocolModel elProtocolModel : elProtocolModelList) {
			//更加精确 提高效率
			if (Constants.ELPL_TYPE_DECLARATION.equals(elProtocolModel.getElplType())) {
				
				if (Constants.SYS_STATUS_ADD.equals(elProtocolModel.getElplStatus()) || Constants.SYS_STATUS_ENABLE.equals(elProtocolModel.getElplStatus())) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Date elplEffectiveDateTo = null;
					Date newDate = null;
					try {
						//失效日期
						elplEffectiveDateTo = sdf.parse(sdf.format(elProtocolModel.getElplEffectiveDateTo())); 
						//当前时间
						newDate = sdf.parse(sdf.format(new Date()));
						//比较该协议是否失效
						if (newDate.getTime() <= elplEffectiveDateTo.getTime()) {
							EoOrderModel eoOrderModel = eoOrderManager.get(eoRequestDeclarationDeputeModel.getEoddEoorId());
							List<FilterCondition> eoOrderExpandAgencyFilterCondition = new ArrayList<>();
							eoOrderExpandAgencyFilterCondition.add(new FilterCondition("eoeaEoorId",eoOrderModel.getEoorId(),"="));
							//2.获取订单代理扩展表
							List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModelList = eoOrderExpandAgencyManager.findByCondition(eoOrderExpandAgencyFilterCondition);
							//验证是否有订单和是否有订单代理扩展表
							if (null != eoOrderModel && EmptyUtils.isNotEmpty(eoOrderExpandAgencyModelList)) {
								//1. 组装匹配协议条件分类
								Map<String, Object> condition = new HashMap<>();
								//1.1 协议条件主键，是为找这个协议下的条件分类
								condition.put("epccElplId",elProtocolModel.getElplId());
								//1.2 从订单代理扩展表匹配协议条件分类装货港
								condition.put("epccLoadPortId",eoOrderExpandAgencyModelList.get(0).getEoeaLoadPortId());
								//1.3 从订单代理扩展表匹配协议条件分类卸货港
								condition.put("epccDischargePortId",eoOrderExpandAgencyModelList.get(0).getEoeaDischargePortId());
								//1.4 从订单代理扩展表匹配协议条件分类船公司
								condition.put("epccShipId",eoOrderExpandAgencyModelList.get(0).getEoeaCarrierId());
								//1.5 从订单代理扩展表匹配协议条件分类订舱代理
//								condition.put("epccShipAgentId",eoOrderExpandAgencyModelList.get(0).getEoeaBookingAgentId());
								//1.6 从订单代理扩展表匹配协议条件分类运输条款
								condition.put("epccFreightClauseCode",eoOrderExpandAgencyModelList.get(0).getEoeaFreightClauseCode());
								//1.8 从订单代理扩展表匹配协议条件分类装运方式
//								condition.put("epccLmId",eoOrderExpandAgencyModelList.get(0).getEoeaLmId());
								//1.9 从订单代理扩展表匹配协议条件分类销售人员
								condition.put("epccBmsEbsmCode",eoOrderModel.getEoorBmsEbsmCode());
								//1.91 从订单代理扩展表匹配协议条件分类报关
								condition.put("epccIsDeclaration",eoOrderExpandAgencyModelList.get(0).getEoeaIsCustoms());
								//1.92 从订单代理扩展表匹配协议条件分类订舱
								condition.put("epccIsBooking",eoOrderExpandAgencyModelList.get(0).getEoeaIsBooking());
								//1.93 从订单代理扩展表匹配协议条件分类拖车
								condition.put("epccIsTrailer",eoOrderExpandAgencyModelList.get(0).getEoeaIsTrailer());
								//2. 获取订舱匹配的协议条件分类
								List<ElProtocolCostConModel> elProtocolCostConModelList = elProtocolCostConManager.queryByCondition(condition);
								if (EmptyUtils.isNotEmpty(elProtocolCostConModelList)) {
									
									for (ElProtocolCostConModel elProtocolCostConModel : elProtocolCostConModelList) {
										
										Double epcfPrice = this.getElelProtocolCostFeelByEpccId(elProtocolCostConModel,eoRequestDeclarationDeputeModel);
										
										//1. 组装查询协议明细
										List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
										//1.1 协议明细主键
										elProtocolCostConFilterCondition.add(new FilterCondition("epctId",elProtocolCostConModel.getEpccEpctId(),"="));
										//1.2 协议状态 （启用）
										elProtocolCostConFilterCondition.add(new FilterCondition("epctStatus","Y","="));
										//2.获取到协议明细信息，所谓的条件费用信息
										List<ElProtocolCostModel> elProtocolCostModelList = elProtocolCostManager.findByCondition(elProtocolCostConFilterCondition);
										
										if (EmptyUtils.isNotEmpty(elProtocolCostModelList)) {
											List<EfBusinessFeesModel> efBusinessFeesModelList = this.getEfBusinessFeesModelByEpctId(elProtocolCostModelList, epcfPrice, eoRequestDeclarationDeputeModel,elProtocolCostConModel);
											
											if (EmptyUtils.isNotEmpty(efBusinessFeesModelList)){
												ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
												try {
													responseData = efbfBusinessFeesService.batchSaveBusinessFees(efBusinessFeesModelList);
												} catch (Exception e) {
													log.error("报关自动生成费用异常，" + responseData);
												}
											}
											
										}
									}
								}
							}
						}
					} catch (ParseException e) {
						e.printStackTrace();
						log.error("时间转换异常" + elProtocolModel.getElplEffectiveDateTo());
					}
				}
			}
		}
	}
	
	/**
	 * @deprecated:根据协议条件分类查询计算方式并且计算
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param elProtocolCostConModel
	 * @param eoRequestTrailerModel
	 * @return
	 */
	public Double getElelProtocolCostFeelByEpccId(ElProtocolCostConModel elProtocolCostConModel,EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel){
		Double epcfPrice = 0.00;
		if (null != elProtocolCostConModel) {
			//1. 组装查询计算方式数据
			List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
			//1.1 条件分类主键
			elProtocolCostConFilterCondition.add(new FilterCondition("epcfEpccId",elProtocolCostConModel.getEpccId(),"="));
			//2.2 条件分类 （启用）
			elProtocolCostConFilterCondition.add(new FilterCondition("epcfStatus","Y","="));
			//2.获取属于这个条件分类的计算方式
			List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(elProtocolCostConFilterCondition);
			
			List<FilterCondition> eoOrderFilterCondition = new ArrayList<>();
			eoOrderFilterCondition.add(new FilterCondition("eosrEoorId",eoRequestDeclarationDeputeModel.getEoddEoorId(),"="));
			//3.获取订单预配箱信息
			List<EoOrderPrecontainerModel> eoOrderPrecontainerModelList = eoOrderPrecontainerManager.findByCondition(eoOrderFilterCondition);
			
			if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
				for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {

					//4.如果是箱的时候，计算根据箱型
//					if (Constants.EPCF_FORMULA_BOX.equals(elProtocolCostFeelModel.getEpcfFormula())) {
//						if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModelList)) {
//							for (EoOrderPrecontainerModel eoOrderPrecontainerModel:eoOrderPrecontainerModelList) {
//								
//								//4.1根据尺寸和箱型匹配计算方式
//								if (EmptyUtils.isEqual(elProtocolCostFeelModel.getEpcfContainerSize(), eoOrderPrecontainerModel.getEosrCntCustomized()) && EmptyUtils.isEqual(elProtocolCostFeelModel.getEpcfContainerType(), eoOrderPrecontainerModel.getEosrCntCustomizedSize())) {
//									
//									//4.2获取订单预配箱数量
//									Integer eosrCtnNumber = eoOrderPrecontainerModel.getEosrCtnNumber() == null ? 1 : eoOrderPrecontainerModel.getEosrCtnNumber();
//									Double epcfPriceBox = elProtocolCostFeelModel.getEpcfPrice() == null ? 0.00 : elProtocolCostFeelModel.getEpcfPrice();
//									epcfPrice += epcfPriceBox * eosrCtnNumber;
//								}
//							}
//						}
//					}
					//5.如果是单的时候，计算是根据1*单价
					if (Constants.EPCF_FORMULA_SINEGLE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
						epcfPrice += elProtocolCostFeelModel.getEpcfPrice();
					}
					
					//6.如果是路线的时候，计算是根据1*单价
//					else if (Constants.EPCF_FORMULA_ROULE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
//						epcfPrice += elProtocolCostFeelModel.getEpcfPrice();
//					} 
					//7.一口价计算，根据1*单价
					else if (Constants.EPCF_FORMULA_PRICE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
						epcfPrice += elProtocolCostFeelModel.getEpcfPrice();
					}
				}
			}
			
		}
		return epcfPrice;
	}
	/**
	 * @deprecated:拼接费用数据
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @return
	 */
	public List<EfBusinessFeesModel> getEfBusinessFeesModelByEpctId(List<ElProtocolCostModel> elProtocolCostModelList,Double epcfPrice,EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel,ElProtocolCostConModel elProtocolCostConModel){
		List<EfBusinessFeesModel> efBusinessFeesModelList = new ArrayList<>();
		EfBusinessFeesModel efBusinessFeesModel = new EfBusinessFeesModel();
		
		List<FilterCondition> eoOrderFilterCondition = new ArrayList<>();
		eoOrderFilterCondition.add(new FilterCondition("eosrEoorId",eoRequestDeclarationDeputeModel.getEoddEoorId(),"="));
		//1.获取订单预配箱信息
		List<EoOrderPrecontainerModel> eoOrderPrecontainerModelList = eoOrderPrecontainerManager.findByCondition(eoOrderFilterCondition);
		
		List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
		elProtocolCostConFilterCondition.add(new FilterCondition("epcfEpccId",elProtocolCostConModel.getEpccId(),"="));
		elProtocolCostConFilterCondition.add(new FilterCondition("epcfStatus","Y","="));
		//2.获取属于这个条件分类的计算方式
		List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(elProtocolCostConFilterCondition);
		
		Long number = 0L;
		
		if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
			for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {
				
				//3.如果是箱的时候，计算根据箱型
//				if (Constants.EPCF_FORMULA_BOX.equals(elProtocolCostFeelModel.getEpcfFormula())) {
//					if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModelList)) {
//						for (EoOrderPrecontainerModel eoOrderPrecontainerModel :eoOrderPrecontainerModelList) {
//							number += eoOrderPrecontainerModel.getEosrCtnNumber() == null ? 0L : eoOrderPrecontainerModel.getEosrCtnNumber();
//						}
//					}
//				}
				//4.如果是单的时候，计算是根据1*单价
				if (Constants.EPCF_FORMULA_SINEGLE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
					number += 1L;
				}
				//5.如果是路线的时候，计算是根据1*单价
//				else if (Constants.EPCF_FORMULA_ROULE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
//					number += 1L;
//				} 
				//6.一口价计算，根据1*单价
				else if (Constants.EPCF_FORMULA_PRICE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
					number += 1L;
				}
			}
		}
		
		//获取当前用户
		UserDetails user = SessionContext.getUser();
		//获取平台
		EsCompanyModel esCompanyModel=esCompanyManager.get(Long.valueOf(user.getOrgId()));
		
		for (ElProtocolCostModel elProtocolCostModel:elProtocolCostModelList) {
			
			List<FilterCondition> conditions = new ArrayList<>();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			conditions.add(new FilterCondition("eberFromCurrency",elProtocolCostModel.getEpctCurrencyType(),"="));//协议明细币种（源币种代码）
			conditions.add(new FilterCondition("eberToCurrency",esCompanyModel.getEscoCurrency(),"="));//平台币种（目标币种代码）
			conditions.add(new FilterCondition("eberEscoId",user.getOrgId(),"="));
			try {
				conditions.add(new FilterCondition("eberConversionDate",formatter.parse(this.getStringDateShort()),"="));//汇率日期
			} catch (ParseException e) {
				e.printStackTrace();
				log.error("汇率日期转换异常");
			}
			List<EbExchangeRateModel> ebExchangeRateModelList = ebExchangeRateManager.findByCondition(conditions);
			//如果是人民币的时候,汇率是自动变成为1
			if (elProtocolCostModel.getEpctCurrencyType().equals(Constants.CURRENCY_CNY)) {
				EbExchangeRateModel ebExchangeRateModel = new EbExchangeRateModel();
				ebExchangeRateModel.setEberConversionRate(1.00);
				ebExchangeRateModelList.add(ebExchangeRateModel);
			}
			if (EmptyUtils.isNotEmpty(ebExchangeRateModelList)) {
				efBusinessFeesModel.setEfbfSettlementEbcuId(elProtocolCostModel.getEpctSettlementEbcuId());//结算对象id
				efBusinessFeesModel.setEfbfSettlementEbcuName(elProtocolCostModel.getEpctSettlementEbcuName());//结算对象名称
				efBusinessFeesModel.setEfbfSettlementEbcuCdh(elProtocolCostModel.getEpctSettlementEbcuCdh());//结算对象财务代码
				efBusinessFeesModel.setEfbfEbfhId(elProtocolCostModel.getEpctEbfhId());//费目id
				efBusinessFeesModel.setEfbfCurrency(elProtocolCostModel.getEpctCurrencyType());//币种
				efBusinessFeesModel.setEfbfType(elProtocolCostModel.getEpctEfbfType());//收/付
				String epctIsDutyfree = elProtocolCostModel.getEpctIsDutyfree() == null ? "0" :elProtocolCostModel.getEpctIsDutyfree();
				efBusinessFeesModel.setEbfhIsDutyfree(Long.valueOf(epctIsDutyfree));//是否含税
				efBusinessFeesModel.setEfbfTaxRate(elProtocolCostModel.getEpctTaxRate());//税率
				Double amount = 0.00;//单价
				if (number == 0L){
					amount = epcfPrice * number;
				} else {
					amount = epcfPrice/number;
				}
				efBusinessFeesModel.setEfbfPrice(amount);//单价
				efBusinessFeesModel.setEfbfEoorId(eoRequestDeclarationDeputeModel.getEoddEoorId());//订单主键
				efBusinessFeesModel.setEfbfEscoId(eoRequestDeclarationDeputeModel.getEoddEscoId());//公司主键
				efBusinessFeesModel.setEfbfQuantity(number);//数量
				efBusinessFeesModel.setEfbfExchangeRate(ebExchangeRateModelList.get(0).getEberConversionRate().doubleValue());//汇率
				//计算结算金额和含税价保留两位小数
				BigDecimal bigDecimal = new BigDecimal(epcfPrice);  
				Double  total = bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue(); 
				efBusinessFeesModel.setEfbfAmount(total);//结算金额
				efBusinessFeesModel.setEfbfTaxAmount(total);//含税价
				//免税
				if (elProtocolCostModel.getEpctIsDutyfree().equals(Constants.IS_DUTYFREE_STRING)) {
					efBusinessFeesModel.setEfbfTaxRate(0.00);
					efBusinessFeesModel.setEfbfTaxFee(epcfPrice);//不含税价
				}
				//非免税
				if (elProtocolCostModel.getEpctIsDutyfree().equals(Constants.NOT_DUTYFREE_STRING)) {
					Double afterAmount  = (epcfPrice) / (1 + elProtocolCostModel.getEpctTaxRate());
					BigDecimal afterBigDecimal = new BigDecimal(afterAmount);  
					Double  afterTotal = afterBigDecimal.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
					efBusinessFeesModel.setEfbfTaxFee(afterTotal);//不含税价
				}
				efBusinessFeesModelList.add(efBusinessFeesModel);
			}
			
		}
		return efBusinessFeesModelList;
	}
	
	/**
	 * @deprecated:获取现在时间
	 * @author Colley.Bai  
	 * @date 2018年12月11日
	 * @return 返回短时间字符串格式yyyy-MM-dd
	 */
	public String getStringDateShort() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}

	@Override
	public ResponseData eoddStatusBackByEoorIds(Long[] eoddIds) {
		ResponseData responseData = new ResponseData();
		if (null != eoddIds) {
			try {
				List<FilterCondition> eoddCondition = new ArrayList<>();
				eoddCondition.add(new FilterCondition("eoddId", eoddIds, "in"));
				List<EoRequestDeclarationDeputeModel> beforeEoRequestDeclarationDeputeModels = new ArrayList<>();
				List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModels = this.eoRequestDeclarationDeputeManager.findByCondition(eoddCondition);
				if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModels)) {
					//1、报关已完成 回退到 报关待反馈
					if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModels.get(0).getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestDeclarationDeputeModels.get(0).getEoddStatus())) {
						for (EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel : eoRequestDeclarationDeputeModels) {
							this.updateDpInTrack(eoRequestDeclarationDeputeModel);
							eoRequestDeclarationDeputeModel.setEoddStatus(Constants.SYS_STOCKIN_STATUS_ISSUED);
							eoRequestDeclarationDeputeModel.setEoddTaskStatus("1");
							beforeEoRequestDeclarationDeputeModels.add(eoRequestDeclarationDeputeModel);
						}
					} else if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModels.get(0).getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_ISSUED.equals(eoRequestDeclarationDeputeModels.get(0).getEoddStatus())) {
						//2、报关待反馈  回退到  报关待下达
						for (EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel : eoRequestDeclarationDeputeModels) {
							this.updateDpInTrack(eoRequestDeclarationDeputeModel);
							eoRequestDeclarationDeputeModel.setEoddStatus(Constants.SYS_STOCKIN_STATUS_UNISSUED);
							eoRequestDeclarationDeputeModel.setEoddTaskStatus("0");
							eoRequestDeclarationDeputeModel.setEoddFilingDate(null);//申报日期
							eoRequestDeclarationDeputeModel.setEoddDeclareCustom(null);//海关编号
							eoRequestDeclarationDeputeModel.setEoddTaskConfirmUser(null);//确认人
							eoRequestDeclarationDeputeModel.setEoddTaskConfirmDate(null);//确认时间
							eoRequestDeclarationDeputeModel.setEoddTaskRefuseUser(null);//退回人
							eoRequestDeclarationDeputeModel.setEoddTaskRefuseDate(null);//退回时间
							eoRequestDeclarationDeputeModel.setEoddInspectionDate(null);//查验时间
							eoRequestDeclarationDeputeModel.setEoddReleaseDate(null);//放行时间
							eoRequestDeclarationDeputeModel.setEoddNoticeTaxDate(null);//返还退回联
							eoRequestDeclarationDeputeModel.setEoddShippingArriveDate(null);//收到运抵时间
							eoRequestDeclarationDeputeModel.setEoddApproveDate(null);//审核通过时间
							eoRequestDeclarationDeputeModel.setEoddCheckingstrDate(null);//查验开始时间
							eoRequestDeclarationDeputeModel.setEoddCheckingendDate(null);//查验结束时间
							eoRequestDeclarationDeputeModel.setEoddShippingBillDate(null);//收到舱单时间
							eoRequestDeclarationDeputeModel.setEoddPreManifesState(null);//预配舱单状态
							eoRequestDeclarationDeputeModel.setEoddTallyDate(null);//理货时间
							eoRequestDeclarationDeputeModel.setEoddConcludeDate(null);//审结时间
							eoRequestDeclarationDeputeModel.setEoddSingleDeliveryDate(null);//预录入时间
							
							beforeEoRequestDeclarationDeputeModels.add(eoRequestDeclarationDeputeModel);
						}
					}
					List<EoRequestDeclarationDeputeModel> saveAll = this.eoRequestDeclarationDeputeManager.saveAll(beforeEoRequestDeclarationDeputeModels);
					responseData.setCode(Constants.YES);
					responseData.setData(saveAll);
					responseData.setMsg("操作成功");
					return responseData;
				}
			} catch (Exception e) {
				responseData.setCode(Constants.YES);
				responseData.setMsg("操作失败");
				e.printStackTrace();
				return responseData;
			}
		}
		responseData.setCode(Constants.YES);
		responseData.setMsg("操作失败");
		return responseData;
	}
	
	/**
	 * @deprecated:
	 * @author Colley.Bai  
	 * @date 2018年12月26日
	 * @param eoRequestDeclarationDeputeModel
	 */
	public void updateDpInTrack(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",eoRequestDeclarationDeputeModel.getEoddId(),"="));
		filterCondition.add(new FilterCondition("dpitOrderId",eoRequestDeclarationDeputeModel.getEoddEoorId(),"="));
		if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModel.getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestDeclarationDeputeModel.getEoddStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_DECLARATION_COMPLETE,"="));
		} else if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModel.getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_ISSUED.equals(eoRequestDeclarationDeputeModel.getEoddStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_DECLARATION_ISSUSED,"="));
		}
		//1、查询是否有内部状态生成
		List<DpInTrackModel> dpInTrackModelList = dpInTrackManager.findByCondition(filterCondition);
		if (EmptyUtils.isNotEmpty(dpInTrackModelList)) {
			for (DpInTrackModel dpInTrackModel : dpInTrackModelList) {
				//业务操作时间
				dpInTrackModel.setDpitOperatorTime(null);
				//业务操作人
				dpInTrackModel.setDpitOperator("");
				dpInTrackManager.save(dpInTrackModel);
			}
		} 
	}
	
	/**
	 * @deprecated:拆分报关任务时，记录新增报关任务节点
	 * @author Colley.Bai  
	 * @date 2018年12月26日
	 * @param eoRequestDeclarationDeputeModel
	 */
	public void saveNewDeclarationDpInTrack(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",eoRequestDeclarationDeputeModel.getEoddId(),"="));
		filterCondition.add(new FilterCondition("dpitOrderId",eoRequestDeclarationDeputeModel.getEoddEoorId(),"="));
		filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_DECLARATION_UNISSUSED,"="));
		//1、用户信息
		UserDetails user = SessionContext.getUser();
		//2、查询是否有内部状态生成
		List<DpInTrackModel> dpInTrackModelList = dpInTrackManager.findByCondition(filterCondition);
		if (EmptyUtils.isNotEmpty(dpInTrackModelList)) {
			for (DpInTrackModel dpInTrackModel : dpInTrackModelList) {
				//业务操作时间
				dpInTrackModel.setDpitOperatorTime(new Date());
				//业务操作人
				dpInTrackModel.setDpitOperator(user.getUserId());
				dpInTrackManager.save(dpInTrackModel);
			}
		} else {
			DpInTrackModel dpInTrackModel = new DpInTrackModel();
			//业务请求主键
			dpInTrackModel.setDpitBridId(eoRequestDeclarationDeputeModel.getEoddId());
			//订单ID
			dpInTrackModel.setDpitOrderId(eoRequestDeclarationDeputeModel.getEoddEoorId());
			//内部状态
			dpInTrackModel.setDpitType(Constants.DPIT_TYPE_DECLARATION_UNISSUSED);
			//业务操作时间
			dpInTrackModel.setDpitOperatorTime(new Date());
			//业务操作人
			dpInTrackModel.setDpitOperator(user.getUserId());
			dpInTrackManager.save(dpInTrackModel);
		}
	}
}
