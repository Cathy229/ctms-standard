package com.sinotrans.oms.basicdata.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.basicdata.manager.EbCodeMasterManager;
import com.sinotrans.oms.basicdata.model.EbCodeMasterModel;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年8月29日 下午2:59:25
* 类说明
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbCodeMasterManagerImpl extends MybatisManagerImpl implements EbCodeMasterManager{

	@Override
	public EbCodeMasterModel get(Long id) {
		
		return this.myBatisDao.get(EbCodeMasterModel.class, id);
	}

	@Override
	public List<EbCodeMasterModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbCodeMasterModel.class, null, null, conditions);
	}

	@Override
	public EbCodeMasterModel save(EbCodeMasterModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbCodeMasterModel> saveAll(List<EbCodeMasterModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbCodeMasterModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbCodeMasterModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbCodeMasterModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbCodeMasterModel.class, ids);
	}
}
