package com.sinotrans.oms.common.nogenerator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**  
* <p>Title: RuleFactoryImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月9日  
* @version 1.0  
*/
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.basicdata.manager.EbBillNoRuleManager;
import com.sinotrans.oms.basicdata.model.EbBillNoRuleModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
@Service("RuleFactoryImpl")//20180921 harley 工程初始化加入spring容器
public class RuleFactoryImpl implements RuleFactory {
	@Autowired
	private EbBillNoRuleManager ruleManager;
	private EbBillNoRuleModel ruleModel;
	/* 获取Rule信息*/     
	public Rule getRule(String ruleName) {
		Rule rule=new Rule();
		// 去数据库中查询EbBillNoRuleModel信息
		this.queryEbBillNoRules(ruleName);
		// 设置rule信息，并返回
		rule = this.setRule(ruleModel);
		/*
		 * 判断是否有清空周期，有则分别进行处理。
		 */
		if(null!=ruleModel.getEbbrClearType()&&null!=ruleModel.getEbbrLastCreatorDate()){
			final Long currentCursor=0L;//根据周期清空时，重新设置的当前流水号
			String dateFormat="";
			if("YEAR".equals(ruleModel.getEbbrClearType())){
				dateFormat="yyyy";
			}else if("MONTH".equals(ruleModel.getEbbrClearType())){
				dateFormat="yyyyMM";
			}else if("DAY".equals(ruleModel.getEbbrClearType())){
				dateFormat="yyyyMMdd";
			}
			String weekTypeDate=new SimpleDateFormat(dateFormat).format(ruleModel.getEbbrLastCreatorDate());
			String lastCreatorDate=new SimpleDateFormat(dateFormat).format(new Date());
			if(!weekTypeDate.equals(lastCreatorDate)){
				rule.setCurrentCursor(currentCursor);
			}
		}
		return rule;
	}
   /*根据RuleName查询数据库中的EbBillNoRuleModel信息*/
	private void queryEbBillNoRules(String ruleName){
		///////////////////////////////////
		//此时用户并没有登录，在此强制设置日志字段
		//////////////////////////////////
		UserDetails user = SessionContext.getUser();
		if(null != user){
			user = SessionContext.getUser();
			if(user == null){
				throw new RuntimeException("you must login first.");
			}
		}
		List<FilterCondition> rulemCondition = new ArrayList<>();
		// 设置编号名称
		rulemCondition.add(new FilterCondition("ebbrName", ruleName, "="));
		// 所属公司
		if(null==user){
			rulemCondition.add(new FilterCondition("ebbrEscoId", null, "="));
		}else{
			rulemCondition.add(new FilterCondition("ebbrEscoId", Long.valueOf(user.getOrgId()), "="));
		}
		// add by krik at 20170815
		rulemCondition.add(new FilterCondition("recStatus", Long.valueOf(Constants.DELETED_NO), "="));// 查询未删除状态的数据
		// 查询数据信息
		List<EbBillNoRuleModel> list = this.ruleManager.findByCondition(rulemCondition); 
		if (list.size()==0) {
			EbBillNoRuleModel model = new EbBillNoRuleModel();
			model.setEbbrName(ruleName);
			model.setEbbrEscoId(Long.valueOf(user.getOrgId()));
			model.setEbbrDesc("{PARAMS(SO)}{DATE(yyyyMMdd)}{NO(4)}");
			model.setEbbrPrefix("SO");
			model.setEbbrDateFormat("yyyyMMdd");
			model.setEbbrNoLen("4");
			model.setEbbrCurNo("1");
			ruleManager.save(model);
			list = this.ruleManager.findByCondition(rulemCondition); 
		}
		ruleModel = list.get(0);
	}
	/*保存EbBillNoRuleModel，并返回更新后的Rule信息*/
	public Rule saveCurrentValue(String ruleName, Long value) {
		EbBillNoRuleModel rulem = ruleModel;
		// 重新设置当前流水号
		rulem.setEbbrCurNo(value.toString());
		//设置其最后生成日期
		rulem.setEbbrLastCreatorDate(new Date());
		// 保存EbBillNoRuleModel信息到数据库中
		rulem = this.saveEbBillNoRules(rulem);
		// 设置Rule信息，并返回
		return this.setRule(rulem);
	}
	/* 根据EbBillNoRuleModel信息，设置Rule信息*/
	private Rule setRule(EbBillNoRuleModel rulem){
		Rule rule = new Rule();
		// 编号名称
		rule.setName(rulem.getEbbrName());
		// 编号规则
		rule.setRuleExpression(rulem.getEbbrDesc());
		// 当前流水号
		if(rulem.getEbbrCurNo()!=null){
			rule.setCurrentCursor(Long.valueOf(rulem.getEbbrCurNo()));
		}
		rule.setSize(1);
		return rule;
	}
	/* 保存EbBillNoRuleModel信息*/
	private EbBillNoRuleModel saveEbBillNoRules(EbBillNoRuleModel rulem){
		return ruleManager.save(rulem);
	}
	
}

