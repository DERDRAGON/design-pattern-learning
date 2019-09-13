package com.der.observerMode.version2;

public abstract class Subject {

	abstract void attach(Observer observer);
	
	abstract void detach(Observer observer);
	
	abstract void notifyEmploy();
	
	abstract void set(String value);
	
	abstract String get();
	
	public interface SubjectState {
		String get();
		void set(String value);
	}
}
