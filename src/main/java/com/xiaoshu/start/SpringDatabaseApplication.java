package com.xiaoshu.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 
 * 功能说明：多数据源动态切换，启动时添加多数据源信息，提供用户查询使用
 * 
 * SpringDatabaseApplication.java
 * 
 * Original Author: deane.jia,2016年9月18日 上午8:52:09
 * 
 * Copyright (C)2013-2016 深圳优必选科技 All rights reserved.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource("classpath:application-service-provider.xml")
@EnableScheduling
@EnableAspectJAutoProxy
public class SpringDatabaseApplication extends SpringBootServletInitializer {
	private final static Logger _logger = LoggerFactory.getLogger(SpringDatabaseApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringDatabaseApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		_logger.info("start up the ImageServer server ...");
		return application.sources(SpringDatabaseApplication.class);
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean(){
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		registrationBean.setFilter(characterEncodingFilter);
		return registrationBean;
	}
}
