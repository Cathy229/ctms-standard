package com.sinotrans.oms.test.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.test.model.FjWorklogitemModel;
import com.sinotrans.oms.test.service.FjWorklogitemManager;

@Service
public class FjWorklogitemManagerImpl extends MybatisManagerImpl implements
		FjWorklogitemManager {

	public FjWorklogitemModel get(String id) {
		return this.myBatisDao.get(FjWorklogitemModel.class, id);
	}

	public FjWorklogitemModel save(FjWorklogitemModel model) {
		return this.myBatisDao.save(model);
	}

	public List<FjWorklogitemModel> saveAll(
			Collection<FjWorklogitemModel> models) {
		List<FjWorklogitemModel> savedList = new ArrayList<FjWorklogitemModel>();
		for (FjWorklogitemModel model : models) {
			savedList.add(this.myBatisDao.save(model));
		}
		return savedList;
	}

	public void remove(FjWorklogitemModel model) {
		this.myBatisDao.delete(model);
	}

	public void removeByPk(String id) {
		this.myBatisDao.deleteByPk(FjWorklogitemModel.class, id);
	}

	public void removeAllByPks(Collection<String> ids) {
		this.myBatisDao.deleteByPks(FjWorklogitemModel.class, ids);
	}

}
