package com.example.nmss_backend.entities;

public class Testimonials {
	private long id;
	
	private String avatar;
	private String name;
	private String review;
	
	public Testimonials(long id, String avatar, String name, String review) {
		super();
		this.id = id;
		this.avatar = avatar;
		this.name = name;
		this.review = review;
	}

	public Testimonials() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	
}
