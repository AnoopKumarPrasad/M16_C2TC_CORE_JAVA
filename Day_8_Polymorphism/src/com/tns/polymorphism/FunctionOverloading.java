package com.tns.polymorphism;

class Shape
{
	void print(int a,int b)
	{
		System.out.println(a*b);
	}
	void print(float a,float b)
	{
		System.out.println(a*b);
	}
	void print(int l,int b,int h)
	{
		System.out.println(l*b*h);
	
	}
}
public class FunctionOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.print(10, 20);
		s.print(5.3f, 20.6f);
		s.print(10,20,30);

	}

}