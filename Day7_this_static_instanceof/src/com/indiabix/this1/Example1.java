package com.indiabix.this1;

class Parent
{
	int a;
	void print(int a)
	{
		this.a=a;
	}
	void display()
	{
		System.out.println("The value of a is: "+a);
	}
}
public class Example1 {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.print(10);
		p.display();
	}
	}
