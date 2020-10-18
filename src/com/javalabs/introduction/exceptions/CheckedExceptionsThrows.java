package com.javalabs.introduction.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsThrows {
	
  public static void maain(String args[]) throws FileNotFoundException {
	  
    File file = new File("/file.txt");
    FileReader fileReader = new FileReader(file);
    System.out.println("Successful");
  
  }
}