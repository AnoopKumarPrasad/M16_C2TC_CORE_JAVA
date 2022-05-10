package com.tns.junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Example3_Assumptions {

	@Test
	void accept()
	{
		
		System.setProperty("1", "Ak");
		Assumptions.assumeTrue("Ak".equals(System.getProperty("2")));
	}

}
