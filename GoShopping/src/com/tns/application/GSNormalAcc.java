package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	//Constructor
	public GSNormalAcc(int accNumber, String accName, float charges, float deliveryCharges) {
		super(accNumber, accName, charges,deliveryCharges);
		
	}

	//Methods
	@Override
	public void bookProduct(int bookproducts) 
	{
		System.out.println("Account Number: "+ getAccNumber()+"\n"+"Account Name: "+ getAccName()
				+"\n"+"Number of Products Booked are: "+bookproducts);
	}

	@Override
	public void items(float charges) 
	{
		System.out.println("Charges of Products are: "+getCharges()+" Rs"+"\n"+"Delivery Charges for Normal Members: "
				+getDeliveryCharges()+" Rs");
	}


	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", toString()=" + super.toString()
				+ ", getCharges()=" + getCharges() + "]";
	}
	
}
