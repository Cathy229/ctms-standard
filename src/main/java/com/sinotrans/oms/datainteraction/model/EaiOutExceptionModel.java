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
 * Model class for EaiOutException
 */
@Entity
@Table(name = "EAI_OUT_EXCEPTION")
public class EaiOutExceptionModel extends BaseModel implements OperationLog {

	//eaioId
	private Long eaioId;
	//eaioEscoId
	private String eaioEscoId;
	//eaioEbpjId
	private String eaioEbpjId;
	//eaioType
	private String eaioType;
	//eaioDescription
	private String eaioDescription;
	//eaioContent
	private byte[] eaioContent;
	//eaioTablename
	private String eaioTablename;
	//eaioItemid
	private Long eaioItemid;
	//eaioETime
	private Date eaioETime;
	//eaioIsResend
	private String eaioIsResend;
	//eaioRTime
	private Date eaioRTime;
	//eaioSysCode
	private String eaioSysCode;
	//eaioEbbuId
	private Long eaioEbbuId;
	//eaioEbbuNameCn
	private String eaioEbbuNameCn;
	//eaioEbbuCode
	private String eaioEbbuCode;
	//eaioSendMethod
	private String eaioSendMethod;
	//eaioSender
	private String eaioSender;
	//eaioReceiver
	private String eaioReceiver;
	//eaioMessageType
	private String eaioMessageType;
	//eaioFileName
	private String eaioFileName;
	//eaioIsZip
	private String eaioIsZip;
	//eaioIsBase64
	private String eaioIsBase64;
	//eaioEncoding
	private String eaioEncoding;
	//eaioSubstr1
	private String eaioSubstr1;
	//eaioSubstr2
	private String eaioSubstr2;
	//eaioSubstr3
	private String eaioSubstr3;
	//eaioSubstr4
	private String eaioSubstr4;
	//eaioSubstr5
	private String eaioSubstr5;
	//eaioSubstr6
	private String eaioSubstr6;
	//eaioSubstr7
	private String eaioSubstr7;
	//eaioSubstr8
	private String eaioSubstr8;
	//eaioSubdate1
	private Date eaioSubdate1;
	//eaioSubdate2
	private Date eaioSubdate2;
	//eaioSubdate3
	private Date eaioSubdate3;
	//eaioSubdate4
	private Date eaioSubdate4;
	//eaioSubnum1
	private Long eaioSubnum1;
	//eaioSubnum2
	private Long eaioSubnum2;
	//eaioSubnum3
	private Long eaioSubnum3;
	//eaioSubnum4
	private Long eaioSubnum4;
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
	 * Get eaioId
	 */
	@Column(name = "EAIO_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEaioId() {
		return eaioId;
	}

	/**
	 * Set eaioId
	 */
	public void setEaioId(Long eaioId) {
		this.eaioId = eaioId;
		addValidField("eaioId");
	}

	/**
	 * Get eaioEscoId
	 */
	@Column(name = "EAIO_ESCO_ID")
	public String getEaioEscoId() {
		return eaioEscoId;
	}

	/**
	 * Set eaioEscoId
	 */
	public void setEaioEscoId(String eaioEscoId) {
		this.eaioEscoId = eaioEscoId;
		addValidField("eaioEscoId");
	}

	/**
	 * Get eaioEbpjId
	 */
	@Column(name = "EAIO_EBPJ_ID")
	public String getEaioEbpjId() {
		return eaioEbpjId;
	}

	/**
	 * Set eaioEbpjId
	 */
	public void setEaioEbpjId(String eaioEbpjId) {
		this.eaioEbpjId = eaioEbpjId;
		addValidField("eaioEbpjId");
	}

	/**
	 * Get eaioType
	 */
	@Column(name = "EAIO_TYPE")
	public String getEaioType() {
		return eaioType;
	}

	/**
	 * Set eaioType
	 */
	public void setEaioType(String eaioType) {
		this.eaioType = eaioType;
		addValidField("eaioType");
	}

	/**
	 * Get eaioDescription
	 */
	@Column(name = "EAIO_DESCRIPTION")
	public String getEaioDescription() {
		return eaioDescription;
	}

	/**
	 * Set eaioDescription
	 */
	public void setEaioDescription(String eaioDescription) {
		this.eaioDescription = eaioDescription;
		addValidField("eaioDescription");
	}

	/**
	 * Get eaioContent
	 */
	@Column(name = "EAIO_CONTENT")
	public byte[] getEaioContent() {
		return eaioContent;
	}

