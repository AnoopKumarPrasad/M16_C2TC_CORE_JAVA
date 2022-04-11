package com.indiabix.oops;

public class Car {
	
	String name; //variable
	
	Car(String name)
	{
		this.name=name;
	}
	void print() //method
	{
		System.out.println("This is" + name);
	}	
	public static void main(String[] args) 
	{
		Car obj1=new Car("Audi");
		Car obj2=new Car("BMW");
		Car obj3=new Car("Mercedes");
		obj1.print();
		obj2.print();
		obj3.print();
	}

}
