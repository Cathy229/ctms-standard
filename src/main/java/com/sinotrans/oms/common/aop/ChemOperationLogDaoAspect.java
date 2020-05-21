package com.sinotrans.oms.common.aop;

import java.util.Collection;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.orm.model.OperationLog;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;


/**
 * <p>Description:保存前处理服务类</p>
 *
 * @author simon.yu
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本      修改人   	    修改日期   	修改内容
 * 2009-10-20.1  simon.yu       20091020 	创建
 * 20091222.1    黄军明			20091222    保存时creator,modifor,user.getUserName()修改为user.getUserCode
 * 20091226.1    黄军明          20091226    保存时将creator,modifor,user.getUserId()修改为user.getUsername
 * 20091226.1    simon.yu       20091226    保存时将creator,modifor,user.getUsername修改为user.getUserId()
 * 20100122.1     李政       	20100122    增加if(BypassLogin.getBypass()) return ;跳过AOP
 * 20100701.1    simon.yu      	20100701    增加aroundGetModel方法，拦截当指定的ID不存在数据库异常
 * 20100806.1    simon.yu  		忽略登录时，也需要设置创建/修改时间，同时将修改人设置为System
 * 20101114.1	黄军明        增加beforeRemoveByPkModel，beforeRemoveAllByPkModel，beforeRemoveModel，beforeRemoveAllModel方法，处理删除前的逻辑，
 *  						beforeSaveCommon保存前的日志表处理
 * 20120322     jimmy.wang      创建人和修改人由System改为1,因为关联ES_USER表时是esus_id做的关联,用System会报错
 * </pre>
 */
@Component
@Aspect
public class ChemOperationLogDaoAspect extends BaseAspect{
	
	/**
	 * Before *Dao.save()
	 * @param model
	 */
	@Before("execution(* *..dao.*Dao.save(..)) && args(model)")
	public void beforeSaveModel(JoinPoint jp, OperationLog model) {
		log.debug("Before Dao.save(), set Creator or Modifier");
		UserDetails user = SessionContext.getUser();
		Date sysDate = new Date();
		if (IgnoreLoginController.isIgnore()) {
			//虚拟登录时，对创建人，创建时间，修改人，修改时间等赋值
			if (model.getCreator() == null) {
				model.setCreator(user.getUserId());
				model.setCreateTime(sysDate);
			}
			if (model.getModifier() == null) {
				model.setModifier(EmptyUtils.isEmpty(model.getCreator()) ? user.getUserId() : model.getCreator());
				model.setModifyTime(sysDate);
			}
			return;
		}
		///////////////////////////////////
		//此时用户并没有登录，在此强制设置日志字段
		//////////////////////////////////
		if(user == null){
			throw new RuntimeException("you must login first.");
		}
		if (model.getCreator() == null || model.getCreateTime() == null) {
			model.setCreator(user.getUserId());
			model.setCreateTime(sysDate);
			setProperty(model, "orgId", user.getOrgId());
		}
		model.setModifier(user.getUserId());
		model.setModifyTime(sysDate);
	}
	
	/**
	 * Before *Dao.saveAll()
	 * @param models
	 */
	@Before("execution(* *..dao.*Dao.saveAll(..)) && args(models)")
	public void beforeSaveAllModels(JoinPoint jp, Collection<? extends OperationLog> models) {
		if (models.isEmpty() || ! (models.iterator().next() instanceof OperationLog)) {
			return;
		}
		
		log.debug("Before Dao.saveAll(), set Creator or Modifier");
		Date sysDate = new Date();
		UserDetails user = SessionContext.getUser();
		if (IgnoreLoginController.isIgnore()) {
			for (OperationLog model : models) { 
				//虚拟登录时，对创建人，创建时间，修改人，修改时间等赋值
				if (model.getCreator() == null) {
					model.setCreator(user.getUserId());
					model.setCreateTime(sysDate);
				}
				if (model.getModifier() == null) {
					model.setModifier(EmptyUtils.isEmpty(model.getCreator()) ? user.getUserId() : model.getCreator());
					model.setModifyTime(sysDate);
				}
			}
			return;
		}
		
		///////////////////////////////////
		//此时用户并没有登录，在此强制设置日志字段
		//////////////////////////////////
		if(user == null){
			throw new RuntimeException("you must login first.");
		}
		for (OperationLog model : models) {
			if (model.getCreator() == null || model.getCreateTime() == null) {
				model.setCreator(user.getUserId());
				model.setCreateTime(sysDate);
				setProperty(model, "orgId", user.getOrgId());
			}
			model.setModifier(user.getUserId());
			model.setModifyTime(sysDate);
		}
	}
	
	private void setProperty(Object object,String property,Object value){
		try {
			BeanUtils.setProperty(object, property, value);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	
	
	
}
