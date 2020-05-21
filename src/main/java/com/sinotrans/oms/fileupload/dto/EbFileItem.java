package com.sinotrans.oms.fileupload.dto;

import java.util.Date;

import com.sinotrans.framework.orm.model.BaseModel;

/**
 * 
 * @ClassName: EbFileItem
 * @Description: 文件列表信息
 * @author Simon
 * @date 2018年8月24日下午3:13:10
 *
 */
public class EbFileItem extends BaseModel {
    
	private String eoorSinoNo;//外运号
	private Long ebflEoorId;//系统订单号
	private String ebflType;//文件类型
	private String ebflName;//文件名称
	private Date createTime;//上传时间
	private String eoorConsignorEbcuName;//货主
	private String eoeaLoadPortName;//装货港
	private String eoeaDischargePortName;//卸货港
	private String eoorCustomEbcuCode;//委托方
	
	private Date beginUploadTime;//开始上传时间
	private Date endUploadTime;//结束上传时间
	
	
	
	public Date getBeginUploadTime() {
		return beginUploadTime;
	}
	public void setBeginUploadTime(Date beginUploadTime) {
		this.beginUploadTime = beginUploadTime;
	}
	public Date getEndUploadTime() {
		return endUploadTime;
	}
	public void setEndUploadTime(Date endUploadTime) {
		this.endUploadTime = endUploadTime;
	}
	public String getEoorSinoNo() {
		return eoorSinoNo;
	}
	public void setEoorSinoNo(String eoorSinoNo) {
		this.eoorSinoNo = eoorSinoNo;
	}
	public Long getEbflEoorId() {
		return ebflEoorId;
	}
	public void setEbflEoorId(Long ebflEoorId) {
		this.ebflEoorId = ebflEoorId;
	}
	public String getEbflType() {
		return ebflType;
	}
	public void setEbflType(String ebflType) {
		this.ebflType = ebflType;
	}
	public String getEbflName() {
		return ebflName;
	}
	public void setEbflName(String ebflName) {
		this.ebflName = ebflName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getEoorConsignorEbcuName() {
		return eoorConsignorEbcuName;
	}
	public void setEoorConsignorEbcuName(String eoorConsignorEbcuName) {
		this.eoorConsignorEbcuName = eoorConsignorEbcuName;
	}
	public String getEoeaLoadPortName() {
		return eoeaLoadPortName;
	}
	public void setEoeaLoadPortName(String eoeaLoadPortName) {
		this.eoeaLoadPortName = eoeaLoadPortName;
	}
	public String getEoeaDischargePortName() {
		return eoeaDischargePortName;
	}
	public void setEoeaDischargePortName(String eoeaDischargePortName) {
		this.eoeaDischargePortName = eoeaDischargePortName;
	}
	public String getEoorCustomEbcuCode() {
		return eoorCustomEbcuCode;
	}
	public void setEoorCustomEbcuCode(String eoorCustomEbcuCode) {
		this.eoorCustomEbcuCode = eoorCustomEbcuCode;
	}
	
}
