package com.javalabs.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *	HashMapExample
 */
public class HashMapExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - HashMap");
	
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(0, null); 
		students.put(1, "Antonio"); 
		students.put(2, "Antonio"); 
		students.put(3, "Beatrice");
		students.put(4, "Xavier"); 

		for(Integer i: students.keySet()) {
			System.out.println(i + ", " + students.get(i));
		}
		
	}

}
