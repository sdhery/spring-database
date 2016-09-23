package com.xiaoshu.start.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 功能说明：多数据源的注解信息声明
 * 
 * DatabaseAnnotation.java
 * 
 * Original Author: deane.jia,2016年9月18日 上午8:52:00
 * 
 * Copyright (C)2013-2016 深圳优必选科技 All rights reserved.
 */
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DatabaseAnnotation {
	String dataBase() default "";
} 
