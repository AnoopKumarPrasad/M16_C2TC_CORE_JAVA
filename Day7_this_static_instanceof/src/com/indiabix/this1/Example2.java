package com.indiabix.this1;

public class Example2 
{
	String str;
	Example2()
	{
		
	}
	Example2(String str)
	{
		this.str=str;
	}

	public static void main(String[] args) {
		Example2 e=new Example2("Java Full Stack");
		System.out.println(e.str);

	}

}