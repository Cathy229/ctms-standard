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
 * Model class for EaiInException
 */
@Entity
@Table(name = "EAI_IN_EXCEPTION")
public class EaiInExceptionModel extends BaseModel implements OperationLog {

	//eaiiId
	private Long eaiiId;
	//eaiiEscoId
	private String eaiiEscoId;
	//eaiiEbpjId
	private String eaiiEbpjId;
	//eaiiType
	private String eaiiType;
	//eaiiDescription
	private String eaiiDescription;
	//eaiiContent
	private byte[] eaiiContent;
	//eaiiTablename
	private String eaiiTablename;
	//eaiiItemid
	private Long eaiiItemid;
	//eaiiETime
	private Date eaiiETime;
	//eaiiFixContent
	private byte[] eaiiFixContent;
	//eaiiFixTime
	private Date eaiiFixTime;
	//eaiiIsReceiving
	private String eaiiIsReceiving;
	//eaiiRTime
	private Date eaiiRTime;
	//eaiiSysCode
	private String eaiiSysCode;
	//eaiiEbbuId
	private Long eaiiEbbuId;
	//eaiiEbbuNameCn
	private String eaiiEbbuNameCn;
	//eaiiEbbuCode
	private String eaiiEbbuCode;
	//eaiiEdiService
	private String eaiiEdiService;
	//eaiiSender
	private String eaiiSender;
	//eaiiReceiver
	private String eaiiReceiver;
	//eaiiMessageType
	private String eaiiMessageType;
	//eaiiFileName
	private String eaiiFileName;
	//eaiiIsZip
	private String eaiiIsZip;
	//eaiiIsBase64
	private String eaiiIsBase64;
	//eaiiEncoding
	private String eaiiEncoding;
	//eaiiSubstr1
	private String eaiiSubstr1;
	//eaiiSubstr2
	private String eaiiSubstr2;
	//eaiiSubstr3
	private String eaiiSubstr3;
	//eaiiSubstr4
	private String eaiiSubstr4;
	//eaiiSubstr5
	private String eaiiSubstr5;
	//eaiiSubstr6
	private String eaiiSubstr6;
	//eaiiSubstr7
	private String eaiiSubstr7;
	//eaiiSubstr8
	private String eaiiSubstr8;
	//eaiiSubdate1
	private Date eaiiSubdate1;
	//eaiiSubdate2
	private Date eaiiSubdate2;
	//eaiiSubdate3
	private Date eaiiSubdate3;
	//eaiiSubdate4
	private Date eaiiSubdate4;
	//eaiiSubnum1
	private Long eaiiSubnum1;
	//eaiiSubnum2
	private Long eaiiSubnum2;
	//eaiiSubnum3
	private Long eaiiSubnum3;
	//eaiiSubnum4
	private Long eaiiSubnum4;
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
	 * Get eaiiId
	 */
	@Column(name = "EAII_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEaiiId() {
		return eaiiId;
	}

	/**
	 * Set eaiiId
	 */
	public void setEaiiId(Long eaiiId) {
		this.eaiiId = eaiiId;
		addValidField("eaiiId");
	}

	/**
	 * Get eaiiEscoId
	 */
	@Column(name = "EAII_ESCO_ID")
	public String getEaiiEscoId() {
		return eaiiEscoId;
	}

	/**
	 * Set eaiiEscoId
	 */
	public void setEaiiEscoId(String eaiiEscoId) {
		this.eaiiEscoId = eaiiEscoId;
		addValidField("eaiiEscoId");
	}

	/**
	 * Get eaiiEbpjId
	 */
	@Column(name = "EAII_EBPJ_ID")
	public String getEaiiEbpjId() {
		return eaiiEbpjId;
	}

	/**
	 * Set eaiiEbpjId
	 */
	public void setEaiiEbpjId(String eaiiEbpjId) {
		this.eaiiEbpjId = eaiiEbpjId;
		addValidField("eaiiEbpjId");
	}

