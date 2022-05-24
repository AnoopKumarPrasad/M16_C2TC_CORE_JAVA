package com.tech.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) 
	{
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("• Account no is "+this.getAccNo()+"\t| • Account name is: "
				+this.getAccNm()+" "+"\t| • AccBalance is : "+(accBal+creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s,toString()=%s]", creditLimit,super.toString());
	}

	
	
	

}