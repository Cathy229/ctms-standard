package com.sinotrans.oms.eoorder.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;
import com.sinotrans.oms.common.util.BeanUtils;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.JsonUtils;
import com.sinotrans.oms.common.util.NumberUtil;
import com.sinotrans.oms.eoorder.dto.EoConsignmentDto;
import com.sinotrans.oms.eoorder.dto.EoConsignmentModelDto;
import com.sinotrans.oms.eoorder.dto.EoConsignmentQueryDto;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.dto.EocmAndAcceptDto;
import com.sinotrans.oms.eoorder.manager.EoConsignmentManager;
import com.sinotrans.oms.eoorder.manager.EoConsignmentMaterielManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.manager.EoOrderMaterielManager;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.service.EoConsignmentService;
import com.sinotrans.oms.eoorder.service.EoOrderService;

@Service
public class EoConsignmentServiceImpl implements EoConsignmentService{

	@Autowired
	private EoConsignmentManager eoConsignmentManager;//manage层只作为和DB交互，不处理业务逻辑
	@Autowired
	private EoConsignmentMaterielManager eoConsignmentMaterielManager;
	@Autowired
	private EoOrderService eoOrderService;
	@Autowired
	private EoOrderManager eoOrderManager;
	@Autowired
	private EoOrderMaterielManager eoOrderMaterielManager;
	/**
	 * 通过前台传进来的json数据进行数据查询，然后将查询到的值返回到前台
	 * add by shoven
	 * @param json
	 * @return
	 */
	@Override
	public Response findEoConsignmentByCondition(String json, String token) {
		EoConsignmentModel eoConsignmentModel = JsonUtils.json2Bean(json, EoConsignmentModel.class);
		List<EoConsignmentMaterielModel> eoConsignmentMaterielModelList = new ArrayList<EoConsignmentMaterielModel>();
		EoConsignmentQueryDto queryDto = new EoConsignmentQueryDto();
		Map<String, Object> conditions = new HashMap<String, Object>();
		//conditions.put("eocsEscoId", "5008000");//公司ID
		conditions.put("eocsSoNo", "4002805090");//so号
		conditions.put("eocssubstr16", "Y");//已经发送邮件通知客户
		conditions.put("eocsCcPlanStatus", "1");//项目执行计划执行情况
		//查询头信息
		List<EoConsignmentModel> eoConsignmentModelList = eoConsignmentManager.findEoConsignmentListByCondition(conditions);
		Response response = new ResponseData<EoConsignmentQueryDto>();
		if (EmptyUtils.isEmpty(eoConsignmentModelList)) {
			response.setCode("N");
			response.setMsg("无查询结果");
			return response;
		} else {
			eoConsignmentModel = eoConsignmentModelList.get(0);
			eoConsignmentMaterielModelList = this.findEoConsignmentMaterielByCondition(eoConsignmentModelList);
		}
		//显示在界面上的数据拼接
		if (!EmptyUtils.isEmpty(eoConsignmentMaterielModelList)) {
			EoConsignmentMaterielModel eoConsignmentMaterielModel = eoConsignmentMaterielModelList.get(0);
			eoConsignmentModel.setEocsSubstr18(eoConsignmentMaterielModel.getEocmSubstr18());//总件数
			eoConsignmentModel.setEocsSubstr19(eoConsignmentMaterielModel.getEocmSubstr19());//总毛重
			eoConsignmentModel.setEocsSubstr20(eoConsignmentMaterielModel.getEocmSubstr20());//总净重
		}
		String eocsShipperEbsaContact = this.emptyReturnValue(eoConsignmentModel.getEocsShipperEbsaContact());//发货联系人
		String eocsShipperEbsaTel = this.emptyReturnValue(eoConsignmentModel.getEocsShipperEbsaTel());//发货联系人电话
		String eocsConsigneeEbsaContact = this.emptyReturnValue(eoConsignmentModel.getEocsConsigneeEbsaContact());//收货联系人
		String eocsConsigneeEbsaTel = this.emptyReturnValue(eoConsignmentModel.getEocsConsigneeEbsaTel());//收货联系人电话
		String eocsShipperEbsaContactValue = this.getEocsConsigneeEbsaTel(eocsShipperEbsaContact, eocsShipperEbsaTel);//发货联系人、电话
		String eocsConsigneeEbsaContactValue = this.getEocsConsigneeEbsaTel(eocsConsigneeEbsaContact, eocsConsigneeEbsaTel);//收货联系人、电话
		eoConsignmentModel.setEocsShipperEbsaContact(eocsShipperEbsaContactValue);
		eoConsignmentModel.setEocsConsigneeEbsaContact(eocsConsigneeEbsaContactValue);
		queryDto.setFormModel(eoConsignmentModel);
		queryDto.setGridList(eoConsignmentMaterielModelList);
		response.setCode("Y");
		return new ResponseData<EoConsignmentQueryDto>(queryDto);
	}

	/**
	 * 通过界面头信息查询出列表信息
	 * @author shoven
	 * @param request
	 * @param json
	 * @return
	 */
	public List<EoConsignmentMaterielModel> findEoConsignmentMaterielByCondition(List<EoConsignmentModel> eoConsignmentModelList) {
		EoConsignmentMaterielModel eoConsignmentMaterielModel = new EoConsignmentMaterielModel();
		Map<String, Object> eocmConditions = new HashMap<String, Object>();
		//查询出订单委托表的ID，用来查询委托物料信息
		List<Long> eocmEocsIdList = new ArrayList<Long>();
		if (!EmptyUtils.isEmpty(eoConsignmentModelList)) {
			for (int i = 0; i < eoConsignmentModelList.size(); i++) {
				eocmEocsIdList.add(eoConsignmentModelList.get(i).getEocsId());
			}
		}
		eocmConditions.put("eocmEocsIds", eocmEocsIdList);
		List<EoConsignmentMaterielModel> eoConsignmentMaterielModelList = eoConsignmentManager.findEoConsignmentMaterielListByCondition(eocmConditions);
		this.getCountEocm(eoConsignmentMaterielModelList);
		return eoConsignmentMaterielModelList;
		
	}
	
