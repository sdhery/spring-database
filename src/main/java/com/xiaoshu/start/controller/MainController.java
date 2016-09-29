package com.xiaoshu.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoshu.start.model.Blog;
import com.xiaoshu.start.service.BlogService;

/**
 * 
 * 功能说明：提供数据源的查询
 * 
 * MainController.java
 * 
 * Original Author: deane.jia,2016年9月18日 下午5:56:14
 * 
 * Copyright (C)2013-2016 深圳优必选科技 All rights reserved.
 */
@RestController
@RequestMapping(value="/admin")
public class MainController {
	
	@Autowired
	private BlogService blogService;

	@RequestMapping(value="/ds1",method=RequestMethod.GET)
	public String getDataBase1(){
		Blog blog = blogService.selectByPrimaryKey1(110);
		System.out.println("Server is Health.." + blog.getContent());
		return blog.getTitle();
	}
	
	
	@RequestMapping(value="/ds2",method=RequestMethod.GET)
	public String getDataBase2(){
		Blog blog = blogService.selectByPrimaryKey2(110);
		System.out.println("Server is Health.." + blog.getContent());
		return blog.getTitle();
	}
}
