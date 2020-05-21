package com.sinotrans.oms.test.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.test.model.FjWorklogExtendModel;
import com.sinotrans.oms.test.model.FjWorklogModel;
import com.sinotrans.oms.test.model.FjWorklogitemModel;
import com.sinotrans.oms.test.model.SysUserModel;
import com.sinotrans.oms.test.model.WorktypeModel;
import com.sinotrans.oms.test.service.FjWorklogManager;

@Service
public class FjWorklogManagerImpl extends MybatisManagerImpl implements FjWorklogManager {

	public FjWorklogModel save(FjWorklogModel model) {
		if (model != null && model.getId() != null && !"".equals(model.getId())) {
			model.setRowState(BaseModel.ROW_STATE_MODIFIED);
		} else {
			model.setRowState(BaseModel.ROW_STATE_ADDED);
		}
		return this.myBatisDao.save(model);
	}

	@Override
	public void deleteByPks(Collection<String> ids) {
		// FilterCondition FieldValue 为in操作时只认Array
		Object[] idArray = ids.toArray();
		List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
		FilterCondition fc = new FilterCondition();
		fc.setFieldName("worklogId");
		fc.setFieldValue(idArray);
		fc.setOperator("in");
		filterCond.add(fc);
		this.myBatisDao.batchDelete(FjWorklogitemModel.class, filterCond);
		this.myBatisDao.deleteByPks(FjWorklogModel.class, ids);
	}

	@Override
	public FjWorklogModel get(String id) {
		return this.myBatisDao.get(FjWorklogModel.class, id);
	}

	@Override
	public FjWorklogExtendModel getExtendModel(String id) {
		FjWorklogModel model = this.myBatisDao.get(FjWorklogModel.class, id);

		FjWorklogExtendModel extendModel = new FjWorklogExtendModel();
		try {
			PropertyUtils.copyProperties(extendModel, model);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// get worktypeName and userRealName
		WorktypeModel worktype = myBatisDao.get(WorktypeModel.class, model.getWorktypeId());
		if (worktype != null)
			extendModel.setWorktypeName(worktype.getTypename());

		SysUserModel sysuser = myBatisDao.get(SysUserModel.class, model.getUserId());
		if (sysuser != null)
			extendModel.setUserName(sysuser.getUsrRealName());

		return extendModel;
	}

}
