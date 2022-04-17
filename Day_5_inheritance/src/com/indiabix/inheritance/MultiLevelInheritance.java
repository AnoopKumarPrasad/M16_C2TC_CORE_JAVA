package com.indiabix.inheritance;
class Samsung
{
	void accept()
	{
		System.out.println("Samsung Galaxy");
	}
}
class SamsungM31 extends Samsung
{
	void print()
	{
		System.out.println("Samsung Galaxy-M31");
	}
}
class SamsungM31s extends SamsungM31
{
	void display()
	{
		System.out.println("Samsung Galaxy-M31s");
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		SamsungM31s obj=new SamsungM31s();
		obj.display();
		obj.accept();
		obj.print();

	}

}