	/**
	 * Set eaioContent
	 */
	public void setEaioContent(byte[] eaioContent) {
		this.eaioContent = eaioContent;
		addValidField("eaioContent");
	}

	/**
	 * Get eaioTablename
	 */
	@Column(name = "EAIO_TABLENAME")
	public String getEaioTablename() {
		return eaioTablename;
	}

	/**
	 * Set eaioTablename
	 */
	public void setEaioTablename(String eaioTablename) {
		this.eaioTablename = eaioTablename;
		addValidField("eaioTablename");
	}

	/**
	 * Get eaioItemid
	 */
	@Column(name = "EAIO_ITEMID")
	public Long getEaioItemid() {
		return eaioItemid;
	}

	/**
	 * Set eaioItemid
	 */
	public void setEaioItemid(Long eaioItemid) {
		this.eaioItemid = eaioItemid;
		addValidField("eaioItemid");
	}

	/**
	 * Get eaioETime
	 */
	@Column(name = "EAIO_E_TIME")
	public Date getEaioETime() {
		return eaioETime;
	}

	/**
	 * Set eaioETime
	 */
	public void setEaioETime(Date eaioETime) {
		this.eaioETime = eaioETime;
		addValidField("eaioETime");
	}

	/**
	 * Get eaioIsResend
	 */
	@Column(name = "EAIO_IS_RESEND")
	public String getEaioIsResend() {
		return eaioIsResend;
	}

	/**
	 * Set eaioIsResend
	 */
	public void setEaioIsResend(String eaioIsResend) {
		this.eaioIsResend = eaioIsResend;
		addValidField("eaioIsResend");
	}

	/**
	 * Get eaioRTime
	 */
	@Column(name = "EAIO_R_TIME")
	public Date getEaioRTime() {
		return eaioRTime;
	}

	/**
	 * Set eaioRTime
	 */
	public void setEaioRTime(Date eaioRTime) {
		this.eaioRTime = eaioRTime;
		addValidField("eaioRTime");
	}

	/**
	 * Get eaioSysCode
	 */
	@Column(name = "EAIO_SYS_CODE")
	public String getEaioSysCode() {
		return eaioSysCode;
	}

	/**
	 * Set eaioSysCode
	 */
	public void setEaioSysCode(String eaioSysCode) {
		this.eaioSysCode = eaioSysCode;
		addValidField("eaioSysCode");
	}

	/**
	 * Get eaioEbbuId
	 */
	@Column(name = "EAIO_EBBU_ID")
	public Long getEaioEbbuId() {
		return eaioEbbuId;
	}

	/**
	 * Set eaioEbbuId
	 */
	public void setEaioEbbuId(Long eaioEbbuId) {
		this.eaioEbbuId = eaioEbbuId;
		addValidField("eaioEbbuId");
	}

	/**
	 * Get eaioEbbuNameCn
	 */
	@Column(name = "EAIO_EBBU_NAME_CN")
	public String getEaioEbbuNameCn() {
		return eaioEbbuNameCn;
	}

	/**
	 * Set eaioEbbuNameCn
	 */
	public void setEaioEbbuNameCn(String eaioEbbuNameCn) {
		this.eaioEbbuNameCn = eaioEbbuNameCn;
		addValidField("eaioEbbuNameCn");
	}

	/**
	 * Get eaioEbbuCode
	 */
	@Column(name = "EAIO_EBBU_CODE")
	public String getEaioEbbuCode() {
		return eaioEbbuCode;
	}

	/**
	 * Set eaioEbbuCode
	 */
	public void setEaioEbbuCode(String eaioEbbuCode) {
		this.eaioEbbuCode = eaioEbbuCode;
		addValidField("eaioEbbuCode");
	}

	/**
	 * Get eaioSendMethod
	 */
	@Column(name = "EAIO_SEND_METHOD")
	public String getEaioSendMethod() {
		return eaioSendMethod;
	}

	/**
	 * Set eaioSendMethod
	 */
	public void setEaioSendMethod(String eaioSendMethod) {
		this.eaioSendMethod = eaioSendMethod;
		addValidField("eaioSendMethod");
	}

	/**
	 * Get eaioSender
	 */
	@Column(name = "EAIO_SENDER")
	public String getEaioSender() {
		return eaioSender;
	}

	/**
	 * Set eaioSender
	 */
	public void setEaioSender(String eaioSender) {
		this.eaioSender = eaioSender;
		addValidField("eaioSender");
	}

