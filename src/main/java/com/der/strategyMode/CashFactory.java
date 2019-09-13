package com.der.strategyMode;

public class CashFactory {

	public static CashSuper createCashAccept(String type) {
		CashSuper cs = null;
		switch (type) {
		case "normal":cs = new CashNormal();break;
		case "return":cs = new CashReturn(300d, 100d);break;
		case "rebate":cs = new CashRebate(0.8);break;
		default:cs = new CashNormal();;
		}
		return cs;
	}
}
