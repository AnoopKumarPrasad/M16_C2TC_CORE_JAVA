package com.tech.application;

import com.tech.framework.SavingAcc;

public class MMSavingsAcc extends SavingAcc
{

	public MMSavingsAcc (int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMSavingsAcc [toString()=%s]", super.toString());
	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		
	}
	
	

}