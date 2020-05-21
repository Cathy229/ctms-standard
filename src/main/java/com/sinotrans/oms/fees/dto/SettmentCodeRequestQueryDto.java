package com.sinotrans.oms.fees.dto;

import java.io.Serializable;

/**  
* <p>Title: SettmentCodeRequestQueryDto</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年10月9日  
* @version 1.0  
*/
public class SettmentCodeRequestQueryDto implements Serializable{

	private Long efbfEscoId;
	private Long efbfSettlementEbcuId;
	private String efbfSettlementEbcuCdh;
	private String efbfSettlementEbcuName;
	private String efbfType;
	private String efbfCurrency;
	private Double efbfTaxRate;
	private Double efbfSum;
	private String eoorBmsEsdeDepartmentCode;
	private String eoorBmsEbsmCode;
	public Long getEfbfEscoId() {
		return efbfEscoId;
	}
	public void setEfbfEscoId(Long efbfEscoId) {
		this.efbfEscoId = efbfEscoId;
	}
	public Long getEfbfSettlementEbcuId() {
		return efbfSettlementEbcuId;
	}
	public void setEfbfSettlementEbcuId(Long efbfSettlementEbcuId) {
		this.efbfSettlementEbcuId = efbfSettlementEbcuId;
	}
	public String getEfbfSettlementEbcuCdh() {
		return efbfSettlementEbcuCdh;
	}
	public void setEfbfSettlementEbcuCdh(String efbfSettlementEbcuCdh) {
		this.efbfSettlementEbcuCdh = efbfSettlementEbcuCdh;
	}
	public String getEfbfSettlementEbcuName() {
		return efbfSettlementEbcuName;
	}
	public void setEfbfSettlementEbcuName(String efbfSettlementEbcuName) {
		this.efbfSettlementEbcuName = efbfSettlementEbcuName;
	}
	public String getEfbfType() {
		return efbfType;
	}
	public void setEfbfType(String efbfType) {
		this.efbfType = efbfType;
	}
	public String getEfbfCurrency() {
		return efbfCurrency;
	}
	public void setEfbfCurrency(String efbfCurrency) {
		this.efbfCurrency = efbfCurrency;
	}
	public Double getEfbfTaxRate() {
		return efbfTaxRate;
	}
	public void setEfbfTaxRate(Double efbfTaxRate) {
		this.efbfTaxRate = efbfTaxRate;
	}
	public Double getEfbfSum() {
		return efbfSum;
	}
	public void setEfbfSum(Double efbfSum) {
		this.efbfSum = efbfSum;
	}
	public String getEoorBmsEsdeDepartmentCode() {
		return eoorBmsEsdeDepartmentCode;
	}
	public void setEoorBmsEsdeDepartmentCode(String eoorBmsEsdeDepartmentCode) {
		this.eoorBmsEsdeDepartmentCode = eoorBmsEsdeDepartmentCode;
	}
	public String getEoorBmsEbsmCode() {
		return eoorBmsEbsmCode;
	}
	public void setEoorBmsEbsmCode(String eoorBmsEbsmCode) {
		this.eoorBmsEbsmCode = eoorBmsEbsmCode;
	}
	
	
}
