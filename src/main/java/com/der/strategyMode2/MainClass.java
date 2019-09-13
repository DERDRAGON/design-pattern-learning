package com.der.strategyMode2;

public class MainClass {
	
	public static void main(String[] args) {
		Context context = null;
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}

}
