package com.javalabs.collections;

import java.util.List;
import java.util.Vector;

/**
 *	VectorExample
 *	Uses a dynamic array
 *	Is synchronized 
 */
public class VectorExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - Vector");
	
		List<String> students = new Vector<String>();
		students.add("Antonio"); //0 
		students.add("Xavier"); //1
		students.add("Beatrice"); //2

		/*
		System.out.println("\nUsing for:");
		for (int i=0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		*/
		/*
		System.out.println("\nUsing iterator:");
		Iterator<String> it = students.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		/*
		System.out.println("\nUsing shorthand for:");
		for (String name: students) {
			System.out.println(name);
		}
		*/
		/*
		System.out.println("\nUsing streams:");
		Consumer<String> printConsumer= new Consumer<String>() {
		    public void accept(String name) {
		        System.out.println(name);
		    }
		};
		students.forEach(printConsumer);
		*/
	}

}
