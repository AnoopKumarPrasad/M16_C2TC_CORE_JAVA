package com.indiabix.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example7 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Programming");
		Matcher m=p.matcher("Java Programming is enough to get a job in IT industry");
	while(m.find())	
	{
		System.out.printf("Pattern Found from:"  +m.start()+ "to" + (m.end()-1));
	}
	System.out.println("Nothing");
	}

}