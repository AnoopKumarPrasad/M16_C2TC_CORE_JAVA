package com.indiabix.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,6,30,12,17,6);
		obj.stream().distinct().forEach(System.out::println);
		System.out.println("Distinct Output: ");
		obj.stream().limit(5).forEach(System.out::println);
		System.out.println("Skip Output: ");
		obj.stream().skip(1).forEach(System.out::println);

		
	}

}
