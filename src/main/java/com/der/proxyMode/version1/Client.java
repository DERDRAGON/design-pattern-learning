package com.der.proxyMode.version1;
/**
 * 无代理代码
 * @author caoshilong
 *
 */
public class Client {

	public static void main(String[] args) {
		SchoolGril jiaojiao = new SchoolGril();
		jiaojiao.setName("娇娇");
		
		Pursuit zhuojiayi = new Pursuit(jiaojiao);
		
		zhuojiayi.giveDolls();
		zhuojiayi.giveFlowers();
		zhuojiayi.giveChocolate();
	}
}
