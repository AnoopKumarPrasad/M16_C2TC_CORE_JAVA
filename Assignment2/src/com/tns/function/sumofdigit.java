package com.tns.function;
import java.util.Scanner;

public class sumofdigit {
	static int sumdigit(int n,int sum)
	{
		int a,sum=0;
		//a=n;
		if(n==0)
			return sum;
		else
		{	
			a=n;
			a=a%10;
			sum=sum+a;
			n=n/10;
			return sum;		
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sumdigit(sum));
		s.close();
		
	}

}
