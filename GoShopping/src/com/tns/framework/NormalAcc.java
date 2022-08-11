package com.tns.framework;

public abstract class NormalAcc extends ShopAcc{
	
	private static final float  deliveryCharges = 60.75f;

	//Constructor
	public NormalAcc(int accNumber, String accName, float charges,float deliveryCharges) {
		super(accNumber, accName, charges);
		
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	//Methods
	@Override
	public void bookProduct(int bookproducts) 
	{
		System.out.println("Account Number: "+ getAccNumber()+"\n"+"Account Name: "+ getAccName()+"\n"
				+"Number of Products Booked are: "+bookproducts);
	}

	@Override
	public void items(float charges) 
	{
		System.out.println("Charges of Products are: "+getCharges()+"Rs"+"\n"+"Delivery Charges for Normal Members: "
				+getDeliveryCharges()+" Rs");
	}

	@Override
	public String toString() {
		return "NormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", toString()=" + super.toString() + "]";
	}
	
}
