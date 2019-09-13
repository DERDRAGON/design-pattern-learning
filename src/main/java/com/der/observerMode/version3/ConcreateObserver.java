package com.der.observerMode.version3;

public class ConcreateObserver extends Observer {
	
	private String name;
	
	private String observerState;
		
	private ConcreateSubject subject;
	
	public ConcreateObserver(String name, ConcreateSubject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println(String.format("观察者%s的新状态是%s", name, observerState));
	}
	
}
