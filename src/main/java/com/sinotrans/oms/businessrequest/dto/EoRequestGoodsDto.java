package com.sinotrans.oms.businessrequest.dto;

import java.util.Date;

/**
 * 
 * <p>Description: 商品信息接收
 *    
 * </p>
 *
 * @author colley
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年9月19日     colley       	               创建
 * 
 * 
 * </pre>
 */
public class EoRequestGoodsDto {
	private String code;//商品编号
	private String name;//商品名称
	private Date updateDate; //最后录入时间
	private Long times;//次数
	private String model;//规格
	private String dealunit;//成交单位
	private String legalunituncode;//法定单位
	private String secondunituncode;//第二单位
	
	private String statcode;//检疫检验编号
	private String classifycnnm;
	private String hsname;//检疫检验名称
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatcode() {
		return statcode;
	}
	public void setStatcode(String statcode) {
		this.statcode = statcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassifycnnm() {
		return classifycnnm;
	}
	public void setClassifycnnm(String classifycnnm) {
		this.classifycnnm = classifycnnm;
	}
	public String getHsname() {
		return hsname;
	}
	public void setHsname(String hsname) {
		this.hsname = hsname;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Long getTimes() {
		return times;
	}
	public void setTimes(Long times) {
		this.times = times;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDealunit() {
		return dealunit;
	}
	public void setDealunit(String dealunit) {
		this.dealunit = dealunit;
	}
	public String getLegalunituncode() {
		return legalunituncode;
	}
	public void setLegalunituncode(String legalunituncode) {
		this.legalunituncode = legalunituncode;
	}
	public String getSecondunituncode() {
		return secondunituncode;
	}
	public void setSecondunituncode(String secondunituncode) {
		this.secondunituncode = secondunituncode;
	}
	

}
