package com.tns.application;

public class Customer {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Go Shopping!");
		System.out.println("\n");

		
		GSPrimeAcc GsPrimeAcc = new GSPrimeAcc(1234, "Riya", 9000f, true);
		GsPrimeAcc.bookProduct(4);
		GsPrimeAcc.items(9000f);
		GsPrimeAcc.toString();
		System.out.println("\n");

		GSNormalAcc GsNormalAcc = new GSNormalAcc(5678, "Meera", 5000f, 60.75f);
		GsNormalAcc.bookProduct(2);
		GsNormalAcc.items(5000f);
		GsNormalAcc.toString();
		

	}

}
