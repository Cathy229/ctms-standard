package com.sinotrans.oms.fileupload.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EbFile
 */
@Entity
@Table(name = "EB_FILE")
public class EbFileModel extends BaseModel implements OperationLog {

	//ebflId
	private Long ebflId;
	//ebflType
	private String ebflType;
	//ebflEoorId
	private Long ebflEoorId;
	//ebflBackOrderId
	private Long ebflBackOrderId;
	//ebflBackOrderNo
	private String ebflBackOrderNo;
	//ebflSignOrderNo
	private String ebflSignOrderNo;
	//ebflName
	private String ebflName;
	//ebflContentBlob
	private byte[] ebflContentBlob;
	//ebflSubstr1
	private String ebflSubstr1;
	//ebflSubstr2
	private String ebflSubstr2;
	//ebflSubstr3
	private String ebflSubstr3;
	//ebflSubstr4
	private String ebflSubstr4;
	//ebflSubstr5
	private String ebflSubstr5;
	//ebflSubstr6
	private String ebflSubstr6;
	//ebflSubstr7
	private String ebflSubstr7;
	//ebflSubstr8
	private String ebflSubstr8;
	//ebflSubdate1
	private Date ebflSubdate1;
	//ebflSubdate2
	private Date ebflSubdate2;
	//ebflSubdate3
	private Date ebflSubdate3;
	//ebflSubdate4
	private Date ebflSubdate4;
	//ebflSubnum1
	private Long ebflSubnum1;
	//ebflSubnum2
	private Long ebflSubnum2;
	//ebflSubnum3
	private Long ebflSubnum3;
	//ebflSubnum4
	private Long ebflSubnum4;
	//recVer
	private Long recVer;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//ebflUploader
	private String ebflUploader;
	//ebflServicerId
	private String ebflServicerId;
	//ebflServicerAddress
	private String ebflServicerAddress;
	//efblRemark
	private String efblRemark;
	//efblElctId
	private Long ebflElctId;

	/**
	 * Get ebflId
	 */
	@Column(name = "EBFL_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbflId() {
		return ebflId;
	}

	/**
	 * Set ebflId
	 */
	public void setEbflId(Long ebflId) {
		this.ebflId = ebflId;
		addValidField("ebflId");
	}

	/**
	 * Get ebflType
	 */
	@Column(name = "EBFL_TYPE")
	public String getEbflType() {
		return ebflType;
	}

	/**
	 * Set ebflType
	 */
	public void setEbflType(String ebflType) {
		this.ebflType = ebflType;
		addValidField("ebflType");
	}

	/**
	 * Get ebflEoorId
	 */
	@Column(name = "EBFL_EOOR_ID")
	public Long getEbflEoorId() {
		return ebflEoorId;
	}

	/**
	 * Set ebflEoorId
	 */
	public void setEbflEoorId(Long ebflEoorId) {
		this.ebflEoorId = ebflEoorId;
		addValidField("ebflEoorId");
	}

	/**
	 * Get ebflBackOrderId
	 */
	@Column(name = "EBFL_BACK_ORDER_ID")
	public Long getEbflBackOrderId() {
		return ebflBackOrderId;
	}

	/**
	 * Set ebflBackOrderId
	 */
	public void setEbflBackOrderId(Long ebflBackOrderId) {
		this.ebflBackOrderId = ebflBackOrderId;
		addValidField("ebflBackOrderId");
	}

	/**
	 * Get ebflBackOrderNo
	 */
	@Column(name = "EBFL_BACK_ORDER_NO")
	public String getEbflBackOrderNo() {
		return ebflBackOrderNo;
	}

	/**
	 * Set ebflBackOrderNo
	 */
	public void setEbflBackOrderNo(String ebflBackOrderNo) {
		this.ebflBackOrderNo = ebflBackOrderNo;
		addValidField("ebflBackOrderNo");
	}

	/**
	 * Get ebflSignOrderNo
	 */
	@Column(name = "EBFL_SIGN_ORDER_NO")
	public String getEbflSignOrderNo() {
		return ebflSignOrderNo;
	}

	/**
	 * Set ebflSignOrderNo
	 */
	public void setEbflSignOrderNo(String ebflSignOrderNo) {
		this.ebflSignOrderNo = ebflSignOrderNo;
		addValidField("ebflSignOrderNo");
	}

	/**
	 * Get ebflName
	 */
	@Column(name = "EBFL_NAME")
	public String getEbflName() {
		return ebflName;
	}

	/**
	 * Set ebflName
	 */
	public void setEbflName(String ebflName) {
		this.ebflName = ebflName;
		addValidField("ebflName");
	}

	/**
	 * Get ebflContentBlob
	 */
	@Column(name = "EBFL_CONTENT_BLOB")
	public byte[] getEbflContentBlob() {
		return ebflContentBlob;
	}

