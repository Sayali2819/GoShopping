package com.tns.framework;

public abstract class ShopFactory {
	
	public abstract PrimeAcc getNewPrimeAcc(int accNumber, String accName, float charges, boolean isPrime);
	
	public abstract NormalAcc getNewNormalAcc(int accNumber, String accName, float charges,float deliveryCharges);
	
}
