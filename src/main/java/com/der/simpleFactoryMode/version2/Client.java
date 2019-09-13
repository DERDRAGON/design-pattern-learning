package com.der.simpleFactoryMode.version2;

public class Client {

	public static void main(String[] args) {
		Operation operation = OperationFactory.createOperation("*");
		double result = operation.getResult(2, 4);
		System.out.println(result);
	}
}