package com.der.proxyMode.version3;

import com.der.proxyMode.version1.SchoolGril;

public class Pursuit implements IGiveGift {
	
	private SchoolGril mm;

	public Pursuit(SchoolGril mm) {
		super();
		this.mm = mm;
	}

	@Override
	public void giveDolls() {
		System.out.println(String.format("%s 送你洋娃娃。", mm.getName()));
	}

	@Override
	public void giveFlowers() {
		System.out.println(String.format("%s 送你鲜花。", mm.getName()));
	}

	@Override
	public void giveChocolate() {
		System.out.println(String.format("%s 送你巧克力。", mm.getName()));
	}

}
