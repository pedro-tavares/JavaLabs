package com.javalabs.collections;

import java.util.LinkedList;
import java.util.List;

/**
 *	LinkedListExample
 */
public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - LinkedList");
	
		List<String> students = new LinkedList<String>();
		students.add("Antonio"); 
		students.add("Antonio");
		students.add("Xavier"); 
		students.add("Beatrice");

		for (String name: students) {
			System.out.println(name);
		}
	}

}
