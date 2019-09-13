package com.der.observerMode.version3;

public class Client {

	public static void main(String[] args) {
		ConcreateSubject boss = new ConcreateSubject();
		boss.attach(new ConcreateObserver("a", boss));
		boss.attach(new ConcreateObserver("b", boss));
		
		boss.setSubjectState("我回来了！");
		
		boss.notifyEmp();
		
	}
}
