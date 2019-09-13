package com.der.simpleFactoryMode.version3;

import com.der.simpleFactoryMode.version2.Operation;

public class Client {

	public static void main(String[] args) {
		AddFactory factory = new AddFactory();
		Operation operation = factory.createOperation();
		double result = operation.getResult(3, 5);
		System.out.println(result);
	}
}
