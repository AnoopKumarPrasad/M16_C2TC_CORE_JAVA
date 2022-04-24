package com.indiabix.exception;

public class Program1 {

	public static void main(String[] args) {
		try
		{
			int x=12/0;
			System.out.println(x);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled " +e);
		}

	}

}