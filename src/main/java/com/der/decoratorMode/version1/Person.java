package com.der.decoratorMode.version1;

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
	
	public void wearShirts() {
		System.out.println("大 T 恤");
	}
	
	public void wearBigTrouser() {
		System.out.println("穿 垮 裤");
	}
	
	public void wearSneakers() {
		System.out.println("破 球 鞋");
	}
	
	public void wearSuit() {
		System.out.println("西装 ");
	}
	
	public void wearTie() {
		System.out.println("领带 ");
	}
	
	public void wearLeatherShoes() {
		System.out.println("皮鞋 ");
	}
	
	public void show() {
		System.out.println(String.format("装扮的 %s",name));
	}

}
