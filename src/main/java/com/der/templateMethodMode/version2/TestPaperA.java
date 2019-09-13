package com.der.templateMethodMode.version2;

public class TestPaperA extends TestPaper {

	public void testQuestion1() {
		super.testQuestion1();
		System.out.println("正确答案是：b！");
	}
	
	public void  testQuestion2() {
		super.testQuestion2();
		System.out.println("正确答案是：a！");
	}
	
	public void testQuestion3() {
		super.testQuestion3();
		System.out.println("正确答案是：d！");
	}
}
