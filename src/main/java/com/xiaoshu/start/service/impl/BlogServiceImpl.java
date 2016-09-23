/**
*	Copyright © 2014 - 2016 Xiaoshu Tech. All Rights Reserved 
*/
package com.xiaoshu.start.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoshu.start.annotation.DatabaseAnnotation;
import com.xiaoshu.start.dao.BlogMapper;
import com.xiaoshu.start.model.Blog;
import com.xiaoshu.start.service.BlogService;


/**
 * 
 * 功能说明：
 * 
 * BlogServiceImpl.java
 * 
 * Original Author: deane.jia,2016年9月18日 上午8:53:34
 * 
 * Copyright (C)2013-2016 深圳优必选科技 All rights reserved.
 */
@Service
public class BlogServiceImpl implements BlogService {

	private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);
	@Autowired
	private BlogMapper blogMapper;
	
	@Override
	@DatabaseAnnotation(dataBase="ds1")
	public Blog selectByPrimaryKey1(Integer id){
		logger.info("The blogMapper Select Id is :{}", id);
		return blogMapper.selectByPrimaryKey(id);
	}
	
	@Override
	@DatabaseAnnotation(dataBase="ds2")
	public Blog selectByPrimaryKey2(Integer id){
		logger.info("The blogMapper Select Id is :{}", id);
		return blogMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Blog record) {
		logger.info("The blogMapper Insert is :{}", record.toString());
		return blogMapper.insert(record);
	}

	@Override
	public int insertSelective(Blog record) {
		logger.info("The blogMapper InsertSelevtive is :{}", record.toString());
		return blogMapper.insertSelective(record);
	}
}
