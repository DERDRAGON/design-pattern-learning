package com.der.observerMode.version2;

public class Client {
	
	public static void main(String[] args) {
		Boss boss = new Boss();
		StockObserver stockObserver = new StockObserver("小王", boss);
		StockObserver stockObserver2 = new StockObserver("筱荔", boss);
		
		boss.attach(stockObserver);
		boss.attach(stockObserver2);
		
		boss.detach(stockObserver);
		
		boss.set("我回来了！");
		
		boss.notifyEmploy();
	}

}
