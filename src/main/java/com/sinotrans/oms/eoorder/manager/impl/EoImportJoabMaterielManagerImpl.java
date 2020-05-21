package com.sinotrans.oms.eoorder.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.eoorder.manager.EoImportJoabMaterielManager;
import com.sinotrans.oms.eoorder.model.EoImportJoabMaterielModel;

/**  
* Title: EoImportJoabMaterielManagerImpl  
* Description:  进口物料
* @author Colley.Bai  
* @date 2019年02月28日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoImportJoabMaterielManagerImpl extends MybatisManagerImpl implements EoImportJoabMaterielManager {

	@Override
	public EoImportJoabMaterielModel get(Long id) {
		return this.myBatisDao.get(EoImportJoabMaterielModel.class, id);
	}

	@Override
	public List<EoImportJoabMaterielModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoImportJoabMaterielModel.class, null, null, conditions);
	}

	@Override
	public EoImportJoabMaterielModel save(EoImportJoabMaterielModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoImportJoabMaterielModel> saveAll(List<EoImportJoabMaterielModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoImportJoabMaterielModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoImportJoabMaterielModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoImportJoabMaterielModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoImportJoabMaterielModel.class, ids);
	}
}