	/**
	 * Set ebflContentBlob
	 */
	public void setEbflContentBlob(byte[] ebflContentBlob) {
		this.ebflContentBlob = ebflContentBlob;
		addValidField("ebflContentBlob");
	}

	/**
	 * Get ebflSubstr1
	 */
	@Column(name = "EBFL_SUBSTR1")
	public String getEbflSubstr1() {
		return ebflSubstr1;
	}

	/**
	 * Set ebflSubstr1
	 */
	public void setEbflSubstr1(String ebflSubstr1) {
		this.ebflSubstr1 = ebflSubstr1;
		addValidField("ebflSubstr1");
	}

	/**
	 * Get ebflSubstr2
	 */
	@Column(name = "EBFL_SUBSTR2")
	public String getEbflSubstr2() {
		return ebflSubstr2;
	}

	/**
	 * Set ebflSubstr2
	 */
	public void setEbflSubstr2(String ebflSubstr2) {
		this.ebflSubstr2 = ebflSubstr2;
		addValidField("ebflSubstr2");
	}

	/**
	 * Get ebflSubstr3
	 */
	@Column(name = "EBFL_SUBSTR3")
	public String getEbflSubstr3() {
		return ebflSubstr3;
	}

	/**
	 * Set ebflSubstr3
	 */
	public void setEbflSubstr3(String ebflSubstr3) {
		this.ebflSubstr3 = ebflSubstr3;
		addValidField("ebflSubstr3");
	}

	/**
	 * Get ebflSubstr4
	 */
	@Column(name = "EBFL_SUBSTR4")
	public String getEbflSubstr4() {
		return ebflSubstr4;
	}

	/**
	 * Set ebflSubstr4
	 */
	public void setEbflSubstr4(String ebflSubstr4) {
		this.ebflSubstr4 = ebflSubstr4;
		addValidField("ebflSubstr4");
	}

	/**
	 * Get ebflSubstr5
	 */
	@Column(name = "EBFL_SUBSTR5")
	public String getEbflSubstr5() {
		return ebflSubstr5;
	}

	/**
	 * Set ebflSubstr5
	 */
	public void setEbflSubstr5(String ebflSubstr5) {
		this.ebflSubstr5 = ebflSubstr5;
		addValidField("ebflSubstr5");
	}

	/**
	 * Get ebflSubstr6
	 */
	@Column(name = "EBFL_SUBSTR6")
	public String getEbflSubstr6() {
		return ebflSubstr6;
	}

	/**
	 * Set ebflSubstr6
	 */
	public void setEbflSubstr6(String ebflSubstr6) {
		this.ebflSubstr6 = ebflSubstr6;
		addValidField("ebflSubstr6");
	}

	/**
	 * Get ebflSubstr7
	 */
	@Column(name = "EBFL_SUBSTR7")
	public String getEbflSubstr7() {
		return ebflSubstr7;
	}

	/**
	 * Set ebflSubstr7
	 */
	public void setEbflSubstr7(String ebflSubstr7) {
		this.ebflSubstr7 = ebflSubstr7;
		addValidField("ebflSubstr7");
	}

	/**
	 * Get ebflSubstr8
	 */
	@Column(name = "EBFL_SUBSTR8")
	public String getEbflSubstr8() {
		return ebflSubstr8;
	}

	/**
	 * Set ebflSubstr8
	 */
	public void setEbflSubstr8(String ebflSubstr8) {
		this.ebflSubstr8 = ebflSubstr8;
		addValidField("ebflSubstr8");
	}

	/**
	 * Get ebflSubdate1
	 */
	@Column(name = "EBFL_SUBDATE1")
	public Date getEbflSubdate1() {
		return ebflSubdate1;
	}

	/**
	 * Set ebflSubdate1
	 */
	public void setEbflSubdate1(Date ebflSubdate1) {
		this.ebflSubdate1 = ebflSubdate1;
		addValidField("ebflSubdate1");
	}

	/**
	 * Get ebflSubdate2
	 */
	@Column(name = "EBFL_SUBDATE2")
	public Date getEbflSubdate2() {
		return ebflSubdate2;
	}

	/**
	 * Set ebflSubdate2
	 */
	public void setEbflSubdate2(Date ebflSubdate2) {
		this.ebflSubdate2 = ebflSubdate2;
		addValidField("ebflSubdate2");
	}

	/**
	 * Get ebflSubdate3
	 */
	@Column(name = "EBFL_SUBDATE3")
	public Date getEbflSubdate3() {
		return ebflSubdate3;
	}

	/**
	 * Set ebflSubdate3
	 */
	public void setEbflSubdate3(Date ebflSubdate3) {
		this.ebflSubdate3 = ebflSubdate3;
		addValidField("ebflSubdate3");
	}

	/**
	 * Get ebflSubdate4
	 */
	@Column(name = "EBFL_SUBDATE4")
	public Date getEbflSubdate4() {
		return ebflSubdate4;
	}

