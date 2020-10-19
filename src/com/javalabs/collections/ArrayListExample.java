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
		students.add("Antonio"); // ArrayList accepts duplicates
		students.add("Beatrice");
		students.add("Xavier"); 

		for (String name: students) {
			System.out.println(name);
		}
		
		System.out.println("\nIterate with for backwards");
		for (int i=students.size()-1; i>=0; i--) {
			System.out.println(students.get(i));
		}
		
		// now remove Antonio
		/*
		students.remove(0);
		System.out.println("After remove...");
		for (String name: students) {
			System.out.println(name);
		}
		*/		
	}

}
