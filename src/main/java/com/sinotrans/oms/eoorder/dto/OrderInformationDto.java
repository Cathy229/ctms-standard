package com.sinotrans.oms.eoorder.dto;

import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;

public class OrderInformationDto {

	private EoOrderModel eoOrderModel;
	
	private EoOrderExpandAgencyModel formModel;
	
	public EoOrderModel setOrderModel(EoOrderModel eoOrderModel) {
		
		return this.eoOrderModel = eoOrderModel;
	}
	
	public EoOrderExpandAgencyModel setFormModel(EoOrderExpandAgencyModel formModel) {
		return this.formModel = formModel;
	}

}
