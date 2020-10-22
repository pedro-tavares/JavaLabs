package com.javalabs.concurrency;

/**
 * Introduction to Concurrency
 */
public class RunnableDemoMain {

	public static void main(String[] args) {
		System.out.println("Hello World from JavaLabs - concurrency");

		RunnableDemo thread1 = new RunnableDemo("Thread-1");
		thread1.start();

		RunnableDemo thread2 = new RunnableDemo("Thread-2");
		thread2.start();
		
		RunnableDemo thread3 = new RunnableDemo("Thread-3");
		thread3.start();
		
		RunnableDemo thread4 = new RunnableDemo("Thread-4");
		thread4.start();
		
		RunnableDemo thread5 = new RunnableDemo("Thread-5");
		thread5.start();

	}
	
	
	
}
