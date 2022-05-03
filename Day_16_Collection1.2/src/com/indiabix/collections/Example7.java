package com.indiabix.collections;

import java.util.HashMap;
import java.util.Map;

public class Example7 {

	public static void main(String[] args) {
	 Map<Integer,String>obj=new HashMap<Integer,String>();
	 obj.put(1,"Anoop");
	 obj.put(2, "Ruchika");
	 obj.put(1, "Shiwani");
	 
	 //if keys are duplicated then recent one is showed like new user taken the old phone number of someone
	 System.out.println(obj);
	 obj.remove(2);
	 System.out.println(obj);
	 
	 /*for(Map.Entry m:map.entrySet())
	 {
		 System.out.println(m.getKey()+""+m.getValue());
	 }*/
	 }

}