	/**
	 * Get eaiiType
	 */
	@Column(name = "EAII_TYPE")
	public String getEaiiType() {
		return eaiiType;
	}

	/**
	 * Set eaiiType
	 */
	public void setEaiiType(String eaiiType) {
		this.eaiiType = eaiiType;
		addValidField("eaiiType");
	}

	/**
	 * Get eaiiDescription
	 */
	@Column(name = "EAII_DESCRIPTION")
	public String getEaiiDescription() {
		return eaiiDescription;
	}

	/**
	 * Set eaiiDescription
	 */
	public void setEaiiDescription(String eaiiDescription) {
		this.eaiiDescription = eaiiDescription;
		addValidField("eaiiDescription");
	}

	/**
	 * Get eaiiContent
	 */
	@Column(name = "EAII_CONTENT")
	public byte[] getEaiiContent() {
		return eaiiContent;
	}

	/**
	 * Set eaiiContent
	 */
	public void setEaiiContent(byte[] eaiiContent) {
		this.eaiiContent = eaiiContent;
		addValidField("eaiiContent");
	}

	/**
	 * Get eaiiTablename
	 */
	@Column(name = "EAII_TABLENAME")
	public String getEaiiTablename() {
		return eaiiTablename;
	}

	/**
	 * Set eaiiTablename
	 */
	public void setEaiiTablename(String eaiiTablename) {
		this.eaiiTablename = eaiiTablename;
		addValidField("eaiiTablename");
	}

	/**
	 * Get eaiiItemid
	 */
	@Column(name = "EAII_ITEMID")
	public Long getEaiiItemid() {
		return eaiiItemid;
	}

	/**
	 * Set eaiiItemid
	 */
	public void setEaiiItemid(Long eaiiItemid) {
		this.eaiiItemid = eaiiItemid;
		addValidField("eaiiItemid");
	}

	/**
	 * Get eaiiETime
	 */
	@Column(name = "EAII_E_TIME")
	public Date getEaiiETime() {
		return eaiiETime;
	}

	/**
	 * Set eaiiETime
	 */
	public void setEaiiETime(Date eaiiETime) {
		this.eaiiETime = eaiiETime;
		addValidField("eaiiETime");
	}

	/**
	 * Get eaiiFixContent
	 */
	@Column(name = "EAII_FIX_CONTENT")
	public byte[] getEaiiFixContent() {
		return eaiiFixContent;
	}

	/**
	 * Set eaiiFixContent
	 */
	public void setEaiiFixContent(byte[] eaiiFixContent) {
		this.eaiiFixContent = eaiiFixContent;
		addValidField("eaiiFixContent");
	}

	/**
	 * Get eaiiFixTime
	 */
	@Column(name = "EAII_FIX_TIME")
	public Date getEaiiFixTime() {
		return eaiiFixTime;
	}

	/**
	 * Set eaiiFixTime
	 */
	public void setEaiiFixTime(Date eaiiFixTime) {
		this.eaiiFixTime = eaiiFixTime;
		addValidField("eaiiFixTime");
	}

	/**
	 * Get eaiiIsReceiving
	 */
	@Column(name = "EAII_IS_RECEIVING")
	public String getEaiiIsReceiving() {
		return eaiiIsReceiving;
	}

	/**
	 * Set eaiiIsReceiving
	 */
	public void setEaiiIsReceiving(String eaiiIsReceiving) {
		this.eaiiIsReceiving = eaiiIsReceiving;
		addValidField("eaiiIsReceiving");
	}

	/**
	 * Get eaiiRTime
	 */
	@Column(name = "EAII_R_TIME")
	public Date getEaiiRTime() {
		return eaiiRTime;
	}

	/**
	 * Set eaiiRTime
	 */
	public void setEaiiRTime(Date eaiiRTime) {
		this.eaiiRTime = eaiiRTime;
		addValidField("eaiiRTime");
	}

