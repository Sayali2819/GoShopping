package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime = true;
	private static final float deliveryCharges = 0.0f;
	
	
	//Constructor
	public PrimeAcc(int accNumber, String accName, float charges, boolean isPrime) {
		super(accNumber, accName, charges);
		this.isPrime = isPrime;
		
	}


	public boolean isPrime() {
		return this.isPrime;
	}


	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}


	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	@Override
	public void bookProduct(int bookproducts) 
	{
		System.out.println("Account Number: "+ getAccNumber()+"\n"+"Account Name: "+ getAccName()+"\n"
				+"isPrimeAccount: "+isPrime()+"\n"+"Number of Products Booked are: "+bookproducts);
	}

	@Override
	public void items(float charges) 
	{
		System.out.println("Charges of Products are: "+getCharges()+" Rs"+"\n"+"Delivery Charges for Prime Members: "
				+getDeliveryCharges()+" Rs");
	}


	@Override
	public String toString() {
		return "PrimeAcc [ isPrime()=" + isPrime() + ","+ " getDeliveryCharges()="+ getDeliveryCharges() 
				+ ", toString()=" + super.toString() + "]";
	}
	
}
