package com.der.proxyMode.version1;

public class Pursuit {
	
	private SchoolGril mm;

	public Pursuit(SchoolGril mm) {
		super();
		this.mm = mm;
	}
	
	public void giveDolls() {
		System.out.println(String.format("%s 送你洋娃娃。", mm.getName()));
	}
	
	public void giveFlowers() {
		System.out.println(String.format("%s 送你鲜花。", mm.getName()));
	}
	
	public void giveChocolate() {
		System.out.println(String.format("%s 送你巧克力。", mm.getName()));
	}

}
