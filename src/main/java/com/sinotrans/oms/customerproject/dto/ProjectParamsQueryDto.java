package com.sinotrans.oms.customerproject.dto;

import java.io.Serializable;

/**  
* <p>Title: ProjectParamsQueryDto</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年10月13日  
* @version 1.0  
*/
public class ProjectParamsQueryDto  implements Serializable {

	private Long ebpcId;
	private Long ebpcEbpjId;
	private Long ebpcEscpId;
	private Long recVer;
	private Long escpId;
	private String escpCode;
	private String escpName;
	private String escpValue;
	private String escpDesc;
	private Long escpParentId;//ESCP_PARENT_ID
	
	public Long getEbpcId() {
		return ebpcId;
	}
	public void setEbpcId(Long ebpcId) {
		this.ebpcId = ebpcId;
	}
	public Long getEbpcEbpjId() {
		return ebpcEbpjId;
	}
	public void setEbpcEbpjId(Long ebpcEbpjId) {
		this.ebpcEbpjId = ebpcEbpjId;
	}
	public Long getEbpcEscpId() {
		return ebpcEscpId;
	}
	public void setEbpcEscpId(Long ebpcEscpId) {
		this.ebpcEscpId = ebpcEscpId;
	}
	public Long getRecVer() {
		return recVer;
	}
	public void setRecVer(Long recVer) {
		this.recVer = recVer;
	}
	public Long getEscpId() {
		return escpId;
	}
	public void setEscpId(Long escpId) {
		this.escpId = escpId;
	}
	public String getEscpCode() {
		return escpCode;
	}
	public void setEscpCode(String escpCode) {
		this.escpCode = escpCode;
	}
	public String getEscpName() {
		return escpName;
	}
	public void setEscpName(String escpName) {
		this.escpName = escpName;
	}
	public String getEscpValue() {
		return escpValue;
	}
	public void setEscpValue(String escpValue) {
		this.escpValue = escpValue;
	}
	public String getEscpDesc() {
		return escpDesc;
	}
	public void setEscpDesc(String escpDesc) {
		this.escpDesc = escpDesc;
	}
	public Long getEscpParentId() {
		return escpParentId;
	}
	public void setEscpParentId(Long escpParentId) {
		this.escpParentId = escpParentId;
	}
	
	
}
