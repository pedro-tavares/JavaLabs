package com.javalabs.introduction.privateprotectedpublic.derived;

import com.javalabs.introduction.privateprotectedpublic.BaseClass;

public class DerivedClass extends BaseClass {
	
	public DerivedClass() {
		protectedName = "derived protectedName";
		publicName = "derived publicName";
	}
	
}
