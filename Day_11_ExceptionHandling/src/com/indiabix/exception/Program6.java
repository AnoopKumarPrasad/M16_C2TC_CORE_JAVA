package com.indiabix.exception;

import java.io.IOException;

class A
{
	void print(int num)throws ClassNotFoundException,IOException
	{
		if(num==1)
		{
			throw new IOException("Exception handled");
		}
		else
		{
			throw new ClassNotFoundException("Exception occurred and handled");
		}
	}
}
public class Program6 {

	public static void main(String[] args) {
		try
		{
			A obj=new A();
			obj.print(11);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}