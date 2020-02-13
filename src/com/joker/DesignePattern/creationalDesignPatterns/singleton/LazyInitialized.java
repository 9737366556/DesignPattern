package com.joker.DesignePattern.creationalDesignPatterns.singleton;

/**
 * Purpose : Simple Example of EagerInitialized singleton design pattern
 * 			it restrict the instance to create multiple instance 
 *			exception will handled
 * 			instance will created at the time use.
 * 
 * 			// not Thread Safe
 * 
 * @author Nikunj Balar
 *
 */
public class LazyInitialized {
	public static void main(String[] args) {
		LazyInitializedPattern.getInstance();
	}
}

class LazyInitializedPattern{
	private static LazyInitializedPattern instance;
	
	// private constructor 
	private LazyInitializedPattern() {
		System.out.println("invoking LazyInitializedPattern ");
	}
	
	// function for creating instance if the creation of new instance is first
	// return instance of a class
	public static LazyInitializedPattern getInstance() {
		if(instance == null) {
			instance = new LazyInitializedPattern();
		}
		return instance;
	}
}