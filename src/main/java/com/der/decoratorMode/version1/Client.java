package com.der.decoratorMode.version1;

public class Client {
	
	public static void main(String[] args) {
		Person person = new Person("小菜");
		System.out.println("第一种装扮\n");
		person.wearShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();
		Person person2 = new Person("小菜2");
		System.out.println("第二种装扮\n");
		person2.wearSuit();
		person2.wearTie();
		person2.wearLeatherShoes();
		person2.show();
	}

}
