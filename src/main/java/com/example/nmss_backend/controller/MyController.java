package com.example.nmss_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.nmss_backend.entities.Blog;
import com.example.nmss_backend.entities.FounderMessage;
import com.example.nmss_backend.entities.Testimonials;
import com.example.nmss_backend.services.BlogService;
import com.example.nmss_backend.services.FounderMessageService;
import com.example.nmss_backend.services.TestimonialsService;

@RestController
public class MyController {
	
	@Autowired
	public BlogService blogService;
	
	@Autowired
	public FounderMessageService founderMessageService;
	
	@Autowired
	public TestimonialsService testimonialsService;
	
	@CrossOrigin
	@GetMapping("/home")
	public String home() {
		return "This is homepage";
	}
	
	@CrossOrigin
	@GetMapping("/blogs")
	public List<Blog> getBlogs()
	{
		return this.blogService.getBlogs();
	//	return String.format("Hello Sir/Mam, Welcome to our website");
	}
	
	@CrossOrigin
	@GetMapping("/hello")
	public String hello(@RequestParam (value="name", defaultValue = "springboot") String name) {
		//return String.format("Hello %s", name);
		return String.format("Hello Sir/Mam, Welcome to our website");
	}
	
	@CrossOrigin
	@GetMapping("/foundermessage")
	public List<FounderMessage> founderMessage() {
		return this.founderMessageService.getFounderMessage();
	}
	
	@CrossOrigin
	@GetMapping("/testimonials")
	public List<Testimonials> testimonials() {
		return this.testimonialsService.getTestimonials();
	}
}
