package com.javalabs.introduction.conditionals;

public class SwitchClass {

	public static void main(String[] args) {

		String s = "";
		
		switch(s) {
		case "":
			System.out.println("s equals empty string");
			break;
		case "something else":
			System.out.println("s equals something else");
			break;
		case "a string":
			System.out.println("s equals a string");
			break;
		case "lalala":
			System.out.println("s equals lalala");
			break;
		default:
			System.out.println("NONE of the above");
		}
	}
}
