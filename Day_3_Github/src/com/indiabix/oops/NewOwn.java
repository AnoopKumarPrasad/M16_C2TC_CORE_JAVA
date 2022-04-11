package com.indiabix.oops;

public class NewOwn {
	//parameterized constructor 
	String name="Anoop";//variable
	/*NewOwn(String Name1) //constructor is same as class name
	{
		this.name=Name1; //number 1
	}*/
	void display()
	{
		System.out.println("This is CEO " + name);
	}

	public static void main(String[] args) {
		NewOwn e1=new NewOwn(); //number2
		//Example3 e2=new Example3("Amey");
		//Example3 e3=new Example3("Ritu");
		e1.display();    // number3
		//e2.display();
		//e3.display();
	}

}
