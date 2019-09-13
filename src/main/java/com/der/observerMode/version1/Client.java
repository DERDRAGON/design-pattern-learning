package com.der.observerMode.version1;

public class Client {

	public static void main(String[] args) {
		Secretary secretary = new Secretary();
		StockObserver observer1 = new StockObserver("tongshi1", secretary);
		StockObserver observer2 = new StockObserver("tongshi2", secretary);
		
		secretary.arrach(observer1);
		secretary.arrach(observer2);
		
		secretary.secretaryAction("老板回来了！");
		
		secretary.notifyObs();
	}
}
