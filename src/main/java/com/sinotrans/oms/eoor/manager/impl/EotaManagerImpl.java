package com.sinotrans.oms.eoor.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoor.manager.EoorManager;
import com.sinotrans.oms.eoor.manager.EotaManager;
import com.sinotrans.oms.eoor.model.EoTaskModel;
import com.sinotrans.oms.eoor.service.EoorService;
import com.sinotrans.oms.eoor.service.EotaService;
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EotaManagerImpl extends MybatisManagerImpl implements EotaManager{
     @Autowired
	private CommonQueryManager commonQueryManager;
     @Override
 	public EoTaskModel saveOrder(EoTaskModel eoTaskModel) {
 		
 		return this.myBatisDao.save(eoTaskModel);
 	}


 	@Override
 	public EoTaskModel get(Integer id) {
 		
 		return this.myBatisDao.get(EoTaskModel.class, id);
 	}

 	@Override
 	public List<EoTaskModel> findByCondition(List<FilterCondition> conditions) {
 		return this.myBatisDao.findByCondition(EoTaskModel.class, null, null, conditions);
 	}

 	@Override
 	public EoTaskModel save(EoTaskModel model) {
 		 return this.myBatisDao.save(model);
 	}

 	@Override
 	public List<EoTaskModel> saveAll(List<EoTaskModel> models) {
 		return this.myBatisDao.saveAll(models);
 	}

 	@Override
 	public void delete(EoTaskModel model) {
 		this.myBatisDao.delete(model);
 		
 	}

 	@Override
 	public void batchDelete(List<FilterCondition> conditions) {
 		 this.myBatisDao.batchDelete(EoTaskModel.class, conditions);
 		
 	}

 	@Override
 	public void deleteByPk(Integer id) {
 		this.myBatisDao.deleteByPk(EoTaskModel.class, id);
 	}

 	@Override
 	public void deleteByPks(Collection<Integer> ids) {
 		 this.myBatisDao.deleteByPks(EoTaskModel.class, ids);
 	}


	@Override
	public QueryData queryEoLandOrderTrackQuery(QueryInfo queryInfo) {
		queryInfo.setQueryType("com.sinotrans.oms.eoor.mapper.EoLandOrderTrackQuery");
		queryInfo = getEotaSoNo(queryInfo);
		return commonQueryManager.query(queryInfo);
	}


	@Override
	public QueryInfo getEotaSoNo(QueryInfo queryInfo) {
		if (EmptyUtils.isNotEmpty(queryInfo.getQueryFields())) {
			for (int i = 0; i < queryInfo.getQueryFields().size(); i++) {
				String fieldName = queryInfo.getQueryFields().get(i).getFieldName();
				String fieldValue = queryInfo.getQueryFields().get(i).getFieldValue().toString();
				//获取页面系统订单号参数信息
				if ("CDT_eotaSoNo".equals(fieldName)) {
					String eotaSoNo = "";
					String[] eoorOrderNos = fieldValue.split(",");
					for(int j = 0; j < eoorOrderNos.length; j++){
						String eoNo = eoorOrderNos[j];
						if(EmptyUtils.isNotEmpty(eoNo)){
							eoNo = "'" + eoNo + "'";
							eotaSoNo += eoNo;
							if(j < eoorOrderNos.length - 1){
								eotaSoNo +=  ",";
							}
						}
					}
					//重新构造系统订单号参数信息
					queryInfo.getQueryFields().get(i).setFieldValue(eotaSoNo);
				}
			}
		}
		return queryInfo;
	}

}
