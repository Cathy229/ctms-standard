package com.sinotrans.oms.eoorder.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.eoorder.manager.EsReportTemplateManager;
import com.sinotrans.oms.eoorder.model.EsReportTemplateModel;
import com.sinotrans.oms.eoorder.model.EsReportTemplateModel;

/**  
* Title: EsReportTemplateManagerImpl  
* Description:  
* @author Shoven.Jiang  
* @date 2018年10月31日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EsReportTemplateManagerImpl extends MybatisManagerImpl implements EsReportTemplateManager {

	@Override
	public EsReportTemplateModel get(Long id) {
		
		return this.myBatisDao.get(EsReportTemplateModel.class, id);
	}

	@Override
	public List<EsReportTemplateModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EsReportTemplateModel.class, null, null, conditions);
	}

	@Override
	public EsReportTemplateModel save(EsReportTemplateModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EsReportTemplateModel> saveAll(List<EsReportTemplateModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EsReportTemplateModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EsReportTemplateModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EsReportTemplateModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EsReportTemplateModel.class, ids);
	}
}
