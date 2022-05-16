package com.tns.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		LocalDate d= LocalDate.now();
		LocalTime obj=LocalTime.now();
		LocalDateTime xyz = LocalDateTime.now();
		LocalDate obj2=LocalDate.of(2020, 2, 29);
		System.out.println(d);
		System.out.println(obj);
		System.out.println(xyz);
		System.out.println(obj2);
	}

}

