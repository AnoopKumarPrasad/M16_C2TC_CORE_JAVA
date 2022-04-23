package com.indiabix.this1;

public class Example4 
{
	int a;
	int b;
	Example4()
	{
		a=20;
		b=40;
	}
	Example4 accept()
	{
		return this;
	}
	void print()
	{
		System.out.println("value of a is: "+a);
		System.out.println("value of b is: "+b);
	}

	public static void main(String[] args) {
		Example4 e=new Example4();
		e.print();

	}

}