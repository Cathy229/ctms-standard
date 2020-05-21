package com.sinotrans.oms.system.manager.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.NewTransactionTemplate;
import com.sinotrans.oms.common.cache.redis.RedisTemplateUtil;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.EqualsUtils;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.manager.EsCounterManager;
import com.sinotrans.oms.system.model.EsCompanyModel;
import com.sinotrans.oms.system.model.EsCounterModel;
@Service
public class EsCounterManagerImpl extends MybatisManagerImpl implements EsCounterManager{

	@Autowired
	private CommonQueryManager commonQueryManager;
	@Autowired
	private EsCounterManager esCounterManager;
	@Autowired
	private EsCompanyManager esCompanyManager;
	@Autowired
	private RedisTemplateUtil redisTemplateUtil;
	/**
	 * 数字格式化工具，生成例如0909这样的年月序号
	 */
	public static final SimpleDateFormat formatYearAndMonth = new SimpleDateFormat("yyMM");

	/**
	 * 数字格式化工具，生成例如09这样的月份序号
	 */
	public static final SimpleDateFormat formatMonth = new SimpleDateFormat("MM");

	/**
	 * 默认的开始计数器
	 */
	private static final int DEFAULT_START_COUNTER = 0;

	/**
	 * 默认每次递增的数量
	 */
	private static final int DEFAULT_INCREASE = 1;
	
	/**
	 * 默认一次生成的序号数
	 */
	private static final int DEFAULT_CREATE_NUM = 1;

	/**
	 * 流水号默认位数
	 */
	private static final int DEFAULT_DIGIT = 5;

	/**
	 * 序号不足位数时的补充
	 */
	private static final String DEFAULT_SUPPLY = "0";

	/**
	 * 行车单号计数器类型
	 */
	private static final String COUNT_TYPR_TRAVELLING_CRANE_BILL = "TRAVELLING_CRANE_BILL";

	/**
	 * 行车单号编号前缀
	 */
	private static final String PREFIX_TRAVELLING_CRANE_BILL = "TCB";
	
	/**
	 * 系统订单号前缀
	 */
	private static final String PREFIX_ORDER_NO = "ORD";
	
	/**
	 * 陆运任务编号前缀
	 */
	private static final String PREFIX_OVERLAND_TRANSPORTATION = "ODT";
	
	/**
	 * 海运任务编号前缀
	 */
	private static final String PREFIX_OCEAN_TRANSPORTATION = "ONT";
	
	/**
	 * 入库任务编号前缀
	 */
	private static final String PREFIX_IN_BOUND = "INB";
	
	/**
	 * 出库任务编号前缀
	 */
	private static final String PREFIX_OUT_BOUND = "OTB";
	
	/**
	 * 报关任务编号前缀
	 */
	private static final String PREFIX_CUSTOMS = "CUS";
	
	/**
	 * 铁路任务编号前缀
	 */
	private static final String PREFIX_RAILWAY = "RLW";
	
	/**
	 * 空运任务编号前缀
	 */
	private static final String PREFIX_AIR_LIFT = "AIR";
	
	/**
	 * 进口拖车任务编号前缀
	 */
	private static final String PREFIX_IMPORT_TRAILER = "IMT";
	
	/**
	 * 出口拖车任务编号前缀
	 */
	private static final String PREFIX_EXPORT_TRAILER = "EXT";
	
	/**
	 * 系统订单号计数器类型
	 */
	private static final String COUNT_TYPE_ORDER_NO = "ORDER_NO";
	
	/**
	 * 陆运任务编号计数器类型
	 */
	private static final String COUNT_TYPE_OVERLAND_TRANSPORTATION = "OVERLAND_TRANSPORTATION";
	
	/**
	 * 海运任务编号计数器类型
	 */
	private static final String COUNT_TYPE_OCEAN_TRANSPORTATION = "OCEAN_TRANSPORTATION";
	
	/**
	 * 入库任务编号计数器类型
	 */
	private static final String COUNT_TYPE_IN_BOUND = "IN_BOUND";
	
	/**
	 * 出库任务编号计数器类型
	 */
	private static final String COUNT_TYPE_OUT_BOUND = "OUT_BOUND";
	
	/**
	 * 报关任务编号计数器类型
	 */
	private static final String COUNT_TYPE_CUSTOMS = "CUSTOMS";
	
	/**
	 * 铁路任务编号计数器类型
	 */
	private static final String COUNT_TYPE_RAILWAY = "RAILWAY";
	
	/**
	 * 空运任务编号计数器类型
	 */
	private static final String COUNT_TYPE_AIR_LIFT = "AIR_LIFT";
	
	/**
	 * 进口拖车任务编号计数器类型
	 */
	private static final String COUNT_TYPE_EXPORT_TRAILER = "EXPORT_TRAILER";
	