	/**
	 * 显示在界面中的净重，毛重，件数的总和
	 * @author shoven
	 * @param eocmList
	 */
	public void getCountEocm(List<EoConsignmentMaterielModel> eocmList) {
		double eocmQuatity = 0;//件数
		double eoomGrossWeight = 0;//毛重
		double eoomNetWeight = 0;//净重
		for (int i = 0; i < eocmList.size(); i++) {
			if (eocmList.get(i).getEocmQuantity() != null) {
				eocmQuatity = eocmQuatity + Double.valueOf(eocmList.get(i).getEocmQuantity());
			}
			if (eocmList.get(i).getEocmGrossWeight() != null) {
				eoomGrossWeight = eoomGrossWeight + Double.valueOf(eocmList.get(i).getEocmGrossWeight());
			}
			if (eocmList.get(i).getEocmNetWeight() != null) {
				eoomNetWeight = eoomNetWeight + Double.valueOf(eocmList.get(i).getEocmNetWeight());
			}
		}
		for (int i = 0; i < eocmList.size(); i++) {
			eocmList.get(i).setEocmSubstr18(String.valueOf(eocmQuatity));//件数
			eocmList.get(i).setEocmSubstr19(String.valueOf(eoomGrossWeight));//毛重
			eocmList.get(i).setEocmSubstr20(String.valueOf(eoomNetWeight));//净重
		}
	}

	/**
	 * 判断是不是空值，并返回结果
	 * @return
	 */
   private String emptyReturnValue(String inValue) {
	   String outValue = "";
	   if (inValue == null || inValue == "") {
		   outValue = "";
	   } else {
		   outValue = inValue;
	   }
	   return outValue;
   }
   
   /**
    * 判断发货以及收货联系人电话，增加页面显示效果
    * @param ebsaContact
    * @param ebsaTel
    * @return
    */
   private String getEocsConsigneeEbsaTel(String ebsaContact, String ebsaTel) {
	   String ebsaContactValue = "";//发货联系人、电话
	   if (EmptyUtils.isNotEmpty(ebsaContact) && EmptyUtils.isNotEmpty(ebsaTel)) {
		   ebsaContactValue = ebsaContact + "/" + ebsaTel;
	   } else if (EmptyUtils.isNotEmpty(ebsaContact) && EmptyUtils.isEmpty(ebsaTel)) {
		   ebsaContactValue = ebsaContact;
	   } else if (EmptyUtils.isEmpty(ebsaContact) && EmptyUtils.isNotEmpty(ebsaTel)) {
		   ebsaContactValue = ebsaTel;
	   } else if (EmptyUtils.isEmpty(ebsaContact) && EmptyUtils.isEmpty(ebsaTel)) {
		   ebsaContactValue = "";
	   }
	   return ebsaContactValue;
   }

   /**
    * 保存委托受理表测试
    * add by shoven 
    * 2018年7月22日15:36:42
    */
	@Override
	public void saveEoConsignmentModel(String json) {
		Long eocsId = 103780L;
		EoConsignmentModel eoConsignmentModel = this.eoConsignmentManager.get(eocsId);
		eoConsignmentModel.setModifyTime(new Date());
		eoConsignmentModel.setModifier("20180722");
		this.eoConsignmentManager.save(eoConsignmentModel);
	}

	@Override
	public ResponseData<EoConsignmentDto> getConsignmentById(Long eocsId) {
		ResponseData<EoConsignmentDto> responseData = new ResponseData<>();
		EoConsignmentDto eoConsignmentDto = getEocsAndEocmList(eocsId);
		
		responseData.setData(eoConsignmentDto);
		responseData.setCode(Constants.YES);
		responseData.setMsg("查询委托订单成功");
		return responseData;
	}

	private EoConsignmentDto getEocsAndEocmList(Long eocsId) {
		EoConsignmentDto eoConsignmentDto = new EoConsignmentDto();
		
		EoConsignmentModel eoConsignmentModel = eoConsignmentManager.get(eocsId);
		eoConsignmentDto.setEoConsignmentModel(eoConsignmentModel);
		
		List<FilterCondition> conditions = new ArrayList<>();
		conditions.add(new FilterCondition("eocmEocsId",eocsId,"="));
		List<EoConsignmentMaterielModel> eocmList = eoConsignmentMaterielManager.findByCondition(conditions );
		eoConsignmentDto.setEoConsignmentMaterielModelList(eocmList);
		return eoConsignmentDto;
	}
	