	/**
	 * Get eaioReceiver
	 */
	@Column(name = "EAIO_RECEIVER")
	public String getEaioReceiver() {
		return eaioReceiver;
	}

	/**
	 * Set eaioReceiver
	 */
	public void setEaioReceiver(String eaioReceiver) {
		this.eaioReceiver = eaioReceiver;
		addValidField("eaioReceiver");
	}

	/**
	 * Get eaioMessageType
	 */
	@Column(name = "EAIO_MESSAGE_TYPE")
	public String getEaioMessageType() {
		return eaioMessageType;
	}

	/**
	 * Set eaioMessageType
	 */
	public void setEaioMessageType(String eaioMessageType) {
		this.eaioMessageType = eaioMessageType;
		addValidField("eaioMessageType");
	}

	/**
	 * Get eaioFileName
	 */
	@Column(name = "EAIO_FILE_NAME")
	public String getEaioFileName() {
		return eaioFileName;
	}

	/**
	 * Set eaioFileName
	 */
	public void setEaioFileName(String eaioFileName) {
		this.eaioFileName = eaioFileName;
		addValidField("eaioFileName");
	}

	/**
	 * Get eaioIsZip
	 */
	@Column(name = "EAIO_IS_ZIP")
	public String getEaioIsZip() {
		return eaioIsZip;
	}

	/**
	 * Set eaioIsZip
	 */
	public void setEaioIsZip(String eaioIsZip) {
		this.eaioIsZip = eaioIsZip;
		addValidField("eaioIsZip");
	}

	/**
	 * Get eaioIsBase64
	 */
	@Column(name = "EAIO_IS_BASE64")
	public String getEaioIsBase64() {
		return eaioIsBase64;
	}

	/**
	 * Set eaioIsBase64
	 */
	public void setEaioIsBase64(String eaioIsBase64) {
		this.eaioIsBase64 = eaioIsBase64;
		addValidField("eaioIsBase64");
	}

	/**
	 * Get eaioEncoding
	 */
	@Column(name = "EAIO_ENCODING")
	public String getEaioEncoding() {
		return eaioEncoding;
	}

	/**
	 * Set eaioEncoding
	 */
	public void setEaioEncoding(String eaioEncoding) {
		this.eaioEncoding = eaioEncoding;
		addValidField("eaioEncoding");
	}

	/**
	 * Get eaioSubstr1
	 */
	@Column(name = "EAIO_SUBSTR1")
	public String getEaioSubstr1() {
		return eaioSubstr1;
	}

	/**
	 * Set eaioSubstr1
	 */
	public void setEaioSubstr1(String eaioSubstr1) {
		this.eaioSubstr1 = eaioSubstr1;
		addValidField("eaioSubstr1");
	}

	/**
	 * Get eaioSubstr2
	 */
	@Column(name = "EAIO_SUBSTR2")
	public String getEaioSubstr2() {
		return eaioSubstr2;
	}

	/**
	 * Set eaioSubstr2
	 */
	public void setEaioSubstr2(String eaioSubstr2) {
		this.eaioSubstr2 = eaioSubstr2;
		addValidField("eaioSubstr2");
	}

	/**
	 * Get eaioSubstr3
	 */
	@Column(name = "EAIO_SUBSTR3")
	public String getEaioSubstr3() {
		return eaioSubstr3;
	}

	/**
	 * Set eaioSubstr3
	 */
	public void setEaioSubstr3(String eaioSubstr3) {
		this.eaioSubstr3 = eaioSubstr3;
		addValidField("eaioSubstr3");
	}

	/**
	 * Get eaioSubstr4
	 */
	@Column(name = "EAIO_SUBSTR4")
	public String getEaioSubstr4() {
		return eaioSubstr4;
	}

	/**
	 * Set eaioSubstr4
	 */
	public void setEaioSubstr4(String eaioSubstr4) {
		this.eaioSubstr4 = eaioSubstr4;
		addValidField("eaioSubstr4");
	}

	/**
	 * Get eaioSubstr5
	 */
	@Column(name = "EAIO_SUBSTR5")
	public String getEaioSubstr5() {
		return eaioSubstr5;
	}

	/**
	 * Set eaioSubstr5
	 */
	public void setEaioSubstr5(String eaioSubstr5) {
		this.eaioSubstr5 = eaioSubstr5;
		addValidField("eaioSubstr5");
	}

