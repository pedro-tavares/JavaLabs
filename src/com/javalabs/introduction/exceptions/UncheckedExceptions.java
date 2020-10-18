package com.javalabs.introduction.exceptions;

public class UncheckedExceptions {
	
  public static void main(String args[]) {
	  
	// NullPointerException
	/*
	String s = "";
	System.out.println(s);
	
	if (s == null) {
		System.out.println("s IS null");
	} else {
		System.out.println(s.equals(""));
	}
	*/
	
    // ArrayIndexOutOfBoundsException
    int[] a = {1, 2, 3, 4, 5, 6};
    System.out.println(a[0]);
    System.out.println(a[5]);	
    System.out.println(a[6]);	
  }
}