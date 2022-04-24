package com.indiabix.multithreading;

public class Example3 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current thread: "+t);
		t.setName("Anoop");
		t.setPriority(9);
		System.out.println("Current thread: "+t);
		try
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}

	}

}