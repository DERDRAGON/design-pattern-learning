package com.der.observerMode.version2;

public class StockObserver extends Observer {

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(String.format("%s %s 关闭股票行情，老板回来了", sub.get(), name));
	}

}
