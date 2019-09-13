package com.der.decoratorMode.version4;

public class Finery extends Person {

	protected Person person;

	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public void show() {
		if (null != person) {
			person.show();
		}
	}

}
