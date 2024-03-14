package com.anonymous.call;

/**
 * This is a new way we call the anonymous function with 
 * the help using lambda expression and functional interface.
 *
 * Don't forget functional interface
 * contain single abstract method.
 * 
 * 
 * **/
@FunctionalInterface
interface myParamDemo{
	
	int add(int a,int b);
}

public class ParametarizedAnonymousCallDemo {

	public static void main(String[] args) {
		/**
		 * As we know the parent class can hold reference to both the parent and child objects.
		 * thus, in this way we can call the anonymous function using functional interface without
		 * implementation class.
		 * 
		 * we all know FunctionalInterface contains single abstract method, 
		 * compiler automatically point the function at the call time.
		 * */
		
		/**
		 * anonymous function call with return keyword.
		 * **/
		myParamDemo m1 = (a,b)-> {return a*b;};
		System.out.println(m1.add(10, 10));
		
		
		/** 
		 * anonymous function call without return keyword, as we know for single line we can write like this.
		 * **/
		myParamDemo m2 = (a,b)-> a*b;
		System.out.println(m2.add(11, 11));
	}
}
