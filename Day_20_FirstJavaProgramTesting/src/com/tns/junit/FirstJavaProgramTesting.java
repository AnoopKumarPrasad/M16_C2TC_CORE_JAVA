package com.tns.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FirstJavaProgramTesting {

		@Test
		 	void display()
		 	{
		 		System.out.println("Welcome TO C2TC");
		 	}
		
		@Test @BeforeAll  //here @beforeall makes print to be executed first
 			void print()
			{
			System.out.println("Welcome to Core Java");
			}

}