	/**
	 * Get eaiiSysCode
	 */
	@Column(name = "EAII_SYS_CODE")
	public String getEaiiSysCode() {
		return eaiiSysCode;
	}

	/**
	 * Set eaiiSysCode
	 */
	public void setEaiiSysCode(String eaiiSysCode) {
		this.eaiiSysCode = eaiiSysCode;
		addValidField("eaiiSysCode");
	}

	/**
	 * Get eaiiEbbuId
	 */
	@Column(name = "EAII_EBBU_ID")
	public Long getEaiiEbbuId() {
		return eaiiEbbuId;
	}

	/**
	 * Set eaiiEbbuId
	 */
	public void setEaiiEbbuId(Long eaiiEbbuId) {
		this.eaiiEbbuId = eaiiEbbuId;
		addValidField("eaiiEbbuId");
	}

	/**
	 * Get eaiiEbbuNameCn
	 */
	@Column(name = "EAII_EBBU_NAME_CN")
	public String getEaiiEbbuNameCn() {
		return eaiiEbbuNameCn;
	}

	/**
	 * Set eaiiEbbuNameCn
	 */
	public void setEaiiEbbuNameCn(String eaiiEbbuNameCn) {
		this.eaiiEbbuNameCn = eaiiEbbuNameCn;
		addValidField("eaiiEbbuNameCn");
	}

	/**
	 * Get eaiiEbbuCode
	 */
	@Column(name = "EAII_EBBU_CODE")
	public String getEaiiEbbuCode() {
		return eaiiEbbuCode;
	}

	/**
	 * Set eaiiEbbuCode
	 */
	public void setEaiiEbbuCode(String eaiiEbbuCode) {
		this.eaiiEbbuCode = eaiiEbbuCode;
		addValidField("eaiiEbbuCode");
	}

	/**
	 * Get eaiiEdiService
	 */
	@Column(name = "EAII_EDI_SERVICE")
	public String getEaiiEdiService() {
		return eaiiEdiService;
	}

	/**
	 * Set eaiiEdiService
	 */
	public void setEaiiEdiService(String eaiiEdiService) {
		this.eaiiEdiService = eaiiEdiService;
		addValidField("eaiiEdiService");
	}

	/**
	 * Get eaiiSender
	 */
	@Column(name = "EAII_SENDER")
	public String getEaiiSender() {
		return eaiiSender;
	}

	/**
	 * Set eaiiSender
	 */
	public void setEaiiSender(String eaiiSender) {
		this.eaiiSender = eaiiSender;
		addValidField("eaiiSender");
	}

	/**
	 * Get eaiiReceiver
	 */
	@Column(name = "EAII_RECEIVER")
	public String getEaiiReceiver() {
		return eaiiReceiver;
	}

	/**
	 * Set eaiiReceiver
	 */
	public void setEaiiReceiver(String eaiiReceiver) {
		this.eaiiReceiver = eaiiReceiver;
		addValidField("eaiiReceiver");
	}

	/**
	 * Get eaiiMessageType
	 */
	@Column(name = "EAII_MESSAGE_TYPE")
	public String getEaiiMessageType() {
		return eaiiMessageType;
	}

	/**
	 * Set eaiiMessageType
	 */
	public void setEaiiMessageType(String eaiiMessageType) {
		this.eaiiMessageType = eaiiMessageType;
		addValidField("eaiiMessageType");
	}

	/**
	 * Get eaiiFileName
	 */
	@Column(name = "EAII_FILE_NAME")
	public String getEaiiFileName() {
		return eaiiFileName;
	}

	/**
	 * Set eaiiFileName
	 */
	public void setEaiiFileName(String eaiiFileName) {
		this.eaiiFileName = eaiiFileName;
		addValidField("eaiiFileName");
	}

	/**
	 * Get eaiiIsZip
	 */
	@Column(name = "EAII_IS_ZIP")
	public String getEaiiIsZip() {
		return eaiiIsZip;
	}

