package com.sinotrans.oms.fees.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xml.resolver.apps.resolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BeanUtils;
import com.sinotrans.oms.common.util.DateUtil;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.fees.dto.ContractLogisticTempleteQueryDto;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.manager.EfBmsImManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesContractLogisticManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesSettlementManager;
import com.sinotrans.oms.fees.model.EfBmsImModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfBusinessFeesContractLogisticSettlementService;
import com.sinotrans.oms.fees.service.efBusinessFeesSettlementService;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.model.EsCompanyModel;

/**  
* <p>Title: EfBusinessFeesContractLogisticSettlementManagerImpl</p>  
* <p>Description: 合同物流上传实现</p>  
* @author Shoven.Jiang  
* @date 2018年9月11日  
* @version 1.0  
*/
@Service
public class EfBusinessFeesContractLogisticSettlementServiceImpl implements EfBusinessFeesContractLogisticSettlementService{

	@Autowired
	private EfBmsImManager efBmsImManager;//单票操作表
	@Autowired
	private EfBusinessFeesContractLogisticManager efBusinessFeesContractLogisticManager;//合同物流获取统计值
	@Autowired
	private efBusinessFeesSettlementService efBusinessFeesSettlementService;//费用上传通用逻辑
	@Autowired
	private EoOrderExpandAgencyManager eoOrderExpandAgencyManager;//订单代理拓展表
	@Autowired
	private EfBusinessFeesSettlementManager efBusinessFeesSettlementManager;//费用通用逻辑
	@Autowired
	private EoOrderManager eoOrderManage;//订单
	@Autowired
	private EsCompanyManager esCompanyManager;//公司
	@Autowired
	private EfbfBusinessFeesServiceImpl efbfBusinessFeesService;
	
