package com.indiabix.com;

	enum Margin
	{
		TOP,BOTTOM,LEFT,RIGHT;
	}
	public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=11;
		for(Margin m:Margin.values())
		{
			System.out.printf("Margin:%d- %s\n", count++,m);
		}
	}

}
