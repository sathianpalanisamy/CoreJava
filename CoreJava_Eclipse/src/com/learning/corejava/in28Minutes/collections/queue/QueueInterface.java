package com.learning.corejava.in28Minutes.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	/*
	 * - Arranged in Order of Processing -> a to-do list for example
	 * - Queue Interface extends Collection. So it supports all collection methods
	 * 
	 */
	
	public static void main(String[] args) {
		
		Queue<String> queue=new PriorityQueue<>();
		
		// removing the head element
		System.out.println(queue.poll());
		
		//fo adding element to an queue
		queue.offer("Apple");
		queue.addAll(List.of("Zebra","Monkey","Cat"));
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
	}

}
