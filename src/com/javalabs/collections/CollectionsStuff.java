package com.javalabs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsStuff {

	public static void main(String[] args) {
		System.out.println("Hello World from JavaLabs - Collections Stuff");

		List<String> names = new ArrayList<String>();
		names.add("1");
		names.add("2");
		names.add("3");
		for (String name: names) {
			System.out.println(name);
		}
		
		/*
		String s = "Whatever String";
		Collections.fill(names, s);
		System.out.println("\nAfter fill:");
		for (String name: names) {
			System.out.println(name);
		}
		*/
		
		System.out.println("\nCollections max:");
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		System.out.println(Collections.max(integers));
		
		System.out.println("\nCollections reverse:");
		Collections.reverse(integers);
		for (Integer i: integers) {
			System.out.println(i);
		}
		
	}

}
