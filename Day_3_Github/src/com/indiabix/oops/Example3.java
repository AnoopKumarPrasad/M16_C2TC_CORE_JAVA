package com.indiabix.oops;

public class Example3 {
	//parameterized constructor 
	String name;//variable
	Example3(String Name1) //constructor is same as class name
	{
		this.name=Name1; //number 1
	}
	void display()
	{
		System.out.println("This is employee " + name);
	}

	public static void main(String[] args) {
		Example3 e1=new Example3("Anoop"); //number2
		Example3 e2=new Example3("Amey");
		Example3 e3=new Example3("Ritu");
		e1.display();    // number3
		//e2.display();
		//e3.display();
	}

}
