package com.der.decoratorMode.version2;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println(String.format("装扮的 %s", name));
	}

}
