package com.tns.date;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Example3 {

	public static void main(String[] args) {
		OffsetDateTime d=OffsetDateTime.now();
		OffsetTime d1=OffsetTime.now();
		System.out.println(d);
		System.out.println(d1);

	}

}