package com.der.simpleFactoryMode.version2;

public class OperationAdd extends Operation {

	@Override
	public double getResult(double param1, double param2) {
		return param1 + param2;
	}

}
