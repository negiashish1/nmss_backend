package com.example.nmss_backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.nmss_backend.entities.Blog;


@Service
public class BlogServiceImpl implements BlogService {
	
	List<Blog> list;
	
	public BlogServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Blog(1, "title1","test Title1"));
		list.add(new Blog(2, "title2","test Title2"));
	}

	@Override
	public List<Blog> getBlogs() {
		// TODO Auto-generated method stub
		return list;
	}

}
