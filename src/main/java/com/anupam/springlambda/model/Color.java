package com.anupam.springlambda.model;

public class Color {
	
	private String stateName;
	
	public Color(String name) {
		this.stateName = name;
	}
	
	public String getState() {
		return stateName;
	}
	
	public void setState(String name) {
		this.stateName = name;
	}

}
