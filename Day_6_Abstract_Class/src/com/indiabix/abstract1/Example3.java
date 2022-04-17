package com.indiabix.abstract1;

class Parent
{
	final void accept()
	{
		System.out.print("Parent");
	}
}
class Child extends Parent
{
	void accept1()
	{
		System.out.print("Child");
	}
}
public class Example3 {

	public static void main(String[] args) {
		Child c=new Child();
		c.accept1();

	}

}
