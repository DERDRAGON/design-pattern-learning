package com.der.strategyMode;

import java.util.Scanner;

public class MallCashier {
	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入价格：");
//		String pStrig = scanner.nextLine();
//		double price = Double.parseDouble(pStrig);
//		System.out.println("请输入数量：");
//		String numString = scanner.nextLine();
//		int num = Integer.parseInt(numString);
////		double total = btnOkClick(price, num);
//		CashSuper cashSuper = CashFactory.createCashAccept("normal");
//		double total = cashSuper.acceptCash(price) * num;
//		System.out.println(total);
//	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入价格：");
		String pStrig = scanner.nextLine();
		double price = Double.parseDouble(pStrig);
		System.out.println("请输入数量：");
		String numString = scanner.nextLine();
		int num = Integer.parseInt(numString);
		System.out.println("请从1，2，3中选择您的付款方式！");
		String typeString = scanner.nextLine();
		CashContext cashContext = new CashContext(typeString);
		double result = cashContext.getResult(price * num);
//		double total = btnOkClick(price, num);
//		CashSuper cashSuper = CashFactory.createCashAccept("normal");
//		double total = cashSuper.acceptCash(price) * num;
		System.out.println(result);
	}
	
//	private static double btnOkClick(double price,int number) {
//		double result = 0.0d;
//		result = result + price*number;
//		return result;
//	}

}
