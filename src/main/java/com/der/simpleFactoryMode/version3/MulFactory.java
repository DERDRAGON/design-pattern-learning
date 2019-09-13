package com.der.simpleFactoryMode.version3;

import com.der.simpleFactoryMode.version2.Operation;
import com.der.simpleFactoryMode.version2.OperationMul;

public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
