package com.sinotrans.oms.eoor.manager.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoor.dto.CheckEoorInfoQueryItem;
import com.sinotrans.oms.eoor.dto.GetCityNameQueryItem;
import com.sinotrans.oms.eoor.manager.EttaManager;
import com.sinotrans.oms.eoor.model.EtTaskModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EttaManagerImpl extends MybatisManagerImpl implements EttaManager{
     @Autowired
	private CommonQueryManager commonQueryManager;

	@Override
	public EtTaskModel get(Integer id) {
		return this.myBatisDao.get(EtTaskModel.class, id);
	}

	@Override
	public List<EtTaskModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EtTaskModel.class, null, null, conditions);
	}

	@Override
	public EtTaskModel save(EtTaskModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EtTaskModel> saveAll(List<EtTaskModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EtTaskModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EtTaskModel.class, conditions);
	}

	@Override
	public void deleteByPk(Integer id) {
		this.myBatisDao.deleteByPk(EtTaskModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Integer> ids) {
		 this.myBatisDao.deleteByPks(EtTaskModel.class, ids);
	}

	@Override
	public EtTaskModel saveOrder(EtTaskModel etTaskModel) {
		return this.myBatisDao.save(etTaskModel);
	}


	@Override
	public String etCityName(Map<String, Object> conditions) {
		 List<Map<String, Object>> getCityNameQueryList = this.myBatisDao.queryByCondition("GetCityNameQuery", conditions, null, null, null);
         if(getCityNameQueryList.size()>0){
        	 GetCityNameQueryItem item=(GetCityNameQueryItem) BlukInsertUtils.parseMapToObject(getCityNameQueryList.get(0), new GetCityNameQueryItem());
        	 return item.getEbplNameCn();
         }
		return "";
	}

	@Override
	public String checkEoorInfo(Integer[] ettaIds) {
		System.out.println("ceshi -----------------1");
		Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("ettaIds", StringUtils.join(ettaIds, ","));
		List<Map<String, Object>> checkEoorInfoList = this.myBatisDao.queryByCondition("CheckEoorInfoQuery", conditions, null, null, null);
		System.out.println("ceshi -----------------2");
		if (EmptyUtils.isEmpty(checkEoorInfoList)) {
            return null;
        } 
		StringBuffer stbf = new StringBuffer();
		for (Map<String, Object> map : checkEoorInfoList) {
			CheckEoorInfoQueryItem item = (CheckEoorInfoQueryItem) BlukInsertUtils.parseMapToObject(map, new CheckEoorInfoQueryItem());
			stbf.append(item.getEttaSoNo()+",");
        }
		stbf.append("请查看这些单号是否体积小于1000、预计提货时间小于预计到货时间！");
		return stbf.toString();
	}

	
	
}
