package com.der.proxyMode.version2;

import com.der.proxyMode.version1.SchoolGril;

/**
 * 只有代理的代码
 * @author caoshilong
 *
 */
public class Client {

	public static void main(String[] args) {
		SchoolGril jiaojiao = new SchoolGril();
		jiaojiao.setName("娇娇");
		
		Proxy proxy = new Proxy(jiaojiao);
		
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}
}
