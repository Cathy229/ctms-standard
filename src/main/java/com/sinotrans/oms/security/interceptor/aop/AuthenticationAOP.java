package com.sinotrans.oms.security.interceptor.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import com.sinotrans.oms.security.interceptor.VerificatAuthentication;
import com.sinotrans.oms.security.util.SessionContext;

/**
 * Harley 20180812
 * TODO:用户认证注解拦截器
 * 拦截所有被 @VerificatAuthentication 注释的方法及类
 * 如果有用户信息才能和数据库交互
 */

@Component
@Aspect
public class AuthenticationAOP {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationAOP.class);
    
    private static final String AOP_EXECUTION = "execution(* *..manager.*.*(..))";
    
    /**
     * 在方法执行之前拦截注解，判断线程中是否有登录用户信息
     * @param joinPoint
     * @throws Throwable
     */
    @Before(AOP_EXECUTION)
    public void invoke(JoinPoint joinPoint) throws Throwable {
        logger.info("--VerificatAuthentication AOP--");
        /**
         * 获取方法注解
         * 当方法注解为空时，获取类注解
         * 当最终得到的注解不为空，设置当前线程的数据源
         */
        Object object = joinPoint.getTarget();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        VerificatAuthentication authentication = null;
        authentication = AnnotationUtils.findAnnotation(method, VerificatAuthentication.class);
        if (null == authentication) {
            authentication = AnnotationUtils.findAnnotation(object.getClass(), VerificatAuthentication.class);
        }
        if (null != authentication) {
        	com.sinotrans.oms.security.util.UserDetails user = SessionContext.getUser();
            if (null == user) {
                //捕获自定义异常进行数据返回,先不做
                throw new RuntimeException("access user can not be null....");
            }
        }
    }
}
