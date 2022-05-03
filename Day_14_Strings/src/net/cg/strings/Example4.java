package net.cg.strings;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		Object clone1;
		a.add("Anoop");
		a.add("Prince");
		a.add(5);
		System.out.println(a);
		clone1=a.clone();
		System.out.println(clone1);
		

	}

}