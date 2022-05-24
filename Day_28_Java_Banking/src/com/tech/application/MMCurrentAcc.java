package com.tech.application;

import com.tech.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMNormalAcc [toString()=%s]", super.toString());
	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		
	}
	

}