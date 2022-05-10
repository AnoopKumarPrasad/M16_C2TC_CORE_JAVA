package com.tns.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class Example2_Assertions {

	@AfterAll
	
	 static void display() //static to be used when @AfterAll Assertion is used
	{
		System.out.println("Sush");
	}
		
		@Test
		void display1()
		{
			System.out.println("Kam");
		}
	}

