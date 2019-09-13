package com.der.strategyMode;
/**
 * 正常收费子类
 * @author caoshilong
 *
 */
public class CashNormal extends CashSuper{

	/**
	 * 正常收费，原价返回
	 */
	@Override
	public double acceptCash(double money) {
		return money;
	}

}
