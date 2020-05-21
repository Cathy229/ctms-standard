package com.sinotrans.oms.datainteraction.model;

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
 * Model class for EaiMessageFile
 */
@Entity
@Table(name = "EAI_MESSAGE_FILE")
public class EaiMessageFileModel extends BaseModel implements OperationLog {

	//eaifId
	private Long eaifId;
	//eaifType
	private String eaifType;
	//eaifETime
	private Date eaifETime;
	//eaifSysCode
	private String eaifSysCode;
	//eaifEbbuId
	private Long eaifEbbuId;
	//eaifEbbuNameCn
	private String eaifEbbuNameCn;
	//eaifEbbuCode
	private String eaifEbbuCode;
	//eaifSendMethod
	private String eaifSendMethod;
	//eaifSender
	private String eaifSender;
	//eaifReceiver
	private String eaifReceiver;
	//eaifMessageType
	private String eaifMessageType;
	//eaifFileName
	private String eaifFileName;
	//eaifIsZip
	private String eaifIsZip;
	//eaifIsBase64
	private String eaifIsBase64;
	//eaifEncoding
	private String eaifEncoding;
	//eaifContent
	private byte[] eaifContent;
	//eaifSubstr1
	private String eaifSubstr1;
	//eaifSubstr2
	private String eaifSubstr2;
	//eaifSubstr3
	private String eaifSubstr3;
	//eaifSubstr4
	private String eaifSubstr4;
	//eaifSubstr5
	private String eaifSubstr5;
	//eaifSubstr6
	private String eaifSubstr6;
	//eaifSubstr7
	private String eaifSubstr7;
	//eaifSubstr8
	private String eaifSubstr8;
	//eaifSubdate1
	private Date eaifSubdate1;
	//eaifSubdate2
	private Date eaifSubdate2;
	//eaifSubdate3
	private Date eaifSubdate3;
	//eaifSubdate4
	private Date eaifSubdate4;
	//eaifSubnum1
	private Long eaifSubnum1;
	//eaifSubnum2
	private Long eaifSubnum2;
	//eaifSubnum3
	private Long eaifSubnum3;
	//eaifSubnum4
	private Long eaifSubnum4;
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

	/**
	 * Get eaifId
	 */
	@Column(name = "EAIF_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEaifId() {
		return eaifId;
	}

	/**
	 * Set eaifId
	 */
	public void setEaifId(Long eaifId) {
		this.eaifId = eaifId;
		addValidField("eaifId");
	}

	/**
	 * Get eaifType
	 */
	@Column(name = "EAIF_TYPE")
	public String getEaifType() {
		return eaifType;
	}

	/**
	 * Set eaifType
	 */
	public void setEaifType(String eaifType) {
		this.eaifType = eaifType;
		addValidField("eaifType");
	}

	/**
	 * Get eaifETime
	 */
	@Column(name = "EAIF_E_TIME")
	public Date getEaifETime() {
		return eaifETime;
	}

	/**
	 * Set eaifETime
	 */
	public void setEaifETime(Date eaifETime) {
		this.eaifETime = eaifETime;
		addValidField("eaifETime");
	}

	/**
	 * Get eaifSysCode
	 */
	@Column(name = "EAIF_SYS_CODE")
	public String getEaifSysCode() {
		return eaifSysCode;
	}

	/**
	 * Set eaifSysCode
	 */
	public void setEaifSysCode(String eaifSysCode) {
		this.eaifSysCode = eaifSysCode;
		addValidField("eaifSysCode");
	}

	/**
	 * Get eaifEbbuId
	 */
	@Column(name = "EAIF_EBBU_ID")
	public Long getEaifEbbuId() {
		return eaifEbbuId;
	}

	/**
	 * Set eaifEbbuId
	 */
	public void setEaifEbbuId(Long eaifEbbuId) {
		this.eaifEbbuId = eaifEbbuId;
		addValidField("eaifEbbuId");
	}

	/**
	 * Get eaifEbbuNameCn
	 */
	@Column(name = "EAIF_EBBU_NAME_CN")
	public String getEaifEbbuNameCn() {
		return eaifEbbuNameCn;
	}

	/**
	 * Set eaifEbbuNameCn
	 */
	public void setEaifEbbuNameCn(String eaifEbbuNameCn) {
		this.eaifEbbuNameCn = eaifEbbuNameCn;
		addValidField("eaifEbbuNameCn");
	}

	/**
	 * Get eaifEbbuCode
	 */
	@Column(name = "EAIF_EBBU_CODE")
	public String getEaifEbbuCode() {
		return eaifEbbuCode;
	}

	/**
	 * Set eaifEbbuCode
	 */
	public void setEaifEbbuCode(String eaifEbbuCode) {
		this.eaifEbbuCode = eaifEbbuCode;
		addValidField("eaifEbbuCode");
	}

	/**
	 * Get eaifSendMethod
	 */
	@Column(name = "EAIF_SEND_METHOD")
	public String getEaifSendMethod() {
		return eaifSendMethod;
	}

