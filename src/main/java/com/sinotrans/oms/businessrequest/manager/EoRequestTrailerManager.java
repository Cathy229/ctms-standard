package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoRequestTrailerManager extends MybatisManager{
	
	EoRequestTrailerModel get(Long id);

	List<EoRequestTrailerModel> findByCondition(List<FilterCondition> conditions);

	EoRequestTrailerModel save(EoRequestTrailerModel model);

	List<EoRequestTrailerModel> saveAll(List<EoRequestTrailerModel> models);

	void delete(EoRequestTrailerModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	/**
	 * 拖车请求保存，包含拖车基本信息，拖车货物，拖车集装箱信息
	 * @param eoTrailerDto
	 * @return
	 */
	ResponseData<EoTrailerDto> saveTrailerAndMaterial(EoTrailerDto eoTrailerDto);
	
	
	/**
	 * 拖车请求下达
	 * @param eoetId
	 * @return
	 */
	public String issuedTrailer(Long[] eoetIds);
	/**
	 * 根据拖车主键查询拖车信息及物料信息，箱信息
	 * @param eoetId
	 * @return
	 */
	public EoTrailerDto getTrailerAndMaterialById(Long eoetId);
	
	/**
	 * 查询拖车列表信息，根据查询条件
	 * @param condition
	 * @return
	 */
	public QueryData queryTrailerByCondition(QueryInfo queryInfo);
	
	/**
	 * @deprecated:跟踪订舱状态
	 * @author Colley.Bai  
	 * @date 2018年12月26日
	 * @param eoRequestTrailerModel
	 */
	void saveDpInTrack(EoRequestTrailerModel eoRequestTrailerModel);
}
