package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xml.resolver.apps.resolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.basicdata.manager.EbCodeMasterManager;
import com.sinotrans.oms.basicdata.model.EbCodeMasterModel;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EobrManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.service.EoBookingService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.tool.SendMailUtil;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbCustomerContactManager;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;

import oracle.jdbc.Const;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoRequestBookingManagerImpl extends MybatisManagerImpl implements EoRequestBookingManager{
	
	@Autowired
	private EbCustomerManager ebCustomerManager;
	@Autowired
	private EbCustomerContactManager ebCustomerContactManager;
	@Autowired
	private EoEoom2EobrManager eoEoom2EobrManager;
	@Autowired
	private EoBookingService eoBookingService;
	@Autowired
	private EbCodeMasterManager ebCodeMasterManager;
	
	@Override
	public EoRequestBookingModel get(Long id) {
		
		return this.myBatisDao.get(EoRequestBookingModel.class, id);
	}

	@Override
	public List<EoRequestBookingModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoRequestBookingModel.class, null, null, conditions);
	}

	@Override
	public EoRequestBookingModel save(EoRequestBookingModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoRequestBookingModel> saveAll(List<EoRequestBookingModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoRequestBookingModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoRequestBookingModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoRequestBookingModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoRequestBookingModel.class, ids);
	}
	
	/**
     * 订舱代理配载人信息展示
     */
	@Override
    public ResponseData getEsUserByEbcuNo(String ebcuCustomerNo, Long eoorId, String type) {
		ResponseData responseData = new ResponseData();
    	UserDetails user = SessionContext.getUser();
    	String escoId = user.getOrgId();
    	Long ebcuId = null;
    	Boolean flag = true;
    	List<FilterCondition> conditions = new ArrayList<FilterCondition>();
    	if (EmptyUtils.isNotEmpty(escoId)) {
    		conditions.add(new FilterCondition("ebcuEscoId",Long.valueOf(escoId),"="));
    	}
    	conditions.add(new FilterCondition("ebcuCustomerNo",ebcuCustomerNo,"="));
    	conditions.add(new FilterCondition("ebcuIsSubcontractor","Y","="));
    	conditions.add(new FilterCondition("ebcuCustomerStatus","ENABLE","="));
        List<EbCustomerModel> ebCustomerModels = ebCustomerManager.findByCondition(conditions);
    	if (EmptyUtils.isNotEmpty(ebCustomerModels)) {
    		ebcuId = ebCustomerModels.get(0).getEbcuId();
    	}
    	if (ebcuId == null) {
    		responseData.setCode(Constants.NO);
    		responseData.setMsg("未查询客户信息");
    		return responseData;
    	}
    	//客户联系人表
    	List<FilterCondition> _conditions = new ArrayList<FilterCondition>();
    	_conditions.add(new FilterCondition("ebccEbcuId",ebcuId,"="));
    	_conditions.add(new FilterCondition("ebccIsDefault","Y","="));
    	Map<String, Object> map = new HashMap<String, Object>();
    	String ebccContactName = "";
    	String ebccTel = "";
    	String ebccFax = "";
    	String ebccEmail = "";
    	String ebccViscountship = "";
    	Long ebccId = null;
    	List<EbCustomerContactModel> ebCustomerContactModels = ebCustomerContactManager.findByCondition(_conditions);
    	//List<EbCustomerContactModel> ebCustomerContactModels = this.dao.findByExample(ebCustomerContactModel);
    	if (EmptyUtils.isNotEmpty(ebCustomerContactModels)) {
    		EbCustomerContactModel ebCustomerContactModel = ebCustomerContactModels.get(0);
    		ebccContactName = ebCustomerContactModel.getEbccContactName();
    		
    		ebccTel = ebCustomerContactModel.getEbccTel();
    		ebccFax = ebCustomerContactModel.getEbccFax();
    		ebccEmail = ebCustomerContactModel.getEbccEmail();
    		ebccId = ebCustomerContactModel.getEbccId();
    		// 添加联系人代码给配载人
    		ebccViscountship = ebCustomerContactModel.getEbccViscountship();
    	}
    	//通过订单id查找该订单下包含的物料信息
    	List<EoEoom2EobrModel> eoEoom2EobrModels = this.getEobmModelsByEoorId(eoorId);
    	String eobmCount = "";//订舱下是否包含多条物料
    	if (EmptyUtils.isNotEmpty(eoEoom2EobrModels) && eoEoom2EobrModels.size() == 1) {//只包含一条货物信息
    		eobmCount = Constants.YES;
    		map.put("eobmCount", eobmCount);
    		map.put("eoEoom2EobrModels", eoEoom2EobrModels.get(0));
    	}
    	if (EmptyUtils.isNotEmpty(eoEoom2EobrModels) && eoEoom2EobrModels.size() > 1) {//包含多条货物信息
    		eobmCount = Constants.NO;
    		map.put("eobmCount", eobmCount);
    		map.put("eoEoom2EobrModels", eoEoom2EobrModels);
    	}
    	if (EmptyUtils.isEmpty(eoEoom2EobrModels)) {
    		eobmCount = Constants.YES;
    		map.put("eobmCount", eobmCount);
    		map.put("eoEoom2EobrModels", new EoEoom2EobrModel());
    	}
    	map.put("ebccContactName", ebccContactName);
    	map.put("ebccTel", ebccTel);
    	map.put("ebccFax", ebccFax);
    	map.put("ebccEmail", ebccEmail);
    	map.put("ebccId", ebccId);
    	//20180309 Joanna 添加联系人代码给配载人
    	map.put("ebccViscountship", ebccViscountship);
    	responseData.setData(map);
    	responseData.setCode(Constants.YES);
    	//用于订舱代理配载人信息逻辑判断
    	flag = this.checkEorbStowageIdByEoorId(eoorId);
    	if (EmptyUtils.isNotEmpty(type) && "viewType".equals(type)) {
    		if (flag == false) {
    			responseData.setCode(Constants.NO);
        	}
    	}
    	return responseData;
    }
	
	/**
     * 通过订单id来获取该订单下订舱物料
     * add by shoven 2018年6月4日17:00:54
     * @param eoorId
     * @return
     */
    private List<EoEoom2EobrModel> getEobmModelsByEoorId(Long eoorId) {
    	List<EoEoom2EobrModel> eoEoom2EobrModels = new ArrayList<EoEoom2EobrModel>();
    	if (null != eoorId) {
    		List<FilterCondition> conditions = new ArrayList<FilterCondition>();
        	conditions.add(new FilterCondition("eorbEoorId",eoorId,"="));
    		List<EoRequestBookingModel> eoRequestBookingModels = this.findByCondition(conditions);
    		if (EmptyUtils.isNotEmpty(eoRequestBookingModels)) {
    			List<FilterCondition> _conditions = new ArrayList<FilterCondition>();
            	_conditions.add(new FilterCondition("eobmEorbId",eoRequestBookingModels.get(0).getEorbId(),"="));
    			eoEoom2EobrModels = eoEoom2EobrManager.findByCondition(_conditions);
    		}
    	}
    	return eoEoom2EobrModels;
    }
    /**
     * 用于订舱代理配载人信息逻辑判断
     * @param eoorId
     * @return
     */
    private Boolean checkEorbStowageIdByEoorId(Long eoorId) {
    	Boolean flag = true;
    	List<FilterCondition> conditions = new ArrayList<FilterCondition>();
    	conditions.add(new FilterCondition("eorbEoorId",eoorId,"="));
    	List<EoRequestBookingModel> eoRequestBookingModels = this.findByCondition(conditions);
    	if (EmptyUtils.isNotEmpty(eoRequestBookingModels)) {
    		EoRequestBookingModel eoRequestBookingModel = eoRequestBookingModels.get(0);
    		if (eoRequestBookingModel.getEorbStowageId() != null) {
    			flag = false;
    		}
    	}
    	return flag;
    }

	@Override
	public ResponseData feedBackToEorb(Map<String, Object> contentMap) {
		ResponseData responseData = new ResponseData<>();
		for (Map.Entry<String, Object> resultMap : contentMap.entrySet()) {
			Map<String, String> eorbMap = new HashMap<>();
			String eorbNo = "";//订舱请求中的业务编号
			Object resultValue = resultMap.getValue();
			String [] resultContent = (String[]) resultValue;
			String resultStr = "";//存放解析之后的邮件内容
			for (int i = 0; i < 15/*resultContent.length*/; i++) {
				resultStr = resultContent[i];
				if (EmptyUtils.isNotEmpty(resultStr)) {
					if (-1 != resultStr.indexOf("委托编号:")) {
						eorbNo = resultStr.split(":")[1];//将邮件中的正文存入到订舱请求中，在这里取出，可以减少一次map遍历，用此处数据直接查订舱信息
					}
					this.analysisMapValue(resultStr, eorbMap);
				}
			}
			this.updateEorbModelByMailContent(eorbMap, eorbNo);
		}
		responseData.setCode(Constants.YES);
		responseData.setMsg("操作成功");
		return null;
	}
	
	/**
	 * 将邮件中的内容根据判断组装成map集合，用以向数据库存储
	 * @author Shoven.Jiang  
	 * @date 2019年3月27日
	 * @param resultValue 遍历的邮件内容的数组
	 * @param eorbMap 存储邮件中正文内容
	 * @return
	 */
	private Map<String, String> analysisMapValue(String resultValue, Map<String, String> eorbMap) {
		String [] eorbValue;//用来接收处理之后的value值
		eorbValue = resultValue.split(":");
		if (-1 != resultValue.indexOf("委托编号:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("提单号:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("船公司:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("船名:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("航次:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("ETD:")) {//时间会存在多个 ： ，所以需要拼接显示
			eorbMap.put(eorbValue[0], eorbValue[1] + eorbValue[2] + eorbValue[3]);
		} else if (-1 != resultValue.indexOf("卸 货 港:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("交 货 地:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("箱型箱量:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("预配箱型箱量:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("subject")) {//此处信息存入是为了防止通过委托编号在oms系统找不到订舱任务时的异常信息处理
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("拒绝原因:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} 
		return eorbMap;
	}
	
	/**
	 * 将邮件中的内容根据判断组装成map集合，用以向数据库存储
	 * @author Shoven.Jiang  
	 * @date 2019年3月27日
	 * @param resultValue 遍历的邮件内容的数组
	 * @param eorbMap 存储邮件中正文内容
	 * @return
	 */
	private Map<String, String> analysisMapValue(String resultValue, Map<String, String> eorbMap, String type) {
		String [] eorbValue;//用来接收处理之后的value值
		eorbValue = resultValue.split(":");
		if (-1 != resultValue.indexOf("委托编号:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		}else if (-1 != resultValue.indexOf("subject")) {//此处信息存入是为了防止通过委托编号在oms系统找不到订舱任务时的异常信息处理
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} else if (-1 != resultValue.indexOf("拒绝原因:")) {
			eorbMap.put(eorbValue[0], eorbValue[1]);
		} 
		return eorbMap;
	}
	
	/**
	 * 将邮件中的内容存入到数据库中
	 * @author Shoven.Jiang  
	 * @date 2019年3月27日
	 * @param eorbSource 订舱反馈的邮件内容
	 * @param eorbNo 订舱委托编号
	 */
	private void updateEorbModelByMailContent(Map<String, String> eorbSource, String eorbNo) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		Long eoorId = null;//订单ID
		String eorbBulkBillNo = "";//提单号
		String eorbVoyage = "";//航次
		String eorbVesselName = "";//船名
		List<FilterCondition> eorbCondition = new ArrayList<>();
		eorbCondition.add(new FilterCondition("eorbNo", eorbNo, "="));
		List<EoRequestBookingModel> eoRequestBookingModels = this.findByCondition(eorbCondition);
		if (EmptyUtils.isNotEmpty(eoRequestBookingModels) && eoRequestBookingModels.size() == 1) {
			EoRequestBookingModel eoRequestBookingModel = eoRequestBookingModels.get(0);//订舱业务请求实体对象
			eoorId = eoRequestBookingModel.getEorbEoorId();
			for (Map.Entry<String, String> eorbMap : eorbSource.entrySet()) {
				String eorbMapKey = eorbMap.getKey();
				String eorbMapValue = eorbMap.getValue();
				if (EmptyUtils.isNotEmpty(eorbMapKey) && EmptyUtils.isNotEmpty(eorbMapValue)) {
					if ("提单号".equals(eorbMapKey)) {
						eorbBulkBillNo = eorbMapValue;
						eoRequestBookingModel.setEorbBulkBillNo(eorbMapValue);
					} else if ("船名".equals(eorbMapKey)) {
						eorbVesselName = eorbMapValue;
						eoRequestBookingModel.setEorbVesselName(eorbMapValue);
					} else if ("航次".equals(eorbMapKey)) {
						eorbVoyage = eorbMapValue;
						eoRequestBookingModel.setEorbVoyage(eorbMapValue);
					}
				}
			}
			this.save(eoRequestBookingModel);
			//将船名航次提单号同步到相应的任务上
			this.eoBookingService.saveEoddAndEoetModelByEoorId(eoorId, eorbBulkBillNo, eorbVoyage, eorbVesselName);
			IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		} else {
			this.sendEmail(eorbSource, eoRequestBookingModels, eorbNo);//发送邮件
		}
	}
	
	/**
	 * 订舱解析错误邮件提示
	 * @author Shoven.Jiang  
	 * @date 2019年4月2日
	 * @param eorbSource
	 * @param eoRequestBookingModels
	 * @param eorbNo
	 */
	private void sendEmail(Map<String, String> eorbSource, List<EoRequestBookingModel> eoRequestBookingModels, String eorbNo) {
		String subjectMail = eorbSource.get("subject");
		//如果通过委托编号没有查到订舱相应的任务，则邮件提醒相关人员去处理
		StringBuffer content = new StringBuffer();//用来存储邮件正文的内容
		//查询解析异常之后所有的邮件发送人
		List<String> mailAddress = new ArrayList<>();
		List<FilterCondition> ebcdCondition = new ArrayList<>();
		ebcdCondition.add(new FilterCondition("ebcdDictionaryType", Constants.SYS_MAIL_RECEIVER, "="));
		ebcdCondition.add(new FilterCondition("ebcdQuickCode", "EORB", "="));
		ebcdCondition.add(new FilterCondition("ebcdStatus", "1", "="));
		ebcdCondition.add(new FilterCondition("ebcdEscoId", "100", "="));
		List<EbCodeMasterModel> ebCodeMasterModels = this.ebCodeMasterManager.findByCondition(ebcdCondition);
		if (EmptyUtils.isNotEmpty(ebCodeMasterModels)) {
			SendMailUtil sendMailUtil = new SendMailUtil();
			String [] emailReceiverAddress = new String [ebCodeMasterModels.size()];//邮件接收地址
			for (int i = 0; i < ebCodeMasterModels.size(); i++) {
				emailReceiverAddress[i] = ebCodeMasterModels.get(i).getEbcdCode();
				mailAddress.add(ebCodeMasterModels.get(i).getEbcdCode());
			}
			sendMailUtil.addAddress("lmsupport@sinotrans.com", emailReceiverAddress, "SOIIIADMIN 反馈邮件解析失败！");
			sendMailUtil.setX_Priority("1");//设置邮件的优先级，1 的优先级最高
			content.append("您好，\n");
			if (EmptyUtils.isEmpty(eoRequestBookingModels)) {
				content.append("		订舱委托编号： " + eorbNo + " 在系统中查询不到相应的订舱任务，请联系管理员及时处理！\n");
			} else if (eoRequestBookingModels.size() != 1) {
				content.append("		订舱委托编号： " + eorbNo + " 在系统中查询到多条订舱任务，请联系管理员及时处理！\n");
			}
			content.append("		原订舱网邮件主题：" + subjectMail + " 请参考！");
			Map<String,String> contentMap = new HashMap<String, String>();
			contentMap.put("date", content.toString());
			sendMailUtil.sendEmailByFileTypeStreamFroms(contentMap, null);		
		}
	}
	
	/**
	 * 代码解析订舱网反馈的订单已被拒绝的邮件，需将订舱任务切换为未下达状态，并邮件将错误信息反馈给用户
	 * @author Shoven.Jiang  
	 * @date 2019年4月2日
	 * @param contentMap
	 * @return
	 */
	@Override
	public ResponseData feedBackToEorbByrefuse(Map<String, Object> contentMap) {
		ResponseData responseData = new ResponseData<>();
		for (Map.Entry<String, Object> resultMap : contentMap.entrySet()) {
			Map<String, String> eorbMap = new HashMap<>();
			String eorbNo = "";//订舱请求中的业务编号
			Object resultValue = resultMap.getValue();
			String [] resultContent = (String[]) resultValue;
			String resultStr = "";//存放解析之后的邮件内容
			for (int i = 0; i < 15/*resultContent.length*/; i++) {
				resultStr = resultContent[i];
				if (EmptyUtils.isNotEmpty(resultStr)) {
					if (-1 != resultStr.indexOf("委托编号:")) {
						eorbNo = resultStr.split(":")[1];//将邮件中的正文存入到订舱请求中，在这里取出，可以减少一次map遍历，用此处数据直接查订舱信息
					}
					this.analysisMapValue(resultStr, eorbMap, "refuse");
				}
			}
			this.updateEorbModelByMailContentByRefuse(eorbMap, eorbNo);
		}
		return responseData;
	}
	
	/**
	 * 
	 * @author Shoven.Jiang  
	 * @date 2019年4月2日
	 * @param eorbSource 订舱反馈的邮件内容
	 * @param eorbNo 订舱委托编号
	 */
	private void updateEorbModelByMailContentByRefuse(Map<String, String> eorbSource, String eorbNo) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		String refuseReasons = "";//拒绝原因
		List<FilterCondition> eorbCondition = new ArrayList<>();
		eorbCondition.add(new FilterCondition("eorbNo", eorbNo, "="));
		List<EoRequestBookingModel> eoRequestBookingModels = this.findByCondition(eorbCondition);
		if (EmptyUtils.isNotEmpty(eoRequestBookingModels) && eoRequestBookingModels.size() == 1) {
			EoRequestBookingModel eoRequestBookingModel = eoRequestBookingModels.get(0);//订舱业务请求实体对象
			for (Map.Entry<String, String> eorbMap : eorbSource.entrySet()) {
				String eorbMapKey = eorbMap.getKey();
				String eorbMapValue = eorbMap.getValue();
				if (EmptyUtils.isNotEmpty(eorbMapKey) && EmptyUtils.isNotEmpty(eorbMapValue)) {
					if ("拒绝原因".equals(eorbMapKey)) {
						refuseReasons = eorbMapValue;
						eoRequestBookingModel.setEorbSubstr25(eorbMapValue);
					}
				}
			}
			eoRequestBookingModel.setEorbStatus("unissued");
			eoRequestBookingModel.setEorbTaskStatus("0");
			this.save(eoRequestBookingModel);
			//将船名航次提单号同步到相应的任务上
//			this.eoBookingService.saveEoddAndEoetModelByEoorId(eoorId, eorbBulkBillNo, eorbVoyage, eorbVesselName);
			IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		}
	}
}
