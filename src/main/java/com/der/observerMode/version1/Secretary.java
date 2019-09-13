package com.der.observerMode.version1;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	
	private List<StockObserver> observers = new ArrayList<StockObserver>();
	
	private String action;
	
	public String getAction() {
		return action;
	}

	public void arrach(StockObserver observer) {
		observers.add(observer);
	}
	
	public void notifyObs() {
		for (StockObserver stockObserver : observers) {
			stockObserver.update();
		}
	}
	
	public String secretaryAction(String action) {
		this.action = action;
		return action;
	}

}
