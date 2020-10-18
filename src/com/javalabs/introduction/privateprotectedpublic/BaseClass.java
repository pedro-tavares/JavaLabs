package com.javalabs.introduction.privateprotectedpublic;

public class BaseClass {

	private String privateName = "Private Name";
	protected String protectedName = "Protected Name";
	public String publicName = "Public Name";

	public String getPrivateName() {
		return privateName;
	}
	
	public void setPrivateName(String privateName) {
		this.privateName = privateName;
	}
	
}
