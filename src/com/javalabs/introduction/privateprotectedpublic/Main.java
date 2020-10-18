package com.javalabs.introduction.privateprotectedpublic;

import com.javalabs.introduction.privateprotectedpublic.derived.DerivedClass;

/**
 * Introduces:
 * 	private
 * 	protected
 * 	public
 */
public class Main {

	public static void main(String[] args) {		
		
		BaseClass bc = new BaseClass();
		//System.out.println(bc.privateName);
		System.out.println(bc.getPrivateName());
		System.out.println(bc.protectedName);
		System.out.println(bc.publicName);
		
		DerivedClass dc = new DerivedClass();
		//System.out.println(dc.privateName);
		System.out.println(dc.getPrivateName());
		System.out.println(dc.protectedName);
		System.out.println(dc.publicName);

		//Main m = new Main();

	
	}
}
