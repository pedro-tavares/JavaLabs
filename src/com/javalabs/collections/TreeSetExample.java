package com.javalabs.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 *	TreeSetExample
 */
public class TreeSetExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - TreeSet");
	
		Set<String> students = new TreeSet<String>();
		students.add("Antonio"); 
		students.add("Antonio"); 
		students.add("Beatrice");
		students.add("Xavier"); 

		for (String name: students) {
			System.out.println(name);
		}
		
	}

}
