package com.tech.framework;

public abstract class BankAcc 
{
	private int accNo;
	private String accNm;
	private float accBal;
	public BankAcc(int accNo, String accNm, float accBal)
	{
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	abstract public void bookProduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
	}

	
	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public float getAccBal() {
		return accBal;
	}
	

	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}


	
	

}