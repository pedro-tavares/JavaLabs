package com.javalabs.collections;

import java.util.LinkedList;
import java.util.List;

/**
 *	LinkedListExample
 */
public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - LinkedList");
	
		String antonio = "Antonio";
		
		List<String> students = new LinkedList<String>();
		students.add(antonio); 
		students.add(antonio);
		students.add("Xavier"); 
		students.add("Beatrice");

		System.out.println("\nUsing shorthand for:");
		for (String name: students) {
			System.out.println(name);
		}
	}

}
