package com.der.facadeMode.version1;

public class Fund {

	private Stock1 stock1;
	private Stock2 stock2;
	private Stock3 stock3;
	
	private NationalDebt1 debt1;
	private NationalDebt2 debt2;
	public Fund() {
		super();
		stock1 = new Stock1();
		stock2 = new Stock2();
		stock3 = new Stock3();
		debt1 = new NationalDebt1();
		debt2 = new NationalDebt2();
	}
	
	public void buyFund() {
		stock1.buy();
		stock2.buy();
		stock3.buy();
		debt1.buy();
		debt2.buy();
	}
	
	public void sellFund() {
		stock1.sell();
		stock2.sell();
		stock3.sell();
		debt1.sell();
		debt2.sell();
	}
	
}
