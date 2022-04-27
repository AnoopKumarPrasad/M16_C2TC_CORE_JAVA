package com.own.problem;
import java.util.Scanner;

public class npeople {
		int npeople1(int n,int k)
		{
			if(n==1)
			{
				return 1;
			}
			else
			{
				return (npeople1(n-1,k)+k-1)%n+1;
			}
		}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
	}
}
