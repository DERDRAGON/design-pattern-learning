package com.der.strategyMode2;

public class Context {
	
	Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void contextInterface() {
		strategy.AlgorithmInterface();
	}

}
