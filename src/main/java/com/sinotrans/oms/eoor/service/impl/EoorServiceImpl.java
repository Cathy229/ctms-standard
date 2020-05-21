package com.sinotrans.oms.eoor.service.impl;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.lang.StringUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.dto.EoTrailerModelDto;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrule.manager.EbRegionManager;
import com.sinotrans.oms.businessrule.model.EbRegionModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BeanUtils;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.MD55;
import com.sinotrans.oms.common.util.StringUtil;
import com.sinotrans.oms.eoor.dto.CheckEoorInfoQueryItem;
import com.sinotrans.oms.eoor.dto.EoLandOrderTrackQueryItem;
import com.sinotrans.oms.eoor.dto.EoorScheduleQueryItem;
import com.sinotrans.oms.eoor.dto.EtSchedduleModelDto;
import com.sinotrans.oms.eoor.dto.EtVehicleByScheduleQueryItem;
import com.sinotrans.oms.eoor.dto.GetStationAndVehicleTrackQueryItem;
import com.sinotrans.oms.eoor.dto.IotData;
import com.sinotrans.oms.eoor.manager.EiSchedulingShiporderManager;
import com.sinotrans.oms.eoor.manager.EiShiporderUnitsManager;
import com.sinotrans.oms.eoor.manager.EoorManager;
import com.sinotrans.oms.eoor.manager.EotaManager;
import com.sinotrans.oms.eoor.manager.EtLineNodeManager;
import com.sinotrans.oms.eoor.manager.EtOrderMaterielManager;
import com.sinotrans.oms.eoor.manager.EtSchedulePlanManager;
import com.sinotrans.oms.eoor.manager.EtVehicleManager;
import com.sinotrans.oms.eoor.manager.EtVehicleModelManager;
import com.sinotrans.oms.eoor.manager.EtorManager;
import com.sinotrans.oms.eoor.manager.EttaManager;
import com.sinotrans.oms.eoor.manager.SchedulBatchLockManager;
import com.sinotrans.oms.eoor.manager.SchedulStopsInfoManager;
import com.sinotrans.oms.eoor.model.EiSchedulingShiporderModel;
import com.sinotrans.oms.eoor.model.EiShiporderUnitsModel;
import com.sinotrans.oms.eoor.model.EoOrderModel;
import com.sinotrans.oms.eoor.model.EoTaskModel;
import com.sinotrans.oms.eoor.model.EoTaskTrackModel;
import com.sinotrans.oms.eoor.model.EtLineNodeModel;
import com.sinotrans.oms.eoor.model.EtOrderMaterielModel;
import com.sinotrans.oms.eoor.model.EtOrderModel;
import com.sinotrans.oms.eoor.model.EtSchedulePlanModel;
import com.sinotrans.oms.eoor.model.EtSchedulePlanTaskEntity;
import com.sinotrans.oms.eoor.model.EtTaskModel;
import com.sinotrans.oms.eoor.model.EtVehicleModel;
import com.sinotrans.oms.eoor.model.EtVehicleModelModel;
import com.sinotrans.oms.eoor.model.SchedulBatchLockModel;
import com.sinotrans.oms.eoor.model.SchedulStopsInfoModel;
import com.sinotrans.oms.eoor.service.EotaService;
import com.sinotrans.oms.eoor.util.MD5Util;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;
import com.sinotrans.oms.security.interceptor.AuthenticationInterceptor;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCounterManager;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsUserModel;
import com.sinotrans.oms.eoor.service.EoorService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.google.gson.Gson;
import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.core.util.ContextUtils;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryField;
import com.sinotrans.framework.service.support.QueryInfo;

