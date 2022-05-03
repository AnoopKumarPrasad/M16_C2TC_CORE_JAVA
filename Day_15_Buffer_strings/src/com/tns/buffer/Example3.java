package com.tns.buffer;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuilder sh=new StringBuilder(s.nextLine());
		System.out.println(sh.capacity());
		
	}

}
/*import java.util.Scanner;

public class Example3 {

	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		String str1=new String(s.nextLine());
		//String str="Hello";
        //String str1 = "Hello";
        //String str2 = new String("Hello");
        System.out.println(str1.length());
        //System.out.println(str == str2);
    }


*/