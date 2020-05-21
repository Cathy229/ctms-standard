package com.sinotrans.oms.businessrequest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.service.EoEooc2EoetService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.ChangeChar;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
@Service
public class EoEooc2EoetServiceImpl implements EoEooc2EoetService {
	
	@Autowired
	public EoEooc2EoetManager eoEooc2EoetManager;
	@Autowired
	private EoEooc2EoddManager eoEooc2EoddManager;

	@Override
	public ResponseData<List<EoEooc2EoetModel>> saveTrailerEoot(List<EoEooc2EoetModel> eoEooc2EoetModels) {
		ResponseData<List<EoEooc2EoetModel>> responseData = new ResponseData<>();
		String msg  = "";
		for (EoEooc2EoetModel eoEooc2EoetModel : eoEooc2EoetModels) {
			if (EmptyUtils.isNotEmpty(eoEooc2EoetModel.getEootContainerNo())) {
				msg = this.getKeyString(eoEooc2EoetModel.getEootContainerNo());
			}
		}
		
		if (EmptyUtils.isNotEmpty(msg)){
			responseData.setCode(Constants.NO);
			responseData.setMsg(msg);
			return responseData;
		}
		List<EoEooc2EoetModel> afterEoEooc2EoetModelList = eoEooc2EoetManager.saveAll(eoEooc2EoetModels);
		this.updateEoEooc2EoddEoocId(afterEoEooc2EoetModelList);
		responseData.setData(afterEoEooc2EoetModelList);
		return responseData;
	}
	
	@Override
	public ResponseData<EoEooc2EoetModel> deleteById(Long eootId) {
		if (eootId != null) {
			eoEooc2EoetManager.deleteByPk(eootId);
			ResponseData<EoEooc2EoetModel> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	@Override
	public ResponseData<List<EoEooc2EoetModel>> deleteByIds(List<Long> eootIds) {
		if (eootIds != null && eootIds.size() > 0) {
			eoEooc2EoetManager.deleteByPks(eootIds);
			ResponseData<List<EoEooc2EoetModel>> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	/**
	 * 校验集装箱号
	 * @author Colley.Bai  
	 * @date 2018年10月8日 下午5:58:23
	 * @param containerNoStr
	 * @return
	 */
	public String getKeyString(String containerNoStr) {
		String msg = "";
		/*if (EmptyUtils.isNotEmpty(containerNoStr)) {*/
			Integer[] num = new Integer[11];
		    for (int i=0;i<11;i++) {
		    	num[i]=new Integer(0);
		    }
			if (containerNoStr.length() != 11) {
				msg +="请重新输入11位的集装箱号！";
				return msg;
			} else {
				String a = "^[a-zA-Z]{4}[0-9]{7}";
				Pattern p =Pattern .compile(a);
				Matcher  m = p.matcher(containerNoStr);
				if (m.matches()) {
					//序列号
					String char1=containerNoStr.substring(0,1);
					String char2=containerNoStr.substring(1,2);
					String char3=containerNoStr.substring(2,3);
					String char4=containerNoStr.substring(3,4);
					String char5=containerNoStr.substring(4,5);
					String char6=containerNoStr.substring(5,6);
					String char7=containerNoStr.substring(6,7);
					String char8=containerNoStr.substring(7,8);
					String char9=containerNoStr.substring(8,9);
					String char10=containerNoStr.substring(9,10);
					String char11=containerNoStr.substring(10,11);
					//箱号前面4个字母
					num[0]= ChangeChar.changeChar(char1);
			        num[1]= ChangeChar.changeChar(char2);
			        num[2]= ChangeChar.changeChar(char3);
			        num[3]= ChangeChar.changeChar(char4);
			        //箱号中间7个数字
			        num[4]= ChangeChar.changeChar(char5);
			        num[5]= ChangeChar.changeChar(char6);
			        num[6]= ChangeChar.changeChar(char7);
			        num[7]= ChangeChar.changeChar(char8);
			        num[8]= ChangeChar.changeChar(char9);
			        num[9]= ChangeChar.changeChar(char10);
			        //校验数字
			        num[10]= ChangeChar.changeChar(char11);
			        Integer sum=num[0]+num[1]*2+num[2]*4+num[3]*8+num[4]*16+num[5]*32+num[6]*64+num[7]*128+num[8]*256+num[9]*512;
			        int intSum = sum.intValue();
			        Integer result=intSum%11;
			        if(result == 10){
			        	result = result%10;
			        }
			        if (!result.equals(num[10])) {
			        	//msg += "集装箱号校验错误！正确的校验码为:" + result;
						return msg;
			        } else {
						return msg;
			        }
				} else{ 
					msg +="集装箱号格式不正确，前四位应为字母，后七位为数字，请重新输入！";
					return msg;
				}
			}
		/*} else {
			msg +="集装箱号不能为空！";
			return msg;
		}*/
	}
	
	/**
	 * @deprecated:拖车集装箱同步报关集装箱
	 * @author Colley.Bai  
	 * @date 2018年12月19日
	 * @param eoOrderContainerModelList
	 */
	public void updateEoEooc2EoddEoocId(List<EoEooc2EoetModel> eoEooc2EoetModels) {
		if (EmptyUtils.isNotEmpty(eoEooc2EoetModels)) {
			for (EoEooc2EoetModel eoEooc2EoetModel : eoEooc2EoetModels) {
				List<FilterCondition> filterConditions = new ArrayList<>();
				filterConditions.add(new FilterCondition("eocdEoocId",eoEooc2EoetModel.getEootEoocId(),"="));
				List<EoEooc2EoddModel> eoEooc2EoddModelList = eoEooc2EoddManager.findByCondition(filterConditions);
				for (EoEooc2EoddModel eoEooc2EoddModel : eoEooc2EoddModelList) {
					eoEooc2EoddModel.setEocdCntCustomizedSize(eoEooc2EoetModel.getEootStandard());//箱型
					eoEooc2EoddModel.setEocdContainerNo(eoEooc2EoetModel.getEootContainerNo()); //集装箱号
					if (EmptyUtils.isEqual(eoEooc2EoetModel.getEootIsLcl(), Constants.YES)){
						eoEooc2EoddModel.setEocdSubstr1("1"); //标识
					} else {
						eoEooc2EoddModel.setEocdSubstr1("0"); //标识
					}
					eoEooc2EoddModel.setEocdGrossWeight(eoEooc2EoetModel.getEootCntWeight());
					
					eoEooc2EoddManager.save(eoEooc2EoddModel);
				}
			}
		}
	}
}
