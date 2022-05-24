package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) 
	{
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
		//this.deliveryCharges=deliveryCharges;
	}
		
	public void bookProduct(float charges)
	{
			System.out.println("Account no is "+this.getAccNo()+" Account name is: "
					+this.getAccNm()+" "+"Charge is : "+charges);
	}
		
		
	
	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s,toString()=%s]", isPrime,super.toString());
	}

	
	
	
	

}