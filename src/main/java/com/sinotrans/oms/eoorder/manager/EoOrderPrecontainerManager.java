package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;

public interface EoOrderPrecontainerManager extends MybatisManager{

	EoOrderPrecontainerModel get(Long id);

	List<EoOrderPrecontainerModel> findByCondition(List<FilterCondition> conditions);

	EoOrderPrecontainerModel save(EoOrderPrecontainerModel model);

	List<EoOrderPrecontainerModel> saveAll(List<EoOrderPrecontainerModel> models);

	void delete(EoOrderPrecontainerModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	/**
	 * 订单执行完成之后，已经生成了拖车任务，是否还可以修改订单与配型信息校验
	 * @author Shoven.Jiang  
	 * @date 2018年11月12日
	 * @return
	 */
	ResponseData<List<EoOrderPrecontainerModel>> checkEosrListBeforeUpdateEosr(Long eoorId, List<EoOrderPrecontainerModel> eoOrderPrecontainerModels);

	/**
	 * 订单预配箱删除前的校验
	 * @author Shoven.Jiang  
	 * @date 2018年11月13日
	 * @param eosr 该订单下剩余的预配箱信息
	 * @param eoorId 订单id
	 * @param assembleEeoOrderPrecontainerModels 重新组装之后的预配箱
	 * @return
	 */
	ResponseData deleteEosrBeforeCheck(List<String> eosr, Long eoorId,
			List<EoOrderPrecontainerModel> assembleEeoOrderPrecontainerModels);
	
	/**
	 * 订单预配箱保存
	 * @author Shoven.Jiang  
	 * @date 2018年11月19日
	 * @param eoOrderDto
	 * @return
	 */
	ResponseData<EoOrderDto> saveOrderPrecontainer(EoOrderDto eoOrderDto);
	
	/**
	 * 查询订单预配箱信息
	 * @author Shoven.Jiang  
	 * @date 2018年11月21日
	 * @param queryInfo
	 * @return
	 */
	ResponseData<QueryData> queryOrderPrecontainerByCondition(QueryInfo queryInfo);
}
