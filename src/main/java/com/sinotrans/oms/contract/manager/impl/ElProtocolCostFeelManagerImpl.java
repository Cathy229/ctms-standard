package com.sinotrans.oms.contract.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.contract.manager.ElProtocolCostFeelManager;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;

/**
 * <p>Description: 协议费用计算Manager </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181121              Colley.Bai       	                    创建
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ElProtocolCostFeelManagerImpl extends MybatisManagerImpl implements ElProtocolCostFeelManager {

	@Override
	public ElProtocolCostFeelModel get(Long id) {
		return this.myBatisDao.get(ElProtocolCostFeelModel.class, id);
	}

	@Override
	public List<ElProtocolCostFeelModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(ElProtocolCostFeelModel.class, null, null, conditions);
	}

	@Override
	public ElProtocolCostFeelModel save(ElProtocolCostFeelModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<ElProtocolCostFeelModel> saveAll(List<ElProtocolCostFeelModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(ElProtocolCostFeelModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(ElProtocolCostFeelModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(ElProtocolCostFeelModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(ElProtocolCostFeelModel.class, ids);
	}
}
