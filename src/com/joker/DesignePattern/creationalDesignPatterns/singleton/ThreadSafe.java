package com.joker.DesignePattern.creationalDesignPatterns.singleton;

/**
 * Purpose : Simple Example of EagerInitialized singleton design pattern
 * 			instance will created at the time use.
 *			Thread safe
 * 
 * 			// it will failed when too many threads try to get the instance of the Singleton class simultaneously.
 * 
 * @author Nikunj Balar
 *
 */
public class ThreadSafe {
	public static void main(String[] args) {
		System.out.println(ThreadSafePattern.getInstance());
	}
}

class ThreadSafePattern {
	private static ThreadSafePattern instance;

	// private constructor 
	private ThreadSafePattern() {
		System.out.println("invoking ThreadSafePattern");
	}

	// function for creating instance if the creation of new instance is first
	// return instance of a class
	public static synchronized ThreadSafePattern getInstance() {
		if (instance == null) {
			instance = new ThreadSafePattern();
		}
		return instance;
	}
}