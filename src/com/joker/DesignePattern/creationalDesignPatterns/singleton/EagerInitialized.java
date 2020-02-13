package com.joker.DesignePattern.creationalDesignPatterns.singleton;

/**
 * Purpose : Simple Example of EagerInitialized singleton design pattern
 * 			it restrict the instance to create multiple instance 
 * 			// no option for Exception handling
 * 			// but in this..instance will created before its being used
 * 
 * @author Nikunj Balar
 *
 */
public class EagerInitialized {

	public static void main(String[] args) {
		try {
			// trying to create normal object multiple time
			// it create each new object
			Nikunj nikunj = new Nikunj();
			System.out.println(nikunj.getInstance());
			System.out.println(nikunj.getInstance());
			System.out.println(nikunj.getInstance());

			// trying to create singleton object multiple time
			// it create object at first time only
			System.out.println(EagerInitializedPattern.getInstance());
			System.out.println(EagerInitializedPattern.getInstance());
			System.out.println(EagerInitializedPattern.getInstance());
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
	}
}

class EagerInitializedPattern {

	private static final EagerInitializedPattern instance = new EagerInitializedPattern();

	// private constructor to restrict the instance creation
	private EagerInitializedPattern() {
		System.out.println("invoking EagerInitializedPattern ");
	}

	// function to create instance
	public static EagerInitializedPattern getInstance() {
		return instance;
	}
}

// normal class
class Nikunj {
	Nikunj nikunj;

	// public constructor 
	public Nikunj() {
		System.out.println("invoking Nikunj");
	}

	// function for return the instanceS
	public Nikunj getInstance() {
		return nikunj = new Nikunj();
	}
}