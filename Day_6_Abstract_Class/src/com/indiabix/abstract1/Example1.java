package com.indiabix.abstract1;

abstract class A
{
	abstract void print();
	int a;
	
}
class B extends A
{
	void print()
	{
		System.out.println("Welcome to JFS program");
	}
}
public class Example1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.print();

	}

}
