package com.xiaoshu.start.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.xiaoshu.start.annotation.DatabaseAnnotation;
import com.xiaoshu.start.config.MultipleDataSource;
import com.xiaoshu.start.util.DatabaseType;

/**
 * 
 * 功能说明：
 * 
 * DatabaseAspect.java
 * 
 * Original Author: deane.jia,2016年9月18日 上午8:52:25
 * 
 * Copyright (C)2013-2016 深圳优必选科技 All rights reserved.
 */
@Aspect  
@Component
public class DatabaseAspect {

private static final Logger _logger = LoggerFactory.getLogger(DatabaseAspect.class);
	
	@Pointcut("@annotation(com.xiaoshu.start.annotation.DatabaseAnnotation)")
	public void controllerAspect(){
	}
	
	@Before("controllerAspect()")
	public void doBefore(JoinPoint joinPoint){
		String dataBase = this.getAnnotationMap(joinPoint);
		_logger.info("====> dataBase is {}", dataBase);
		if(dataBase.equals(DatabaseType.ds2.toString())){
			_logger.info("选择ds2 数据源");
			MultipleDataSource.setDataSourceKey(DatabaseType.ds2.toString());
		}else{
			_logger.info("选择ds1 数据源");
			MultipleDataSource.setDataSourceKey(DatabaseType.ds1.toString());
		}
	}

	/**
	 * 获得注解的Description
	 * @param joinPoint
	 * @return
	 */
	public String getAnnotationMap(JoinPoint joinPoint){
		String targetName = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		String dataBase = null;
		try {
			Class targetClass = Class.forName(targetName);
			Method[] methods = targetClass.getDeclaredMethods();
			for(Method method : methods){
				if(method.getName().equals(methodName)){
					Class clazz[] = method.getParameterTypes();
					if(clazz.length == arguments.length){
						dataBase = method.getAnnotation(DatabaseAnnotation.class).dataBase();
						break;
					}
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return dataBase;
	}
}
