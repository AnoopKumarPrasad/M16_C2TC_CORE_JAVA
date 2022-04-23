package com.indiabix.instance1;

class Example2
{
	void print()
	{
		System.out.println("Hello");

	}
}
public class Example1 extends Example2 {

	public static void main(String[] args) {
		Example1 e=new Example1();
		System.out.println(e instanceof Example2);

	}

}