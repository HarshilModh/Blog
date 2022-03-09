package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.BlogBean;
import com.dao.BlogDao;

@Controller
public class BlogController {

	@Autowired
	BlogDao blogDao;
	@PostMapping("/saveBlog")
	public String saveBlog(BlogBean bean) {
		blogDao.addBlog(bean);
		return "NewBlog";
	}
	@GetMapping("/NewBlog")
	public String newBlog() {
		return "NewBlog";
	}
}
