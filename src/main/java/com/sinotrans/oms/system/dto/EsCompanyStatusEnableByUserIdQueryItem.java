package com.sinotrans.oms.system.dto;

import com.sinotrans.framework.orm.model.BaseModel;
/**
 * <p>Description: 查询用户下的公司是否为可用状态 </p>
 * @author  黄军明
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本    		修改人   		修改日期   		修改内容
 * 2010-1-27.1	    黄军明   		2010-1-27		    create
 * 
 * </pre>
 */
public class EsCompanyStatusEnableByUserIdQueryItem extends BaseModel {

	private String esusIsenable;
	private Long esusId;
	private Long esusEscoId;
	private String esugUserGroupName;
	private String esugStatus;
	private String escoStatus;

	public String getEsusIsenable() {
		return esusIsenable;
	}

	public void setEsusIsenable(String esusIsenable) {
		this.esusIsenable = esusIsenable;
	}

	public Long getEsusId() {
		return esusId;
	}

	public void setEsusId(Long esusId) {
		this.esusId = esusId;
	}

	public Long getEsusEscoId() {
		return esusEscoId;
	}

	public void setEsusEscoId(Long esusEscoId) {
		this.esusEscoId = esusEscoId;
	}

	public String getEsugUserGroupName() {
		return esugUserGroupName;
	}

	public void setEsugUserGroupName(String esugUserGroupName) {
		this.esugUserGroupName = esugUserGroupName;
	}

	public String getEsugStatus() {
		return esugStatus;
	}

	public void setEsugStatus(String esugStatus) {
		this.esugStatus = esugStatus;
	}

	public String getEscoStatus() {
		return escoStatus;
	}

	public void setEscoStatus(String escoStatus) {
		this.escoStatus = escoStatus;
	}

}