	/**
	 * Set eaiiIsZip
	 */
	public void setEaiiIsZip(String eaiiIsZip) {
		this.eaiiIsZip = eaiiIsZip;
		addValidField("eaiiIsZip");
	}

	/**
	 * Get eaiiIsBase64
	 */
	@Column(name = "EAII_IS_BASE64")
	public String getEaiiIsBase64() {
		return eaiiIsBase64;
	}

	/**
	 * Set eaiiIsBase64
	 */
	public void setEaiiIsBase64(String eaiiIsBase64) {
		this.eaiiIsBase64 = eaiiIsBase64;
		addValidField("eaiiIsBase64");
	}

	/**
	 * Get eaiiEncoding
	 */
	@Column(name = "EAII_ENCODING")
	public String getEaiiEncoding() {
		return eaiiEncoding;
	}

	/**
	 * Set eaiiEncoding
	 */
	public void setEaiiEncoding(String eaiiEncoding) {
		this.eaiiEncoding = eaiiEncoding;
		addValidField("eaiiEncoding");
	}

	/**
	 * Get eaiiSubstr1
	 */
	@Column(name = "EAII_SUBSTR1")
	public String getEaiiSubstr1() {
		return eaiiSubstr1;
	}

	/**
	 * Set eaiiSubstr1
	 */
	public void setEaiiSubstr1(String eaiiSubstr1) {
		this.eaiiSubstr1 = eaiiSubstr1;
		addValidField("eaiiSubstr1");
	}

	/**
	 * Get eaiiSubstr2
	 */
	@Column(name = "EAII_SUBSTR2")
	public String getEaiiSubstr2() {
		return eaiiSubstr2;
	}

	/**
	 * Set eaiiSubstr2
	 */
	public void setEaiiSubstr2(String eaiiSubstr2) {
		this.eaiiSubstr2 = eaiiSubstr2;
		addValidField("eaiiSubstr2");
	}

	/**
	 * Get eaiiSubstr3
	 */
	@Column(name = "EAII_SUBSTR3")
	public String getEaiiSubstr3() {
		return eaiiSubstr3;
	}

	/**
	 * Set eaiiSubstr3
	 */
	public void setEaiiSubstr3(String eaiiSubstr3) {
		this.eaiiSubstr3 = eaiiSubstr3;
		addValidField("eaiiSubstr3");
	}

	/**
	 * Get eaiiSubstr4
	 */
	@Column(name = "EAII_SUBSTR4")
	public String getEaiiSubstr4() {
		return eaiiSubstr4;
	}

	/**
	 * Set eaiiSubstr4
	 */
	public void setEaiiSubstr4(String eaiiSubstr4) {
		this.eaiiSubstr4 = eaiiSubstr4;
		addValidField("eaiiSubstr4");
	}

	/**
	 * Get eaiiSubstr5
	 */
	@Column(name = "EAII_SUBSTR5")
	public String getEaiiSubstr5() {
		return eaiiSubstr5;
	}

	/**
	 * Set eaiiSubstr5
	 */
	public void setEaiiSubstr5(String eaiiSubstr5) {
		this.eaiiSubstr5 = eaiiSubstr5;
		addValidField("eaiiSubstr5");
	}

	/**
	 * Get eaiiSubstr6
	 */
	@Column(name = "EAII_SUBSTR6")
	public String getEaiiSubstr6() {
		return eaiiSubstr6;
	}

	/**
	 * Set eaiiSubstr6
	 */
	public void setEaiiSubstr6(String eaiiSubstr6) {
		this.eaiiSubstr6 = eaiiSubstr6;
		addValidField("eaiiSubstr6");
	}

	/**
	 * Get eaiiSubstr7
	 */
	@Column(name = "EAII_SUBSTR7")
	public String getEaiiSubstr7() {
		return eaiiSubstr7;
	}

	/**
	 * Set eaiiSubstr7
	 */
	public void setEaiiSubstr7(String eaiiSubstr7) {
		this.eaiiSubstr7 = eaiiSubstr7;
		addValidField("eaiiSubstr7");
	}