	@Override
	public ResponseData batchDeleteConsignmentMaterial(Collection<Long> eosrIds) {
		ResponseData<EoConsignmentDto> responseData = new ResponseData<>();
		try {
			eoConsignmentMaterielManager.deleteByPks(eosrIds);
			responseData.setCode(Constants.YES);
			responseData.setMsg("批量删除委托订单物料成功");
		} catch (Exception e) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("批量删除委托订单物料失败-->"+e.getMessage());
			e.printStackTrace();
			return responseData;
		}
		return responseData;
	}
	
	@Override
	public ResponseData<List<EoConsignmentMaterielModel>> saveConsignmentMateriel(List<EoConsignmentMaterielModel> eoConsignmentModelList) {
		ResponseData<List<EoConsignmentMaterielModel>> responseData = new ResponseData<>();
		try {
			List<EoConsignmentMaterielModel> eocmList = eoConsignmentMaterielManager.saveAll(eoConsignmentModelList);
			responseData.setData(eocmList);
			responseData.setCode(Constants.YES);
			responseData.setMsg("保存成功");
		} catch (Exception e) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败-->"+e.getMessage());
			e.printStackTrace();
			return responseData;
		}
		return responseData;
	}
	
	@Override
	public ResponseData entrustOrder(Long eocsId) {
		ResponseData responseData = new ResponseData();
		
		EoConsignmentModel eocsModel = eoConsignmentManager.get(eocsId);
		
		List<FilterCondition> conditions = new ArrayList<>();
		conditions.add(new FilterCondition("eocmEocsId",eocsId,"="));
		List<EoConsignmentMaterielModel> eocmList = eoConsignmentMaterielManager.findByCondition(conditions );
		if (eocmList.size() == 0) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("委托物料信息不能为空");
			return responseData;
		}
		//受理信息求和
		EoOrderModel eoorModel = new EoOrderModel();
		Double eocmAcceptQuantity = 0D;
		Double eocmAcceptGrossWeight = 0D;
		Double eocmAcceptNetWeight = 0D;
		Double eocmAcceptVolume = 0D;
		
		List<EoConsignmentMaterielModel> eocms = new ArrayList<>();
		for (EoConsignmentMaterielModel eocmModel : eocmList) {
			//校验物料总和>=受理物料
			if (eocmModel.getEocmAcceptQuantity() == 0D && eocmModel.getEocmAcceptGrossWeight() == 0D 
					&& eocmModel.getEocmAcceptNetWeight()== 0D && eocmModel.getEocmAcceptVolume() == 0D) {
				continue;
			}
			if (eocmModel.getEocmAcceptQuantity() == 0D || eocmModel.getEocmAcceptGrossWeight() == 0D 
					|| eocmModel.getEocmAcceptNetWeight()== 0D || eocmModel.getEocmAcceptVolume() == 0D) {
				String msg  = eocmModel.getEocmAcceptQuantity() == 0D ? "受理件数为0,":"";
				msg  += eocmModel.getEocmAcceptGrossWeight() == 0D ? "受理毛重为0,":"";
				msg  += eocmModel.getEocmAcceptNetWeight() == 0D ? "受理净重为0,":"";
				msg  += eocmModel.getEocmAcceptVolume() == 0D ? "受理件数为0,":"";
				msg = msg.substring(0,msg.length()-1);
				responseData.setCode(Constants.NO);
				responseData.setMsg("物料名称为"+eocmModel.getEocmEbmaNameCn()+"的物料受理信息有误("+msg+"),请维护!!");
				return responseData;
			}
			if (eocmModel.getEocmAcceptQuantity() > eocmModel.getEocmQuantity() 
					|| eocmModel.getEocmAcceptGrossWeight() > eocmModel.getEocmGrossWeight() 
					|| eocmModel.getEocmAcceptNetWeight()> eocmModel.getEocmNetWeight()
					|| eocmModel.getEocmAcceptVolume() > eocmModel.getEocmVolume()) {
				String msg  = eocmModel.getEocmAcceptQuantity() > eocmModel.getEocmQuantity() ? "受理件数大于总件数,":"";
				msg  += eocmModel.getEocmAcceptGrossWeight() > eocmModel.getEocmGrossWeight() ? "受理毛重大于总毛重,":"";
				msg  += eocmModel.getEocmAcceptNetWeight()> eocmModel.getEocmNetWeight() ? "受理净重大于总净重,":"";
				msg  += eocmModel.getEocmAcceptVolume() > eocmModel.getEocmVolume() ? "受理件数大于总件数,":"";
				msg = msg.substring(0,msg.length()-1);
				responseData.setCode(Constants.NO);
				responseData.setMsg("物料名称为"+eocmModel.getEocmEbmaNameCn()+"的物料受理信息有误("+msg+"),请维护!!");
				return responseData;
			}
			eocmAcceptQuantity += eocmModel.getEocmAcceptQuantity();
			eocmAcceptGrossWeight += eocmModel.getEocmAcceptGrossWeight();
			eocmAcceptNetWeight += eocmModel.getEocmAcceptNetWeight();
			eocmAcceptVolume += eocmModel.getEocmAcceptVolume();
			eocms.add(eocmModel);
		}
		if (eocms.size() == 0) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("暂无要受理的委托物料信息,请维护");
			return responseData;
		}
		//将总受理物料信息保存到订单表
		eoorModel.setEoorQuantity(eocmAcceptQuantity);
		eoorModel.setEoorWeight(eocmAcceptGrossWeight);
		eoorModel.setEoorNetWeight(eocmAcceptNetWeight);
		eoorModel.setEoorVolume(eocmAcceptVolume);
		//下达订单
		ResponseData<EoOrderDto> response = new ResponseData<>();
		EoOrderDto eoOrderDto = new EoOrderDto();
		try {
			response = eocsToEoor(eocsModel,eoorModel);
			if (Constants.NO.equals(response.getCode())) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("委托下达生成订单有误:"+response.getMsg());
				return responseData;
			}
			eoOrderDto = response.getData();
		} catch (Exception e) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("委托下达生成订单有误:"+e.getMessage());
			e.printStackTrace();
			return responseData;
		}
		//下达订单物料
		try {
			List<EoOrderMaterielModel> eoomList = eocmList2EoomList(eocmList,response.getData().getEoOrderModel().getEoorId());
			eoOrderDto.setEoOrderMaterielModelList(eoomList);
			responseData.setData(eoOrderDto);
			responseData.setCode(Constants.YES);
			responseData.setMsg("委托下达成功");
		} catch (Exception e) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("委托下达生成订单物料有误"+e.getMessage());
			e.printStackTrace();
			return responseData;
		}
		/*//将委托物料表及委托表的信息更新
		for (EoConsignmentMaterielModel eocmModel : eocmList) {
			eocmModel.setEocmQuantity(eocmModel.getEocmAcceptQuantity());
			eocmModel.setEocmGrossWeight(eocmModel.getEocmAcceptGrossWeight());
			eocmModel.setEocmNetWeight(eocmModel.getEocmAcceptNetWeight());
			eocmModel.setEocmVolume(eocmModel.getEocmAcceptVolume());
			eocmModel.setEocmAcceptQuantity(0D);
			eocmModel.setEocmAcceptGrossWeight(0D);
			eocmModel.setEocmAcceptNetWeight(0D);
			eocmModel.setEocmAcceptVolume(0D);
		}
		List<EoConsignmentMaterielModel> afterEocmList = new ArrayList<>();
		try {
			afterEocmList = eoConsignmentMaterielManager.saveAll(eocmList);
			eocsModel.setEocsQuantity(eocsModel.getEocsQuantity() - eocmAcceptQuantity);
			eocsModel.setEocsWeight(eocsModel.getEocsWeight() - eocmAcceptGrossWeight);
			eocsModel.setEocsNetWeight(eocsModel.getEocsNetWeight() - eocmAcceptQuantity);
			eocsModel.setEocsVolume(eocsModel.getEocsVolume() - eocmAcceptQuantity);
			EoConsignmentModel eocs = eoConsignmentManager.save(eocsModel);
		} catch (Exception e) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("跟新委托物料及委托信息失败");
			e.printStackTrace();
		}*/
		responseData.setData(eocmList);
		return responseData;
	}

	private List<EoOrderMaterielModel> eocmList2EoomList(List<EoConsignmentMaterielModel> eocmList,Long eoorId) throws Exception{
		List<EoOrderMaterielModel> eoomList = new ArrayList<>();
		for (EoConsignmentMaterielModel eocmModel : eocmList) {
			if (eocmModel.getEocmAcceptQuantity() != 0D 
					&& eocmModel.getEocmAcceptGrossWeight() != 0D 
					&& eocmModel.getEocmAcceptNetWeight() != 0D 
					&&eocmModel.getEocmAcceptVolume() != 0D) {
				eocmToEoom(eocmModel,eoomList,eoorId);
			}
		}
		ResponseData<List<EoOrderMaterielModel>> responseData = this.eoOrderService.batchSaveOrderMaterial(eoomList);
		return responseData.getData();
	}

	private void eocmToEoom(EoConsignmentMaterielModel eocmModel,List<EoOrderMaterielModel> eoomList,Long eoorId) throws Exception{
		
		EoOrderMaterielModel eoomModel = new EoOrderMaterielModel();
		if (eocmModel.getEocmMaterialNo() != null) {
			eoomModel.setEoomMaterialNo(eocmModel.getEocmMaterialNo());
		}
		if (eocmModel.getEocmEbmaNameCn() != null) {
			eoomModel.setEoomEbmaNameCn(eocmModel.getEocmEbmaNameCn());
		}
		if (eocmModel.getEocmEbmaId() != null) {
			eoomModel.setEoomEbmaId(eocmModel.getEocmEbmaId());
		}
		if (eocmModel.getEocmType() != null) {
			eoomModel.setEoomType(eocmModel.getEocmType());
		}
		
		if (eocmModel.getEocmAcceptQuantity() != 0D 
				&& eocmModel.getEocmAcceptGrossWeight() != 0D 
				&& eocmModel.getEocmAcceptNetWeight() != 0D 
				&&eocmModel.getEocmAcceptVolume() != 0D) {
			eoomModel.setEoomQuantity(eocmModel.getEocmAcceptQuantity());
			eoomModel.setEoomGrossWeight(eocmModel.getEocmAcceptGrossWeight());
			eoomModel.setEoomNetWeight(eocmModel.getEocmAcceptNetWeight());
			eoomModel.setEoomVolume(eocmModel.getEocmAcceptVolume());
		}
		if (eocmModel.getEocmMaterialDesc() != null) {
			eoomModel.setEoomMaterialDesc(eocmModel.getEocmMaterialDesc());
		}
		if (eocmModel.getEocmEbtpModel() != null) {
			eoomModel.setEoomEbtpModel(eocmModel.getEocmEbtpModel());
		}
		if (eocmModel.getEocmEbtpId() != null) {
			eoomModel.setEoomEbtpId(eocmModel.getEocmEbtpId());
		}
		if (eocmModel.getEocmEbtpPackage() != null) {
			eoomModel.setEoomEbtpPackage(eocmModel.getEocmEbtpPackage());
		}
		if (eocmModel.getEocmStatus() != null) {
			eoomModel.setEoomStatus(eocmModel.getEocmStatus());
		}
		if (eocmModel.getEocmEbtpPackageType() != null) {
			eoomModel.setEoomEbtpPackageType(eocmModel.getEocmEbtpPackageType());
		}
		eoomModel.setEoomEoorId(eoorId);
		if (eocmModel.getEocmSubstr11() != null) {
			eoomModel.setEoomMark(eocmModel.getEocmSubstr11());
		}
		if (eocmModel.getEocmSubstr12() != null) {
			eoomModel.setEoomEbmaNameEn(eocmModel.getEocmSubstr12());
		}
		eoomList.add(eoomModel);
	}

	private ResponseData<EoOrderDto> eocsToEoor(EoConsignmentModel eocsModel,EoOrderModel eoorModel) throws Exception{
		EoOrderDto eoOrderDto = new EoOrderDto();
		EoOrderExpandAgencyModel eoeaModel = new EoOrderExpandAgencyModel();
		if (eocsModel.getEocsEbpjId() != null) {
			eoorModel.setEoorEbpjId(eocsModel.getEocsEbpjId());
		}
		if (eocsModel.getEocsEbpjName() != null) {
			eoorModel.setEoorEbpjName(eocsModel.getEocsEbpjName());
		}
		if (eocsModel.getEocsEscoId() != null) {
			eoorModel.setEoorEscoId(eocsModel.getEocsEscoId());
		}
		if (eocsModel.getEocsEsdeName() != null) {
			eoorModel.setEoorEsdeName(eocsModel.getEocsEsdeName());
		}
		if (eocsModel.getEocsEsdeId() != null) {
			eoorModel.setEoorEsdeId(eocsModel.getEocsEsdeId());
		}
		if (eocsModel.getEocsType() != null) {
			eoorModel.setEoorType(eocsModel.getEocsType());
		}
		if (eocsModel.getEocsConsignorEbcuName() != null) {
			eoorModel.setEoorConsignorEbcuName(eocsModel.getEocsConsignorEbcuName());
		}
		if (eocsModel.getEocsConsignorEbcuCode() != null) {
			eoorModel.setEoorConsignorEbcuCode(eocsModel.getEocsConsignorEbcuCode());
		}
		if (eocsModel.getEocsConsignorEbcuId() != null) {
			eoorModel.setEoorConsignorEbcuId(eocsModel.getEocsConsignorEbcuId());
		}
		if (eocsModel.getEocsSoNo() != null) {
			eoorModel.setEoorSoNo(eocsModel.getEocsSoNo());
		}
		/*if (eocsModel.getEocsDoNo() != null) {
			eoorModel.setEoorDoNo(eocsModel.getEocsDoNo());
		}*/
		
		if (eocsModel.getEocsStartEbrgNameCn() != null) {
			eoorModel.setEoorStartEbrgNameCn(eocsModel.getEocsStartEbrgNameCn());
		}
		if (eocsModel.getEocsStartEbrgId() != null) {
			eoorModel.setEoorStartEbrgId(eocsModel.getEocsStartEbrgId());
		}
		if (eocsModel.getEocsEndEbrgNameCn() != null) {
			eoorModel.setEoorEndEbrgNameCn(eocsModel.getEocsEndEbrgNameCn());
		}
		if (eocsModel.getEocsEndEbrgId() != null) {
			eoorModel.setEoorEndEbrgId(eocsModel.getEocsEndEbrgId());
		}
		
		if (eocsModel.getEocsStartEbrgNameCn() != null) {
			eoeaModel.setEoeaDeliveryPlace(eocsModel.getEocsStartEbrgNameCn());
		}
		if (eocsModel.getEocsEndEbrgNameCn() != null) {
			eoeaModel.setEoeaReceiptPlaceName(eocsModel.getEocsEndEbrgNameCn());
		}
		
		if (eocsModel.getEocsOrderDate() != null) {
			eoorModel.setEoorOrderDate(eocsModel.getEocsOrderDate());
		}
		/*if (eocsModel.getEocsOrderFudeji() != null) {
			eoorModel.setEoorOrderFudeji(eocsModel.getEocsOrderFudeji());
		}*/
		
		if (eocsModel.getEocsShipperEbspId() != null) {
			eoorModel.setEoorShipperEbspId(eocsModel.getEocsShipperEbspId());
		}
		if (eocsModel.getEocsShipperEbspCode() != null) {
			eoorModel.setEoorShipperEbspCode(eocsModel.getEocsShipperEbspCode());
		}
		if (eocsModel.getEocsShipperEbspNameCn() != null) {
			eoorModel.setEoorShipperEbspNameCn(eocsModel.getEocsShipperEbspNameCn());
		}
		if (eocsModel.getEocsShipperEbsaPost() != null) {
			eoorModel.setEoorShipperEbsaPost(eocsModel.getEocsShipperEbsaPost());
		}
		if (eocsModel.getEocsShipperEbsaContact() != null) {
			eoorModel.setEoorShipperEbsaContact(eocsModel.getEocsShipperEbsaContact());
		}
		if (eocsModel.getEocsShipperEbsaTel() != null) {
			eoorModel.setEoorShipperEbsaTel(eocsModel.getEocsShipperEbsaTel());
		}
		if (eocsModel.getEocsShipperEbsaAddress() != null) {
			eoorModel.setEoorShipperEbsaAddress(eocsModel.getEocsShipperEbsaAddress());
		}
		
		if (eocsModel.getEocsConsigneeEbspId() != null) {
			eoorModel.setEoorConsigneeEbspId(eocsModel.getEocsConsigneeEbspId());
		}
		if (eocsModel.getEocsConsigneeEbspCode() != null) {
			eoorModel.setEoorConsigneeEbspCode(eocsModel.getEocsConsigneeEbspCode());
		}
		if (eocsModel.getEocsConsigneeEbspNameCn() != null) {
			eoorModel.setEoorConsigneeEbspNameCn(eocsModel.getEocsConsigneeEbspNameCn());
		}
		if (eocsModel.getEocsConsigneeEbsaPost() != null) {
			eoorModel.setEoorConsigneeEbsaPost(eocsModel.getEocsConsigneeEbsaPost());
		}
		if (eocsModel.getEocsConsigneeEbsaContact() != null) {
			eoorModel.setEoorConsigneeEbsaContact(eocsModel.getEocsConsigneeEbsaContact());
		}
		if (eocsModel.getEocsConsigneeEbsaTel() != null) {
			eoorModel.setEoorConsigneeEbsaTel(eocsModel.getEocsConsigneeEbsaTel());
		}
		if (eocsModel.getEocsConsigneeEbsaAddress() != null) {
			eoorModel.setEoorConsigneeEbsaAddress(eocsModel.getEocsConsigneeEbsaAddress());
		}
		eoorModel.setEoorEocsId(eocsModel.getEocsId());//订单表保存委托表主键
		eoOrderDto.setEoOrderModel(eoorModel);
		eoOrderDto.setEoOrderExpandAgencyModel(eoeaModel);
		//保存订单
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		return responseData;
	}

	@Override
	public ResponseData<EoConsignmentModel> saveConsignment(EoConsignmentModelDto eoConsignmentModelDto) {
		ResponseData<EoConsignmentModel> responseData = new ResponseData<>();
		
		EoConsignmentModel eoConsignmentModel = new EoConsignmentModel();
		
		// SO NO
		BlukInsertUtils.copyPropertiesNonNull(eoConsignmentModel, eoConsignmentModelDto);
		/*if (EmptyUtils.isEmpty(eoConsignmentModel.getEocsSoNo())) {
			String eoorSoNo = NOGeneratorUtil.currentValue(Constants.ORDER_SONO);
			eoConsignmentModel.setEocsSoNo(eoorSoNo);
		}*/
		
		if (eoConsignmentModel.getEocsId() == null) {
			eoConsignmentModel.setEocsOrderDate(new Date());
			eoConsignmentModel.setEocsDataSource(Constants.EOOR_SOURCE_11);//与其他系统订单区别
		}
		//系统委托号
        if (EmptyUtils.isEmpty(eoConsignmentModel.getEocsConsignmentNo())) {
            String eocsConsignmentNo = NOGeneratorUtil.currentValue(Constants.EOCS_NO);
            eoConsignmentModel.setEocsConsignmentNo(eocsConsignmentNo);
        }
        
		try {
			EoConsignmentModel eocsModel = eoConsignmentManager.save(eoConsignmentModel);
			responseData.setData(eocsModel);
			responseData.setCode(Constants.YES);
			responseData.setMsg("委托订单保存成功");
		} catch (Exception e) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("委托订单保存失败-->"+e.getMessage());
			e.printStackTrace();
			return responseData;
		}
		return responseData;
	}

	@Override
	public ResponseData saveEocmTotalInfo2Eocs(Long eocsId) {
		ResponseData responseData = new ResponseData();
		if (eocsId != null) {
			try {
				List<FilterCondition> conditions = new ArrayList<>();
				conditions.add(new FilterCondition("eocmEocsId",eocsId,"="));
				List<EoConsignmentMaterielModel> eocmList = this.eoConsignmentMaterielManager.findByCondition(conditions );
				Double eocmQuantityTotal = 0D;
				Double eocmGrossWeightTotal = 0D;
				Double eocmNetWeightTotal = 0D;
				Double eocmVolumeTotal = 0D;
				//Map<String, List<Double>> eocmTotals = new HashMap<>();
				
				if (eocmList.size() != 0) {
					for (EoConsignmentMaterielModel eocmModel : eocmList) {
						eocmQuantityTotal = NumberUtil.doubleAdd(eocmQuantityTotal, eocmModel.getEocmQuantity()==null?0D:eocmModel.getEocmQuantity());
						eocmGrossWeightTotal = NumberUtil.doubleAdd(eocmGrossWeightTotal, eocmModel.getEocmGrossWeight()==null?0D:eocmModel.getEocmGrossWeight());
						eocmNetWeightTotal = NumberUtil.doubleAdd(eocmNetWeightTotal, eocmModel.getEocmNetWeight()==null?0D:eocmModel.getEocmNetWeight());
						eocmVolumeTotal = NumberUtil.doubleAdd(eocmVolumeTotal, eocmModel.getEocmVolume()==null?0D:eocmModel.getEocmVolume());
					}
				}
				EoConsignmentModel eocsModel = this.eoConsignmentManager.get(eocsId);
				eocsModel.setEocsQuantity(eocmQuantityTotal);
				eocsModel.setEocsWeight(eocmGrossWeightTotal);
				eocsModel.setEocsNetWeight(eocmNetWeightTotal);
				eocsModel.setEocsVolume(eocmVolumeTotal);
				Map<String, Object> map = new HashMap<>();
				if (getIsIssuedEndInfo(eocsId)) {
					eocsModel.setEocsIsIssuedEnd(Constants.YES);
					map.put("eocsIsIssuedEnd", Constants.YES);
				}else{
					eocsModel.setEocsIsIssuedEnd(Constants.NO);
					map.put("eocsIsIssuedEnd", Constants.NO);
				}
				EoConsignmentModel afterEocs = this.eoConsignmentManager.save(eocsModel);
				
				map.put("eocmQuantityTotal", NumberUtil.getRoundDoubleToSting(eocmQuantityTotal, 0, true));
				map.put("eocmGrossWeightTotal",NumberUtil.getRoundDoubleToSting(eocmGrossWeightTotal, 3, true) );
				map.put("eocmNetWeightTotal",NumberUtil.getRoundDoubleToSting(eocmNetWeightTotal, 3, true) );
				map.put("eocmVolumeTotal",NumberUtil.getRoundDoubleToSting(eocmVolumeTotal, 3, true) );
				
				Map<String, List<Double>> eoomTotals = getEoorTotalInfo(eocsId);
				Set<String> eocmMaterialNos = eoomTotals.keySet();
				
				Double eocmAcceptQuantityTotal = 0D;
				Double eocmAcceptGrossWeightTotal = 0D;
				Double eocmAcceptNetWeightTotal = 0D;
				Double eocmAcceptVolumeTotal = 0D;
				for (String eocmMaterialNo : eocmMaterialNos) {
					eocmAcceptQuantityTotal = NumberUtil.doubleAdd(eocmAcceptQuantityTotal, eoomTotals.get(eocmMaterialNo).get(0));
					eocmAcceptGrossWeightTotal = NumberUtil.doubleAdd(eocmAcceptGrossWeightTotal, eoomTotals.get(eocmMaterialNo).get(1));
					eocmAcceptNetWeightTotal = NumberUtil.doubleAdd(eocmAcceptNetWeightTotal, eoomTotals.get(eocmMaterialNo).get(2));
					eocmAcceptVolumeTotal = NumberUtil.doubleAdd(eocmAcceptVolumeTotal, eoomTotals.get(eocmMaterialNo).get(3));
				}
				map.put("eocmQuantityRemainTotal", NumberUtil.getRoundDoubleToSting(NumberUtil.doubleSub(eocmQuantityTotal, eocmAcceptQuantityTotal), 0, true));
				map.put("eocmGrossWeightRemainTotal",NumberUtil.getRoundDoubleToSting(NumberUtil.doubleSub(eocmGrossWeightTotal, eocmAcceptGrossWeightTotal), 3, true) );
				map.put("eocmNetWeightRemainTotal",NumberUtil.getRoundDoubleToSting(NumberUtil.doubleSub(eocmNetWeightTotal, eocmAcceptNetWeightTotal), 3, true) );
				map.put("eocmVolumeRemainTotal",NumberUtil.getRoundDoubleToSting(NumberUtil.doubleSub(eocmVolumeTotal, eocmAcceptVolumeTotal), 3, true) );
				
				responseData.setCode(Constants.YES);
				responseData.setMsg("委托订单物料总信息保存委托成功");
				responseData.setData(map);
			} catch (Exception e) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("委托订单物料总计出错:"+e.getMessage());
				e.printStackTrace();
				return responseData;
			}
		}else{
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单id为空");
			return responseData;
		}
		return responseData;
	}
	/**
	 * 
	 * @description 判断物料是否完全下达
	 * @author Simon.Guo  
	 * @date 2018年12月3日下午8:56:09
	 * @param queryInfo
	 * @return
	 */
	private boolean getIsIssuedEndInfo(Long eocsId) {
		Map<String, List<Double>> eocmTotals = getEocsTotalInfo(eocsId);
		Map<String, List<Double>> eoomTotals = getEoorTotalInfo(eocsId);
		boolean flag = false;
		if (eocmTotals.size()>0 && eoomTotals.size()> 0 && eocmTotals.size() == eoomTotals.size() ) {
			Set<String> materialNoSet = eocmTotals.keySet();
			for (String materialNo : materialNoSet) {
				if (eoomTotals.containsKey(materialNo) 
						 && NumberUtil.doubleSub(eocmTotals.get(materialNo).get(0) , eoomTotals.get(materialNo).get(0)) == 0L
						 && NumberUtil.doubleSub(eocmTotals.get(materialNo).get(1) , eoomTotals.get(materialNo).get(1)) == 0L
						 && NumberUtil.doubleSub(eocmTotals.get(materialNo).get(2) , eoomTotals.get(materialNo).get(2)) == 0L
						 && NumberUtil.doubleSub(eocmTotals.get(materialNo).get(3) , eoomTotals.get(materialNo).get(3)) == 0L) {
					flag = true;
				}
			}
			
		}
		return flag;
	}
	@Override
	public Map<String, List<Double>> getEocsTotalInfo(Long eocsId) {
		List<FilterCondition> conditions = new ArrayList<>();
		conditions.add(new FilterCondition("eocmEocsId",eocsId,"="));
		List<EoConsignmentMaterielModel> eocmList = this.eoConsignmentMaterielManager.findByCondition(conditions );
		Map<String, List<Double>> eocmTotals = new HashMap<>();
		if (eocmList.size() != 0) {
			for (EoConsignmentMaterielModel eocmModel : eocmList) {
				Double quantityTotal = 0D;
				Double grossWeightTotal = 0D;
				Double netWeightTotal = 0D;
				Double volumeTotal = 0D;
				List<Double> total = new ArrayList<>();
				if (eocmTotals.containsKey(eocmModel.getEocmMaterialNo())) {
					quantityTotal = eocmTotals.get(eocmModel.getEocmMaterialNo()).get(0);
					grossWeightTotal = eocmTotals.get(eocmModel.getEocmMaterialNo()).get(1);
					netWeightTotal = eocmTotals.get(eocmModel.getEocmMaterialNo()).get(2);
					volumeTotal = eocmTotals.get(eocmModel.getEocmMaterialNo()).get(3);
				}
				total.add(NumberUtil.doubleAdd(quantityTotal, eocmModel.getEocmQuantity()==null?0D:eocmModel.getEocmQuantity()));
				total.add(NumberUtil.doubleAdd(grossWeightTotal, eocmModel.getEocmGrossWeight()==null?0D:eocmModel.getEocmGrossWeight()));
				total.add(NumberUtil.doubleAdd(netWeightTotal, eocmModel.getEocmNetWeight()==null?0D:eocmModel.getEocmNetWeight()));
				total.add(NumberUtil.doubleAdd(volumeTotal, eocmModel.getEocmVolume()==null?0D:eocmModel.getEocmVolume()));
				eocmTotals.put(eocmModel.getEocmMaterialNo(), total);
			}
		}
		return eocmTotals;
	}
	@Override
	public Map<String, List<Double>> getEoorTotalInfo(Long eocsId) {
		List<FilterCondition> conditions_eocsId = new ArrayList<>();
		conditions_eocsId.add(new FilterCondition("eoorEocsId",eocsId,"="));
		List<EoOrderModel> eoorList = this.eoOrderManager.findByCondition(conditions_eocsId );
		Map<String, List<Double>> eoomTotals = new HashMap<>();
		if (eoorList.size() > 0 ) {
			for (EoOrderModel eoorModel : eoorList) {
				List<FilterCondition> conditions_eoorId = new ArrayList<>();
				conditions_eoorId.add(new FilterCondition("eoomEoorId",eoorModel.getEoorId(),"="));
				List<EoOrderMaterielModel> eoomList = this.eoOrderMaterielManager.findByCondition(conditions_eoorId );
				if (eoomList.size() > 0 ) {
					for (EoOrderMaterielModel eoomModel : eoomList) {
						Double quantityTotal = 0D;
						Double grossWeightTotal = 0D;
						Double netWeightTotal = 0D;
						Double volumeTotal = 0D;
						List<Double> total = new ArrayList<>();
						if (eoomTotals.containsKey(eoomModel.getEoomMaterialNo())) {
							quantityTotal = eoomTotals.get(eoomModel.getEoomMaterialNo()).get(0);
							grossWeightTotal = eoomTotals.get(eoomModel.getEoomMaterialNo()).get(1);
							netWeightTotal = eoomTotals.get(eoomModel.getEoomMaterialNo()).get(2);
							volumeTotal = eoomTotals.get(eoomModel.getEoomMaterialNo()).get(3);
						}
						total.add(NumberUtil.doubleAdd(quantityTotal, eoomModel.getEoomQuantity()==null?0D:eoomModel.getEoomQuantity()));
						total.add(NumberUtil.doubleAdd(grossWeightTotal, eoomModel.getEoomGrossWeight()==null?0D:eoomModel.getEoomGrossWeight()));
						total.add(NumberUtil.doubleAdd(netWeightTotal, eoomModel.getEoomNetWeight()==null?0D:eoomModel.getEoomNetWeight()));
						total.add(NumberUtil.doubleAdd(volumeTotal, eoomModel.getEoomVolume()==null?0D:eoomModel.getEoomVolume()));
						eoomTotals.put(eoomModel.getEoomMaterialNo(), total);
					}
				}
			}
		}
		return eoomTotals;
	}
	@Override
	public List<Double> getEocsTotalInfo(Long eocsId,String eocmMaterialNo) {
		List<FilterCondition> conditions = new ArrayList<>();
		conditions.add(new FilterCondition("eocmEocsId",eocsId,"="));
		List<EoConsignmentMaterielModel> eocmList = this.eoConsignmentMaterielManager.findByCondition(conditions );
		Map<String, List<Double>> eocmTotals = new HashMap<>();
		if (eocmList.size() != 0) {
			for (EoConsignmentMaterielModel eocmModel : eocmList) {
				if (!eocmMaterialNo.equals(eocmModel.getEocmMaterialNo())) {
					continue;
				}
				Double quantityTotal = 0D;
				Double grossWeightTotal = 0D;
				Double netWeightTotal = 0D;
				Double volumeTotal = 0D;
				List<Double> total = new ArrayList<>();
				if (eocmTotals.containsKey(eocmModel.getEocmMaterialNo())) {
					quantityTotal = eocmTotals.get(eocmModel.getEocmMaterialNo()).get(0);
					grossWeightTotal = eocmTotals.get(eocmModel.getEocmMaterialNo()).get(1);
					netWeightTotal = eocmTotals.get(eocmModel.getEocmMaterialNo()).get(2);
					volumeTotal = eocmTotals.get(eocmModel.getEocmMaterialNo()).get(3);
				}
				total.add(NumberUtil.doubleAdd(quantityTotal, eocmModel.getEocmQuantity()==null?0D:eocmModel.getEocmQuantity()));
				total.add(NumberUtil.doubleAdd(grossWeightTotal, eocmModel.getEocmGrossWeight()==null?0D:eocmModel.getEocmGrossWeight()));
				total.add(NumberUtil.doubleAdd(netWeightTotal, eocmModel.getEocmNetWeight()==null?0D:eocmModel.getEocmNetWeight()));
				total.add(NumberUtil.doubleAdd(volumeTotal, eocmModel.getEocmVolume()==null?0D:eocmModel.getEocmVolume()));
				eocmTotals.put(eocmModel.getEocmMaterialNo(), total);
			}
		}
		return eocmTotals.get(eocmMaterialNo);
	}
	@Override
	public List<Double> getEoorTotalInfo(Long eocsId,String eocmMaterialNo) {
		List<FilterCondition> conditions_eocsId = new ArrayList<>();
		conditions_eocsId.add(new FilterCondition("eoorEocsId",eocsId,"="));
		List<EoOrderModel> eoorList = this.eoOrderManager.findByCondition(conditions_eocsId );
		Map<String, List<Double>> eoomTotals = new HashMap<>();
		if (eoorList.size() > 0 ) {
			for (EoOrderModel eoorModel : eoorList) {
				List<FilterCondition> conditions_eoorId = new ArrayList<>();
				conditions_eoorId.add(new FilterCondition("eoomEoorId",eoorModel.getEoorId(),"="));
				List<EoOrderMaterielModel> eoomList = this.eoOrderMaterielManager.findByCondition(conditions_eoorId );
				if (eoomList.size() > 0 ) {
					for (EoOrderMaterielModel eoomModel : eoomList) {
						if (!eocmMaterialNo.equals(eoomModel.getEoomMaterialNo())) {
							continue;
						}
						Double quantityTotal = 0D;
						Double grossWeightTotal = 0D;
						Double netWeightTotal = 0D;
						Double volumeTotal = 0D;
						List<Double> total = new ArrayList<>();
						if (eoomTotals.containsKey(eoomModel.getEoomMaterialNo())) {
							quantityTotal = eoomTotals.get(eoomModel.getEoomMaterialNo()).get(0);
							grossWeightTotal = eoomTotals.get(eoomModel.getEoomMaterialNo()).get(1);
							netWeightTotal = eoomTotals.get(eoomModel.getEoomMaterialNo()).get(2);
							volumeTotal = eoomTotals.get(eoomModel.getEoomMaterialNo()).get(3);
						}
						total.add(NumberUtil.doubleAdd(quantityTotal, eoomModel.getEoomQuantity()==null?0D:eoomModel.getEoomQuantity()));
						total.add(NumberUtil.doubleAdd(grossWeightTotal, eoomModel.getEoomGrossWeight()==null?0D:eoomModel.getEoomGrossWeight()));
						total.add(NumberUtil.doubleAdd(netWeightTotal, eoomModel.getEoomNetWeight()==null?0D:eoomModel.getEoomNetWeight()));
						total.add(NumberUtil.doubleAdd(volumeTotal, eoomModel.getEoomVolume()==null?0D:eoomModel.getEoomVolume()));
						eoomTotals.put(eoomModel.getEoomMaterialNo(), total);
					}
				}
			}
		}
		return eoomTotals.get(eocmMaterialNo);
	}
	
	
	@Override
	public ResponseData<QueryData> queryConsignmentByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData eoDeclarationDeputeList = eoConsignmentManager.queryConsignmentByCondition(queryInfo);
		responseData.setData(eoDeclarationDeputeList);
		return responseData;
	}

	@Override
	public ResponseData<List<EocmAndAcceptDto>> getEocmsAndAcceptInfo(Long eocsId) {
		ResponseData<List<EocmAndAcceptDto>> responseData = new ResponseData<>();
		List<EocmAndAcceptDto> eocmaadList= new ArrayList<>();
		try {
			//1.获取委托物料信息
			List<FilterCondition> conditions = new ArrayList<>();
			conditions.add(new FilterCondition("eocmEocsId",eocsId,"="));
			List<EoConsignmentMaterielModel> eocmList = this.eoConsignmentMaterielManager.findByCondition(conditions );
			//2.获取委托订单下达订单信息
			List<FilterCondition> conditionsEoor = new ArrayList<>();
			conditionsEoor.add(new FilterCondition("eoorEocsId",eocsId,"="));
			List<EoOrderModel> eoorList = this.eoOrderManager.findByCondition(conditionsEoor);
			//3.判断eoorList:0,受理返回0,否则累加返回
			
			for (EoConsignmentMaterielModel eocm : eocmList) {
				EocmAndAcceptDto eocmaad = new EocmAndAcceptDto(); 
				BeanUtils.copyProperties(eocmaad, eocm);
				
				Double acceptQuantity = 0d;
				Double acceptGrossWeight = 0d;
				Double acceptNetWeight = 0d;
				Double acceptVolume = 0d;
				
				if (eoorList!=null && eoorList.size()>=0) {
					for (EoOrderModel eoor : eoorList) {
						List<FilterCondition> conditionsEoom = new ArrayList<>();
						conditionsEoom.add(new FilterCondition("eoomEoorId",eoor.getEoorId(),"="));
						List<EoOrderMaterielModel> eoomList = this.eoOrderMaterielManager.findByCondition(conditionsEoom);
						
						for (EoOrderMaterielModel eoom : eoomList) {
							if (eocm.getEocmMaterialNo().equals(eoom.getEoomMaterialNo())) {
								acceptQuantity = NumberUtil.doublePlus(acceptQuantity, eoom.getEoomQuantity());
								acceptGrossWeight = NumberUtil.doublePlus(acceptGrossWeight, eoom.getEoomGrossWeight());
								acceptNetWeight = NumberUtil.doublePlus(acceptNetWeight, eoom.getEoomNetWeight());
								acceptVolume = NumberUtil.doublePlus(acceptVolume, eoom.getEoomVolume());
							}
						}
						
					}
				}
				eocmaad.setAcceptQuantity(NumberUtil.getRoundDoubleToSting(NumberUtil.doubleMinus(eocm.getEocmQuantity(), acceptQuantity), 0, true));
				eocmaad.setAcceptGrossWeight(NumberUtil.getRoundDoubleToSting(NumberUtil.doubleMinus(eocm.getEocmGrossWeight(), acceptGrossWeight), 3, true));
				eocmaad.setAcceptNetWeight(NumberUtil.getRoundDoubleToSting(NumberUtil.doubleMinus(eocm.getEocmNetWeight(), acceptNetWeight), 3, true));
				eocmaad.setAcceptVolume(NumberUtil.getRoundDoubleToSting(NumberUtil.doubleMinus(eocm.getEocmVolume(), acceptVolume), 3, true));
				eocmaadList.add(eocmaad);
			}
			responseData.setCode(Constants.YES);
			responseData.setMsg("查询成功");
			responseData.setData(eocmaadList);
		} catch (Exception e) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("查询失败");
			e.printStackTrace();
			return responseData;
		}
		return responseData;
	}

}
