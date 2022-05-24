package com.tns.framework;

public abstract class ShopAcc 
{
	private int accNo;
	private String accNm;
	private float charges;
	//private float charge;
	public ShopAcc(int accNo, String accNm, float charges)
	{
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	abstract public void bookProduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
	}

	public int getAccNo() {
		return accNo;
	}
	/*public void setAccNo(int accNo) {
		this.accNo = accNo;
	}*/
	public String getAccNm() {
		return accNm;
	}
	/*public void setAccNm(String accNm) {
		this.accNm = accNm;
	}*/
	public float getCharges() {
		return charges;
	}
	public float getCharge() {
		
		return charges;
	}
	/*public void setCharges(float charges) {
		this.charges = charges;
	}*/
	@Override
	public String toString() {
		return String.format("ShopAcc [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, charges);
	}
	

}