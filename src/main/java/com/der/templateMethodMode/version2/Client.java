package com.der.templateMethodMode.version2;

public class Client {

	public static void main(String[] args) {
		System.out.println("学生甲抄的答案：");
		TestPaperA studentA = new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();
		System.out.println("学生乙抄的答案：");
		TestPaperB studentB = new TestPaperB();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}
}
