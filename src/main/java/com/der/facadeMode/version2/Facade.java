package com.der.facadeMode.version2;

public class Facade {

	private SubSystemOne subSystemOne;
	
	private SubSystemTwo subSystemTwo;
	
	private SubSystemThree subSystemThree;
	
	private SubSystemFour subSystemFour;

	public Facade() {
		super();
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	}
	
	public void methodA() {
		System.out.println("方法组A -- ");
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
		subSystemThree.methodThree();
	}
	
	public void methodB() {
		System.out.println("方法组B -- ");
		subSystemFour.methodFour();
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
	}
	
	
}
