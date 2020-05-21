package com.sinotrans.oms.common.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sinotrans.oms.common.service.BaseService;

/**
 * service 层继承的base类
 * @author Harley 20180920
 * 里面封装一些共用方法和属性 如：log类
 */
public class BaseServiceImpl implements BaseService {
	protected final Log log = LogFactory.getLog(this.getClass());
}
