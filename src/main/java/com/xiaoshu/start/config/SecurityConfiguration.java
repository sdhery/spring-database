/**
*	Copyright © 2013 - 2016 Ubtrobot Tech. All Rights Reserved 
*/
package com.xiaoshu.start.config;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能说明：Spring Security Oauth2.0 配置文件信息
 * 
 * SecurityConfiguration.java
 * 
 * Original Author: deane.jia,2016年9月22日 上午10:21:09
 * 
 * Copyright (C)2013-2016 深圳优必选科技 All rights reserved.
 */
@Configuration
public class SecurityConfiguration {
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new org.springframework.web.filter.DelegatingFilterProxy());
		filterRegistrationBean.setName("springSecurityFilterChain");
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}
	
}