	/**
	 * Get eaiiSubstr8
	 */
	@Column(name = "EAII_SUBSTR8")
	public String getEaiiSubstr8() {
		return eaiiSubstr8;
	}

	/**
	 * Set eaiiSubstr8
	 */
	public void setEaiiSubstr8(String eaiiSubstr8) {
		this.eaiiSubstr8 = eaiiSubstr8;
		addValidField("eaiiSubstr8");
	}

	/**
	 * Get eaiiSubdate1
	 */
	@Column(name = "EAII_SUBDATE1")
	public Date getEaiiSubdate1() {
		return eaiiSubdate1;
	}

	/**
	 * Set eaiiSubdate1
	 */
	public void setEaiiSubdate1(Date eaiiSubdate1) {
		this.eaiiSubdate1 = eaiiSubdate1;
		addValidField("eaiiSubdate1");
	}

	/**
	 * Get eaiiSubdate2
	 */
	@Column(name = "EAII_SUBDATE2")
	public Date getEaiiSubdate2() {
		return eaiiSubdate2;
	}

	/**
	 * Set eaiiSubdate2
	 */
	public void setEaiiSubdate2(Date eaiiSubdate2) {
		this.eaiiSubdate2 = eaiiSubdate2;
		addValidField("eaiiSubdate2");
	}

	/**
	 * Get eaiiSubdate3
	 */
	@Column(name = "EAII_SUBDATE3")
	public Date getEaiiSubdate3() {
		return eaiiSubdate3;
	}

	/**
	 * Set eaiiSubdate3
	 */
	public void setEaiiSubdate3(Date eaiiSubdate3) {
		this.eaiiSubdate3 = eaiiSubdate3;
		addValidField("eaiiSubdate3");
	}

	/**
	 * Get eaiiSubdate4
	 */
	@Column(name = "EAII_SUBDATE4")
	public Date getEaiiSubdate4() {
		return eaiiSubdate4;
	}

	/**
	 * Set eaiiSubdate4
	 */
	public void setEaiiSubdate4(Date eaiiSubdate4) {
		this.eaiiSubdate4 = eaiiSubdate4;
		addValidField("eaiiSubdate4");
	}

	/**
	 * Get eaiiSubnum1
	 */
	@Column(name = "EAII_SUBNUM1")
	public Long getEaiiSubnum1() {
		return eaiiSubnum1;
	}

	/**
	 * Set eaiiSubnum1
	 */
	public void setEaiiSubnum1(Long eaiiSubnum1) {
		this.eaiiSubnum1 = eaiiSubnum1;
		addValidField("eaiiSubnum1");
	}

	/**
	 * Get eaiiSubnum2
	 */
	@Column(name = "EAII_SUBNUM2")
	public Long getEaiiSubnum2() {
		return eaiiSubnum2;
	}

	/**
	 * Set eaiiSubnum2
	 */
	public void setEaiiSubnum2(Long eaiiSubnum2) {
		this.eaiiSubnum2 = eaiiSubnum2;
		addValidField("eaiiSubnum2");
	}

	/**
	 * Get eaiiSubnum3
	 */
	@Column(name = "EAII_SUBNUM3")
	public Long getEaiiSubnum3() {
		return eaiiSubnum3;
	}

	/**
	 * Set eaiiSubnum3
	 */
	public void setEaiiSubnum3(Long eaiiSubnum3) {
		this.eaiiSubnum3 = eaiiSubnum3;
		addValidField("eaiiSubnum3");
	}

	/**
	 * Get eaiiSubnum4
	 */
	@Column(name = "EAII_SUBNUM4")
	public Long getEaiiSubnum4() {
		return eaiiSubnum4;
	}

	/**
	 * Set eaiiSubnum4
	 */
	public void setEaiiSubnum4(Long eaiiSubnum4) {
		this.eaiiSubnum4 = eaiiSubnum4;
		addValidField("eaiiSubnum4");
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
