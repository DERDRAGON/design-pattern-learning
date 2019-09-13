package com.der.observerMode.version2;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject {
	
	//同事列表
	private List<Observer> observers = new ArrayList<Observer>();
	
	private String action;

	/**
	 * 增加
	 */
	@Override
	void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 减少
	 */
	@Override
	void detach(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 提醒
	 */
	@Override
	void notifyEmploy() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	void set(String value) {
		this.action = value;
	}

	@Override
	String get() {
		return action;
	}
	
}
