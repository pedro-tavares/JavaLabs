package com.javalabs.collections;

/**
 *	VectorExample
 *	Uses a dynamic array
 *	Is synchronized 
 */
public class VectorExample {

	public static void main(String[] args) {
		System.out.println("JavaLabs - collections - Vector");
		
		/*
		System.out.println("\nUsing for:");
		for (int i=0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		*/
		/*
		System.out.println("\nUsing iterator:");
		Iterator iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		*/
		/*
		System.out.println("\nUsing shorthand for:");
		for (String s: v) {
			System.out.println(s);
		}
		*/
		/*
		System.out.println("\nUsing streams:");
		Consumer<String> printConsumer= new Consumer<String>() {
		    public void accept(String name) {
		        System.out.println(name);
		    }
		};
		v.forEach(printConsumer);
		*/
	}

}
