package com.der.strategyMode;

public class CashContext {
	
	private CashSuper cs;
	
	public CashContext(String type) {
		switch (type) {
		case "1":cs = new CashNormal();break;
		case "2":cs = new CashReturn(300d, 100d);break;
		case "3":cs = new CashRebate(0.8);break;
		default:cs = new CashNormal();
		}
	}
	
	public double getResult(double money) {
		return cs.acceptCash(money);
	}

}
