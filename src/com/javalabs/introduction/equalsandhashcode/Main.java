package com.javalabs.introduction.equalsandhashcode;

public class Main {

	public static void main(String[] args) {

		String s1 = "String 1";
		String s2 = "String 2";
		String s3 = "String 1";
		
		System.out.println("s1 equals s2?: " + s1.equals(s2));
		System.out.println("s1 equals s3?: " + s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
	}

}
