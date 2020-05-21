package com.sinotrans.oms.contract.dto;

import java.util.List;

import com.sinotrans.oms.contract.model.ElContractConfigModel;
import com.sinotrans.oms.contract.model.ElContractGreatClausesModel;
import com.sinotrans.oms.contract.model.ElContractModel;
import com.sinotrans.oms.fileupload.model.EbFileModel;

/**
 * <p>Description: 合同与合同接单设置DTO用来做出参 </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181120              Colley.Bai       	                    创建
 * </pre>
 */
public class ElContractDto {

	private ElContractModel elContractModel;//合同表
	
	private List<ElContractConfigModel> elContractConfigModelList;//合同接单设置表
	
	private List<ElContractGreatClausesModel> elContractGreatClausesModelList;//合同重要条款
	
	private List<EbFileModel> ebFileModelList;//合同附件

	public ElContractModel getElContractModel() {
		return elContractModel;
	}

	public void setElContractModel(ElContractModel elContractModel) {
		this.elContractModel = elContractModel;
	}

	public List<ElContractConfigModel> getElContractConfigModelList() {
		return elContractConfigModelList;
	}

	public void setElContractConfigModelList(List<ElContractConfigModel> elContractConfigModelList) {
		this.elContractConfigModelList = elContractConfigModelList;
	}

	public List<ElContractGreatClausesModel> getElContractGreatClausesModelList() {
		return elContractGreatClausesModelList;
	}

	public void setElContractGreatClausesModelList(List<ElContractGreatClausesModel> elContractGreatClausesModelList) {
		this.elContractGreatClausesModelList = elContractGreatClausesModelList;
	}

	public List<EbFileModel> getEbFileModelList() {
		return ebFileModelList;
	}

	public void setEbFileModelList(List<EbFileModel> ebFileModelList) {
		this.ebFileModelList = ebFileModelList;
	}
	
	
}
