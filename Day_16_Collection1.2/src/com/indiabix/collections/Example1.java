package com.indiabix.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
	Queue<Integer> obj=new PriorityQueue();
	obj.add(1);
	obj.add(2);
	obj.add(3);
	System.out.println(obj);
	obj.poll();
	obj.remove();
	obj.remove();
	System.out.println(obj);
	}

}
