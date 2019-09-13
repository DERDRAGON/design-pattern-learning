package com.der.simpleFactoryMode.version1;

public class Wing {
	
	private String feather = "绒毛";
	
	private String number;
	
	public Wing(String number) {
		super();
		this.number = number;
	}

	public Wing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFeather() {
		return feather;
	}

	public void setFeather(String feather) {
		this.feather = feather;
	}

	@Override
	public String toString() {
		return "Wing [feather=" + feather + ", number=" + number + "]";
	}
	
}
