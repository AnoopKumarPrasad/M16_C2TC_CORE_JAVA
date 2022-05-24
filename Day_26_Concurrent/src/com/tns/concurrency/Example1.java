package com.tns.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 implements Runnable 
{
	final Main m;
	final int n;
	final String task;
	public Example1(Main m, int n, String task)
	{
		this.m = m;
		this.n = n;
		this.task= task;
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Thread "+Thread.currentThread().getName());
			m.pause(Math.random());
		}
	}
}
class Main
{
	public void print()
	{
		ExecutorService t=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
		{
			t.execute(new Example1(this, i+1, "task"+(i+1)));
		}
			t.shutdown();
	}
	void pause(double seconds)
	{
		try
		{
			Thread.sleep(Math.round(1000.0*seconds));
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occurred "+e);
		}
	}

	public static void main(String[] args) {
		new Main().print();
		

	}

}