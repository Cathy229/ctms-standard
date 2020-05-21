package com.sinotrans.oms.businessrule.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrule.model.EsControlParamModel;

public interface EsControlParamManager extends MybatisManager{
	
	EsControlParamModel get(Long id);

	List<EsControlParamModel> findByCondition(List<FilterCondition> conditions);

	EsControlParamModel save(EsControlParamModel model);

	List<EsControlParamModel> saveAll(List<EsControlParamModel> models);

	void delete(EsControlParamModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	/**
	 * 查询公司的参数值
	 * @return
	 */
	public String getIsCompanyValue(String Code);
	
	/**
	 * 查询公司的参数值,增加公司编码参数
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param Code
	 * @param escoCompanyNo
	 * @return
	 */
	String getIsCompanyValue(String Code, String escoCompanyNo);
	
	/**
	 * 查询系统级别的控制参数
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param params
	 * @return
	 */
	Map<String, Object> getControlParamValues(String... params);

}
