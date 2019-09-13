package com.der.decoratorMode.version4;

public class Person {

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println(String.format("装扮的 %s", name));
	}

}
