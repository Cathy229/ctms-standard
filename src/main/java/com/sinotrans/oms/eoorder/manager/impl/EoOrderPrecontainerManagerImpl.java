package com.sinotrans.oms.eoorder.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoRequestTraileContainerNumQueryItem;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.manager.EoOrderPrecontainerManager;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoOrderPrecontainerManagerImpl extends MybatisManagerImpl implements EoOrderPrecontainerManager{

	@Autowired
	private CommonQueryManager commonQueryManager;
	@Override
	public EoOrderPrecontainerModel get(Long id) {
		
		return this.myBatisDao.get(EoOrderPrecontainerModel.class, id);
	}

	@Override
	public List<EoOrderPrecontainerModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoOrderPrecontainerModel.class, null, null, conditions);
	}

	@Override
	public EoOrderPrecontainerModel save(EoOrderPrecontainerModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoOrderPrecontainerModel> saveAll(List<EoOrderPrecontainerModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoOrderPrecontainerModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoOrderPrecontainerModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoOrderPrecontainerModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoOrderPrecontainerModel.class, ids);
	}

	@Override
	public ResponseData<List<EoOrderPrecontainerModel>> checkEosrListBeforeUpdateEosr(Long eoorId, List<EoOrderPrecontainerModel> eoOrderPrecontainerModels) {
		ResponseData<List<EoOrderPrecontainerModel>> responseData = new ResponseData<List<EoOrderPrecontainerModel>>();
		if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModels)) {
			//1.校验预配箱信息是否可以删除和减少
	        if (eoOrderPrecontainerModels.get(0).getEosrEoorId() != null) {
	            // 查询已经下达的箱型的 尺寸和箱型 不可以更改箱型和尺寸
	            String error = "";
	            List<String> eoet = new ArrayList<String>();// 拖车中下达箱型
	            //拼接查询已下达箱型的SQL
	            Map<String, Object> conditions = new HashMap<String, Object>();
	            conditions.put("eoorId", eoOrderPrecontainerModels.get(0).getEosrEoorId());//订单id
	            List<Map<String, Object>> OrderPrecontainerQueryList = this.myBatisDao.queryByCondition("OrderPrecontainerQuery", conditions, null, null, null);
	            for (Map<String, Object> map : OrderPrecontainerQueryList) {
        			Set<String> keySet = map.keySet();
        			for (String key : keySet) {
						if ("eootSizeAndStandard".equals(key)) {
							eoet.add(map.get(key).toString());// 箱型和尺寸已经拼接
						}
					}
                }
	            List<String> eosr = new ArrayList<String>();// 页面修改的预配箱
	            for (EoOrderPrecontainerModel eosrModels : eoOrderPrecontainerModels) {
	                eosr.add(eosrModels.getEosrCntCustomized() + eosrModels.getEosrCntCustomizedSize());
	            }
	            for (String str : eoet) {
	            	if (!eosr.contains(str)) {
	                    error += str.toString() + " ";
	                }
				}
	            if (EmptyUtils.isNotEmpty(error)) {
	            	responseData.setMsg(error + "箱型已经有数据下达，尺寸和箱型不可改");
	            	responseData.setCode(Constants.NO);
	                return responseData;
	            }
	            
	            // 基本信息
	            Map<String, Object> numCondition = new HashMap<String, Object>();
	            numCondition.put("eoorId", eoOrderPrecontainerModels.get(0).getEosrEoorId());//订单Id
	            for (EoOrderPrecontainerModel eosrModel : eoOrderPrecontainerModels) {
	                if (eosrModel.ROW_STATE_DELETED.equals(eosrModel.getRowState())) {
	                    eosrModel.setEosrCtnNumber(0);
	                }
	                numCondition.put("eosrCtnNumber", eosrModel.getEosrCtnNumber().toString());
	                numCondition.put("eosrCntCustomized", eosrModel.getEosrCntCustomized());
	                numCondition.put("eosrCntCustomizedSize", eosrModel.getEosrCntCustomizedSize());
	                List<Map<String, Object>> ResultList = this.myBatisDao.queryByCondition("EoRequestTraileContainerNumQuery", numCondition, null, null, null);
	        		List<EoRequestTraileContainerNumQueryItem> numItems = new ArrayList<>();
	        		for (Map<String, Object> map : ResultList) {
	        			numItems.add((EoRequestTraileContainerNumQueryItem) BlukInsertUtils.parseMapToObject(map, new EoRequestTraileContainerNumQueryItem()));
	                }
	                if (numItems.get(0).getCt() < 0) {
	                	responseData.setMsg(eosrModel.getEosrCntCustomized() + eosrModel.getEosrCntCustomizedSize() + "箱型数量不可小于"
	                            + numItems.get(0).getIssued() + "条");
	                    responseData.setCode(Constants.NO);
	                    return responseData;
	                }
	            }
	        }
		}
		responseData.setCode(Constants.YES_CHINESE);//如果是中文”是“，则表示预配箱校验信息通过且订单已经执行过有拖车任务
		return responseData;
	}
	
	@Override
	public ResponseData deleteEosrBeforeCheck(List<String> eosr, Long eoorId, List<EoOrderPrecontainerModel> assembleEeoOrderPrecontainerModels) {
		ResponseData responseData = new ResponseData<>();
		// 查询已经下达的箱型的 尺寸和箱型 不可以更改箱型和尺寸
        String error = "";
        List<String> eoet = new ArrayList<String>();// 拖车中下达箱型
        //拼接查询已下达箱型的SQL
        Map<String, Object> conditions = new HashMap<String, Object>();
        conditions.put("eoorId", eoorId);//订单id
        List<Map<String, Object>> OrderPrecontainerQueryList = this.myBatisDao.queryByCondition("OrderPrecontainerQuery", conditions, null, null, null);
        for (Map<String, Object> map : OrderPrecontainerQueryList) {
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				if ("eootSizeAndStandard".equals(key)) {
					eoet.add(map.get(key).toString());// 箱型和尺寸已经拼接
				}
			}
        }
		//将该订单下剩余的预配箱和拖车任务中已经下达的与配型进行比较
		for (String str : eoet) {
        	if (!eosr.contains(str)) {
                error += str.toString() + " ";
            }
		}
		if (EmptyUtils.isNotEmpty(error)) {
        	responseData.setMsg(error + "箱型已经有数据下达，尺寸和箱型不可改");
        	responseData.setCode(Constants.NO);
            return responseData;
        }
		responseData = this.checkBaseInfoemation(eoorId, assembleEeoOrderPrecontainerModels);
		return responseData;
	}
	
	/**
	 * 订单预配箱删除前校验基本信息是否符合删除要求
	 * @author Shoven.Jiang  
	 * @date 2018年11月13日
	 * @param eoorId
	 * @param assembleEeoOrderPrecontainerModels
	 * @return
	 */
	private ResponseData checkBaseInfoemation(Long eoorId, List<EoOrderPrecontainerModel> assembleEeoOrderPrecontainerModels) {
		ResponseData responseData = new ResponseData<>();
		// 基本信息
        Map<String, Object> numCondition = new HashMap<String, Object>();
        numCondition.put("eoorId", eoorId);//订单Id
        for (EoOrderPrecontainerModel eosrModel : assembleEeoOrderPrecontainerModels) {
            if (eosrModel.ROW_STATE_DELETED.equals(eosrModel.getRowState())) {
                eosrModel.setEosrCtnNumber(0);
            }
            numCondition.put("eosrCtnNumber", eosrModel.getEosrCtnNumber().toString());
            numCondition.put("eosrCntCustomized", eosrModel.getEosrCntCustomized());
            numCondition.put("eosrCntCustomizedSize", eosrModel.getEosrCntCustomizedSize());
            List<Map<String, Object>> ResultList = this.myBatisDao.queryByCondition("EoRequestTraileContainerNumQuery", numCondition, null, null, null);
    		List<EoRequestTraileContainerNumQueryItem> numItems = new ArrayList<>();
    		for (Map<String, Object> map : ResultList) {
    			numItems.add((EoRequestTraileContainerNumQueryItem) BlukInsertUtils.parseMapToObject(map, new EoRequestTraileContainerNumQueryItem()));
            }
            if (numItems.get(0).getCt() < 0) {
            	responseData.setMsg(eosrModel.getEosrCntCustomized() + eosrModel.getEosrCntCustomizedSize() + "箱型数量不可小于"
                        + numItems.get(0).getIssued() + "条");
                responseData.setCode(Constants.NO);
                return responseData;
            }
        }
		return responseData;
	}

	@Override
	public ResponseData<EoOrderDto> saveOrderPrecontainer(EoOrderDto eoOrderDto) {
		EoOrderDto afterSaveEoOrderDto = new EoOrderDto();
		Long eoorId = eoOrderDto.getEoOrderPrecontainerModelList().get(0).getEosrEoorId();//获取订单预配箱中的订单id
		List<EoOrderPrecontainerModel> beforeSaveEoOrderPrecontainerModels = new ArrayList<>();//根据订单id查询保存之前数据库中的数据，防止校验信息没有通过，需要重新刷新界面
		if (null != eoorId) {
			List<FilterCondition> condition = new ArrayList<>();
			condition.add(new FilterCondition("eosrEoorId", eoorId, "="));
			beforeSaveEoOrderPrecontainerModels = this.findByCondition(condition);//订单保存之前预配箱数据
		}
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		List<EoOrderPrecontainerModel> eoOrderPrecontainerModels = eoOrderDto.getEoOrderPrecontainerModelList();
		//1.校验预配箱信息是否可以删除和减少
//        if (eoOrderPrecontainerModels.get(0).getEosrEoorId() != null) {
//            // 查询已经下达的箱型的 尺寸和箱型 不可以更改箱型和尺寸
//            String error = "";
//            List<String> eoet = new ArrayList<String>();// 拖车中下达箱型
//            Map<String, Object> conditions = new HashMap<String, Object>();
//            conditions.put("eoorId", eoOrderPrecontainerModels.get(0).getEosrEoorId());//so号
//            List<Map<String, Object>> OrderPrecontainerQueryList = this.myBatisDao.queryByCondition("OrderPrecontainerQuery", conditions, null, null, null);
//            for (Map<String, Object> map : OrderPrecontainerQueryList) {
//    			Set<String> keySet = map.keySet();
//    			for (String key : keySet) {
//					if ("eootSizeAndStandard".equals(key)) {
//						eoet.add(map.get(key).toString());// 箱型和尺寸已经拼接
//					}
//				}
//            }
//            List<String> eosr = new ArrayList<String>();// 页面修改的预配箱
//            for (EoOrderPrecontainerModel eosrModels : eoOrderPrecontainerModels) {
//                eosr.add(eosrModels.getEosrCntCustomized() + eosrModels.getEosrCntCustomizedSize());
//            }
//            for (String str : eoet) {
//            	if (!eosr.contains(str)) {
//                    error += str.toString() + " ";
//                }
//			}
//            if (!"".equals(error)) {
//            	responseData.setMsg(error + "箱型已经有数据下达，尺寸和箱型不可改");
//            	responseData.setCode(Constants.NO);
//            	afterSaveEoOrderDto.setEoOrderPrecontainerModelList(beforeSaveEoOrderPrecontainerModels);//由于不能修改，所以界面回显应该是保存之前的数据
//            	responseData.setData(afterSaveEoOrderDto);
//                return responseData;
//            }
//            
//            // 基本信息
//            Map<String, Object> numCondition = new HashMap<String, Object>();
//            numCondition.put("eoorId", eoOrderPrecontainerModels.get(0).getEosrEoorId());//so号
//            for (EoOrderPrecontainerModel eosrModel : eoOrderPrecontainerModels) {
//                if (eosrModel.ROW_STATE_DELETED.equals(eosrModel.getRowState())) {
//                    eosrModel.setEosrCtnNumber(0);
//                }
//                numCondition.put("eosrCtnNumber", eosrModel.getEosrCtnNumber().toString());
//                numCondition.put("eosrCntCustomized", eosrModel.getEosrCntCustomized());
//                numCondition.put("eosrCntCustomizedSize", eosrModel.getEosrCntCustomizedSize());
//                List<Map<String, Object>> ResultList = this.myBatisDao.queryByCondition("EoRequestTraileContainerNumQuery", numCondition, null, null, null);
//        		List<EoRequestTraileContainerNumQueryItem> numItems = new ArrayList<>();
//        		for (Map<String, Object> map : ResultList) {
//        			numItems.add((EoRequestTraileContainerNumQueryItem) BlukInsertUtils.parseMapToObject(map, new EoRequestTraileContainerNumQueryItem()));
//                }
//                if (numItems.get(0).getCt() < 0) {
//                	responseData.setMsg(eosrModel.getEosrCntCustomized() + eosrModel.getEosrCntCustomizedSize() + "箱型数量不可小于"
//                            + numItems.get(0).getIssued() + "条");
//                    responseData.setCode(Constants.NO);
//                    afterSaveEoOrderDto.setEoOrderPrecontainerModelList(beforeSaveEoOrderPrecontainerModels);//由于不能修改，所以界面回显应该是保存之前的数据
//                	responseData.setData(afterSaveEoOrderDto);
//                    return responseData;
//                }
//            }
//        }
        
        // ------------预配箱保存 start------------
		List<EoOrderPrecontainerModel> afterSaveEoOrderPrecontainerModels = new ArrayList<EoOrderPrecontainerModel>();
		afterSaveEoOrderPrecontainerModels = this.saveAll(eoOrderPrecontainerModels);
		afterSaveEoOrderDto.setEoOrderPrecontainerModelList(afterSaveEoOrderPrecontainerModels);
        // ------------预配箱保存 end------------
		responseData.setMsg("订单预配箱信息保存成功");
		responseData.setData(afterSaveEoOrderDto);
		return responseData;
	}

	@Override
	public ResponseData<QueryData> queryOrderPrecontainerByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<>();
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderPrecontainerQuery");
		QueryData queryData = commonQueryManager.query(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}
}