	/**
	 * Set ebflSubdate4
	 */
	public void setEbflSubdate4(Date ebflSubdate4) {
		this.ebflSubdate4 = ebflSubdate4;
		addValidField("ebflSubdate4");
	}

	/**
	 * Get ebflSubnum1
	 */
	@Column(name = "EBFL_SUBNUM1")
	public Long getEbflSubnum1() {
		return ebflSubnum1;
	}

	/**
	 * Set ebflSubnum1
	 */
	public void setEbflSubnum1(Long ebflSubnum1) {
		this.ebflSubnum1 = ebflSubnum1;
		addValidField("ebflSubnum1");
	}

	/**
	 * Get ebflSubnum2
	 */
	@Column(name = "EBFL_SUBNUM2")
	public Long getEbflSubnum2() {
		return ebflSubnum2;
	}

	/**
	 * Set ebflSubnum2
	 */
	public void setEbflSubnum2(Long ebflSubnum2) {
		this.ebflSubnum2 = ebflSubnum2;
		addValidField("ebflSubnum2");
	}

	/**
	 * Get ebflSubnum3
	 */
	@Column(name = "EBFL_SUBNUM3")
	public Long getEbflSubnum3() {
		return ebflSubnum3;
	}

	/**
	 * Set ebflSubnum3
	 */
	public void setEbflSubnum3(Long ebflSubnum3) {
		this.ebflSubnum3 = ebflSubnum3;
		addValidField("ebflSubnum3");
	}

	/**
	 * Get ebflSubnum4
	 */
	@Column(name = "EBFL_SUBNUM4")
	public Long getEbflSubnum4() {
		return ebflSubnum4;
	}

	/**
	 * Set ebflSubnum4
	 */
	public void setEbflSubnum4(Long ebflSubnum4) {
		this.ebflSubnum4 = ebflSubnum4;
		addValidField("ebflSubnum4");
	}

	/**
	 * Get recVer
	 */
	@Column(name = "REC_VER")
	@Version
	public Long getRecVer() {
		return recVer;
	}

	/**
	 * Set recVer
	 */
	public void setRecVer(Long recVer) {
		this.recVer = recVer;
		addValidField("recVer");
	}

	/**
	 * Get creator
	 */
	@Column(name = "CREATOR")
	public String getCreator() {
		return creator;
	}

	/**
	 * Set creator
	 */
	public void setCreator(String creator) {
		this.creator = creator;
		addValidField("creator");
	}

	/**
	 * Get createTime
	 */
	@Column(name = "CREATE_TIME")
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * Set createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		addValidField("createTime");
	}

	/**
	 * Get modifier
	 */
	@Column(name = "MODIFIER")
	public String getModifier() {
		return modifier;
	}

	/**
	 * Set modifier
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
		addValidField("modifier");
	}

	/**
	 * Get modifyTime
	 */
	@Column(name = "MODIFY_TIME")
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * Set modifyTime
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
		addValidField("modifyTime");
	}

	/**
	 * Get ebflUploader
	 */
	@Column(name = "EBFL_UPLOADER")
	public String getEbflUploader() {
		return ebflUploader;
	}

	/**
	 * Set ebflUploader
	 */
	public void setEbflUploader(String ebflUploader) {
		this.ebflUploader = ebflUploader;
		addValidField("ebflUploader");
	}

	/**
	 * Get ebflServicerId
	 */
	@Column(name = "EBFL_SERVICER_ID")
	public String getEbflServicerId() {
		return ebflServicerId;
	}

	/**
	 * Set ebflServicerId
	 */
	public void setEbflServicerId(String ebflServicerId) {
		this.ebflServicerId = ebflServicerId;
		addValidField("ebflServicerId");
	}

	/**
	 * Get ebflServicerAddress
	 */
	@Column(name = "EBFL_SERVICER_ADDRESS")
	public String getEbflServicerAddress() {
		return ebflServicerAddress;
	}

	/**
	 * Set ebflServicerAddress
	 */
	public void setEbflServicerAddress(String ebflServicerAddress) {
		this.ebflServicerAddress = ebflServicerAddress;
		addValidField("ebflServicerAddress");
	}

	/**
	 * Get efblRemark
	 */
	@Column(name = "EFBL_REMARK")
	public String getEfblRemark() {
		return efblRemark;
	}

	/**
	 * Set efblRemark
	 */
	public void setEfblRemark(String efblRemark) {
		this.efblRemark = efblRemark;
		addValidField("efblRemark");
	}
	/**
	 * Get efblElctId
	 */
	@Column(name = "EBFL_ELCT_ID")
	public Long getEbflElctId() {
		return ebflElctId;
	}

	/**
	 * Set efblElctId
	 */
	public void setEbflElctId(Long ebflElctId) {
		this.ebflElctId = ebflElctId;
		addValidField("ebflElctId");
	}
}
