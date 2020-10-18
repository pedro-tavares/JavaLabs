package com.javalabs.introduction.conditionals;

/**
 * Demo if
 *
 */
public class IfClass {

	public static void main(String[] args) {

		String s = "lalala";
		
		if (s.equals("")) {
			System.out.println("s equals empty string");
		}
		else if (s.equals("something else")) {
			System.out.println("s equals something else");
		}
		else if (s.equals("a string")) {
			System.out.println("s equals a string");
		}
		else {
			System.out.println("NONE of the above");
		}
		
	}

}
