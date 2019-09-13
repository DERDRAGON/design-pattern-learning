package com.der.proxyMode.version3;

import com.der.proxyMode.version1.SchoolGril;

public class Proxy implements IGiveGift {
	
	private Pursuit gg;

	public Proxy(SchoolGril mm) {
		super();
		this.gg = new Pursuit(mm);
	}

	@Override
	public void giveDolls() {
		gg.giveDolls();
	}

	@Override
	public void giveFlowers() {
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		gg.giveChocolate();
	}

}
