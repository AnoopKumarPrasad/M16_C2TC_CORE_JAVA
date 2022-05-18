package com.own.problem;

import java.util.Scanner;

public class robotmn {
	

	static int  num(int m, int n)
	{
	   if (m == 1 || n == 1)
	        return 1;
	  
	   return  num(m-1, n) + num(m, n-1);
	          }

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows and columns");
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println("Total number of ways robot can reach the destination is: "+num(m,n));
    sc.close();
    
}
}