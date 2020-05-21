package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoDeclarationDeputeDto;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoRequestDeclarationDeputeManager extends MybatisManager{

	EoRequestDeclarationDeputeModel get(Long id);

	List<EoRequestDeclarationDeputeModel> findByCondition(List<FilterCondition> conditions);

	EoRequestDeclarationDeputeModel save(EoRequestDeclarationDeputeModel model);

	List<EoRequestDeclarationDeputeModel> saveAll(List<EoRequestDeclarationDeputeModel> models);

	void delete(EoRequestDeclarationDeputeModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	/**
	 * 委托报关任务保存
	 * @param eoRequestDeclarationDeputeModel
	 * @return
	 */
	ResponseData<EoRequestDeclarationDeputeModel> saveDeclarationDepute(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel);
	/**
	 * 
	 * @date 2018年8月10日 下午2:47:08  
	 * @author simon 
	 * Description:报关任务+报关货物+报关集装箱+报关随附单据保存
	 * @param eoDeclarationDeputeDto
	 * @return
	 */
	EoDeclarationDeputeDto saveDeclarationDeputeAndMaterial(EoDeclarationDeputeDto eoDeclarationDeputeDto);
	/**
	 * 
	 * @date 2018年8月10日 下午6:32:22  
	 * @author Richard 
	 * Description：报关下达
	 * @param eoddIds
	 * @return
	 */
	 public String issuedDeclarationDepute(Long[] eoddIds);
	 
	 /**
	  * 
	  * @date 2018年8月11日 上午9:50:11  
	  * @author Richard 
	  * Description:报关列表查询（按条件查询）
	  * @param conditionMap
	  * @return
	  */
	 public QueryData getDeclarationDeputeByCondition(QueryInfo queryInfo);
	 
	 /**
	  * 
	  * @date 2018年8月11日 上午11:17:00  
	  * @author Richard 
	  * Description:报关任务+报关货物查询+报关集装箱+报关随附单据（按照报关主键）
	  * @param eoddId
	  * @return
	  */
	 public EoDeclarationDeputeDto getDeclarationDeputeAndMaterialById(Long eoddId);
	 
	 /**
	  * 更新model
	  * @param eoRequestDeclarationDeputeModel
	  * @return
	  */
	 public EoRequestDeclarationDeputeModel updateModel(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel);

	 /**
	  * @deprecated:验证订单下委托报关的提运单号唯一
	  * @author Colley.Bai  
	  * @date 2018年9月13日
	  * @param eoRequestDeclarationDeputeModel
	  * @return
	  */
	 public ResponseData<EoRequestDeclarationDeputeModel> getDeclarationDeputeByEoddBlNoAndEoddEoorId(
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel);

	 /**
	  * @deprecated:报关任务+报关货物查询+报关集装箱+报关随附单据（按照订单主键）
	  * @author Colley.Bai  
	  * @date 2018年11月14日
	  * @param eoorId
	  * @return
	  */
	 public EoDeclarationDeputeDto getDeclarationDeputeAndMaterialByEoordId(Long eoorId);
	 
	 /**
	  * @deprecated:记录内部状态
	  * @author Colley.Bai  
	  * @date 2018年12月26日
	  * @param eoRequestTrailerModel
	  */
	 void saveDpInTrack(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel);
}
