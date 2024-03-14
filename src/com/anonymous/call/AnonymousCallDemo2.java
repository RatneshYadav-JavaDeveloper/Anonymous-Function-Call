package com.anonymous.call;

/**
 * This is a new way we call the anonymous function with 
 * the help using lambda expression and functional interface.
 *
 * Don't forget functional interface
 * contain single abstract method.
 * 
 * checked return type anonymous method call at ParametarizedAnonymousCallDemo.java
 * **/
@FunctionalInterface
interface myInterface1 {
	void m1();
}

public class AnonymousCallDemo2 {
	public static void main(String[] args) {
		
		/*
		 * As we know the parent class can hold reference to both the parent and child objects.
		 * thus, in this way we can call the anonymous function using functional interface without
		 * implementation class.
		 * 
		 * we all know FunctionalInterface contains single abstract method, 
		 * compiler automatically point the function at the call time.
		 * **/
		myInterface1 m = () -> System.out.println("Anonymous Function Called.");
		m.m1();
	}

}
