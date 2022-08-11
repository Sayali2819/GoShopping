package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	//Constructor
	public GSPrimeAcc(int accNumber, String accName, float charges, boolean isPrime) {
		super(accNumber, accName, charges, isPrime);
		
	}
	
	public float getCharges() {
		return charges;
	}

	//Methods
	@Override
	public void bookProduct(int bookproducts) 
	{
		System.out.println("Account Number: "+ getAccNumber()+"\n"+"Account Name: "+ getAccName()+"\n"
				+"isPrimeAccount: "+isPrime()+"\n"+"Number of Products Booked are: "+bookproducts);
	}

	@Override
	public void items(float charges) 
	{
		System.out.println("Charges of Products are: "+getCharges()+" Rs"+"\n"+"Delivery Charges for Prime Members: "+getDeliveryCharges()+" Rs");
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [charges=" + getCharges() +", isPrime()=" + isPrime()+ ", getDeliveryCharges()=" + getDeliveryCharges() 
		+ ", toString()=" + super.toString() + "]";
	}

}
