package com.indiabix.generics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		Map<Integer, String>obj=new HashMap<Integer,String>();
		obj.put(1, "Umesh");
		obj.put(5, "Afreen");
		System.out.println(obj);
		Set<Entry<Integer, String>>obj1=obj.entrySet();
		Iterator<Entry<Integer, String>>itr=obj1.iterator();
		while(itr.hasNext())
		{
			Map.Entry e1=itr.next();
			System.out.println(e1.getKey() +" " +e1.getValue());
		}
	}
}
