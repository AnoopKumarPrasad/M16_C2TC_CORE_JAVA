package com.indiabix.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Example8 {

	public static void main(String[] args) {
	 SortedMap<Integer,String>obj=new TreeMap<Integer,String>();
	 obj.put(1,"Anoop");
	 obj.put(2, "Ruchika");
	 obj.put(1, "Shiwani");
	 
	 //if keys are duplicated then recent one is showed like new user taken the old phone number of someone
	 System.out.println(obj);
	// obj.remove(2);
	 //System.out.println(obj);
	 
	 }

}
