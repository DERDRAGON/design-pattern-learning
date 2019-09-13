package com.der.strategyMode;
/**
 * 打折收费子类
 * @author caoshilong
 *
 */
public class CashRebate extends CashSuper{
	
	private double moneyRebate = 1d;
	
	public CashRebate(double moneyRebate) {
		super();
		this.moneyRebate = moneyRebate;
	}



	/**
	 * 打折收费，初始化时，必需要输入折扣率，如八折，就是0.8
	 */
	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
