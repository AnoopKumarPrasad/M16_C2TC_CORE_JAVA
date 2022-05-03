package com.indiabix.collections;

import java.util.Vector;

public class Example4 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(0,"Anoop");
		v.add(1,21);
		v.add(2,23.98);
		System.out.println(v);
		v.setElementAt(2,1);
		System.out.println(v);
		
	}

}
