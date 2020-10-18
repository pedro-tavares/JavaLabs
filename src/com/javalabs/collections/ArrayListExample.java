package com.javalabs.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *	ArrayListExample
 */
public class ArrayListExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - ArrayList");
	
		List<String> students = new ArrayList<String>();
		students.add("Antonio"); 
		students.add("Xavier"); 
		students.add("Beatrice");

		System.out.println("\nUsing shorthand for:");
		for (String name: students) {
			System.out.println(name);
		}
		
		// now remove Antonio
		students.remove(0);
		System.out.println("After remove...");
		for (String name: students) {
			System.out.println(name);
		}		
	}

}
