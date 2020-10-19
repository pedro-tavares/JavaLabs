package com.javalabs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *	SortedArrayListExample
 */
public class SortedArrayListExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - Sorted ArrayList");
	
		List<String> students = new ArrayList<String>();
		students.add("Xavier"); 
		students.add("Antonio"); 
		students.add("Antonio");
		students.add("Beatrice");

		for (String name: students) {
			System.out.println(name);
		}

		//Collection
		//Collections
		
		System.out.println("\nAfter sort:");
		Collections.sort(students);
		for (String name: students) {
			System.out.println(name);
		}
		
	}

}
