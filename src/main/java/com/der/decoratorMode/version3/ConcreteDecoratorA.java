package com.der.decoratorMode.version3;

public class ConcreteDecoratorA extends Decorator {

	private String addedState;

	@Override
	public void operation() {
		super.operation();
		addedState = "new State";
		System.out.println("具体装饰对象A的操作");
	}
	
}
