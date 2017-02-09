package com.xiaoshu.start.dao;


import com.xiaoshu.start.model.Blog;

public interface BlogMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
}