package com.anonymous.call;

/**
 * This is old way how we call the 
 * anonymous function with the help of implementation class. 
 * 
 * check new Way to call anonymous function at AnonymousDemo2.java
 *
 * Don't forget functional interface
 * contain single abstract method.
 * **/
@FunctionalInterface
interface myInterface {
	void m1();
}

class Test implements myInterface {

	@Override
	public void m1() {
		System.out.println("Lambda Expression Demo");

	}

}

public class AnonymousCallDemo {
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

}
