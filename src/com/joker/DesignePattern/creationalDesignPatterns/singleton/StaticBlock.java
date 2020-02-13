package com.joker.DesignePattern.creationalDesignPatterns.singleton;

/**
 * Purpose : Simple Example for singleton design pattern with static block
 * 			it restrict the instance to create multiple instance 
 * 			exception will handled
 * 
 * 			// but in this instance will created before its being used
 * 
 * @author Nikunj Balar
 *
 */
public class StaticBlock {
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
			System.out.println(StaticBlockPattern.getInstance());
			System.out.println(StaticBlockPattern.getInstance());
			System.out.println(StaticBlockPattern.getInstance());

		} catch (Exception e) {
			System.out.println(e.getClass());
		}
	}
}

class StaticBlockPattern {
	private static StaticBlockPattern instance;

	// private constructor
	private StaticBlockPattern() {
		System.out.println("invoking StaticBlockPattern");
	}

	// static block
	static {
		try {
			instance = new StaticBlockPattern();
		} catch (Exception e) {
			throw new RuntimeException("Exception accurd at the time of bean creation");
		}
	}

	public static StaticBlockPattern getInstance() {
		return instance;
	}
}