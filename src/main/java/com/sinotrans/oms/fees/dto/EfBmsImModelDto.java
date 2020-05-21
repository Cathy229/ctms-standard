package com.sinotrans.oms.fees.dto;

import java.io.Serializable;

import javax.persistence.Entity;

import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.fees.model.EfBmsImModel;

/**  
* <p>Title: EfBmsImModelDto</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月10日  
* @version 1.0  
*/
@Entity
public class EfBmsImModelDto  extends EfBmsImModel implements Serializable{

	private Long eoorId;
    
    private Integer uploadStatus;
    
    private String storageInCode;//入库仓储代码
    
    private String storageOutCode;//出库仓储代码
    
    private String eosiLibraryTime;//反馈入库时间
    
    private String eosoLibraryTime;//反馈出库时间
    
    private String efbmbusinessType;//业务类型
    /**
     * 合同物流增加货物交付时间、发运到达日判断  add by shoven 2018年8月23日18:59:45
     */
    private Boolean checkDeliveryGoods;//判断货物交付是否必填
    private Boolean checkShipmentDate;//判断发运到达日是否必填
    private EoOrderExpandAgencyModel eoeaModel;//订单代理扩展表
    private Integer SumEoea;//用来判断操作环节是否包含报关
    private Long eoorLoEbppId;//项目执行计划ID
    
    public EoOrderExpandAgencyModel getEoeaModel() {
		return eoeaModel;
	}

	public void setEoeaModel(EoOrderExpandAgencyModel eoeaModel) {
		this.eoeaModel = eoeaModel;
	}

	public Integer getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(Integer uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public Long getEoorId() {
        return eoorId;
    }

    public void setEoorId(Long eoorId) {
        this.eoorId = eoorId;
    }

	public String getStorageInCode() {
		return storageInCode;
	}

	public void setStorageInCode(String storageInCode) {
		this.storageInCode = storageInCode;
	}

	public String getStorageOutCode() {
		return storageOutCode;
	}

	public void setStorageOutCode(String storageOutCode) {
		this.storageOutCode = storageOutCode;
	}

	public String getEosiLibraryTime() {
		return eosiLibraryTime;
	}

	public void setEosiLibraryTime(String eosiLibraryTime) {
		this.eosiLibraryTime = eosiLibraryTime;
	}

	public String getEosoLibraryTime() {
		return eosoLibraryTime;
	}

	public void setEosoLibraryTime(String eosoLibraryTime) {
		this.eosoLibraryTime = eosoLibraryTime;
	}


	public Boolean getCheckDeliveryGoods() {
		return checkDeliveryGoods;
	}

	public void setCheckDeliveryGoods(Boolean checkDeliveryGoods) {
		this.checkDeliveryGoods = checkDeliveryGoods;
	}

	public Boolean getCheckShipmentDate() {
		return checkShipmentDate;
	}

	public void setCheckShipmentDate(Boolean checkShipmentDate) {
		this.checkShipmentDate = checkShipmentDate;
	}

	public Integer getSumEoea() {
		return SumEoea;
	}

	public void setSumEoea(Integer sumEoea) {
		SumEoea = sumEoea;
	}

	public Long getEoorLoEbppId() {
		return eoorLoEbppId;
	}

	public void setEoorLoEbppId(Long eoorLoEbppId) {
		this.eoorLoEbppId = eoorLoEbppId;
	}

	public String getEfbmbusinessType() {
		return efbmbusinessType;
	}

	public void setEfbmbusinessType(String efbmbusinessType) {
		this.efbmbusinessType = efbmbusinessType;
	}
}
