package com.javalabs.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *	HashSetExample
 */
public class HashSetExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - HashSet");
	
		Set<String> students = new HashSet<String>();
		students.add("Antonio"); 
		students.add("Antonio"); // List accepts duplicates, Set does NOT
		students.add("Beatrice");
		students.add("Xavier"); 

		for (String name: students) {
			System.out.println(name);
		}
		
	}

}
