package com.joker.DesignePattern.creationalDesignPatterns.singleton;

import java.lang.reflect.Constructor;


/**
 * Purpose : Simple Example for Reflection singleton design pattern
 * 			it destroy all the above singleton implementation approachesS
 * 
 * 			// reflection is powerful so it delete the singleton pattern
 * 
 * @author Nikunj Balar
 *
 */
public class Reflection {
	public static void main(String[] args) {
		// creating singleton object 
		EagerInitializedPattern instance1 = EagerInitializedPattern.getInstance();
		EagerInitializedPattern instance2 = null;
		try {
			// stored all the object of the class in constructor type array
			Constructor[] constructors = EagerInitializedPattern.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (EagerInitializedPattern) constructor.newInstance();
				break;
			}
			// return the new object and destroy old one
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instance1);
		System.out.println(instance2);
	}
}