	/**
	 * Set eaifSendMethod
	 */
	public void setEaifSendMethod(String eaifSendMethod) {
		this.eaifSendMethod = eaifSendMethod;
		addValidField("eaifSendMethod");
	}

	/**
	 * Get eaifSender
	 */
	@Column(name = "EAIF_SENDER")
	public String getEaifSender() {
		return eaifSender;
	}

	/**
	 * Set eaifSender
	 */
	public void setEaifSender(String eaifSender) {
		this.eaifSender = eaifSender;
		addValidField("eaifSender");
	}

	/**
	 * Get eaifReceiver
	 */
	@Column(name = "EAIF_RECEIVER")
	public String getEaifReceiver() {
		return eaifReceiver;
	}

	/**
	 * Set eaifReceiver
	 */
	public void setEaifReceiver(String eaifReceiver) {
		this.eaifReceiver = eaifReceiver;
		addValidField("eaifReceiver");
	}

	/**
	 * Get eaifMessageType
	 */
	@Column(name = "EAIF_MESSAGE_TYPE")
	public String getEaifMessageType() {
		return eaifMessageType;
	}

	/**
	 * Set eaifMessageType
	 */
	public void setEaifMessageType(String eaifMessageType) {
		this.eaifMessageType = eaifMessageType;
		addValidField("eaifMessageType");
	}

	/**
	 * Get eaifFileName
	 */
	@Column(name = "EAIF_FILE_NAME")
	public String getEaifFileName() {
		return eaifFileName;
	}

	/**
	 * Set eaifFileName
	 */
	public void setEaifFileName(String eaifFileName) {
		this.eaifFileName = eaifFileName;
		addValidField("eaifFileName");
	}

	/**
	 * Get eaifIsZip
	 */
	@Column(name = "EAIF_IS_ZIP")
	public String getEaifIsZip() {
		return eaifIsZip;
	}

	/**
	 * Set eaifIsZip
	 */
	public void setEaifIsZip(String eaifIsZip) {
		this.eaifIsZip = eaifIsZip;
		addValidField("eaifIsZip");
	}

	/**
	 * Get eaifIsBase64
	 */
	@Column(name = "EAIF_IS_BASE64")
	public String getEaifIsBase64() {
		return eaifIsBase64;
	}

	/**
	 * Set eaifIsBase64
	 */
	public void setEaifIsBase64(String eaifIsBase64) {
		this.eaifIsBase64 = eaifIsBase64;
		addValidField("eaifIsBase64");
	}

	/**
	 * Get eaifEncoding
	 */
	@Column(name = "EAIF_ENCODING")
	public String getEaifEncoding() {
		return eaifEncoding;
	}

	/**
	 * Set eaifEncoding
	 */
	public void setEaifEncoding(String eaifEncoding) {
		this.eaifEncoding = eaifEncoding;
		addValidField("eaifEncoding");
	}

	/**
	 * Get eaifContent
	 */
	@Column(name = "EAIF_CONTENT")
	public byte[] getEaifContent() {
		return eaifContent;
	}

	/**
	 * Set eaifContent
	 */
	public void setEaifContent(byte[] eaifContent) {
		this.eaifContent = eaifContent;
		addValidField("eaifContent");
	}

	/**
	 * Get eaifSubstr1
	 */
	@Column(name = "EAIF_SUBSTR1")
	public String getEaifSubstr1() {
		return eaifSubstr1;
	}

	/**
	 * Set eaifSubstr1
	 */
	public void setEaifSubstr1(String eaifSubstr1) {
		this.eaifSubstr1 = eaifSubstr1;
		addValidField("eaifSubstr1");
	}

	/**
	 * Get eaifSubstr2
	 */
	@Column(name = "EAIF_SUBSTR2")
	public String getEaifSubstr2() {
		return eaifSubstr2;
	}

	/**
	 * Set eaifSubstr2
	 */
	public void setEaifSubstr2(String eaifSubstr2) {
		this.eaifSubstr2 = eaifSubstr2;
		addValidField("eaifSubstr2");
	}

	/**
	 * Get eaifSubstr3
	 */
	@Column(name = "EAIF_SUBSTR3")
	public String getEaifSubstr3() {
		return eaifSubstr3;
	}

	/**
	 * Set eaifSubstr3
	 */
	public void setEaifSubstr3(String eaifSubstr3) {
		this.eaifSubstr3 = eaifSubstr3;
		addValidField("eaifSubstr3");
	}

	/**
	 * Get eaifSubstr4
	 */
	@Column(name = "EAIF_SUBSTR4")
	public String getEaifSubstr4() {
		return eaifSubstr4;
	}

	/**
	 * Set eaifSubstr4
	 */
	public void setEaifSubstr4(String eaifSubstr4) {
		this.eaifSubstr4 = eaifSubstr4;
		addValidField("eaifSubstr4");
	}

