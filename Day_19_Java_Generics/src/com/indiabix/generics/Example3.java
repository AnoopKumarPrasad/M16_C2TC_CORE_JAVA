package com.indiabix.generics;
import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Soujan");
		list.add("Shashank");
		String s =list.get(1);
		System.out.println("Element is:" +s);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}
		
	}
