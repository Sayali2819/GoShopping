package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int accNumber, String accName, float charges, boolean isPrime) {
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNumber, accName, charges, isPrime);
		return GsPrime;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNumber, String accName, float charges, float deliveryCharges) {
		GSNormalAcc GsNormal = new GSNormalAcc(accNumber, accName, charges, deliveryCharges);
		return GsNormal;
	}


}
