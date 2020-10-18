package com.javalabs.introduction.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsTryCatch {
	
  public static void main(String args[]) {
	  
    File file = new File("/file.txt");
    try {
		FileReader fileReader = new FileReader(file);
		//fileReader.read(); // InputStreamReader
		
	} catch (FileNotFoundException ex) {
		ex.printStackTrace();
	} finally {
		System.out.println("This will ALWAYS Run!!!");
		// Do we need to close File? TODO
	}
    
  
  }
}