package com.example.nmss_backend.entities;

public class Testimonials {
	private long id;
	
	private String image;
	private String name;
	private String message;
	
	public Testimonials(long id, String image, String name, String message) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.message = message;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
