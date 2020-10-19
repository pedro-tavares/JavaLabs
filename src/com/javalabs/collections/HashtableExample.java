package com.javalabs.collections;

import java.util.Hashtable;
import java.util.Map;

/**
 *	HashtableExample
 */
public class HashtableExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - Hashtable");
	
		Map<Integer, String> students = new Hashtable<Integer, String>();
		students.put(1, "Antonio"); 
		students.put(2, "Antonio"); 
		students.put(3, "Beatrice");
		students.put(4, "Xavier"); 

		for(Integer i: students.keySet()) {
			System.out.println(i + ", " + students.get(i));
		}
		
	}

}
