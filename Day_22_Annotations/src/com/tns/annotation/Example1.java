package com.tns.annotation;

class A
{
	
	void eatSomething()
	{
		System.out.println("Parent Class");
	}
}
class B extends A
{
	@Override
	void eatSomething()
	{
		System.out.println("Parent Class");
	}
}
public class Example1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.eatSomething();

	}

}