	/**
	 * Get eaifSubstr5
	 */
	@Column(name = "EAIF_SUBSTR5")
	public String getEaifSubstr5() {
		return eaifSubstr5;
	}

	/**
	 * Set eaifSubstr5
	 */
	public void setEaifSubstr5(String eaifSubstr5) {
		this.eaifSubstr5 = eaifSubstr5;
		addValidField("eaifSubstr5");
	}

	/**
	 * Get eaifSubstr6
	 */
	@Column(name = "EAIF_SUBSTR6")
	public String getEaifSubstr6() {
		return eaifSubstr6;
	}

	/**
	 * Set eaifSubstr6
	 */
	public void setEaifSubstr6(String eaifSubstr6) {
		this.eaifSubstr6 = eaifSubstr6;
		addValidField("eaifSubstr6");
	}

	/**
	 * Get eaifSubstr7
	 */
	@Column(name = "EAIF_SUBSTR7")
	public String getEaifSubstr7() {
		return eaifSubstr7;
	}

	/**
	 * Set eaifSubstr7
	 */
	public void setEaifSubstr7(String eaifSubstr7) {
		this.eaifSubstr7 = eaifSubstr7;
		addValidField("eaifSubstr7");
	}

	/**
	 * Get eaifSubstr8
	 */
	@Column(name = "EAIF_SUBSTR8")
	public String getEaifSubstr8() {
		return eaifSubstr8;
	}

	/**
	 * Set eaifSubstr8
	 */
	public void setEaifSubstr8(String eaifSubstr8) {
		this.eaifSubstr8 = eaifSubstr8;
		addValidField("eaifSubstr8");
	}

	/**
	 * Get eaifSubdate1
	 */
	@Column(name = "EAIF_SUBDATE1")
	public Date getEaifSubdate1() {
		return eaifSubdate1;
	}

	/**
	 * Set eaifSubdate1
	 */
	public void setEaifSubdate1(Date eaifSubdate1) {
		this.eaifSubdate1 = eaifSubdate1;
		addValidField("eaifSubdate1");
	}

	/**
	 * Get eaifSubdate2
	 */
	@Column(name = "EAIF_SUBDATE2")
	public Date getEaifSubdate2() {
		return eaifSubdate2;
	}

	/**
	 * Set eaifSubdate2
	 */
	public void setEaifSubdate2(Date eaifSubdate2) {
		this.eaifSubdate2 = eaifSubdate2;
		addValidField("eaifSubdate2");
	}

	/**
	 * Get eaifSubdate3
	 */
	@Column(name = "EAIF_SUBDATE3")
	public Date getEaifSubdate3() {
		return eaifSubdate3;
	}

	/**
	 * Set eaifSubdate3
	 */
	public void setEaifSubdate3(Date eaifSubdate3) {
		this.eaifSubdate3 = eaifSubdate3;
		addValidField("eaifSubdate3");
	}

	/**
	 * Get eaifSubdate4
	 */
	@Column(name = "EAIF_SUBDATE4")
	public Date getEaifSubdate4() {
		return eaifSubdate4;
	}

	/**
	 * Set eaifSubdate4
	 */
	public void setEaifSubdate4(Date eaifSubdate4) {
		this.eaifSubdate4 = eaifSubdate4;
		addValidField("eaifSubdate4");
	}

	/**
	 * Get eaifSubnum1
	 */
	@Column(name = "EAIF_SUBNUM1")
	public Long getEaifSubnum1() {
		return eaifSubnum1;
	}

	/**
	 * Set eaifSubnum1
	 */
	public void setEaifSubnum1(Long eaifSubnum1) {
		this.eaifSubnum1 = eaifSubnum1;
		addValidField("eaifSubnum1");
	}

	/**
	 * Get eaifSubnum2
	 */
	@Column(name = "EAIF_SUBNUM2")
	public Long getEaifSubnum2() {
		return eaifSubnum2;
	}

	/**
	 * Set eaifSubnum2
	 */
	public void setEaifSubnum2(Long eaifSubnum2) {
		this.eaifSubnum2 = eaifSubnum2;
		addValidField("eaifSubnum2");
	}

	/**
	 * Get eaifSubnum3
	 */
	@Column(name = "EAIF_SUBNUM3")
	public Long getEaifSubnum3() {
		return eaifSubnum3;
	}

	/**
	 * Set eaifSubnum3
	 */
	public void setEaifSubnum3(Long eaifSubnum3) {
		this.eaifSubnum3 = eaifSubnum3;
		addValidField("eaifSubnum3");
	}

	/**
	 * Get eaifSubnum4
	 */
	@Column(name = "EAIF_SUBNUM4")
	public Long getEaifSubnum4() {
		return eaifSubnum4;
	}

	/**
	 * Set eaifSubnum4
	 */
	public void setEaifSubnum4(Long eaifSubnum4) {
		this.eaifSubnum4 = eaifSubnum4;
		addValidField("eaifSubnum4");
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

}
