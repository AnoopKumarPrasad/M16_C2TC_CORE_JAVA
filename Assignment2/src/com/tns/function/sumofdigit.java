package com.tns.function;
import java.util.Scanner;

public class sumofdigit {
	static int sumdigit(int n)
	{
		int a,sum=0;
		a=n;
		if(n==0)
			return sum;
		else 
			return (n%10+sumdigit(n/10));		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int x=sumdigit(n);
		System.out.println(x);
		s.close();	
	}
}