@Service
public class EoorServiceImpl extends BaseAspect implements EoorService{
	private static final Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);
	@Autowired
	private EoorManager eoorManager;
	@Autowired
	private EotaManager eotaManager;
	@Autowired
	private EtorManager etorManager;
	@Autowired
	private EttaManager ettaManager;
	@Autowired
	private EtSchedulePlanManager etSchedulePlanManager;
	@Autowired
	private EbRegionManager ebRegionManager;
	@Autowired
	private EiSchedulingShiporderManager eiSchedulingShiporderManager;
	@Autowired
	private EtOrderMaterielManager etOrderMaterielManager;
	@Autowired
	private EiShiporderUnitsManager eiShiporderUnitsManager;
	@Autowired
	private SchedulBatchLockManager schedulBatchLockManager;
	@Autowired
	private EtVehicleManager etVehicleManager;
	@Autowired
	private EtLineNodeManager  etLineNodeManager;
	@Autowired
	private EtVehicleModelManager  etVehicleModelManager;
	@Autowired
	private CommonQueryManager commonQueryManager;
	@Autowired
	private SchedulStopsInfoManager schedulStopsInfoManager;
	@Autowired
	private EsUserManager esUserManager;
	/**
	 * 
	 * 编码生成器Manager
	 */
	@Autowired
	private EsCounterManager esCounterManager;
	
	
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	public ResponseData<QueryData> queryOrderFeeByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		QueryData queryData = eoorManager.queryOrderFeeByCondition(queryInfo);
		responseData.setCode(Constants.YES);
		responseData.setData(queryData);
		return responseData;
	}


	@Override
	public ResponseData<QueryData> querySchedulOrdeCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		QueryData queryData = eoorManager.querySchedulOrdeCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}




	@Override
	public ResponseData<QueryData> queryEotaInfoCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		QueryData queryData = eoorManager.queryEotaInfoCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}


	@Override
	public ResponseData<List<EtSchedulePlanModel>> saveSchedulePlan(List<EtSchedduleModelDto> etSchedduleModelDtoList) {
		ResponseData<List<EtSchedulePlanModel>> responseData=new ResponseData<List<EtSchedulePlanModel>>();
		if(EmptyUtils.isNotEmpty(etSchedduleModelDtoList)){
			int lengthDto = etSchedduleModelDtoList.size()-1;
			if("Y".equals(etSchedduleModelDtoList.get(lengthDto).getIsIntelligent())){
				etSchedduleModelDtoList.remove(lengthDto);
//				responseData=intelligentSchedulByDto(etSchedduleModelDtoList);
				return responseData;
			}else{
				etSchedduleModelDtoList.remove(lengthDto);
				responseData=updateSchedulByDto(etSchedduleModelDtoList);
				return responseData;
			}
		}
		return responseData;
	
	}
	
	@Override
	public ResponseData queryIntelligentScheduling(Integer[] ettaIds) {
		ResponseData<List<EtSchedulePlanModel>> responseData=new ResponseData<List<EtSchedulePlanModel>>();
		try {
			IgnoreLoginController.ignoreLogin();// 忽略登陆
			if(EmptyUtils.isEmpty(ettaIds)&&ettaIds.length>1){
				responseData.setCode(Constants.NO);
				responseData.setMsg("请至少勾选一条任务调度");
				return responseData;
			}
//			UserDetails edModel = getUserDetail(ettaIds[ettaIds.length-1]);
//			ettaIds = deleteLastDate(ettaIds);
//			IgnoreLoginController.virtualLogin(edModel);// 忽略登陆
			//获取调度人并在数组中删除操作
			
			//校验数据是否适合智能调度
			ResponseData<StringBuffer> resData=new ResponseData<StringBuffer>();
			resData=checkDate(ettaIds);
			if(Constants.NO.equals(resData.getCode())){
				responseData.setMsg(resData.getMsg());
				responseData.setCode(Constants.NO);
				return responseData;
			}
			//batchNo为本次智能调度唯一编码
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			String batchNo = dateFormat.format(new Date());
			//任务集合
			List<EtTaskModel> ettaModels = getEttaModelList(ettaIds);
			//拼报文组装数据
			ResponseData reData = this.getFileString(ettaModels,batchNo);
			if(Constants.NO.equals(reData.getCode())){
				responseData.setCode(Constants.NO);
				responseData.setMsg(reData.getMsg());
				return responseData;
			}
			String fileString = reData.getMsg();
			if(StringUtil.isNotNULlOrBlank(fileString)){
				responseData = this.testHttps(fileString, batchNo,"optimizationRequest",ettaModels);
			}
		} catch (Exception e) {
			
		}finally{
//			IgnoreLoginController.virtualLogout();//虚拟登出
			IgnoreLoginController.cancelIgnore();//虚拟登出
		}
		return responseData;
	}

	
	
	private Integer[] deleteLastDate(Integer[] ettaIds) {
		List<Integer> list=Arrays.asList(ettaIds);//将数组转换为list集合
		if(list.contains(ettaIds[ettaIds.length-1])){
			list.remove(ettaIds[ettaIds.length-1]);
		}
		Integer[] newArr = new Integer[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newArr[i] = list.get(i);
		}
		return newArr;
	}


	private UserDetails getUserDetail(Integer id) {
		EsUserModel esusModel = esUserManager.get(id.longValue());
		UserDetails edModel = new UserDetails();
		BeanUtils.copyProperties(edModel, esusModel);
		return edModel;
	}


	private List<EtTaskModel> getEttaModelList(Integer[] ettaIds) {
		List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
		filterCond.add(new FilterCondition("ettaId", ettaIds, "in"));
		List<EtTaskModel> ettaModels =ettaManager.findByCondition(filterCond);
		return ettaModels;
	}


	public ResponseData<StringBuffer> checkDate(Integer[] ettaIds) {
		ResponseData<StringBuffer> resData=new ResponseData<StringBuffer>();
		String strBuf = ettaManager.checkEoorInfo(ettaIds);
		if( EmptyUtils.isEmpty(strBuf)){
			resData.setCode(Constants.YES);
		}else{
			resData.setCode(Constants.NO);
			resData.setMsg(strBuf);
		}
		return resData;
	}


	public ResponseData<List<EtSchedulePlanModel>> updateSchedulByDto(List<EtSchedduleModelDto> etSchedduleModelDtoList){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		   List<EtSchedulePlanModel> etSchedulePlanModels = new ArrayList<EtSchedulePlanModel>();
			if(EmptyUtils.isNotEmpty(etSchedduleModelDtoList)){
				try {
					List<EtTaskModel> etTaskModels =  new ArrayList<EtTaskModel>();
					Set<Integer> ettaEtorIds=new HashSet<Integer>();//et_order订单ID结合
					EtTaskModel model = ettaManager.get(etSchedduleModelDtoList.get(0).getEttaId());
					EtSchedulePlanModel etSchedulePlanModel = new EtSchedulePlanModel();
					etSchedulePlanModel.setEtspDefaultOutStopTime(etSchedduleModelDtoList.get(0).getEtspDefaultOutStopTime());
					etSchedulePlanModel.setEtspNo(esCounterManager.generationTCBNo2(model.getEttaEscoId()));
					etSchedulePlanModel.setEtspName(etSchedduleModelDtoList.get(0).getEtspName());
					etSchedulePlanModel.setEtspIsImport("N");
					// 默认调度计划的自关联为-1
					etSchedulePlanModel.setEtspSelfId(Constants.DEFAULT_NONE_FK);
					// 默认调度状态为调度中
					etSchedulePlanModel.setEtspStatus("1");
					// 设置平台
					etSchedulePlanModel.setEtspEscoId(model.getEttaEscoId());
					etSchedulePlanModel.setCreator("466200");
					etSchedulePlanModel.setModifier("466200");
					etSchedulePlanModel.setCreateTime(new Date());
					etSchedulePlanModel.setModifyTime(new Date());
					etSchedulePlanModel.setRecVer(1);
					etSchedulePlanModel.setEtspId(1001);
					etSchedulePlanModel.setEtspEbcuId(model.getEttaCarrierEbcuId());
					etSchedulePlanModel.setEtspEbcuNameCn(model.getEttaCarrierEbcuNameCn());
					etSchedulePlanModel=this.etSchedulePlanManager.save(etSchedulePlanModel);
					for (EtSchedduleModelDto etSchedduleModelDto: etSchedduleModelDtoList) {
						if(etSchedduleModelDto!=null){
							EtTaskModel ettaModel =ettaManager.get(etSchedduleModelDto.getEttaId());
							ettaModel.setEttaEtspId(etSchedulePlanModel.getEtspId());
							ettaModel.setEttaStatus("SCHEDULING");
							etTaskModels.add(ettaModel);
							ettaEtorIds.add(ettaModel.getEttaEtorId());
						}
					}
					this.ettaManager.saveAll(etTaskModels);
					etSchedulePlanModels.add(etSchedulePlanModel);
					writebackTaskStatus(etTaskModels);
					updateEoorStatus(ettaEtorIds);
				} catch (Exception e) {
					e.printStackTrace();
		      }
			}
			ResponseData<List<EtSchedulePlanModel>> responseData=new ResponseData<List<EtSchedulePlanModel>>();
			responseData.setCode(Constants.YES);
			responseData.setData(etSchedulePlanModels);
			IgnoreLoginController.cancelIgnore();//虚拟登出
			return responseData;
	}

	public void updateEoorStatus(Set<Integer> ettaEtorIds) {
		List<EtOrderModel> etOrderModels = new ArrayList<EtOrderModel>();
		List<EoOrderModel> eoOrderModels = new ArrayList<EoOrderModel>();
		for (Integer etorId : ettaEtorIds) {
			//更新TMS订单状态
			EtOrderModel etorModel = etorManager.get(etorId);
			etorModel.setEtorStatus("DOING");
			etOrderModels.add(etorModel);
			EoOrderModel eoorModel = this.eoorManager.get(Integer.valueOf(etorModel.getEtorFkSysId()));
			if(null!=eoorModel){
				//更新OMS订单状态
				eoorModel.setEoorStatus("DOING");
				eoOrderModels.add(eoorModel);
			}
		}
		this.etorManager.saveAll(etOrderModels);
		this.eoorManager.saveAll(eoOrderModels);
	}


	/**
	 * 把TMS任务的状态回写给OMS订单
	 * @param tasks 任务列表
	 */
	public void writebackTaskStatus(List<EtTaskModel> etTaskModels) {
		List<EoTaskModel> models = new ArrayList<EoTaskModel>();
		for (Iterator iterator = etTaskModels.iterator(); iterator.hasNext();) {
			EtTaskModel task = (EtTaskModel) iterator.next();
			Integer eotaId = Integer.valueOf(task.getEttaFkSysId());//OMS任务ID
			EoTaskModel model = eotaManager.get(eotaId);
			model.setEotaStatus(task.getEttaStatus());
			model.setEotaEtspId(task.getEttaEtspId());
			model.setEotaLoadSeq(task.getEttaLoadSeq());
			model.setEotaUnloadSeq(task.getEttaUnLoadSeq());
			models.add(model);
		}
		eotaManager.saveAll(models);
	}




	private ResponseData<List<EtSchedulePlanModel>> testHttps(String fileString, String batchNo, String requestType, List<EtTaskModel> ettaModels) {
		ResponseData<List<EtSchedulePlanModel>> responseData=new ResponseData<List<EtSchedulePlanModel>>();
		  try {
	            Map<String, String> keyMap = this.getShanshuKeyInfo();
	            String key = keyMap.get("key");
	            String secret = keyMap.get("secret");
	            String keyToken = keyMap.get("keyToken");
	            String url = keyMap.get("urlPrefix");
	            //String url = "https://172.30.254.161:8065/tms-schedule-plt/v1/optimization/request";
	            String timeStamp = Long.toString(System.currentTimeMillis());
	            JSONObject jsonObject = JSON.parseObject(fileString, Feature.OrderedField);
	            //key排序，然后拼接
	            StringBuffer sb = new StringBuffer();
	            Set<String> keySet = jsonObject.keySet();
	            List<String> keys = new ArrayList<String>(keySet);
	            Collections.sort(keys);
	            for (String s : keys) {
	                Object s2 = jsonObject.get(s);
	                sb.append(s + "=" + s2 + "&");
	            }
	            // 2.结尾拼接时间戳
	            sb.append(timeStamp.toString());
	            // 3.转成大写，MD5加盐式加密
	            String sign = MD5Util.MD5(sb.toString().toUpperCase() + secret);
	            //签名结束
	            Date date = new Date();
//	            this.eaiMessageFileManager.saveInInfo(null, date, null, null, null, "EAITMS", "SHANSHU", "optimizationRequest", null, fileString, "N", "N", "UTF-8", batchNo, null, null);
	            
	            DefaultHttpClient client = new DefaultHttpClient(new PoolingClientConnectionManager()); 
	            //绕过验证
	            //创建TrustManager
	            X509TrustManager xtm = new X509TrustManager() {
	                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
	                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
	                public X509Certificate[] getAcceptedIssuers() {
		                return  null;
	                }
	            };
	            //HOST验证
	            X509HostnameVerifier hostnameVerifier = new X509HostnameVerifier() {
	                public boolean verify(String arg0, SSLSession arg1) {
	                    return true;
	                }
	                public void verify(String arg0, SSLSocket arg1) throws IOException {}
	                public void verify(String arg0, String[] arg1, String[] arg2) throws SSLException {}
	                public void verify(String arg0, X509Certificate arg1) throws SSLException {}
	            };
	            //TLS1.0与SSL3.0基本上没有太大的差别，可粗略理解为TLS是SSL的继承者，但它们使用的是相同的SSLContext
	            SSLContext ctx = SSLContext.getInstance("TLS");
	            //使用TrustManager来初始化该上下文，TrustManager只是被SSL的Socket所使用
	            ctx.init(null, new TrustManager[] { xtm }, null);
	            //创建SSLSocketFactory
	            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx);
	            socketFactory.setHostnameVerifier(hostnameVerifier);
	            //通过SchemeRegistry将SSLSocketFactory注册到我们的HttpClient上
	            client.getConnectionManager().getSchemeRegistry().register(new Scheme("https", socketFactory, 443));
	            
	            HttpPost httpPost = new HttpPost(url);
	            httpPost.setHeader("BusinessCode", "01009");
	            httpPost.setHeader("key",key);
	            httpPost.setHeader("x-access-token", keyToken);
	            httpPost.setHeader("sign", sign);
	            httpPost.setHeader("reqTimestamp", timeStamp);
	            httpPost.setHeader("Content-Type", "application/json;charset=utf-8");
	            StringEntity stringEntity = new StringEntity(fileString,"UTF-8");
	            stringEntity.setContentType("text/json");
	            httpPost.setEntity(stringEntity);
	            client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 30000);//请求超时
	            client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT,30000); //读取超时
