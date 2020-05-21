package com.sinotrans.oms.fees.dto;

import java.io.Serializable;

/**  
* <p>Title: SettmentCodeRequestParamDto</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年10月9日  
* @version 1.0  
*/
public class SettmentCodeRequestParamDto implements Serializable {
	// 公司代码
		private String efrvEscoCompanyNo;
		// 业务代码
		private String efrvEbbuCode = "OMS01";
		//
		private String efrvEfhiDesc;
		// 应收应付标识
		private String efrvIsRp;
		// 开票预约号
		private String efrvInvoiceNumber;
		// 费用ID
		private String efrvEfepSourceIds;
		// 费用数量
		private String efrvLineCount;
		// 上传人部门代码
		private String efrvDeptCode;
		// 销售人员代码
		private String efrvSalesCode;
		// 总金额
		private String efrvAmt;
		// 申请人名称
		private String efrvApplyUsername;
		// 申请人Email
		private String efrvApplyEmail;
		// 申请时间
		private Long efrvApplyTime;
		// 结算对象代码
		private String efrvEbcuCdhcode;
		private String efrvEbcuCode;
		// 结算对象名称
		private String efrvEbcuName;
		// 币种
		private String efrvCurrency;
		// 汇率
		private String efrvExchangeRate;
		// 税率
		private String efrvTaxrate;
		// 发票内容
		private String efrvEfhiContents;
		// 发票类型名称
		private String efrvEbitName;

		private String efrvEbitType;

		private String efrvInvoiceCargo;

		private String efrvPayeeUsername;

		private String efrvPayeeTime;

		private String efrvReviewUsername;

		private String efrvReviewTime;

		public String getEfrvEscoCompanyNo() {
			return efrvEscoCompanyNo;
		}

		public void setEfrvEscoCompanyNo(String efrvEscoCompanyNo) {
			this.efrvEscoCompanyNo = efrvEscoCompanyNo;
		}

		public String getEfrvEbbuCode() {
			return efrvEbbuCode;
		}

		public void setEfrvEbbuCode(String efrvEbbuCode) {
			this.efrvEbbuCode = efrvEbbuCode;
		}

		public String getEfrvEfhiDesc() {
			return efrvEfhiDesc;
		}

		public void setEfrvEfhiDesc(String efrvEfhiDesc) {
			this.efrvEfhiDesc = efrvEfhiDesc;
		}

		public String getEfrvIsRp() {
			return efrvIsRp;
		}

		public void setEfrvIsRp(String efrvIsRp) {
			this.efrvIsRp = efrvIsRp;
		}

		public String getEfrvInvoiceNumber() {
			return efrvInvoiceNumber;
		}

		public void setEfrvInvoiceNumber(String efrvInvoiceNumber) {
			this.efrvInvoiceNumber = efrvInvoiceNumber;
		}

		public String getEfrvEfepSourceIds() {
			return efrvEfepSourceIds;
		}

		public void setEfrvEfepSourceIds(String efrvEfepSourceIds) {
			this.efrvEfepSourceIds = efrvEfepSourceIds;
		}

		public String getEfrvLineCount() {
			return efrvLineCount;
		}

		public void setEfrvLineCount(String efrvLineCount) {
			this.efrvLineCount = efrvLineCount;
		}

		public String getEfrvDeptCode() {
			return efrvDeptCode;
		}

		public void setEfrvDeptCode(String efrvDeptCode) {
			this.efrvDeptCode = efrvDeptCode;
		}

		public String getEfrvSalesCode() {
			return efrvSalesCode;
		}

		public void setEfrvSalesCode(String efrvSalesCode) {
			this.efrvSalesCode = efrvSalesCode;
		}

		public String getEfrvAmt() {
			return efrvAmt;
		}

		public void setEfrvAmt(String efrvAmt) {
			this.efrvAmt = efrvAmt;
		}

		public String getEfrvApplyUsername() {
			return efrvApplyUsername;
		}

		public void setEfrvApplyUsername(String efrvApplyUsername) {
			this.efrvApplyUsername = efrvApplyUsername;
		}

		public String getEfrvApplyEmail() {
			return efrvApplyEmail;
		}

		public void setEfrvApplyEmail(String efrvApplyEmail) {
			this.efrvApplyEmail = efrvApplyEmail;
		}

		public Long getEfrvApplyTime() {
			return efrvApplyTime;
		}

		public void setEfrvApplyTime(Long efrvApplyTime) {
			this.efrvApplyTime = efrvApplyTime;
		}

		public String getEfrvEbcuCdhcode() {
			return efrvEbcuCdhcode;
		}

		public void setEfrvEbcuCdhcode(String efrvEbcuCdhcode) {
			this.efrvEbcuCdhcode = efrvEbcuCdhcode;
		}

		public String getEfrvEbcuCode() {
			return efrvEbcuCode;
		}

		public void setEfrvEbcuCode(String efrvEbcuCode) {
			this.efrvEbcuCode = efrvEbcuCode;
		}

		public String getEfrvEbcuName() {
			return efrvEbcuName;
		}

		public void setEfrvEbcuName(String efrvEbcuName) {
			this.efrvEbcuName = efrvEbcuName;
		}

		public String getEfrvCurrency() {
			return efrvCurrency;
		}

		public void setEfrvCurrency(String efrvCurrency) {
			this.efrvCurrency = efrvCurrency;
		}

		public String getEfrvExchangeRate() {
			return efrvExchangeRate;
		}

		public void setEfrvExchangeRate(String efrvExchangeRate) {
			this.efrvExchangeRate = efrvExchangeRate;
		}

		public String getEfrvTaxrate() {
			return efrvTaxrate;
		}

		public void setEfrvTaxrate(String efrvTaxrate) {
			this.efrvTaxrate = efrvTaxrate;
		}

		public String getEfrvEfhiContents() {
			return efrvEfhiContents;
		}

		public void setEfrvEfhiContents(String efrvEfhiContents) {
			this.efrvEfhiContents = efrvEfhiContents;
		}

		public String getEfrvEbitName() {
			return efrvEbitName;
		}

		public void setEfrvEbitName(String efrvEbitName) {
			this.efrvEbitName = efrvEbitName;
		}

		public String getEfrvEbitType() {
			return efrvEbitType;
		}

		public void setEfrvEbitType(String efrvEbitType) {
			this.efrvEbitType = efrvEbitType;
		}

		public String getEfrvInvoiceCargo() {
			return efrvInvoiceCargo;
		}

		public void setEfrvInvoiceCargo(String efrvInvoiceCargo) {
			this.efrvInvoiceCargo = efrvInvoiceCargo;
		}

		public String getEfrvPayeeUsername() {
			return efrvPayeeUsername;
		}

		public void setEfrvPayeeUsername(String efrvPayeeUsername) {
			this.efrvPayeeUsername = efrvPayeeUsername;
		}

		public String getEfrvPayeeTime() {
			return efrvPayeeTime;
		}

		public void setEfrvPayeeTime(String efrvPayeeTime) {
			this.efrvPayeeTime = efrvPayeeTime;
		}

		public String getEfrvReviewUsername() {
			return efrvReviewUsername;
		}

		public void setEfrvReviewUsername(String efrvReviewUsername) {
			this.efrvReviewUsername = efrvReviewUsername;
		}

		public String getEfrvReviewTime() {
			return efrvReviewTime;
		}

		public void setEfrvReviewTime(String efrvReviewTime) {
			this.efrvReviewTime = efrvReviewTime;
		}
		
		
}
