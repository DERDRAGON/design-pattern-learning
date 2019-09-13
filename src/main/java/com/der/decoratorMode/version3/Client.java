package com.der.decoratorMode.version3;

public class Client {

	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		Decorator a = new ConcreteDecoratorA();
		Decorator b = new ConcreteDecoratorB();
		a.setComponent(c);
		b.setComponent(a);
		b.operation();
	}
}
