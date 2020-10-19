package com.javalabs.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysStuff {

	public static void main(String[] args) {
		System.out.println("Hello World from JavaLabs - Arrays Stuff");

		Integer ids[] = {5, 10, 69};
		
		Integer key = 69;
		
		int pos = Arrays.binarySearch(ids, key);
		System.out.println("Arrays: Position of " + key + " is " + pos);
	
		List<Integer> listOfIds = Arrays.asList(ids);
		pos = Collections.binarySearch(listOfIds, key);
		System.out.println("Collections: Position of " + key + " is " + pos);
		
	}

}