	/**
	 * Get eaioSubstr6
	 */
	@Column(name = "EAIO_SUBSTR6")
	public String getEaioSubstr6() {
		return eaioSubstr6;
	}

	/**
	 * Set eaioSubstr6
	 */
	public void setEaioSubstr6(String eaioSubstr6) {
		this.eaioSubstr6 = eaioSubstr6;
		addValidField("eaioSubstr6");
	}

	/**
	 * Get eaioSubstr7
	 */
	@Column(name = "EAIO_SUBSTR7")
	public String getEaioSubstr7() {
		return eaioSubstr7;
	}

	/**
	 * Set eaioSubstr7
	 */
	public void setEaioSubstr7(String eaioSubstr7) {
		this.eaioSubstr7 = eaioSubstr7;
		addValidField("eaioSubstr7");
	}

	/**
	 * Get eaioSubstr8
	 */
	@Column(name = "EAIO_SUBSTR8")
	public String getEaioSubstr8() {
		return eaioSubstr8;
	}

	/**
	 * Set eaioSubstr8
	 */
	public void setEaioSubstr8(String eaioSubstr8) {
		this.eaioSubstr8 = eaioSubstr8;
		addValidField("eaioSubstr8");
	}

	/**
	 * Get eaioSubdate1
	 */
	@Column(name = "EAIO_SUBDATE1")
	public Date getEaioSubdate1() {
		return eaioSubdate1;
	}

	/**
	 * Set eaioSubdate1
	 */
	public void setEaioSubdate1(Date eaioSubdate1) {
		this.eaioSubdate1 = eaioSubdate1;
		addValidField("eaioSubdate1");
	}

	/**
	 * Get eaioSubdate2
	 */
	@Column(name = "EAIO_SUBDATE2")
	public Date getEaioSubdate2() {
		return eaioSubdate2;
	}

	/**
	 * Set eaioSubdate2
	 */
	public void setEaioSubdate2(Date eaioSubdate2) {
		this.eaioSubdate2 = eaioSubdate2;
		addValidField("eaioSubdate2");
	}

	/**
	 * Get eaioSubdate3
	 */
	@Column(name = "EAIO_SUBDATE3")
	public Date getEaioSubdate3() {
		return eaioSubdate3;
	}

	/**
	 * Set eaioSubdate3
	 */
	public void setEaioSubdate3(Date eaioSubdate3) {
		this.eaioSubdate3 = eaioSubdate3;
		addValidField("eaioSubdate3");
	}

	/**
	 * Get eaioSubdate4
	 */
	@Column(name = "EAIO_SUBDATE4")
	public Date getEaioSubdate4() {
		return eaioSubdate4;
	}

	/**
	 * Set eaioSubdate4
	 */
	public void setEaioSubdate4(Date eaioSubdate4) {
		this.eaioSubdate4 = eaioSubdate4;
		addValidField("eaioSubdate4");
	}

	/**
	 * Get eaioSubnum1
	 */
	@Column(name = "EAIO_SUBNUM1")
	public Long getEaioSubnum1() {
		return eaioSubnum1;
	}

	/**
	 * Set eaioSubnum1
	 */
	public void setEaioSubnum1(Long eaioSubnum1) {
		this.eaioSubnum1 = eaioSubnum1;
		addValidField("eaioSubnum1");
	}

	/**
	 * Get eaioSubnum2
	 */
	@Column(name = "EAIO_SUBNUM2")
	public Long getEaioSubnum2() {
		return eaioSubnum2;
	}

	/**
	 * Set eaioSubnum2
	 */
	public void setEaioSubnum2(Long eaioSubnum2) {
		this.eaioSubnum2 = eaioSubnum2;
		addValidField("eaioSubnum2");
	}

	/**
	 * Get eaioSubnum3
	 */
	@Column(name = "EAIO_SUBNUM3")
	public Long getEaioSubnum3() {
		return eaioSubnum3;
	}

	/**
	 * Set eaioSubnum3
	 */
	public void setEaioSubnum3(Long eaioSubnum3) {
		this.eaioSubnum3 = eaioSubnum3;
		addValidField("eaioSubnum3");
	}

	/**
	 * Get eaioSubnum4
	 */
	@Column(name = "EAIO_SUBNUM4")
	public Long getEaioSubnum4() {
		return eaioSubnum4;
	}

	/**
	 * Set eaioSubnum4
	 */
	public void setEaioSubnum4(Long eaioSubnum4) {
		this.eaioSubnum4 = eaioSubnum4;
		addValidField("eaioSubnum4");
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
