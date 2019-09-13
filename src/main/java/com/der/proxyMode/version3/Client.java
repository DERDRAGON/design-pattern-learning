package com.der.proxyMode.version3;

import com.der.proxyMode.version1.SchoolGril;

public class Client {

	public static void main(String[] args) {
		SchoolGril jiaojiao = new SchoolGril();
		jiaojiao.setName("娇娇");
		Proxy daili = new Proxy(jiaojiao);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}