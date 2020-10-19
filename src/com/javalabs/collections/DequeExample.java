package com.javalabs.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * DequeExample
 */
public class DequeExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - Deque");

		Deque<String> students = new ArrayDeque<String>();
		students.add("Antonio");
		students.add("Xavier");
		students.add("Beatrice");

		for (String name : students) {
			System.out.println(name);
		}

	}

}
