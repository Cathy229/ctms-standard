package com.sinotrans.oms.basicdata.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.basicdata.model.EbCodeMasterModel;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年8月29日 下午2:58:33
* 类说明
*/
public interface EbCodeMasterManager extends MybatisManager{

	EbCodeMasterModel get(Long id);

	List<EbCodeMasterModel> findByCondition(List<FilterCondition> conditions);

	EbCodeMasterModel save(EbCodeMasterModel model);

	List<EbCodeMasterModel> saveAll(List<EbCodeMasterModel> models);

	void delete(EbCodeMasterModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
