package com.indiabix.abstract1;
class Bike
{
	final void accept()
	{
		System.out.println("Bike");
	}
}  

class Example4 extends Bike
{  
	void run()
	{
		System.out.println("running safely with 100kmph");
	}  
  
	public static void main(String args[])
	{  
		Example4 honda= new Example4();  
		honda.run();
		honda.accept();
	}  
} 
