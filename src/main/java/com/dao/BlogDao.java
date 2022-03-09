package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.BlogBean;

@Repository
public class BlogDao {

	@Autowired
	JdbcTemplate stmt;
	
	public void addBlog(BlogBean bean) {
		stmt.update("insert into blogs(blog) values(?)",bean.getBlog());
	}
	
}
