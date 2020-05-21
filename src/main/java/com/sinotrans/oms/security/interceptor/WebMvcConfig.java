package com.sinotrans.oms.security.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Harley 20180812
 * TODO:注册会话拦截器
 */
@EnableWebMvc
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 会话拦截器
         */
        registry.addInterceptor(authenticationInterceptor())
            .addPathPatterns("/**")
            .excludePathPatterns("login.action")
            .excludePathPatterns("logout.action")
            .excludePathPatterns("/login")
            .excludePathPatterns("/main")
            .excludePathPatterns("/pages/**")
            .excludePathPatterns("/resources/**");
    }
    
}
