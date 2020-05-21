package com.sinotrans.oms.datainteraction.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.datainteraction.manager.EaiMessageFileManager;
import com.sinotrans.oms.datainteraction.model.EaiMessageFileModel;
import com.sinotrans.oms.datainteraction.model.EaiOutExceptionModel;

/**  
* <p>Title: EaiMessageFileManagerImpl</p>  
* <p>Description: </p>  
* @author Colley.Bai 
* @date 2018年11月15日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EaiMessageFileManagerImpl extends MybatisManagerImpl  implements EaiMessageFileManager {

	@Override
	public EaiMessageFileModel get(Long id) {
		return this.myBatisDao.get(EaiMessageFileModel.class, id);
	}

	@Override
	public List<EaiMessageFileModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EaiMessageFileModel.class, null, null, conditions);
	}

	@Override
	public List<EaiMessageFileModel> saveAll(List<EaiMessageFileModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EaiMessageFileModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		this.myBatisDao.batchDelete(EaiMessageFileModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EaiMessageFileModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		this.myBatisDao.deleteByPks(EaiMessageFileModel.class, ids);
	}

	@Override
	public EaiMessageFileModel save(EaiMessageFileModel model) {
		return this.myBatisDao.save(model);
	}

}
