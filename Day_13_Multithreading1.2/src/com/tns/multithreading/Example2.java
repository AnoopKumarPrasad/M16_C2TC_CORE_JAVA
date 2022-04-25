package com.tns.multithreading;

class Parents extends Thread
{
	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println("C2Tc program");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p=new Parents();
		p.start();
		try
		{
			p.interrupt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
