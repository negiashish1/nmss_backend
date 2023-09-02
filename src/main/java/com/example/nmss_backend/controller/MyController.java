package com.example.nmss_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nmss_backend.entities.Blog;
import com.example.nmss_backend.services.BlogService;

@RestController
public class MyController {
	
	@Autowired
	public BlogService blogService;
	
	@GetMapping("/home")
	public String home() {
		return "This is homepage";
	}
	
	@GetMapping("/blogs")
	public List<Blog> getBlogs()
	{
		return this.blogService.getBlogs();
	}
}
