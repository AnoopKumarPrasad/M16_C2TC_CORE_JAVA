package com.indiabix.generics;

import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("Anoop");
		obj.add("Josh");		
		String res=obj.get(0); //change value from 0 to 1 to get Josh instead of Anoop
		System.out.println(res);
		System.out.println(res);
	}
}
