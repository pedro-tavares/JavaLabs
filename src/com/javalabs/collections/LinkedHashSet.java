package com.javalabs.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *	LinkedHashSetExample
 */
public class LinkedHashSet {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - LinkedHashSet");
	
		Set<String> students = new HashSet<String>();
		students.add("Antonio"); 
		students.add("Antonio"); 
		students.add("Beatrice");
		students.add("Xavier"); 

		for (String name: students) {
			System.out.println(name);
		}
		
	}

}