	/**
	 * 出口拖车任务编号计数器类型
	 */
	private static final String COUNT_TYPE_IMPORT_TRAILER = "IMPORT_TRAILER";
	/**
	 * 外运号
	 */
	private static final String SINOTRANS_NO = "01007";
	
	/**
	 * 系统外运号计数器类型
	 */
	private static final String COUNT_TYPE_SINOTRANS_NO = "SINOTRANS_NO";
	@Override
	public EsCounterModel get(Long id) {
		return this.myBatisDao.get(EsCounterModel.class, id);
	}

	@Override
	public List<EsCounterModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EsCounterModel.class, null, null, conditions);
	}

	@Override
	public EsCounterModel save(EsCounterModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<EsCounterModel> saveAll(List<EsCounterModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EsCounterModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		this.myBatisDao.batchDelete(EsCounterModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EsCounterModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		this.myBatisDao.deleteByPks(EsCounterModel.class, ids);
	}
	
	/* (non-Javadoc)
	 * @see com.sinotrans.oms.system.service.EsCounterManager#generationTCBNo(java.lang.Long)
	 */
	public Queue<String> generationTCBNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_TRAVELLING_CRANE_BILL, COUNT_TYPR_TRAVELLING_CRANE_BILL, num);
	}
	public Queue<String> generationTCBNo2(Integer num,Long escoId) {
		return this.generationSystemNoHelper2(PREFIX_TRAVELLING_CRANE_BILL, COUNT_TYPR_TRAVELLING_CRANE_BILL, num,escoId);
	}
	
	public String generationTCBNo(){
		Queue<String> result = this.generationTCBNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	public String generationTCBNo2(Long escoId) {
		Queue<String> result = this.generationTCBNo2(DEFAULT_CREATE_NUM,escoId);
		return result.remove();
	}
	/**
	 * 系统编号生成器，一般生成规则为 业务前缀+四位年月+流水号
	 * @param prefix 业务前缀
	 * @param countType 流水号类型
	 * @param num 个数
	 * @return
	 */
	private Queue<String> getSinotransNoHelper(String prefix, String countType, Integer num) {
		//返回值
		Queue<String> result = new LinkedList<String>();
		String time = formatYearAndMonth.format(new Date());
		//批量获取流水号
		List<String> count = this.getCountNoAndRestByMonth(Long.valueOf(100), countType, 8, num);
		for (Iterator iterator = count.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			//生成编号
			result.add(prefix + time + string);
		}
		return result;
	}
	/**
	 * 系统编号生成器，一般生成规则为 业务前缀+思维年月+公司代码+流水号
	 * @param prefix 业务前缀
	 * @param countType 流水号类型
	 * @param num 个数
	 * @return
	 */
	private Queue<String> generationSystemNoHelper(String prefix, String countType, Integer num) {
		UserDetails user = SessionContext.getUser();
		//返回值
		Queue<String> result = new LinkedList<String>();
		String orgId = user.getOrgId();
		String orgNo = user.getEscoCompanyNo();
		String time = formatYearAndMonth.format(new Date());
		//批量获取流水号
		List<String> count = this.getCountNoAndRestByMonth(Long.valueOf(orgId), countType, DEFAULT_DIGIT, num);
		for (Iterator iterator = count.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			//生成编号
			result.add(prefix + time + orgNo + string);
		}
		return result;
	}
	private Queue<String> generationSystemNoHelper2(String prefix, String countType, Integer num,Long escoId) {
		EsCompanyModel escoModel = esCompanyManager.get(escoId);
		//返回值
		Queue<String> result = new LinkedList<String>();
		String orgNo = escoModel.getEscoCompanyNo();
		String time = formatYearAndMonth.format(new Date());
		//批量获取流水号
		List<String> count = this.getCountNoAndRestByMonth(escoId, countType, DEFAULT_DIGIT, num);
		for (Iterator iterator = count.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			//生成编号
			result.add(prefix + time + orgNo + string);
		}
		return result;
	}

	/**
	 * 根据公司ID 、 计数器类型 、 计数器数量获取编码计数器.该计数器每月进行一次重置
	 * 
	 * @param orgId
	 *            公司ID
	 * @param countType
	 *            编码计数器类型
	 * @param num
	 *            获取计数器的数量
	 * @param digit
	 *            序号的位数
	 * @return
	 */
	private List<String> getCountNoAndRestByMonth(Long orgId, String countType, Integer digit, Integer num) {

		// num 和 digit 必须都大于0
		if (digit == null || digit <= 0 || num == null || num <= 0) {
			throw new IllegalArgumentException("num 和 digit 必须都大于0!");
		}

		int countNum = DEFAULT_START_COUNTER;
		int countIncrease = DEFAULT_INCREASE;
//		// 使用分布式锁锁住该编码规则，等待30s
//		if (redisTemplateUtil.setnxLock(countType, 10 * 1000)){
			// 计数器的存取必须是同步的，否者可能出现两个编码移植的情况
			synchronized (this) {
				final EsCounterModel count = this.getCount(orgId, countType);
				// 当前月份
				String currentMonth = formatMonth.format(new Date());
				// 计数器中保存的月份
				String oldMoth = formatMonth.format(count.getEscuCurrentMonth());
				// 如果月份相等则序号继续递增,否者重置计数器
				if (EqualsUtils.isEquals(currentMonth, oldMoth)) {
					// 当前的开始值
					countNum = count.getEscuLastCounter() == null ? DEFAULT_START_COUNTER : count.getEscuLastCounter();
					// 当前的递增值
					countIncrease = count.getEscuNextCounter() == null ? DEFAULT_INCREASE : count.getEscuNextCounter();
				} else {
					// 重置月份
					count.setEscuCurrentMonth(new Date());
				}
				// 回写新的当前值
				count.setEscuLastCounter(countNum + countIncrease * num);
				// 保存变化(该处的保存使用了新的事务,一旦执行立即保存到数据库，以保证获取计数器的同步方法最少。但是如果使用计数器的方法保存失败，会产生跳号的情况)
				new NewTransactionTemplate().execute(new TransactionCallback() {
					public Object doInTransaction(TransactionStatus status) {
						redisTemplateUtil.delKey(countType);
						return save(count);
					}
				});
			}
	
			return generationCountString(countNum, countIncrease, digit, num);
//		} else {
//			throw new RuntimeException("the rule(" + countType + ") is lock.");
//		}
	}

	/**
	 * 根据公司ID 、 计数器类型获取编码计数器.一次只取一个值
	 * 
	 * @param orgId
	 *            公司ID
	 * @param countType
	 *            编码计数器类型
	 * @param digit
	 *            序号的位数
	 * @return
	 */
	private String getCountNoAndRestByMobth(Long orgId, String countType, Integer digit) {
		List<String> result = getCountNoAndRestByMonth(orgId, countType, digit, 1);
		return result.get(0);
	}

	/**
	 * 生成实际的序号
	 * 
	 * @param countNum
	 *            计数器起始值
	 * @param countIncrease
	 *            计数器的递增值
	 * @param bit
	 *            位数
	 * @param num
	 *            返回序号的个数
	 * @return
	 */
	private List<String> generationCountString(int countNum, int countIncrease, Integer digit, Integer num) {
		List<String> result = new ArrayList<String>();
		String value = null;
		for (int i = 0; i < num; i++) {
			value = String.valueOf(countNum + i * countIncrease);
			int length = value.length();
			if (length < digit) {
				for (int j = 0; j < (digit - length); j++) {
					value = DEFAULT_SUPPLY + value;
				}
			}
			result.add(value);
		}
		return result;
	}

	/**
	 * 根据公司ID 、 计数器类型获取计数器对象
	 * 
	 * @param orgId
	 * @param countType
	 * @return
	 */
	private EsCounterModel getCount(Long orgId, String countType) {
		if (orgId == null || EmptyUtils.isEmpty(countType))
			throw new IllegalArgumentException("orgId 和 countType 不能为空!");
		// 构造查询的参数
//		EsCounterModel condition = new EsCounterModel();
//		condition.setEscuEscoId(orgId);
//		condition.setEscuType(countType);
//		List<EsCounterModel> models = this.findByCondition(condition);
		
		//执行对model的查询
//		QueryInfo queryInfo = new QueryInfo();
//		queryInfo.setQueryType("EsCounterModel");
//		QueryField queryField = new QueryField();
//		QueryField queryFieldEscuType = new QueryField();
//		queryField.setFieldName("escuEscoId");
//		queryField.setFieldValue(orgId);
//		queryField.setOperator("=");
//		
//		queryFieldEscuType.setFieldName("escuType");
//		queryFieldEscuType.setFieldValue(countType);
//		queryFieldEscuType.setOperator("=");
//		List<QueryField> qfList = new ArrayList<QueryField>();
//		qfList.add(queryField);
//		queryInfo.setQueryFields(qfList);
		List<FilterCondition> escuCondition = new ArrayList<>();
		escuCondition.add(new FilterCondition("escuEscoId", orgId, "="));
		escuCondition.add(new FilterCondition("escuType", countType, "="));
		List<EsCounterModel> models = this.esCounterManager.findByCondition(escuCondition);
		
//		QueryData queryData = commonQueryManager.query(queryInfo);
//		List<EsCounterModel> models = (List<EsCounterModel>) queryData.getDataList();
		
		// 如果有查询到数据 ， 返回第一个值
		if (EmptyUtils.isNotEmpty(models)) {
			EsCounterModel ss = models.get(0);
			return models.get(0);
		} else {
			return createAndSaveCounter(orgId, countType);
		}
	}

	/**
	 * 根据公司ID和计数器类型生成一条新的计数器
	 * 
	 * @param orgId
	 * @param countType
	 * @return
	 */
	private EsCounterModel createAndSaveCounter(Long orgId, String countType) {
		// 如果没有查询到数据，那么新增一条Counter信息
		Date today = new Date();
		EsCounterModel counter = new EsCounterModel();
		counter.setEscuEscoId(orgId);
		counter.setEscuType(countType);
		counter.setEscuCurrentYear(today);
		counter.setEscuCurrentMonth(today);
		counter.setEscuLastCounter(DEFAULT_START_COUNTER);
		counter.setEscuNextCounter(DEFAULT_INCREASE);
		return this.save(counter);
	}
	
	/**
	 * 生成系统订单号 ，系统订单号规则 ORD + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationORDrNo(){
		Queue<String> result = this.generationORDNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成外运号 ，系统外运号规则  + 四位年月 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> getSinotransNo(Integer num) {
		return this.getSinotransNoHelper(SINOTRANS_NO, COUNT_TYPE_SINOTRANS_NO, num);
	}
	/**
	 * 生成系统订单号 ，系统订单号规则 ORD + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationORDNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_ORDER_NO, COUNT_TYPE_ORDER_NO, num);
	}
	/**
	 * 生成陆运任务编号 ，陆运任务编号规则 ODT + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationODTNo(){
		Queue<String> result = this.generationODTNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成陆运任务编号 ，陆运任务编号规则 ODT + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationODTNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_OVERLAND_TRANSPORTATION, COUNT_TYPE_OVERLAND_TRANSPORTATION, num);
	}
	/**
	 * 生成出库任务编号 ，出口任务编号规则 ONT + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationONTNo(){
		Queue<String> result = this.generationONTNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成出库任务编号 ，出口任务编号规则 ONT + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationONTNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_OCEAN_TRANSPORTATION, COUNT_TYPE_OCEAN_TRANSPORTATION, num);
	}
	/**
	 * 生成进库任务编号 ，进口任务编号规则 INB + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationINBNo(){
		Queue<String> result = this.generationINBNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成进库任务编号 ，进口任务编号规则 INB + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationINBNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_IN_BOUND, COUNT_TYPE_IN_BOUND, num);
	}
	/**
	 * 生成出库任务编号 ，出口任务编号规则 OTB + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationOTBNo(){
		Queue<String> result = this.generationOTBNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成出库任务编号 ，出口任务编号规则 OTB + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationOTBNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_OUT_BOUND, COUNT_TYPE_OUT_BOUND, num);
	}
	/**
	 * 生成报关任务编号 ，报关任务编号规则 CUS + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationCUSNo(){
		Queue<String> result = this.generationCUSNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成报关任务编号 ，报关任务编号规则 CUS + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationCUSNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_CUSTOMS, COUNT_TYPE_CUSTOMS, num);
	}
	/**
	 * 生成铁路任务编号 ，铁路任务编号规则 RLW + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationRLWNo(){
		Queue<String> result = this.generationRLWNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成铁路任务编号 ，铁路任务编号规则 RLW + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationRLWNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_RAILWAY, COUNT_TYPE_RAILWAY, num);
	}
	/**
	 * 生成空运任务编号 ，空运任务编号规则 AIR + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationAIRNo(){
		Queue<String> result = this.generationAIRNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成空运任务编号 ，空运任务编号规则 AIR + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationAIRNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_AIR_LIFT, COUNT_TYPE_AIR_LIFT, num);
	}
	/**
	 * 生成进口拖车任务编号 ，进口拖车任务编号规则 IMT + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationIMTNo(){
		Queue<String> result = this.generationIMTNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成进口拖车任务编号 ，进口拖车任务编号规则 IMT + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationIMTNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_IMPORT_TRAILER, COUNT_TYPE_IMPORT_TRAILER, num);
	}
	/**
	 * 生成出口拖车任务编号 ，出口拖车任务编号规则 EXT + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationEXTNo(){
		Queue<String> result = this.generationEXTNo(DEFAULT_CREATE_NUM);
		return result.remove();
	}
	/**
	 * 生成出口拖车任务编号 ，出口拖车任务编号规则 EXT + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationEXTNo(Integer num) {
		return this.generationSystemNoHelper(PREFIX_EXPORT_TRAILER, COUNT_TYPE_EXPORT_TRAILER, num);
	}


	
}