	@Override
	public EfBmsImModelDto getContractLogisticTemplete(Long eoorId, String businessType) {
		EfBmsImModelDto efBmsImModelDto = new EfBmsImModelDto();
		ContractLogisticTempleteQueryDto contractLogisticTempleteQueryDto = new ContractLogisticTempleteQueryDto();
		if (null != eoorId) {
			//1.是否在单票操作表已经存在，并且结算审核状态=2
			List<FilterCondition> conditions = new ArrayList<>();
			conditions.add(new FilterCondition("efbmImId", eoorId, "="));
			Long efbmBmsStatus = 2L;
			conditions.add(new FilterCondition("efbmBmsStatus", efbmBmsStatus, "="));
			List<EfBmsImModel> efBmsImModelList = this.efBmsImManager.findByCondition(conditions);
			if(EmptyUtils.isNotEmpty(efBmsImModelList)){
    			EfBmsImModel bmsImModelResult = efBmsImModelList.get(0);
    			BeanUtils.copyProperties(efBmsImModelDto, bmsImModelResult);
    		} else {
    			//从订单及任务上取统计值赋值到单票操作表对象
    			Map<String, Object> efbmConditions = new HashMap<>();
    			efbmConditions.put("eoorId", eoorId);
    			contractLogisticTempleteQueryDto = this.efBusinessFeesContractLogisticManager.getContractLogisticTempleteByEoorId(efbmConditions);
    			//将订单取出来的ITEM转换成EfBmsImModelEntity对象
    			this.orderItemToEfBmsModelDto(efBmsImModelDto, contractLogisticTempleteQueryDto, eoorId, businessType);
    			//判断是订单是否是进出口
    			String eoeaAgencyType = "";//订单进出口
    			String efbmAttribute001 = "";//流行
    			List<FilterCondition> eoeaCondition = new ArrayList<>();
    			eoeaCondition.add(new FilterCondition("eoeaEoorId", eoorId, "="));
    			List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModels = this.eoOrderExpandAgencyManager.findByCondition(eoeaCondition);
    			if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModels)) {
    				eoeaAgencyType = eoOrderExpandAgencyModels.get(0).getEoeaAgencyType();
    				if (EmptyUtils.isNotEmpty(eoeaAgencyType)) {
    					efbmAttribute001 = this.efBusinessFeesSettlementManager.getEfbmAttribute001ByBusinessType(eoorId, eoeaAgencyType);
    					efBmsImModelDto.setEfbmAttribute001(efbmAttribute001);
    				}
    			}
    		}
		}
		return efBmsImModelDto;
	}
	
	/**
	 * 将订单查出来的数据转换成单票操作表需要的字段
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param efBmsImModelDto
	 * @param contractLogisticTempleteQueryDto
	 */
	private void orderItemToEfBmsModelDto(EfBmsImModelDto efBmsImModelDto, ContractLogisticTempleteQueryDto contractLogisticTempleteQueryDto, Long eoorId, String businessType) {
		efBmsImModelDto.setEfbmImId(eoorId);//订单ID
		efBmsImModelDto.setEfbmbusinessType(businessType);//结算统计值类型
		efBmsImModelDto.setEfbmEbbuCode("OMS01");//系统来源
		efBmsImModelDto.setEfbmAttribute040("0");//系统来源
		efBmsImModelDto.setEfbmEiimEscoCompanyNo(contractLogisticTempleteQueryDto.getEscoCompanyNo());
		efBmsImModelDto.setEfbmEscoCompanyNo(contractLogisticTempleteQueryDto.getEscoCompanyNo());//公司
    	efBmsImModelDto.setEfbmEbsmCode(contractLogisticTempleteQueryDto.getEoorBmsEbsmCode());//销售人员
    	efBmsImModelDto.setEfbmEsdeDepartmentCode(contractLogisticTempleteQueryDto.getEoorBmsEsdeDepartmentCode());//部门代码
    	efBmsImModelDto.setEfbmProjectCode(contractLogisticTempleteQueryDto.getEoorFCode());//项目代码
    	efBmsImModelDto.setEfbmNumber(contractLogisticTempleteQueryDto.getEoorOrderNo());//业务号
    	efBmsImModelDto.setEfbmAEbcuCustomerNo(contractLogisticTempleteQueryDto.getEoorBmsAEbcuCustomerNo());//客户编号
    	efBmsImModelDto.setEfbmSEbcuCustomerNo(contractLogisticTempleteQueryDto.getEoorBmsSEbcuCustomerNo());//供应商编号
    	efBmsImModelDto.setEfbmEbbtCode(contractLogisticTempleteQueryDto.getEoorBmsEbbtCode());//票据代码
    	efBmsImModelDto.setEfbmEbotCode(contractLogisticTempleteQueryDto.getEoorBmsEbotCode());//板块代码
    	efBmsImModelDto.setEfbmBusinessClass(contractLogisticTempleteQueryDto.getEoorBmsBusinessClass());//业务类型代码
    	efBmsImModelDto.setEfbmAcmpTime(contractLogisticTempleteQueryDto.getEoorBmsAcmpTime());//业务完成时间
    	//操作环节 仓储 有出入库任务记录数
    	if ((null != contractLogisticTempleteQueryDto.getCountEosi() && contractLogisticTempleteQueryDto.getCountEosi() >0)
    			|| (null != contractLogisticTempleteQueryDto.getCountSoso() && contractLogisticTempleteQueryDto.getCountSoso() >0)) {
    		efBmsImModelDto.setEfbmIsStorage(Constants.CHECKBOX_YES_1);//选中
    	}else{
    		efBmsImModelDto.setEfbmIsStorage(Constants.CHECKBOX_NO_0);//未选中
    	}
    		
    	//操作环节 运输  有陆运任务和化工任务记录数
    	if((null != contractLogisticTempleteQueryDto.getCountEorc() && contractLogisticTempleteQueryDto.getCountEorc()>0) || (null != contractLogisticTempleteQueryDto.getCountEort() && contractLogisticTempleteQueryDto.getCountEort()>0)) {
    		efBmsImModelDto.setEfbmIsTransport(Constants.CHECKBOX_YES_1);//选中
    	}else{
    		efBmsImModelDto.setEfbmIsTransport(Constants.CHECKBOX_NO_0);//未选中
    	}
    	//操作环节 货代  有订单扩展代理表记录数
    	if(null != contractLogisticTempleteQueryDto.getCountEoea() && contractLogisticTempleteQueryDto.getCountEoea()>0){
    		efBmsImModelDto.setEfbmIsAgent(Constants.CHECKBOX_YES_1);//选中
    	}else{
    		efBmsImModelDto.setEfbmIsAgent(Constants.CHECKBOX_NO_0);//未选中
    	}
    	
    	//仓储服务
    	if(Constants.CHECKBOX_YES_1.equals(efBmsImModelDto.getEfbmIsStorage())){
    		//仓储服务
    		if(contractLogisticTempleteQueryDto.getCountEosi()>0){
    			efBmsImModelDto.setEfbmAttribute009(Constants.SYS_STORAGE_SERVICE_IN_0100);
    			//仓库代码
        		efBmsImModelDto.setEfbmAttribute002(contractLogisticTempleteQueryDto.getEosiWarehouseCode());
        		//出入库时间
        		efBmsImModelDto.setEfbmOutInStoreTime(contractLogisticTempleteQueryDto.getEosiLibraryTime());//EFBM_ATTRIBUTE013
        		
    		}
    		if(null != contractLogisticTempleteQueryDto.getCountSoso() && contractLogisticTempleteQueryDto.getCountSoso()>0){
    			efBmsImModelDto.setEfbmAttribute009(Constants.SYS_STORAGE_SERVICE_OUT_0200);
    			//仓库代码
        		efBmsImModelDto.setEfbmAttribute002(contractLogisticTempleteQueryDto.getEosoWarehouseCode());
        		//出入库时间
        		efBmsImModelDto.setEfbmOutInStoreTime(contractLogisticTempleteQueryDto.getEosoLibraryTime());
    		}
    	}
    	//运输服务
    	if(Constants.CHECKBOX_YES_1.equals(efBmsImModelDto.getEfbmIsTransport())){
    		efBmsImModelDto.setEfbmAttribute003(Constants.SYS_TRANS_SERVICE_0100);//默认短途运输
    	}
    	//是否本公司承运
    	efBmsImModelDto.setEfbmAttribute004(contractLogisticTempleteQueryDto.getIsCompanyCarrier());
    	//货代服务
    	if(Constants.CHECKBOX_YES_1.equals(efBmsImModelDto.getEfbmIsAgent())){
    		efBmsImModelDto.setEfbmAttribute010(contractLogisticTempleteQueryDto.getEoeaFreightService());
    	}
    	//提/运单号(MWB)
    	efBmsImModelDto.setEfbmAttribute031(contractLogisticTempleteQueryDto.getEoeaBulkBillNo());
    	//提/运单号(HWB)
    	efBmsImModelDto.setEfbmAttribute032(contractLogisticTempleteQueryDto.getEoeaHblNo());
    	//发运日
    	efBmsImModelDto.setEfbmDeliveryTime(contractLogisticTempleteQueryDto.getShipmentDate());//efbmAttribute014
    	efBmsImModelDto.setEfbmAttribute014(DateUtil.getStringDateFormat(contractLogisticTempleteQueryDto.getShipmentDate(), "yyyy-MM-dd"));
    	//货物交付时间
    	efBmsImModelDto.setEfbmAttribute016(DateUtil.getStringDateFormat(this.getEoeaShipmentDate(contractLogisticTempleteQueryDto.getEortArrivalTime(), contractLogisticTempleteQueryDto.getEorcArrivalTime(), contractLogisticTempleteQueryDto.getEoeaDeliveryDate()), "yyyy-MM-dd"));
    	//订单受理时间
    	efBmsImModelDto.setEfbmAttribute015(contractLogisticTempleteQueryDto.getOrderAccpetDate());
    	//货物交付时间  陆运任务实际送达时间>化工运输任务实际送达时间>订单扩展表的交货日
    	if(null!=contractLogisticTempleteQueryDto.getEortArrivalTime()){
    		efBmsImModelDto.setEfbmEtd(contractLogisticTempleteQueryDto.getEortArrivalTime());
    	}else if(null!=contractLogisticTempleteQueryDto.getEorcArrivalTime()){
    		efBmsImModelDto.setEfbmEtd(contractLogisticTempleteQueryDto.getEorcArrivalTime());
    	}else if(null!=contractLogisticTempleteQueryDto.getEoeaDeliveryDate()){
    		efBmsImModelDto.setEfbmEtd(contractLogisticTempleteQueryDto.getEoeaDeliveryDate());
    	}
    	//起运国
    	efBmsImModelDto.setEfbmShipperCountryId(contractLogisticTempleteQueryDto.getShipperCountryId());
    	efBmsImModelDto.setEfbmShipperCountryCode(contractLogisticTempleteQueryDto.getShipperCountryCode());
    	efBmsImModelDto.setEfbmAttribute005(contractLogisticTempleteQueryDto.getShipperCountryCode());//起运国code传到bms
    	efBmsImModelDto.setEfbmShipperCountryName(contractLogisticTempleteQueryDto.getShipperCountryName());
    	//始发地
    	efBmsImModelDto.setEfbmShipperCityId(contractLogisticTempleteQueryDto.getShipperCityId());
    	efBmsImModelDto.setEfbmShipperCityQuickCode(contractLogisticTempleteQueryDto.getShipperCityQuickCode());
    	efBmsImModelDto.setEfbmAttribute006(contractLogisticTempleteQueryDto.getShipperCityQuickCode());//始发地快速录入码传到bms
    	efBmsImModelDto.setEfbmShipperCityName(contractLogisticTempleteQueryDto.getShipperCityName());
    	//目的国
    	efBmsImModelDto.setEfbmConsigneeCountryId(contractLogisticTempleteQueryDto.getConsigneeCountryId());
    	efBmsImModelDto.setEfbmConsigneeCountryCode(contractLogisticTempleteQueryDto.getConsigneeCountryCode());
    	efBmsImModelDto.setEfbmAttribute007(contractLogisticTempleteQueryDto.getConsigneeCountryCode());//目的国传到bms
    	efBmsImModelDto.setEfbmConsigneeCountryName(contractLogisticTempleteQueryDto.getConsigneeCountryName());
    	
    	//抵达地
    	efBmsImModelDto.setEfbmConsigneeCityId(contractLogisticTempleteQueryDto.getConsigneeCityId());
    	efBmsImModelDto.setEfbmConsigneeCityQuickCode(contractLogisticTempleteQueryDto.getConsigneeCityQuickCode());
    	efBmsImModelDto.setEfbmAttribute008(contractLogisticTempleteQueryDto.getConsigneeCityQuickCode());//抵达地快速录入码传到bms
    	efBmsImModelDto.setEfbmConsigneeCityName(contractLogisticTempleteQueryDto.getConsigneeCityName());
    	
    	//订单件数
    	if(null != contractLogisticTempleteQueryDto.getEoorQuantity()){
    		efBmsImModelDto.setEfbmAttribute017(String.valueOf(contractLogisticTempleteQueryDto.getEoorQuantity().doubleValue()));
    	}
    	
    	//订单箱量 TEU
    	if(null != contractLogisticTempleteQueryDto.getOrderContainerTeu()){
    		efBmsImModelDto.setEfbmAttribute033(String.valueOf(contractLogisticTempleteQueryDto.getOrderContainerTeu().intValue()));
    	}
    	
    	//订单毛重 吨
    	if(null != contractLogisticTempleteQueryDto.getEoorWeight()){
    		efBmsImModelDto.setEfbmAttribute018(String.valueOf(contractLogisticTempleteQueryDto.getEoorWeight().doubleValue()));
    	}
    	
    	//订单体积
    	if(null != contractLogisticTempleteQueryDto.getEoorVolume()){
    		efBmsImModelDto.setEfbmAttribute019(String.valueOf(contractLogisticTempleteQueryDto.getEoorVolume().doubleValue()));
    	}
    	
    	//订单统计重量
    	if(null != contractLogisticTempleteQueryDto.getEoorNetWeight()){
    		efBmsImModelDto.setEfbmAttribute020(String.valueOf(contractLogisticTempleteQueryDto.getEoorNetWeight().doubleValue()));
    	}
    	//操作环节
    	StringBuffer efbmAttribute011 = new StringBuffer();
    	if (EmptyUtils.isNotEmpty(efBmsImModelDto.getEfbmAttribute011())) {
    		efbmAttribute011.append(efBmsImModelDto.getEfbmAttribute011());
    	}
    	if (contractLogisticTempleteQueryDto.getCountEosi() > 0) {
			if (efbmAttribute011.indexOf("0200") < 0) {
				efbmAttribute011.append("#0200");
			}
		}
		if (contractLogisticTempleteQueryDto.getCountSoso() > 0) {
			if (efbmAttribute011.indexOf("0200") < 0) {
				efbmAttribute011.append("#0200");
			}
		}
		//新增化工运输 
		if (contractLogisticTempleteQueryDto.getCountEort() > 0) {
			if (efbmAttribute011.indexOf("0100") < 0) {
				efbmAttribute011.append("#0100");
			}
		}
		if (contractLogisticTempleteQueryDto.getCountEoea() > 0) {
			if (efbmAttribute011.indexOf("0300") < 0) {
				efbmAttribute011.append("#0300");
			}
		}
		if (efbmAttribute011.indexOf("#") == 0) {
			efbmAttribute011.deleteCharAt(0);
		}
		if (null != efbmAttribute011) {
			efBmsImModelDto.setEfbmAttribute011(efbmAttribute011.toString());
		}
    	//单票操作表基础字段
    	List<FilterCondition> eoorCondition = new ArrayList<>();
    	eoorCondition.add(new FilterCondition("eoorId", eoorId, "="));
    	List<EoOrderModel> eoOrderModels = this.eoOrderManage.findByCondition(eoorCondition);
    	Long eoorEscoId = eoOrderModels.get(0).getEoorEscoId();
    	List<FilterCondition> escoCondition = new ArrayList<>();
    	escoCondition.add(new FilterCondition("escoId", eoorEscoId, "="));
    	List<EsCompanyModel> esCompanyModels = this.esCompanyManager.findByCondition(escoCondition);
    	EsCompanyModel esCompanyModel = new EsCompanyModel();
    	if (EmptyUtils.isNotEmpty(esCompanyModels)) {
    		esCompanyModel = esCompanyModels.get(0);
    	}
    	efBmsImModelDto.setEfbmAttribute099("OMS_" + eoorId);//备注字段99
    	efBmsImModelDto.setEfbmSourceId(eoorId.toString());//sourceid
    	efBmsImModelDto.setEfbmBmsSourceId(eoorId.toString());//bms source id
    	efBmsImModelDto.setEfbmEscoId(eoOrderModels.get(0).getEoorEscoId());
    	efBmsImModelDto.setEfbmEscoCompanyNo(esCompanyModel.getEscoCompanyNo());
    	efBmsImModelDto.setEfbmIsDutyfree(eoOrderModels.get(0).getEoorIsDutyfree());
    	efBmsImModelDto.setEfbmImType("00");
    	efBmsImModelDto.setEfbmSource("1");
    	efBmsImModelDto.setEfbmStatus(0L);
    	efBmsImModelDto.setEfbmNumber(eoOrderModels.get(0).getEoorOrderNo());
    	efBmsImModelDto.setEfbmIsOnlyFee(0L);
    	efBmsImModelDto.setEfbmAttribute030("YWDD");
	}
	
	@Override
	public ResponseData upLoadBmsByContractLogisticTemplete(EfBmsImModelDto efBmsImModelDto, Long eoorId, String businessType) {
		ResponseData responseData = new ResponseData();
		//Step1:获取业务完成时间
		responseData = this.efBusinessFeesSettlementService.getOrderBmsAcceptTime(efBmsImModelDto);
		if (Constants.NO.equals(responseData.getCode())) {
			return responseData;
		}
		if (EmptyUtils.isNotEmpty(efBmsImModelDto.getEfbmAttribute011())) {
            String services = efBmsImModelDto.getEfbmAttribute011();
            if (services.startsWith("#")) {
                if (services.startsWith("#null")) {
                	efBmsImModelDto.setEfbmAttribute011(services.substring(6));
                }else{
                	efBmsImModelDto.setEfbmAttribute011(services.substring(1));
                }
            }
        }
		//step2:根据免税非免税生成单票操作表
		this.efBusinessFeesSettlementService.synchronizeEfbmsImModelType(efBmsImModelDto, efBmsImModelDto.getEfbmImId(), "Y", null);
		//Step3:结算上传
		responseData = this.efBusinessFeesSettlementService.uploadBmsByOrderDimension(efBmsImModelDto, efBmsImModelDto.getEfbmImId(), null, true, businessType);
		if (Constants.NO.equals(responseData.getCode())) {
			return responseData;
		}
		responseData.setCode(Constants.YES);
		responseData.setMsg("上传成功");
		
		ResponseData<EoOrderDto> orderFeeByEoorId = efbfBusinessFeesService.getOrderFeeByEoorId(eoorId);
		
		if (Constants.YES.equals(orderFeeByEoorId.getCode())) {
			List<EfBusinessFeesModel> efBusinessFeesModelList = orderFeeByEoorId.getData().getEfBusinessFeesModelList();
			if (efBusinessFeesModelList.size() > 0) {
				for (EfBusinessFeesModel fee : efBusinessFeesModelList) {
					efbfBusinessFeesService.saveDpInTrack(fee, Constants.DPIT_TYPE_EFBF_SETTLEMENT);//上传完成
				}
			}
		}
		return responseData;
	}
	
	/**
	 * 订单扩展表的交货日    货物交付时间优化取    陆运任务实际送达时间>化工运输任务实际送达时间>订单扩展表的交货日
	 * @author Shoven.Jiang  
	 * @date 2018年9月20日
	 * @return
	 */
	private Date getEoeaShipmentDate(Date eortArrivalTime, Date eorcArrivalTime, Date eoeaDeliveryTime) {
		List<Date> compareDate = new ArrayList<Date>();
		Date eoeaShipmentDate = null;
		if (null != eortArrivalTime) {
			compareDate.add(eortArrivalTime);
		}
		if (null != eorcArrivalTime) {
			compareDate.add(eorcArrivalTime);
		}
		if (null != eoeaDeliveryTime) {
			compareDate.add(eoeaDeliveryTime);
		}
		if (EmptyUtils.isNotEmpty(compareDate)) {
			if (compareDate.size() == 1) {
				eoeaShipmentDate = compareDate.get(0);
			} else {
				eoeaShipmentDate = DateUtil.getMastDateByList(compareDate);
			}
		}
		return eoeaShipmentDate;
	}

	@Override
	public ResponseData upLoadBmsSettmentByContractLogisticTemplete(Long[] efbfIds, Long eoorId, String businessType) {
		ResponseData responseData = new ResponseData();
		EfBmsImModelDto efBmsImModelDto = new EfBmsImModelDto();
		efBmsImModelDto = this.getContractLogisticTemplete(eoorId, businessType);
		//Step1:获取业务完成时间
		responseData = this.efBusinessFeesSettlementService.getOrderBmsAcceptTime(efBmsImModelDto);
		if (Constants.NO.equals(responseData.getCode())) {
			return responseData;
		}
		//step2:根据免税非免税生成单票操作表
		this.efBusinessFeesSettlementService.synchronizeEfbmsImModelType(efBmsImModelDto, efBmsImModelDto.getEfbmImId(), "N", efbfIds);
		//step3:费用现结上传bms
		responseData = this.efBusinessFeesSettlementService.uploadBmsByOrderDimension(efBmsImModelDto, eoorId, efbfIds, true, businessType);
		return responseData;
	}

	@Override
	public ResponseData checkEfbmBmsModelByType14(Long[] eoorIds) {
		ResponseData responseData = new ResponseData<>();
		StringBuffer errmBuffer = new StringBuffer();
		String msgStr = "";
		String efbmNumber = "";//单票操作表中的系统订单号
		List<EfBmsImModelDto> efBmsImModelDtos = new ArrayList<>();
		for (int i = 0; i < eoorIds.length; i++) {
			EfBmsImModelDto efBmsImModelDto = this.getContractLogisticTemplete(eoorIds[i], "14");
			efBmsImModelDto.setEoorId(eoorIds[i]);
			efbmNumber = efBmsImModelDto.getEfbmNumber();
			//全部结算上传由于统计值有些字段只能在统计值界面维护，所以全部结算上传时赋一些默认值
			//上海化工全部结算上传时，发运到达日为空为空，则默认取当前时间赋值
            if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute014())) {
            	Date currentTime = new Date();
        	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	    String efbmAttribute014 = formatter.format(currentTime);
        	    efBmsImModelDto.setEfbmAttribute014(efbmAttribute014);
            }
            //增加货物交付时间填值
            if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute016())) {
            	Date getGoodsTime = new Date();
        	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	    String efbmAttribute016 = formatter.format(getGoodsTime);
        	    efBmsImModelDto.setEfbmAttribute016(efbmAttribute016);
            }
            //是否本公司承运
            if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute004())) {
        	    efBmsImModelDto.setEfbmAttribute004("N");
            }
            //货代服务默认水运
            if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute010())) {
        	    efBmsImModelDto.setEfbmAttribute010("0100");
            }
            //MBL
            if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute031())) {
        	    efBmsImModelDto.setEfbmAttribute010("0");
            }
            //HBL
            if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute032())) {
        	    efBmsImModelDto.setEfbmAttribute010("0");
            }
			msgStr = msgStr + this.checkStatisticalValueByBusinessType14(efBmsImModelDto);
	    	efBmsImModelDtos.add(efBmsImModelDto);
		}
    	if (EmptyUtils.isNotEmpty(msgStr)) {
    		responseData.setCode(Constants.NO);
    		responseData.setMsg(msgStr);
    		return responseData;
    	}
		responseData.setCode(Constants.YES);
		responseData.setData(efBmsImModelDtos);
		return responseData;
	}
	
	/**
	 * 校验合同物流上传时统计值需要校验的信息
	 * @author Shoven.Jiang  
	 * @date 2018年10月25日
	 * @param efBmsImModelDto
	 * @return
	 */
	private String checkStatisticalValueByBusinessType14(EfBmsImModelDto efBmsImModelDto) {
		StringBuffer errmBuffer = new StringBuffer();
		String msgStr = "";
		String efbmNumber = efBmsImModelDto.getEfbmNumber();//单票操作表中的系统订单号
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute020())) {
			errmBuffer.append("订单统计重量(吨)不能为空\n");
		}
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute033())) {
			errmBuffer.append("订单箱量(TEU)不能为空\n");
		}
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute006())) {
			errmBuffer.append("始发地不能为空\n");
		}
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute005())) {
			errmBuffer.append("起运国不能为空\n");
		}
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute007())) {
			errmBuffer.append("目的国不能为空\n");
		}
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute008())) {
			errmBuffer.append("抵达地不能为空\n");
		}
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute015())) {
			errmBuffer.append("订单受理时间不能为空\n");
		}
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute001())) {
			errmBuffer.append("流向不能为空\n");
		}
		//仓储
		if (Constants.ORDER_ANOMAL_CLASS_1.equals(efBmsImModelDto.getEfbmIsStorage())) {
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute009())) {
				errmBuffer.append("仓储服务不能为空\n");
			}
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute013())) {
				errmBuffer.append("出入库时间不能为空\n");
			}
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute002())) {
				errmBuffer.append("仓库代码不能为空\n");
			}
		}
		//运输
		if (Constants.ORDER_ANOMAL_CLASS_1.equals(efBmsImModelDto.getEfbmIsTransport())) {
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute003())) {
				errmBuffer.append("运输服务不能为空\n");
			}
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute014())) {
				errmBuffer.append("发运/到达日不能为空\n");
			}
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute004())) {
				errmBuffer.append("是否本公司承运不能为空\n");
			}
		}
		//代理
		if (Constants.ORDER_ANOMAL_CLASS_1.equals(efBmsImModelDto.getEfbmIsAgent())) {
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute010())) {
				errmBuffer.append("货代服务不能为空\n");
			}
		}
		//增值
		if (Constants.ORDER_ANOMAL_CLASS_1.equals(efBmsImModelDto.getEfbmIsAdd())) {
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute012())) {
				errmBuffer.append("增值服务不能为空\n");
			}
		}
		//MBL号
		if (EmptyUtils.isNotEmpty(efBmsImModelDto.getEfbmAttribute010()) && (efBmsImModelDto.getEfbmAttribute010() == "0100" || efBmsImModelDto.getEfbmAttribute010() == "0200" || efBmsImModelDto.getEfbmAttribute010() == "0300" || efBmsImModelDto.getEfbmAttribute010() == "0400")) {
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute031())) {
				errmBuffer.append("货代服务为水运（海运、内河）、空运、陆运、铁路时提/运单号(MWB)不能为空\n");
			}
		}
		//HWB校验
		if (EmptyUtils.isNotEmpty(efBmsImModelDto.getEfbmAttribute010()) && efBmsImModelDto.getEfbmAttribute010() == "0500") {
			if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute032())) {
				errmBuffer.append("货代服务为多式联运时提/运单号(HWB)不能为空\n");
			}
		}
		if (EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute017()) && EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute018()) && EmptyUtils.isEmpty(efBmsImModelDto.getEfbmAttribute019())) {
			errmBuffer.append("订单件数、订单体积、订单毛重至少维护一项\n");
		}
		
		if (EmptyUtils.isNotEmpty(errmBuffer.toString())) {
			msgStr = "系统订单号为：" + efbmNumber + "\n" + errmBuffer.toString();
		}
		return msgStr;
	}

}
