package com.tech.application;

import com.tech.framework.BankFactory;

public class MMBankFactory extends BankFactory
{

	public MMSavingsAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		MMSavingsAcc p=new MMSavingsAcc(accNo, accNm, accBal, isSalaried);
		return p;
	}

	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		
		MMCurrentAcc n=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return n;
	}

}