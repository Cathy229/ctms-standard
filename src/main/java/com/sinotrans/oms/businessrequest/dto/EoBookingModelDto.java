package com.sinotrans.oms.businessrequest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;

/**
 * 
 * <p>Description: 订舱数据传输对象
 *    
 * </p>
 *
 * @author colley
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年9月12日     colley       	               创建
 * 
 * 
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)//20180906 harley jackson转换时忽略空属性不在set。请根据更新逻辑酌情使用
public class EoBookingModelDto extends EoRequestBookingModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
