package com.javalabs.collections;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *	PriorityQueueExample
 */
public class PriorityQueueExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - PriorityQueue");
	
		Queue<String> students = new PriorityQueue<String>();
		students.add("Antonio"); 
		students.add("Xavier"); 
		students.add("Beatrice");

		for (String name: students) {
			System.out.println(name);
		}
		
		students.remove();
		System.out.println("After remove...");
		for (String name: students) {
			System.out.println(name);
		}
	}

}