//	          UserDetails user = SessionContext.getUser();
//	          String eaieEscoId = user.getOrgId();
//	          String eaieEbpjId =  user.getProjectId();
	            CloseableHttpResponse response = client.execute(httpPost);
	            String resultJson = EntityUtils.toString(response.getEntity(),"UTF-8");
	            System.out.println(resultJson);
	            Map<String, Object> returnMap = (Map<String, Object>)JSON.parse(resultJson);
	            Date returnDate = new Date();
//	            this.eaiMessageFileManager.saveInInfo(null, returnDate, null, null, null, "EAITMS", "SHANSHU", "returnOptimizationRequest", null, resultJson, "N", "N", "UTF-8", batchNo, null, null);
	            if("0".equals(String.valueOf(returnMap.get("code")))){
//	                msg.setSuccess(true);
//	                msg.addMessage("操作成功");
	                //存入lock表
	                Map<String, String> reqIdMap = (Map<String, String>)returnMap.get("data");
	                String reqId = reqIdMap.get("requestId");
	                SchedulBatchLockModel scblModel = new SchedulBatchLockModel();
	                scblModel.setScblBatchNo(batchNo);
	                scblModel.setScblRequestId(reqId);
	                this.schedulBatchLockManager.save(scblModel);
	    			String msg = "优化请求发送成功,批次号:"+batchNo+",请求ID:"+reqId+";";
	    			responseData.setCode(Constants.YES);
	    	    	responseData.setMsg(msg);
	                return  responseData;
	            } else {
	            	//更新ETTA
	            	for(EtTaskModel model:ettaModels){
	            		model.setEttaIsIntelscheduling("");
	            	}
	                ettaManager.saveAll(ettaModels);
	            	responseData.setCode(Constants.NO);
	    	    	responseData.setMsg("数据校验错误,请联系管理员");
	                return  responseData;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return responseData;
	}

	private List<EtSchedulePlanModel> schedulingByTaskIds(List<EtSchedduleModelDto> etSchedduleModelDtoList) {
		List<EtSchedulePlanModel> etSchedulePlanModels = new ArrayList<EtSchedulePlanModel>();
		if(EmptyUtils.isNotEmpty(etSchedduleModelDtoList)){
			try {
				List<EtTaskModel> etTaskModels =  new ArrayList<EtTaskModel>();
				Set<Integer> ettaEtorIds=new HashSet<Integer>();//et_order订单ID结合
				EtTaskModel model = ettaManager.get(etSchedduleModelDtoList.get(0).getEttaId());
				EtSchedulePlanModel etSchedulePlanModel = new EtSchedulePlanModel();
//				etSchedulePlanModel.setEtspNo(esCounterManager.generationTCBNo());
				etSchedulePlanModel.setEtspNo(esCounterManager.generationTCBNo2(model.getEttaEscoId()));
				etSchedulePlanModel.setEtspDefaultOutStopTime(etSchedduleModelDtoList.get(0).getEtspDefaultOutStopTime());
				etSchedulePlanModel.setEtspName(etSchedduleModelDtoList.get(0).getEtspName());
				etSchedulePlanModel.setEtspIsImport("N");
				// 默认调度计划的自关联为-1
				etSchedulePlanModel.setEtspSelfId(Constants.DEFAULT_NONE_FK);
				// 默认调度状态为调度中
				etSchedulePlanModel.setEtspStatus("1");
				// 设置平台
				etSchedulePlanModel.setEtspEscoId(model.getEttaEscoId());
				etSchedulePlanModel.setEtspEbcuId(model.getEttaCarrierEbcuId());
				etSchedulePlanModel.setEtspEbcuNameCn(model.getEttaCarrierEbcuNameCn());
				etSchedulePlanModel=this.etSchedulePlanManager.save(etSchedulePlanModel);
				for(EtSchedduleModelDto dto:etSchedduleModelDtoList){
					EtTaskModel ettaModel =ettaManager.get(dto.getEttaId());
					ettaModel.setEttaEtspId(etSchedulePlanModel.getEtspId());
					ettaModel.setEttaStatus("SCHEDULING");
					ettaModel.setEttaIsScheduleInstruction("Y");
					etTaskModels.add(ettaModel);
					ettaEtorIds.add(ettaModel.getEttaEtorId());
				}
				etTaskModels = this.ettaManager.saveAll(etTaskModels);
				etSchedulePlanModels.add(etSchedulePlanModel);
				writebackTaskStatus(etTaskModels);
				updateEoorStatus(ettaEtorIds);
			} catch (Exception e) {
				e.printStackTrace();
	}
		}
		return etSchedulePlanModels;
		
	}
	
	private List<EtSchedulePlanModel> intelligentSchedulingByTaskIds(List<EtSchedduleModelDto> etSchedduleModelDtoList) {
		List<EtSchedulePlanModel> etSchedulePlanModels = new ArrayList<EtSchedulePlanModel>();
		if(EmptyUtils.isNotEmpty(etSchedduleModelDtoList)){
			try {
				List<EtTaskModel> etTaskModels =  new ArrayList<EtTaskModel>();
				Set<Integer> ettaEtorIds=new HashSet<Integer>();//et_order订单ID结合
				EtTaskModel model = ettaManager.get(etSchedduleModelDtoList.get(0).getEttaId());
				EtSchedulePlanModel etSchedulePlanModel = new EtSchedulePlanModel();
//				etSchedulePlanModel.setEtspNo(esCounterManager.generationTCBNo());
				etSchedulePlanModel.setEtspNo(esCounterManager.generationTCBNo2(model.getEttaEscoId()));
				etSchedulePlanModel.setEtspDefaultOutStopTime(etSchedduleModelDtoList.get(0).getEtspDefaultOutStopTime());
				etSchedulePlanModel.setEtspName(etSchedduleModelDtoList.get(0).getEtspName());
				etSchedulePlanModel.setEtspIsImport("N");
				// 默认调度计划的自关联为-1
				etSchedulePlanModel.setEtspSelfId(Constants.DEFAULT_NONE_FK);
				// 默认调度状态为调度中
				etSchedulePlanModel.setEtspStatus("1");
				// 设置平台
				etSchedulePlanModel.setEtspEscoId(model.getEttaEscoId());
				etSchedulePlanModel.setEtspEbcuId(model.getEttaCarrierEbcuId());
				etSchedulePlanModel.setEtspEbcuNameCn(model.getEttaCarrierEbcuNameCn());
				etSchedulePlanModel=this.etSchedulePlanManager.save(etSchedulePlanModel);
				for(EtSchedduleModelDto dto:etSchedduleModelDtoList){
					EtTaskModel ettaModel =ettaManager.get(dto.getEttaId());
					ettaModel.setEttaEtspId(etSchedulePlanModel.getEtspId());
					ettaModel.setEttaStatus("SCHEDULING");
					ettaModel.setEttaIsScheduleInstruction("Y");
					etTaskModels.add(ettaModel);
					ettaEtorIds.add(ettaModel.getEttaEtorId());
				}
				etTaskModels = this.ettaManager.saveAll(etTaskModels);
				etSchedulePlanModels.add(etSchedulePlanModel);
				writebackTaskStatus(etTaskModels);
				updateEoorStatus(ettaEtorIds);
			} catch (Exception e) {
				e.printStackTrace();
	}
		}
		return etSchedulePlanModels;
		
	}




		public Map<String, String> getShanshuKeyInfo(){
		        Map<String, String> keyMap = new HashMap<String, String>();
		      //UAT
//		        keyMap.put("urlPrefix", "https://rc.open.d2d.ai/unicorn-api-v2/api/v2/optimization/request"); 
//		        keyMap.put("key", "0dfabb66754d45e6b5fc2ac1969062a1");
//		        keyMap.put("keyToken", "eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE5MjIzMjgwMDAsImtleSI6IjBkZmFiYjY2NzU0ZDQ1ZTZiNWZjMmFjMTk2OTA2MmExIn0.Y19QKpA_6cyRlYqXPURjgw-szMoCL6rI3ptJ61bgYDcYraNlGONLiskAdmlJpsi9niXkKf7Y4xdCQd6ckPeyrg");
		        keyMap.put("secret", "49d59ca065bb420da4f82845fd42c58a");
		      //生产
		        keyMap.put("urlPrefix", "https://open.d2d.ai/unicorn-api-v2/api/v2/optimization/request");
		        keyMap.put("key", "a2b3aa82e581469c90f72d63a6d41d6b");
		        keyMap.put("keyToken", "eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE5MjIzMjgwMDAsImtleSI6ImEyYjNhYTgyZTU4MTQ2OWM5MGY3MmQ2M2E2ZDQxZDZiIn0.O82mZ40bTidza_x3gTTVOQ5z5siLPIUB0wJ-tlcysF4oAJCtJYtxNGBOzxMh6x9M71gLYcMSejsEJVyJCwjFNQ");
		        keyMap.put("secret", "5778cd62abbb45d4a4cff65a9f0f7331");
		        return keyMap;
		    }
		

		//组装报文
		private ResponseData getFileString(List<EtTaskModel> ettaModels, String batchNo) {
					ResponseData responseData = new ResponseData();
				try{
					JSONObject jsonHead = new JSONObject();
					jsonHead.put("algorithmVersion", "VRPSolver");
					jsonHead.put("branchId", "SINOCHEMIC");
					jsonHead.put("deptId", "SINOCHEMIC-SHDC");
//					jsonHead.put("callbackUrl", "http://58.87.75.132:7777/SChemUAT/NoticeResultServlet");//uat
					jsonHead.put("callbackUrl", "http://140.143.129.81:7777/SChemApp/NoticeResultServlet");//生产腾讯云
					jsonHead.put("controlType", "PARTIAL");//生产腾讯云
					JSONArray shipOrdersList = new JSONArray();
					//运单列表
					List<EtTaskModel> etTaskModels = new ArrayList<EtTaskModel>();
					//获车辆信息
					List<IotData> iotDatas =getVehicle();
					if(iotDatas.size()==0){
						responseData.setCode(Constants.NO);
						responseData.setMsg("暂无可用车辆调度");
						return responseData;
					}
					EtOrderModel etorModel = etorManager.get(ettaModels.get(0).getEttaEtorId());
					//获取车辆信息
					List<EtVehicleModel> etveModels = getEtveModels(iotDatas,ettaModels.get(0));
					if(etveModels==null){
						responseData.setCode(Constants.NO);
						responseData.setMsg("暂无可用车辆调度");
						return responseData;
					}
					//获取车型信息
					List<EtVehicleModelModel> etvmModels =getEtVehicleModel(etveModels);
					if(ettaModels.size()>0){
				      for(EtTaskModel ettaModel:ettaModels){
								JSONObject shipOrder = new JSONObject();
								shipOrder.put("shipOrderId", String.valueOf(ettaModel.getEttaId()));
								shipOrder.put("shipOrderClass", "");
								shipOrder.put("shipOrderType", "");
								shipOrder.put("shipOrderPriority", 1);
								shipOrder.put("pickupLocationId", "");
								shipOrder.put("pickupProvince",ettaModel.getEttaFromEbrgNameCn());
								shipOrder.put("pickupCity", getCityName(ettaModel.getEttaFromEbrgId()));
								shipOrder.put("pickupLocationAddress", ettaModel.getEttaDeliveryAddress());
								shipOrder.put("pickupStopLong", "");//经纬度
								shipOrder.put("pickupStopLat", "");//经纬度
								shipOrder.put("pickupRestrictZoneId", "");
								shipOrder.put("pickupBusinessZoneId", "");
//								shipOrder.put("pickupTimeWindow", getTimeWindow(ettaModel.getEttaDeliveryReqTime()));
								shipOrder.put("pickupTimeWindow", getStartTimeWindow(ettaModel.getEttaArrivalReqTime()));
								shipOrder.put("pickupDuration", 0);
								shipOrder.put("deliveryLocationId", "");
								shipOrder.put("deliveryProvince", ettaModel.getEttaToEbrgNameCn());
								shipOrder.put("deliveryCity", "");
								shipOrder.put("deliveryLocationAddress", ettaModel.getEttaReceiveAddress());
								shipOrder.put("deliveryStopLong", "");//经纬度
								shipOrder.put("deliveryStopLat", "");//经纬度
								shipOrder.put("deliveryRestrictZoneId", "");
								shipOrder.put("deliveryBusinessZoneId", "");
//								shipOrder.put("deliveryTimeWindow", getTimeWindow(ettaModel.getEttaArrivalReqTime()));
								shipOrder.put("deliveryTimeWindow", getEndTimeWindow(ettaModel.getEttaArrivalReqTime()));
								shipOrder.put("deliveryDuration", 0);
								shipOrder.put("lanenLength", 5);
								JSONArray shipOrderUnitsArray = new JSONArray();
								List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
								filterCond.add(new FilterCondition("etomEtorId", ettaModel.getEttaEtorId(), "="));
								List<EtOrderMaterielModel> etOrderMaterielModels =etOrderMaterielManager.findByCondition(filterCond);
								if(EmptyUtils.isNotEmpty(etOrderMaterielModels)){
									for(EtOrderMaterielModel etomModel:etOrderMaterielModels){
										String cmtdyId = getEtomModelType(etomModel);
										JSONObject shipOrderUnit = new JSONObject();
										shipOrderUnit.put("cmtdyId", cmtdyId);
										if(etomModel.getEtomGrossWeight()==null){
											shipOrderUnit.put("weight", 0);	
										}else{
											shipOrderUnit.put("weight", etomModel.getEtomGrossWeight());
										}
										if( etomModel.getEtomVolume()==null){
											shipOrderUnit.put("volume", 0);	
										}else{
											shipOrderUnit.put("volume", etomModel.getEtomVolume());
										}
										if( etomModel.getEtomQuantity()==null||etomModel.getEtomQuantity()==0){
											shipOrderUnit.put("cases", 1);	
										}else{
											shipOrderUnit.put("cases", etomModel.getEtomQuantity());
										}
										shipOrderUnitsArray.add(shipOrderUnit);
									}
								}
								shipOrder.put("shipOrderUnits", shipOrderUnitsArray);
								shipOrdersList.add(shipOrder);
								ettaModel.setEttaBatchNo(batchNo);
								ettaModel.setEttaIsIntelscheduling("Y");
								etTaskModels.add(ettaModel);
							}
					}
					jsonHead.put("shipOrders",shipOrdersList);
					JSONObject resourcesList = new JSONObject();
					//承运商可用资源
					JSONArray carrierAvailableResourcesArray = new JSONArray();
					for(EtVehicleModel etveModel:etveModels){
						JSONObject carrierAvailableResource = new JSONObject();
						carrierAvailableResource.put("resourceId",etveModel.getEtveCard());
						carrierAvailableResource.put("distanceCost", 5);
						carrierAvailableResource.put("resourceCount", 2);
						carrierAvailableResource.put("fixedCost", 320);
						carrierAvailableResource.put("domicile", "");
						carrierAvailableResource.put("carrierId", "SINOCHEMIC");
						carrierAvailableResource.put("resourceType", "Vehicle");
						carrierAvailableResourcesArray.add(carrierAvailableResource);
					}
					resourcesList.put("carrierAvailableResources", carrierAvailableResourcesArray);
					//车型
					JSONArray vehicleModelsArray = new JSONArray();
					for(EtVehicleModelModel model:etvmModels){
						JSONObject vehicleModel = new JSONObject();
						vehicleModel.put("deviceType", "Normal");
						vehicleModel.put("vehicleModelId", model.getEtvmCode());
						vehicleModel.put("in", model.getEtvmIn());
						vehicleModel.put("vehicleRestrictionGroup",model.getEtvmRestrictiongRoup());
						vehicleModel.put("exclusion", model.getEtvmExclusion());
						vehicleModel.put("priority", 1);
						vehicleModel.put("out", model.getEtvmOut());
						vehicleModel.put("retrictZoneId", "");
						vehicleModel.put("maxLoadVolume", model.getEtvmMaxloadvolume());
						vehicleModel.put("maxLoadWeight", model.getEtvmMaxloadweight());
						vehicleModelsArray.add(vehicleModel);
					}
					resourcesList.put("vehicleModels",vehicleModelsArray);
					//车辆
					JSONArray vehiclesArray = new JSONArray();
					for(EtVehicleModel etveModel:etveModels){
						JSONObject vehicles = new JSONObject();
						vehicles.put("vehicleId", etveModel.getEtveCard());
						vehicles.put("vehicleModelId", etveModel.getEtveCode());
						vehicles.put("priority", 1);
						vehicles.put("maxLoadWeight", etveModel.getEtveMaxLoadweight());
						vehicles.put("maxLoadVolume", etveModel.getEtveMaxLoadvolume());
						vehiclesArray.add(vehicles);
					}
					resourcesList.put("vehicles",vehiclesArray);
					jsonHead.put("resources",resourcesList);
					//参数
					JSONObject params = new JSONObject();
					if("S".equals(etorModel.getEtorSubstr6())){
						params.put("paramSetId", 1);
					}else{
						params.put("paramSetId", 2);
					}
					jsonHead.put("params",params);
					this.ettaManager.saveAll(etTaskModels);
					System.out.println(jsonHead.toString());
					responseData.setCode(Constants.YES);
					responseData.setMsg(jsonHead.toString());
				} catch(Exception e) {
					e.printStackTrace();
				}
					return responseData;
				}

	
    //获取城市
    private String getCityName(Integer ettaFromEbrgId) {
    	if(ettaFromEbrgId==null){
    		return "";
    	}
    	Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("ebrgId", ettaFromEbrgId);//车牌号
    	String cityName= ettaManager.etCityName(conditions);
		return cityName;
	}


    //物料类型翻译
	private String getEtomModelType(EtOrderMaterielModel etomModel) {
			if(null!=etomModel){
				if(EmptyUtils.isNotEmpty(etomModel.getEtomEbmaNameCn())&&etomModel.getEtomEbmaNameCn().contains("塑料粒子")){
					return "PP";
				}else if(EmptyUtils.isNotEmpty(etomModel.getEtomType())&&("MATERIAL_DG".equals(etomModel.getEtomType())||"MATERIAL_VIRULENT".equals(etomModel.getEtomType()))){
					return "DANGERS";
				}else if(EmptyUtils.isNotEmpty(etomModel.getEtomEbmaIsTemperature())&&("Y".equals(etomModel.getEtomEbmaIsTemperature()))){
					if(EmptyUtils.isNotEmpty(etomModel.getEtomEbmaFeatures())&&etomModel.getEtomEbmaFeatures().contains("零")){
						return "TC-COLD";
					}else{
						return "TC-HOT";
					}
				}else{
					return "NORMAL";
				}
			}
			return "NORMAL";
		}

	//车型信息去重
	private  List<EtVehicleModelModel> getEtVehicleModel(List<EtVehicleModel> etveModels) {
		//获取车型ID
		List<Integer> etveEtvmIds =  etveModels.stream().map(EtVehicleModel::getEtveEtvmId).collect(Collectors.toList());
		etveEtvmIds.removeAll(Collections.singleton(null)); 
		List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
		Integer[] etvmId = etveEtvmIds.toArray(new Integer[etveEtvmIds.size()]);
		filterCond.add(new FilterCondition("etvmId",etvmId, "in"));
		List<EtVehicleModelModel> etvmModels =etVehicleModelManager.findByCondition(filterCond);
	    return etvmModels;
	}
	
	//获取可用车辆信息
	private List<EtVehicleModel> getEtveModels(List<IotData> iotDatas, EtTaskModel etTaskModel) {
		//iot所有车辆
		List<String> etveCards =  iotDatas.stream().map(IotData::getPlateNo).collect(Collectors.toList());
		System.out.println(StringUtils.join(etveCards,","));
		//查看正使用中的车辆
		Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("etveCards", StringUtils.join(etveCards,","));//车牌号
		List<String> cards = etVehicleManager.getAvailableVehicle(conditions);
		//获取可用车辆
		List<String> avaCards=getAvailableVehicle(etveCards,cards);
		if(avaCards.size()==0){
			return null;
		}
		//获取订单信息--为了基地ID
		EtOrderModel etorModel = etorManager.get(etTaskModel.getEttaEtorId());
		//获取可用车辆信息
		List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
		String[] etveCard = avaCards.toArray(new String[avaCards.size()]);
		filterCond.add(new FilterCondition("etveCard",etveCard, "in"));
		filterCond.add(new FilterCondition("etveEscoId",etTaskModel.getEttaEscoId(), "="));
		filterCond.add(new FilterCondition("etveEsstId",etorModel.getEtorEbotId(), "="));
		filterCond.add(new FilterCondition("etveStatus","ENABLE", "="));
		List<EtVehicleModel> EtVehicleModels =etVehicleManager.findByCondition(filterCond);
		//判空处理
		if(EmptyUtils.isEmpty(EtVehicleModels)){
			return null;
		}
		Iterator<EtVehicleModel> etveIterator = EtVehicleModels.iterator();
		while(etveIterator.hasNext()){ 
			EtVehicleModel model = etveIterator.next();
			 if(model.getEtveEtvmId()==null){
				 etveIterator.remove();
			 }
		}
		return EtVehicleModels;
	}
   
	private List<String> getAvailableVehicle(List<String> etveCards, List<String> cards) {
		List<String> avaCards = new ArrayList<String>();
		 if(cards==null){
			   return etveCards;
		   }else{
			   for(String etveCard:etveCards){
				    if(!cards.contains(etveCard)){
				      avaCards.add(etveCard);
				    } 
				}
		   }
			return avaCards;
		}

	//public static void main(String[] args) {
