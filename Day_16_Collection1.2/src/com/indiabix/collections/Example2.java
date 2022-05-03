package com.indiabix.collections;

import java.util.PriorityQueue;

public class Example2 {

	public static void main(String[] args) {
		PriorityQueue obj=new PriorityQueue();
		obj.add(11);
		obj.add(2);
		obj.add(33);  //jvm decide which to give priority based on mutlithreading 
		System.out.println(obj);
		
//instead of add method we can put offer method
		//offer method is also used to put the elements to the queue
	}

	//obj.peek(2);
	//...
	//...
	//peek method gives the head element when used with add not with offer
}
