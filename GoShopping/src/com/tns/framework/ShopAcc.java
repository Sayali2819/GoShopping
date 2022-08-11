package com.tns.framework;

public abstract class ShopAcc 
{
	protected int accNumber;
	protected String accName;
	protected float charges;
	

	public int getAccNumber(){
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	//Constructor
	public ShopAcc(int accNumber, String accName, float charges)
	{
		this.accNumber = accNumber;
		this.accName = accName;
		this.charges = charges;
	}
	
	//Methods
	public abstract void bookProduct(int bookproducts);
	public abstract void items(float charges);
	
	@Override
	public String toString() {
		return "ShopAcc [charges=" + charges + ", getAccNumber()=" + getAccNumber() + ", getAccName()=" + getAccName()
				+ ", getCharges()=" + getCharges() + "]";
	}

	

	
		

}
