package com.sinotrans.oms.eoorder.dto;

import java.io.Serializable;
import java.util.Date;

public class EoOrderInvoiceBackQueryItem implements Serializable{

	private Long eiibId;
	private Long eiibEscoId;
	private String eiibEscoCompanyNo;
	private String eiibEbbuCode;
	private String eiibEoimSourceId;
	private String eiibEfepSourceId;
	private String eiibInvoiceNumber;
	private String eiibInvoiceCode;
	private Double eiibInvoicedAmt;
	private Double eiibAmt;
	private Double eiibFee;
	private Double eiibTaxrate;
	private Double eiibTax;
	private Date eiibIssueDate;
	private String eiibDrawerEsusUsername;
	public Long getEiibId() {
		return eiibId;
	}
	public void setEiibId(Long eiibId) {
		this.eiibId = eiibId;
	}
	public Long getEiibEscoId() {
		return eiibEscoId;
	}
	public void setEiibEscoId(Long eiibEscoId) {
		this.eiibEscoId = eiibEscoId;
	}
	public String getEiibEscoCompanyNo() {
		return eiibEscoCompanyNo;
	}
	public void setEiibEscoCompanyNo(String eiibEscoCompanyNo) {
		this.eiibEscoCompanyNo = eiibEscoCompanyNo;
	}
	public String getEiibEbbuCode() {
		return eiibEbbuCode;
	}
	public void setEiibEbbuCode(String eiibEbbuCode) {
		this.eiibEbbuCode = eiibEbbuCode;
	}
	public String getEiibEoimSourceId() {
		return eiibEoimSourceId;
	}
	public void setEiibEoimSourceId(String eiibEoimSourceId) {
		this.eiibEoimSourceId = eiibEoimSourceId;
	}
	public String getEiibEfepSourceId() {
		return eiibEfepSourceId;
	}
	public void setEiibEfepSourceId(String eiibEfepSourceId) {
		this.eiibEfepSourceId = eiibEfepSourceId;
	}
	public String getEiibInvoiceNumber() {
		return eiibInvoiceNumber;
	}
	public void setEiibInvoiceNumber(String eiibInvoiceNumber) {
		this.eiibInvoiceNumber = eiibInvoiceNumber;
	}
	public String getEiibInvoiceCode() {
		return eiibInvoiceCode;
	}
	public void setEiibInvoiceCode(String eiibInvoiceCode) {
		this.eiibInvoiceCode = eiibInvoiceCode;
	}
	public Double getEiibInvoicedAmt() {
		return eiibInvoicedAmt;
	}
	public void setEiibInvoicedAmt(Double eiibInvoicedAmt) {
		this.eiibInvoicedAmt = eiibInvoicedAmt;
	}
	public Double getEiibAmt() {
		return eiibAmt;
	}
	public void setEiibAmt(Double eiibAmt) {
		this.eiibAmt = eiibAmt;
	}
	public Double getEiibFee() {
		return eiibFee;
	}
	public void setEiibFee(Double eiibFee) {
		this.eiibFee = eiibFee;
	}
	public Double getEiibTaxrate() {
		return eiibTaxrate;
	}
	public void setEiibTaxrate(Double eiibTaxrate) {
		this.eiibTaxrate = eiibTaxrate;
	}
	public Double getEiibTax() {
		return eiibTax;
	}
	public void setEiibTax(Double eiibTax) {
		this.eiibTax = eiibTax;
	}
	public Date getEiibIssueDate() {
		return eiibIssueDate;
	}
	public void setEiibIssueDate(Date eiibIssueDate) {
		this.eiibIssueDate = eiibIssueDate;
	}
	public String getEiibDrawerEsusUsername() {
		return eiibDrawerEsusUsername;
	}
	public void setEiibDrawerEsusUsername(String eiibDrawerEsusUsername) {
		this.eiibDrawerEsusUsername = eiibDrawerEsusUsername;
	}


}
