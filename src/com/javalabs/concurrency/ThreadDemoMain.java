package com.javalabs.concurrency;

/**
 * Introduction to Concurrency
 */
public class ThreadDemoMain {

	public static void main(String[] args) {
		System.out.println("Hello World from JavaLabs - concurrency");

		ThreadDemo thread1 = new ThreadDemo("Thread-1");
		thread1.start();
		
		ThreadDemo thread2 = new ThreadDemo("Thread-2");
		thread2.start();
		
		ThreadDemo thread3 = new ThreadDemo("Thread-3");
		thread3.start();
		
		ThreadDemo thread4 = new ThreadDemo("Thread-4");
		thread4.start();
		
		ThreadDemo thread5 = new ThreadDemo("Thread-5");
		thread5.start();
	}
	
	
	
}
