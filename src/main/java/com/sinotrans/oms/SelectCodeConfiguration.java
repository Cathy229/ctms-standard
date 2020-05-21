package com.sinotrans.oms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sinotrans.framework.service.support.QueryField;
import com.sinotrans.framework.service.support.SelectCode;

@Configuration
public class SelectCodeConfiguration {

	@Bean(name = "selectCode.WAREHOUSE")
	public SelectCode getWarehouseSelectCode() {
		SelectCode warehouseSC = new SelectCode();
		warehouseSC.setQueryType("BswhWarehouseModel");
		warehouseSC.setOrderBy("bswhId");
		warehouseSC.setKeyFieldName("bswhId");
		warehouseSC.setLabelFieldName("bswhName");
		Map<String, String> localedLabelFieldNames = new HashMap<String, String>();
		localedLabelFieldNames.put("zh_CN", "bswhName");
		localedLabelFieldNames.put("en", "bswhEnName");
		warehouseSC.setLocaledLabelFieldNames(localedLabelFieldNames);
		return warehouseSC;
	}

	@Bean(name = "selectCode.PROVINCE")
	public SelectCode getProvinceSelectCode() {
		SelectCode warehouseSC = new SelectCode();
		warehouseSC.setQueryType("ProvProvinceModel");
		warehouseSC.setOrderBy("provId");
		warehouseSC.setKeyFieldName("provId");
		warehouseSC.setLabelFieldName("provName");
		Map<String, String> localedLabelFieldNames = new HashMap<String, String>();
		localedLabelFieldNames.put("zh_CN", "provName");
		localedLabelFieldNames.put("en", "provEnName");
		warehouseSC.setLocaledLabelFieldNames(localedLabelFieldNames);
		return warehouseSC;
	}

	@Bean(name = "selectCode.CITY")
	public SelectCode getCitySelectCode() {
		SelectCode warehouseSC = new SelectCode();
		warehouseSC.setQueryType("CityCityModel");
		warehouseSC.setOrderBy("cityId");
		warehouseSC.setKeyFieldName("cityId");
		warehouseSC.setLabelFieldName("cityName");
		Map<String, String> localedLabelFieldNames = new HashMap<String, String>();
		localedLabelFieldNames.put("zh_CN", "cityName");
		localedLabelFieldNames.put("en", "cityEnName");
		warehouseSC.setLocaledLabelFieldNames(localedLabelFieldNames);
		return warehouseSC;
	}

	@Bean(name = "selectCode.WAREHOUSEPOS")
	public SelectCode getWarehouseposSelectCode() {
		SelectCode warehouseSC = new SelectCode();
		warehouseSC.setQueryType("BswpWarehousePositionModel");
		warehouseSC.setOrderBy("bswpId");
		warehouseSC.setKeyFieldName("bswpId");
		warehouseSC.setLabelFieldName("bswpName");
		Map<String, String> localedLabelFieldNames = new HashMap<String, String>();
		localedLabelFieldNames.put("zh_CN", "bswpName");
		localedLabelFieldNames.put("en", "bswpNameEn");
		warehouseSC.setLocaledLabelFieldNames(localedLabelFieldNames);
		return warehouseSC;
	}

	@Bean(name = "selectCode.PROVINCECITY")
	public SelectCode getProvincecitySelectCode() {
		SelectCode warehouseSC = new SelectCode();
		warehouseSC.setQueryType("ProvinceCityQuery");
		warehouseSC.setOrderBy("cityId");
		warehouseSC.setKeyFieldName("cityId");
		warehouseSC.setLabelFieldName("cityName");
		Map<String, String> localedLabelFieldNames = new HashMap<String, String>();
		localedLabelFieldNames.put("zh_CN", "cityName");
		localedLabelFieldNames.put("en", "cityEnName");
		warehouseSC.setLocaledLabelFieldNames(localedLabelFieldNames);
		return warehouseSC;
	}

	@Bean(name = "selectCode.WORKTYPES")
	public SelectCode getWorktypesSelectCode() {
		SelectCode warehouseSC = new SelectCode();
		warehouseSC.setQueryType("WorktypeModel");
		warehouseSC.setOrderBy("id");
		warehouseSC.setKeyFieldName("id");
		warehouseSC.setLabelFieldName("typename");
		return warehouseSC;
	}

	@Bean(name = "selectCode.SYSUSER")
	public SelectCode getSysuserSelectCode() {
		SelectCode warehouseSC = new SelectCode();
		warehouseSC.setQueryType("SysUserModel");
		warehouseSC.setOrderBy("oid");
		warehouseSC.setKeyFieldName("oid");
		warehouseSC.setLabelFieldName("usrRealName");
		return warehouseSC;
	}
    @Bean(name = "selectCode.WORKLEVELS")
    public SelectCode getWORKLEVELSSelectCode() {
        SelectCode warehouseSC = new SelectCode();
        warehouseSC.setQueryType("FjWorklevelModel");
        warehouseSC.setOrderBy("id");
        warehouseSC.setKeyFieldName("id");
        warehouseSC.setLabelFieldName("workLevel");
        return warehouseSC;
    }
    @Bean(name = "selectCode.ESCOMPANY")
    public SelectCode getDemoSelectCode() {
        SelectCode warehouseSC = new SelectCode();
        warehouseSC.setQueryType("EsCompanyModel");
        List<QueryField> queryFields = new ArrayList<QueryField>();
		QueryField field = new QueryField();
		field.setFieldName("escoId");
		field.setOperator("=");
		field.setFieldValue("5008000");
		queryFields.add(field);
		warehouseSC.setQueryFields(queryFields);
        warehouseSC.setOrderBy("escoId");
        warehouseSC.setKeyFieldName("escoId");
        warehouseSC.setLabelFieldName("escoCompanyNameCn");
        return warehouseSC;
    }
}
