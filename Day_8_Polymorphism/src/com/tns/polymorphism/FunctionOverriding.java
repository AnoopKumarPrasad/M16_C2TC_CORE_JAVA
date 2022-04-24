package com.tns.polymorphism;
class Android
{
	void display()
	{
		System.out.println("Realme");
	}
}
class Apple extends Android
{
	void  display()
	{
		System.out.println("iPhone 11 pro max");
		
	}
}
class Nokia extends Android
{
	void display()
	{
		System.out.println("iPhone");
	}
}

public class FunctionOverriding {

	public static void main(String[] args) {
		Apple a=new Apple();
		Android a1=new Android();
		Nokia a2=new Nokia();
		a.display();
		a1.display();
		a2.display();
		

	}

}