package com.indiabix.exception;

public class Program5 
{
	public static void display(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
			
		}
		else
		{
			throw new ArithmeticException("Not eligible");
		}
	}

	public static void main(String[] args) {
		display(15,56);

	}

}