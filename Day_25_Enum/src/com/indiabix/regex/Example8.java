package com.indiabix.regex;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str = "M1-16 --Pratik Jain--Ankita--Anoop";
	String[] res=str.split("--"); //\\r\\n
	for(String i:res)
	{
		System.out.println(i);
	}
	}
}