//
//	//获车辆信息
//	List<IotData> iotDatas =getVehicle();
//	//获取车辆信息
//	List<EtVehicleModel> etveModels = getEtveModels(iotDatas);
//}
	private List<IotData> getVehicle() {
		// TODO Auto-generated method stub
//		IgnoreLoginController.ignoreLogin();
		HttpClient client = new HttpClient();
		String str = ""; 
		StringBuffer string = new StringBuffer(); 
		Date now=new Date();
		MD55 md5=new MD55();	
		//uat
//		String strkey = "a9fcaa2111ec4e47b7617b17569d2d95";
//		String strsecret = "fc74e48ef91e42caa8c3d89e1a70ecb9";
		//生产
		String strkey = "1d4a5a191c67464ebc396256e1166f6a";
		String strsecret = "db92c9496f8b46a6bc72371b0e82c461";
		
		List<IotData> iotDatas = new ArrayList<IotData>();
		try {
			//String code = this.esControlParamManager.getDefaultEscpValueByCode("IOT_GPS_VEHICLE");
//			String code = "https://uat.iot.sinotrans.com/iot/fence/oapi/fencePlateNo";//uat
			String code = "https://iot.sinotrans.com/iot/fence/oapi/fencePlateNo";//生产
			System.out.println(code);
			PostMethod method = new PostMethod(code);
		    method.addParameter("sign", md5.md5(strkey+"CR00000684"+strsecret).toLowerCase());
		    System.out.println(md5.md5(strkey+"CR00000684"+strsecret).toLowerCase());
   			method.addParameter("key", strkey);
   			method.addParameter("fenceCode", "CR00000684");
   			method.releaseConnection();
   			client.executeMethod(method);	
   			BufferedReader reader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
   			//String httpResult = new String(reader.getBytes("ISO-8859-1"),"utf-8");
			while((str = reader.readLine())!=null){  
				string.append(str);  
			} 
			System.out.println(string.toString());
			System.out.println(new String(string.toString().getBytes("gbk"),"utf-8"));
			String resultJson =string.toString();
			Map<String, Object> returnMap = (Map<String, Object>)JSON.parse(resultJson);
            if("1".equals(String.valueOf(returnMap.get("code")))){
            	iotDatas = JSONObject.parseArray(returnMap.get("data").toString(), IotData.class);
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		IgnoreLoginController.cancelIgnore();
			return iotDatas;
		}
	
	private  String getTimeWindow2(Date date, Date date2) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
    	Calendar cal = Calendar.getInstance();   
    	cal.setTime(date);   
    	cal.add(Calendar.HOUR, 2);// 24小时制   
    	Date endDate = cal.getTime();   
    	System.out.println("before:" + format.format(date));
    	System.out.println("after:" + format.format(endDate));  //显示更新后的日期 
    	return format.format(date)+":"+format.format(endDate);  
	}
	private  String getStartTimeWindow(Date date) {
		Calendar startCalendar = new GregorianCalendar();
		startCalendar.setTime(new Date());
		startCalendar.add(Calendar.DATE, 0);
		startCalendar.set(Calendar.HOUR_OF_DAY, 12);
		startCalendar.set(Calendar.MINUTE, 0);
		startCalendar.set(Calendar.SECOND, 0);
        Date startTime = startCalendar.getTime();
        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(date);
        endCalendar.add(Calendar.DATE, 0);
        endCalendar.set(Calendar.HOUR_OF_DAY, 14);
        endCalendar.set(Calendar.MINUTE, 0);
        endCalendar.set(Calendar.SECOND, 0);
        Date endTime = endCalendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
    	System.out.println("before:" + format.format(startTime));
    	System.out.println("after:" + format.format(endTime));  //显示更新后的日期 
    	return format.format(startTime)+":"+format.format(endTime);  
	}

	
	private  String getEndTimeWindow(Date date) {
		Calendar startCalendar = new GregorianCalendar();
		startCalendar.setTime(new Date());
		startCalendar.add(Calendar.DATE, 1);
		startCalendar.set(Calendar.HOUR_OF_DAY, 8);
		startCalendar.set(Calendar.MINUTE, 0);
		startCalendar.set(Calendar.SECOND, 0);
        Date startTime = startCalendar.getTime();
        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(date);
        endCalendar.add(Calendar.DATE, 0);
        endCalendar.set(Calendar.HOUR_OF_DAY, 14);
        endCalendar.set(Calendar.MINUTE, 0);
        endCalendar.set(Calendar.SECOND, 0);
        Date endTime = endCalendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
    	System.out.println("before:" + format.format(startTime));
    	System.out.println("after:" + format.format(endTime));  //显示更新后的日期 
    	return format.format(startTime)+":"+format.format(endTime);  
	}
	@Override
	public ResponseData queryCancelScheduling(Integer[] etspIds) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = new ResponseData();
		if(etspIds.length<=0){
			responseData.setCode(Constants.NO);
			return responseData;
		}
		List<Integer> ids = new ArrayList<>();
		//校验状态是否合理
		for(int i=0;i<etspIds.length;i++){
			ids.add(etspIds[i]);
			EtSchedulePlanModel etSchedulePlanModel =etSchedulePlanManager.get(etspIds[i]);
			if("3".equals(etSchedulePlanModel.getEtspStatus())){
				responseData.setCode(Constants.NO);
				responseData.setMsg("请先取消确认，再进行取消调度！");
				return responseData;
			}
		}
	    //若合理，先删除任务（eota、etta）上的调度id
	    this.updateEotaModels(etspIds);
	    this.updateEttaModels(etspIds);
	    //删除站点信息
	    this.updateSsifModels(etspIds);
		//删除任务表
	    this.etSchedulePlanManager.deleteByPks(ids);
	    responseData.setCode(Constants.YES);
	    responseData.setMsg("操作成功!");
	    IgnoreLoginController.cancelIgnore();//虚拟登出
		return responseData;
	}


	private void updateSsifModels(Integer[] etspIds) {
		if(etspIds.length<=0){
			return;
		}
		List<SchedulStopsInfoModel> ssifList = new ArrayList<SchedulStopsInfoModel>();
		for(int i=0;i<etspIds.length;i++){
			List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
			filterCond.add(new FilterCondition("scslEtspId",etspIds[i], "="));
			schedulStopsInfoManager.batchDelete(filterCond);
		}
	}


	private void updateEttaModels(Integer[] etspIds) {
		if(etspIds.length<=0){
			return;
		}
		List<EtTaskModel> etTaskList = new ArrayList<EtTaskModel>();
		for(int i=0;i<etspIds.length;i++){
			List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
			filterCond.add(new FilterCondition("ettaEtspId",etspIds[i], "="));
			List<EtTaskModel> etTaskModels =ettaManager.findByCondition(filterCond);
			if(EmptyUtils.isNotEmpty(etTaskModels)){
				for(EtTaskModel model:etTaskModels){
					model.setEttaEtspId(null);
					model.setEttaIsIntelscheduling(null);
					model.setEttaStatus("NO_ACTION");
					etTaskList.add(model);
				}
			}
		}
		ettaManager.saveAll(etTaskList);
	}


	private void updateEotaModels(Integer[] etspIds) {
		if(etspIds.length<=0){
			return;
		}
		List<EoTaskModel> eoTaskList = new ArrayList<EoTaskModel>();
		for(int i=0;i<etspIds.length;i++){
			List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
			filterCond.add(new FilterCondition("eotaEtspId",etspIds[i], "="));
			List<EoTaskModel> eoTaskModels =eotaManager.findByCondition(filterCond);
			if(EmptyUtils.isNotEmpty(eoTaskModels)){
				for(EoTaskModel model:eoTaskModels){
					model.setEotaEtspId(null);
					eoTaskList.add(model);
				}
			}
		}
		eotaManager.saveAll(eoTaskList);
		
	}


	@Override
	public ResponseData querySchedulingConfirmation(Integer[] etspIds) {
		List<EtSchedulePlanModel> EtSchedulePlanModels = new ArrayList<EtSchedulePlanModel>();
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = new ResponseData();
		if(etspIds.length<=0){
			responseData.setCode(Constants.NO);
			responseData.setMsg("请至少勾选一行");
			return responseData;
		}
		//更改调度状态为3（调度状态-已完成）
		for(int i=0;i<etspIds.length;i++){
			EtSchedulePlanModel etSchedulePlanModel =etSchedulePlanManager.get(etspIds[i]);
			if("3".equals(etSchedulePlanModel.getEtspStatus())){
				responseData.setCode(Constants.NO);
				responseData.setMsg("存在已调度状态，无法确认调度");
				return responseData;
			} else if(etSchedulePlanModel.getEtspTractorEtveCard()!=null){
				etSchedulePlanModel.setEtspLimitVolume(new Date());
				etSchedulePlanModel.setEtspStatus("3");
				EtSchedulePlanModels.add(etSchedulePlanModel);
			}else{
				responseData.setCode(Constants.NO);
				responseData.setMsg("请先配牵引车等相关信息！");
				return responseData;
			}
		}
		etSchedulePlanManager.saveAll(EtSchedulePlanModels);
	    IgnoreLoginController.cancelIgnore();//虚拟登出
	    responseData.setCode(Constants.YES);
	 	responseData.setMsg("操作成功");
		return responseData;
	}


	@Override
	public ResponseData queryCancelConfirm(Integer[] etspIds) {
		List<EtSchedulePlanModel> etSchedulePlanModels = new ArrayList<EtSchedulePlanModel>();
		List<EtTaskModel> etTaskModels = new ArrayList<EtTaskModel>();
		List<Integer> etlnIds = new ArrayList<Integer>();
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = new ResponseData();
		if(etspIds.length<=0){
			responseData.setCode(Constants.NO);
			return responseData;
		}
		//更改调度状态为3（调度状态-已完成）
		for(int i=0;i<etspIds.length;i++){
			EtSchedulePlanModel etSchedulePlanModel =etSchedulePlanManager.get(etspIds[i]);
			if(etSchedulePlanModel.getEtspIsLock()=="Y"){
				responseData.setCode(Constants.NO);
				responseData.setMsg("该行车路线已被锁定，不能继续操作");
				return responseData;
			}else if(!"3".equals(etSchedulePlanModel.getEtspStatus())){
				responseData.setCode(Constants.NO);
				responseData.setMsg("调度状态不是调度完成状态,不能取消确认");
				return responseData;
			}
			etSchedulePlanModel.setEtspLimitVolume(null);
			etSchedulePlanModel.setEtspStatus("1");
			etSchedulePlanModels.add(etSchedulePlanModel);
			//修改状态任务
			List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
			filterCond.add(new FilterCondition("ettaEtspId",etspIds[i], "="));
			List<EtTaskModel> ettaModels =ettaManager.findByCondition(filterCond);
			if(EmptyUtils.isNotEmpty(ettaModels)){
				for(EtTaskModel model:ettaModels){
					model.setEttaStatus("SCHEDULING");
					etTaskModels.add(model);
				}
			}
			//删除线路
			List<FilterCondition> filterCond2 = new ArrayList<FilterCondition>();
			filterCond2.add(new FilterCondition("etlnEtspId", etspIds[i], "="));
			List<EtLineNodeModel> etlnModels= etLineNodeManager.findByCondition(filterCond2);
			if(EmptyUtils.isNotEmpty(etlnModels)){
				for(EtLineNodeModel model:etlnModels){
					etlnIds.add(model.getEtlnId());
				}
			}
		}
		ettaManager.saveAll(etTaskModels);
		if(EmptyUtils.isNotEmpty(etlnIds)){
			etLineNodeManager.deleteByPks(etlnIds);
		}
		etSchedulePlanManager.saveAll(etSchedulePlanModels);
	    IgnoreLoginController.cancelIgnore();//虚拟登出
	    responseData.setCode(Constants.YES);
		responseData.setMsg("操作成功");
		return responseData;
	}


	@Override
	public ResponseData<QueryData> queryStationAndVehicleTracksCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		QueryData queryData = schedulStopsInfoManager.queryStationAndVehicleTracksCondition(queryInfo);
		responseData.setCode(Constants.YES);
		responseData.setData(queryData);
		return responseData;
	}
	

	@Override
	public ResponseData<List<EtSchedulePlanModel>> querySaveScheduling(List<EoorScheduleQueryItem> eoorScheduleQueryItemList) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EtSchedulePlanModel>> responseData=new ResponseData<List<EtSchedulePlanModel>>();
		if(EmptyUtils.isNotEmpty(eoorScheduleQueryItemList)){
			List<EtSchedulePlanModel> models = new ArrayList<EtSchedulePlanModel>();
			for(EoorScheduleQueryItem item:eoorScheduleQueryItemList){
				EtSchedulePlanModel model = this.etSchedulePlanManager.get(item.getEtspId());
				model.setEtspTractorEtveId(item.getEtspTractorEtveId());
				model.setEtspTractorEtveCard(item.getEtspTractorEtveCard());
				model.setEtspTrailerEtveId(item.getEtspTrailerEtveId());
				model.setEtspTrailerEtveCard(item.getEtspTrailerEtveCard());
				model.setEtspMainEttpId(item.getEtspMainEttpId());
				model.setEtspMainEttpName(item.getEtspMainEttpName());
				model.setEtspGuardsEttpId(item.getEtspGuardsEttpId());
				model.setEtspGuardsEttpName(item.getEtspGuardsEttpName());
				model.setEtspCopilorEttpId(item.getEtspCopilorEttpId());
				model.setEtspCopilorEttpName(item.getEtspCopilorEttpName());
				model.setEtspSubstr2(item.getEtspSubstr2());
				models.add(model);
			}
			if(EmptyUtils.isNotEmpty(models)){
				this.etSchedulePlanManager.saveAll(models);
				responseData.setCode(Constants.YES);
				responseData.setData(models);
				 IgnoreLoginController.cancelIgnore();//虚拟登出
				return responseData;
			}
			
		}
		IgnoreLoginController.cancelIgnore();//虚拟登出
		responseData.setCode(Constants.NO);
		return responseData;
	}


	@Override
	public ResponseData queryStationJWDCondition(Integer[] etspIds) {
		ResponseData<List<EtSchedulePlanModel>> responseData=new ResponseData<List<EtSchedulePlanModel>>();
		String strBuf = schedulStopsInfoManager.getStationJWD(etspIds);
		if(EmptyUtils.isNotEmpty(strBuf)){
			responseData.setCode(Constants.YES);
			responseData.setMsg(strBuf);
			return responseData;
		}
		responseData.setCode(Constants.NO);
		return responseData;
	}


	@Override
	public ResponseData<List<EtTaskModel>> saveEttaCarrier(List<EtTaskModel> etTaskModels) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EtTaskModel>> responseData=new ResponseData<List<EtTaskModel>>();
		if(EmptyUtils.isNotEmpty(etTaskModels)){
			List<EtTaskModel> ettaModels = new ArrayList<EtTaskModel>();
			List<EoTaskModel> etoaModels = new ArrayList<EoTaskModel>();
			for(EtTaskModel ettaModel:etTaskModels){
				EtTaskModel etTaskModel =ettaManager.get(ettaModel.getEttaId());
				etTaskModel.setEttaCarrierEbcuId(ettaModel.getEttaCarrierEbcuId());
				etTaskModel.setEttaCarrierEbcuNameCn(ettaModel.getEttaCarrierEbcuNameCn());
				etTaskModel.setEttaIsWithin("N");
				etTaskModel.setEttaStatus("SCHEDULED");
				Integer eotaId = Integer.valueOf(etTaskModel.getEttaFkSysId());
				EoTaskModel eoTaskModel =eotaManager.get(eotaId);
				eoTaskModel.setEotaCarrierEbcuId(ettaModel.getEttaCarrierEbcuId());
				eoTaskModel.setEotaCarrierEbcuNameCn(ettaModel.getEttaCarrierEbcuNameCn());
				eoTaskModel.setEotaIsWithin("N");
				eoTaskModel.setEotaStatus("SCHEDULED");
				ettaModels.add(etTaskModel);
				etoaModels.add(eoTaskModel);
			}
			this.eotaManager.saveAll(etoaModels);
			this.ettaManager.saveAll(ettaModels);
			responseData.setCode(Constants.YES);
			IgnoreLoginController.cancelIgnore();//虚拟登出
			return responseData;
		}
		IgnoreLoginController.cancelIgnore();//虚拟登出
		responseData.setCode(Constants.NO);
		return responseData;
	}


	@Override
	public ResponseData<QueryData> queryEoLandOrderTrackQuery(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		QueryData queryData = eotaManager.queryEoLandOrderTrackQuery(queryInfo);
		responseData.setCode(Constants.YES);
		responseData.setData(queryData);
		return responseData;
	}


	@Override
	public ResponseData<List<EoLandOrderTrackQueryItem>> querySavePlanDate(List<EoLandOrderTrackQueryItem> eoLandOrderTrackQueryItems) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EoLandOrderTrackQueryItem>> responseData=new ResponseData<List<EoLandOrderTrackQueryItem>>();
		if(EmptyUtils.isNotEmpty(eoLandOrderTrackQueryItems)){
			List<EoTaskModel> eotaModels = new ArrayList<EoTaskModel>();
			List<EtTaskModel> ettaModels = new ArrayList<EtTaskModel>();
			List<EoOrderModel> eoorModels = new ArrayList<EoOrderModel>();
			List<EtOrderModel> etorModels = new ArrayList<EtOrderModel>();
			for(EoLandOrderTrackQueryItem item:eoLandOrderTrackQueryItems){
				//任务表--更新预计提货、到货时间
				EoTaskModel eotaModel = eotaManager.get(item.getEotaId());
				eotaModel.setEotaDeliveryReqTime(item.getEotaDeliveryReqTime());
				eotaModel.setEotaArrivalReqTime(item.getEotaArrivalReqTime());
				eotaModels.add(eotaModel);
				//订单表--更新预计提货、到货时间
				EoOrderModel eoorModel = eoorManager.get(eotaModel.getEotaEoorId());
				eoorModel.setEoorReqDeliveryDate(item.getEotaDeliveryReqTime());
				eoorModel.setEoorReqArrivalDate(item.getEotaArrivalReqTime());
				eoorModels.add(eoorModel);
				//任务接口表--更新预计提货、到货时间
				List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
				filterCond.add(new FilterCondition("ettaFkSysId", item.getEotaId(), "="));
				List<EtTaskModel> ettaList = ettaManager.findByCondition(filterCond);
				if(EmptyUtils.isNotEmpty(ettaList)){
					EtTaskModel ettaModel =ettaList.get(0);
					ettaModel.setEttaDeliveryReqTime(item.getEotaDeliveryReqTime());
					ettaModel.setEttaArrivalReqTime(item.getEotaArrivalReqTime());
					ettaModels.add(ettaModel);
					//订单接口表--更新预计提货、到货时间
					EtOrderModel etorModel = etorManager.get(ettaModel.getEttaEtorId());
					etorModel.setEtorReqDeliveryDate(item.getEotaDeliveryReqTime());
					etorModel.setEtorReqArrivalDate(item.getEotaArrivalReqTime());
					etorModels.add(etorModel);
				}
			}
			if(EmptyUtils.isNotEmpty(eotaModels)&&EmptyUtils.isNotEmpty(ettaModels)&&EmptyUtils.isNotEmpty(eoorModels)&&EmptyUtils.isNotEmpty(etorModels)){
				this.eotaManager.saveAll(eotaModels);
				this.ettaManager.saveAll(ettaModels);
				this.eoorManager.saveAll(eoorModels);
				this.etorManager.saveAll(etorModels);
				responseData.setCode(Constants.YES);
				responseData.setData(eoLandOrderTrackQueryItems);
				 IgnoreLoginController.cancelIgnore();//虚拟登出
				return responseData;
			}
			
		}
		IgnoreLoginController.cancelIgnore();//虚拟登出
		responseData.setCode(Constants.NO);
		return responseData;
	}


	@Override
	public ResponseData queryPrintDrivingConfirmation(Integer[] etspIds) {
		List<EtSchedulePlanModel> EtSchedulePlanModels = new ArrayList<EtSchedulePlanModel>();
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = new ResponseData();
		if(etspIds.length<=0){
			responseData.setCode(Constants.NO);
			responseData.setMsg("请至少勾选一行");
			return responseData;
		}
		//更改打印状态为Y
		for(int i=0;i<etspIds.length;i++){
			EtSchedulePlanModel etSchedulePlanModel =etSchedulePlanManager.get(etspIds[i]);
			if("3".equals(etSchedulePlanModel.getEtspStatus())){
				etSchedulePlanModel.setEtspSubstr2(Constants.YES);
				EtSchedulePlanModels.add(etSchedulePlanModel);
			}else{
				responseData.setCode(Constants.NO);
				responseData.setMsg("调度确认后才可以打印行车单哦！");
				return responseData;	
			}
			
		}
		etSchedulePlanManager.saveAll(EtSchedulePlanModels);
	    IgnoreLoginController.cancelIgnore();//虚拟登出
	    responseData.setCode(Constants.YES);
	 	responseData.setMsg("操作成功");
		return responseData;
	}






}
