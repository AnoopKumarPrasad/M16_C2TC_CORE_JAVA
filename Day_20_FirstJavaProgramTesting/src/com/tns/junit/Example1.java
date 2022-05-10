package com.tns.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Example1 {
			@Test 
			void print()
				{
				int a=1;
				int b=1;
				assertEquals(a,b);
				}
			@Disabled //it disables the working of a particular method when placed just with that method
			@Test 
			void print1()
				{
				int a=1;
				int b=12;
				assertEquals(a,b);
				}
	}

