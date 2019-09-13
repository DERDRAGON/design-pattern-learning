package com.der.templateMethodMode.version3;

public abstract class TestPaper {

	public void testQuestion1() {
		System.out.println("1、这里有四个答案：a,b,c,d；");
		System.out.println("正确答案是："+ answer1()+"！");
	}
	
	public abstract String answer1();
	
	public void  testQuestion2() {
		System.out.println("2、这里有四个答案：a,b,c,d；");
		System.out.println("正确答案是："+ answer2()+"！");
	}

	public abstract String answer2();
	
	public void testQuestion3() {
		System.out.println("3、这里有四个答案：a.b.c.d；");
		System.out.println("正确答案是："+ answer3()+"！");
	}

	public abstract String answer3();
}
