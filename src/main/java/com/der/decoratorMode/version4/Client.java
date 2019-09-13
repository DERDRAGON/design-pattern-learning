package com.der.decoratorMode.version4;

public class Client {

	public static void main(String[] args) {
		Person person = new Person("小菜");
		Sneakers sneakers = new Sneakers();
		
		System.out.println("装扮1");
		BigTrouser bigTrouser = new BigTrouser();
		TShirts tShirts = new TShirts();
		sneakers.setPerson(person);
		bigTrouser.setPerson(sneakers);
		tShirts.setPerson(bigTrouser);
		tShirts.show();
	}
}
