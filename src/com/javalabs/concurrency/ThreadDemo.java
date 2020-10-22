package com.javalabs.concurrency;

public class ThreadDemo extends Thread {

	private Thread t;
	private String threadName;
	
	ThreadDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating Thread with name:" + threadName);
	}
	
	public void run() {
		System.out.println("Running:" + threadName);
		
		for (int i=5; i>0; i--) {
			System.out.println("Thread:" + threadName + ", " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Thread:" + threadName + " was interrupted");
			}
		}
		System.out.println("Thread:" + threadName + " is exiting");		
	}
	
	public void start() {
		System.out.println("Starting Thread:" + threadName);
		
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
			
	}
}
