package com.joker.DesignePattern.creationalDesignPatterns.singleton;


/**
 * Purpose : Simple Example for enum singleton design pattern
 * 			to over come with the situation of reflection pattern 
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class Enum {
	public static void main(String[] args) {
		abc obj = abc.INSTANCE;
		obj.i = 7;
		obj.show();

		abc obj1 = abc.INSTANCE;
		obj1.i = 9;
		obj.show();

	}
	}
// enum value can be globally  accessible
// every enum value cane be instantiated only one in java program
enum abc {
	
	INSTANCE;
	int i;

	public void show() {
		System.out.println(INSTANCE);
		System.out.println(i);
	}
}