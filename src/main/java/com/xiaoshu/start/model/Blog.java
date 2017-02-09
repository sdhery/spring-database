package com.xiaoshu.start.model;

/**
 * 
 * 功能说明：
 * 
 * Blog.java
 * 
 * Original Author: deane.jia,2016年9月18日 上午8:53:18
 * 
 * Copyright (C)2013-2016 深圳优必选科技 All rights reserved.
 */
public class Blog {
    private Integer id;

    private String title;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}