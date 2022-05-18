package com.tns.lambdaexp;

public class Example6 {

	public static void main(String[] args) {
		/*Runnable R1=new Runnable()
				{
			public void run()
			{
				System.out.println("Multithreading");
			}
				};
				Thread t = new Thread(R1);
				t.start();*/
		
			Runnable R1=()->
			{
				System.out.println("Multithreading");
			};
			Thread t=new Thread(R1);
			t.start();
	}	

}
