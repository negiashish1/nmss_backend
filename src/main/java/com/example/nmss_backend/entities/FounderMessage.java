package com.example.nmss_backend.entities;


public class FounderMessage {
	
	private String founderName;
	private String founderMessage;
	
	public FounderMessage(String founderName, String founderMessage) {
		super();
		this.founderName = founderName;
		this.founderMessage = founderMessage;
	}
	public FounderMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFounderName() {
		return founderName;
	}
	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}
	public String getFounderMessage() {
		return founderMessage;
	}
	public void setFounderMessage(String founderMessage) {
		this.founderMessage = founderMessage;
	}

}
