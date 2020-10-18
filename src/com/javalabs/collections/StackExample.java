package com.javalabs.collections;

import java.util.Stack;

/**
 *	StackExample
 */
public class StackExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - Stack");

		Stack<String> students = new Stack<String>();
		students.push("Antonio");
		students.push("Xavier"); 
		students.push("Beatrice");
		students.push("Lolita");
		
		/*
		System.out.println("\nUsing shorthand for:");
		for (String name: students) {
			System.out.println(name);
		}
		*/
		
		System.out.println(students.peek());
		students.pop();
		System.out.println(students.peek());
		students.pop();
		System.out.println(students.peek());
		students.pop();
		System.out.println(students.peek());
		students.pop();

		// now its empty
		//students.pop();

	}

}
