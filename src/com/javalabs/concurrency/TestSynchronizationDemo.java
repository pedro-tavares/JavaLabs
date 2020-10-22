package com.javalabs.concurrency;

class SynchronizationDemo {

	synchronized void printTable(int num) { // not synchronized
		for(int i=1; i<10; i++) {
			
			System.out.println(num*i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	SynchronizationDemo t;
	
	MyThread1(SynchronizationDemo t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	SynchronizationDemo t;
	
	MyThread2(SynchronizationDemo t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(100);
	}
}

class MyThread3 extends Thread {
	SynchronizationDemo t;
	
	MyThread3(SynchronizationDemo t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(1000);
	}
}

class TestSynchronizationDemo {
	
	public static void main(String[] args) {
		System.out.println("Hello World from JavaLabs - TestSynchronizationDemo");

		SynchronizationDemo sd = new SynchronizationDemo();

		MyThread1 t1 = new MyThread1(sd);
		t1.start();

		MyThread2 t2 = new MyThread2(sd);
		t2.start();

		MyThread3 t3 = new MyThread3(sd);
		t3.start();

	}
}