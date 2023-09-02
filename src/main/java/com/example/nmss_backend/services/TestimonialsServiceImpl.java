package com.example.nmss_backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.nmss_backend.entities.Testimonials;

@Service
public class TestimonialsServiceImpl implements TestimonialsService{
	
	List<Testimonials> testimonialsList;
	
	public TestimonialsServiceImpl(){
		testimonialsList = new ArrayList<>();
		testimonialsList.add(new Testimonials(1, "AVTR1","Ashish Negi", "शानदार काम!! ऐसे ही जारी रखें"));
		testimonialsList.add(new Testimonials(2, "AVTR2","Shivani Madwal", "एक शानदार माँ होने के नाते, आपका कर्तव्य घर पर समाप्त नहीं होता! अन्य बच्चों की भी आपकी आवश्यकता होती है। आपके बच्चे होने पर गर्व है।"));
		testimonialsList.add(new Testimonials(3, "AVTR3","Kanchan Madwal", "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Odit inventore alias a perspiciatis eum mollitia quibusdam deserunt pariatur consectetur aut culpa modi quis suscipit natus sint sed, sequi aliquid ex."));
		testimonialsList.add(new Testimonials(4, "AVTR4","Navi Dev", "Odit inventore alias a perspiciatis"));
		testimonialsList.add(new Testimonials(5, "AVTR5","Kavi Laka", "Odit inventore alias a perspiciatis"));
	}

	@Override
	public List<Testimonials> getTestimonials() {
		// TODO Auto-generated method stub
		return testimonialsList;
	}
}
