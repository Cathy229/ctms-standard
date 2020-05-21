package com.sinotrans.oms.eoorder.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabMaterielModel;
import com.sinotrans.oms.eoorder.manager.EoOutmportJoabMaterielManager;

/**  
* Title: EoEoob2EomjManagerImpl  
* Description:  
* @author Colley.Bai  
* @date 2018年11月1日21:14:46  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoOutmportJoabMaterielManagerImpl extends MybatisManagerImpl implements EoOutmportJoabMaterielManager {

	@Override
	public EoOutmportJoabMaterielModel get(Long id) {
		
		return this.myBatisDao.get(EoOutmportJoabMaterielModel.class, id);
	}

	@Override
	public List<EoOutmportJoabMaterielModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoOutmportJoabMaterielModel.class, null, null, conditions);
	}

	@Override
	public EoOutmportJoabMaterielModel save(EoOutmportJoabMaterielModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoOutmportJoabMaterielModel> saveAll(List<EoOutmportJoabMaterielModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoOutmportJoabMaterielModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoOutmportJoabMaterielModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoOutmportJoabMaterielModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoOutmportJoabMaterielModel.class, ids);
	}
}
