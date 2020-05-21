package com.sinotrans.oms.fees.dto;

import java.io.Serializable;

/**  
* <p>Title: UpToBmsCheckQueryDto</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月15日  
* @version 1.0  
*/
public class UpToBmsCheckQueryDto  implements Serializable{

	//项目BMS票据代码
		private String ebpjBmsEbbtCode;
		//项目BMS销售人员代码
		private String ebpjBmsEbsmCode;
		//项目BMS部门代码
		private String ebpjBmsEsdeDepartmentCode;
		//项目BMS客户代码
		private String ebpjBmsAEbcuCustomerNo;
		//项目代码
		private String ebpjProjectCode;
		//是否默认销售人员
		private String esusIsSalesman;
		//销售人员代码
		private String esusBmsEbsmCode;
		//部门表默认的销售人员
		private String esdeDefaultBmsEbsmCode;
		//订单委托方
	    private String eoorConsignorEbcuCode;
		//项目统计组
	    private String ebpjFCode;
	    //部门财务代码
	    private String  esdeBmsDepartmentCode;
	    //订单表中的项目组代码
	    private String eoorFCode;
		public String getEbpjBmsEbbtCode() {
			return ebpjBmsEbbtCode;
		}
		public void setEbpjBmsEbbtCode(String ebpjBmsEbbtCode) {
			this.ebpjBmsEbbtCode = ebpjBmsEbbtCode;
		}
		public String getEbpjBmsEbsmCode() {
			return ebpjBmsEbsmCode;
		}
		public void setEbpjBmsEbsmCode(String ebpjBmsEbsmCode) {
			this.ebpjBmsEbsmCode = ebpjBmsEbsmCode;
		}
		public String getEbpjBmsEsdeDepartmentCode() {
			return ebpjBmsEsdeDepartmentCode;
		}
		public void setEbpjBmsEsdeDepartmentCode(String ebpjBmsEsdeDepartmentCode) {
			this.ebpjBmsEsdeDepartmentCode = ebpjBmsEsdeDepartmentCode;
		}
		public String getEbpjBmsAEbcuCustomerNo() {
			return ebpjBmsAEbcuCustomerNo;
		}
		public void setEbpjBmsAEbcuCustomerNo(String ebpjBmsAEbcuCustomerNo) {
			this.ebpjBmsAEbcuCustomerNo = ebpjBmsAEbcuCustomerNo;
		}
		public String getEbpjProjectCode() {
			return ebpjProjectCode;
		}
		public void setEbpjProjectCode(String ebpjProjectCode) {
			this.ebpjProjectCode = ebpjProjectCode;
		}
		public String getEsusIsSalesman() {
			return esusIsSalesman;
		}
		public void setEsusIsSalesman(String esusIsSalesman) {
			this.esusIsSalesman = esusIsSalesman;
		}
		public String getEsusBmsEbsmCode() {
			return esusBmsEbsmCode;
		}
		public void setEsusBmsEbsmCode(String esusBmsEbsmCode) {
			this.esusBmsEbsmCode = esusBmsEbsmCode;
		}
		public String getEsdeDefaultBmsEbsmCode() {
			return esdeDefaultBmsEbsmCode;
		}
		public void setEsdeDefaultBmsEbsmCode(String esdeDefaultBmsEbsmCode) {
			this.esdeDefaultBmsEbsmCode = esdeDefaultBmsEbsmCode;
		}
		public String getEoorConsignorEbcuCode() {
			return eoorConsignorEbcuCode;
		}
		public void setEoorConsignorEbcuCode(String eoorConsignorEbcuCode) {
			this.eoorConsignorEbcuCode = eoorConsignorEbcuCode;
		}
		public String getEbpjFCode() {
			return ebpjFCode;
		}
		public void setEbpjFCode(String ebpjFCode) {
			this.ebpjFCode = ebpjFCode;
		}
		public String getEsdeBmsDepartmentCode() {
			return esdeBmsDepartmentCode;
		}
		public void setEsdeBmsDepartmentCode(String esdeBmsDepartmentCode) {
			this.esdeBmsDepartmentCode = esdeBmsDepartmentCode;
		}
		public String getEoorFCode() {
			return eoorFCode;
		}
		public void setEoorFCode(String eoorFCode) {
			this.eoorFCode = eoorFCode;
		}
	    
}
