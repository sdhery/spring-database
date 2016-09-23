/**
*	Copyright © 2014 - 2016 Ubtechinc Tech. All Rights Reserved 
*/
package com.xiaoshu.start.service;

import com.xiaoshu.start.model.Blog;

/**
 * 
 * 功能说明：
 * 
 * BlogService.java
 * 
 * Original Author: deane.jia,2016年9月18日 上午8:54:10
 * 
 * Copyright (C)2013-2016 深圳优必选科技 All rights reserved.
 */
public interface BlogService {

	public Blog selectByPrimaryKey1(Integer id);
	
	public Blog selectByPrimaryKey2(Integer id);
	
    int insert(Blog record);

    int insertSelective(Blog record);
}
