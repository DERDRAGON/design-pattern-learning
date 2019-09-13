package com.der.builderMode.version1;

public class Client {
	
	public static void main(String[] args) {
		Director director = new Director();
		Builder builder1 = new ConcreteBuilder1();
		Builder builder2 = new ConcreteBuilder2();
		director.construct(builder1);
		Product result = builder1.getResult();
		result.show();
		
		director.construct(builder2);
		Product result2 = builder2.getResult();
		result2.show();
	}

}
