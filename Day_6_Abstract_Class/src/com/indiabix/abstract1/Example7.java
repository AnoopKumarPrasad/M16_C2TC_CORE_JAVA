package com.indiabix.abstract1;
class Parent4
{
	Parent4()
	{
		System.out.println("Parent-4");
	}
}
class Child4 extends Parent4
{
	Child4()
	{
		super();
		System.out.println("Child-4");
		
	}
}
public class Example7 {

	public static void main(String[] args) {
		Child4 c=new Child4();
		
		

	}

}
