package com.der.facadeMode.version1;

public class Client {

	public static void main(String[] args) {
		Stock1 stock1 = new Stock1();
		Stock2 stock2 = new Stock2();
		Stock3 stock3 = new Stock3();
		NationalDebt1 debt1 = new NationalDebt1();
		NationalDebt2 debt2 = new NationalDebt2();
		stock1.buy();
		stock2.buy();
		stock3.buy();
		debt1.buy();
		debt2.buy();
	}
}
