package com.joker.DesignePattern.creationalDesignPatterns.singleton;


/**
 * Purpose : Simple BillPugh singleton Design Pattern Example
 * 			instance will created at the time use.
 *			it will work with too many Thread also
 * 
 * @author Nikunj Balar
 *
 */
public class BillPugh {
	public static void main(String[] args) {
		System.out.println(BillPughPattern.getInstance());
	}
}

class BillPughPattern {
	// Private default constructor
	private BillPughPattern() {
		System.out.println("invoking BillPughPattern");
	}
	
	// static inner class for creating instance of outer class
	private static class Helper{
		// creating restricted instance
		private static final BillPughPattern INSTANCE = new BillPughPattern();
	}
	
	// function for instance
	// return instance of the class
	public static BillPughPattern getInstance() {
		return Helper.INSTANCE;
	}

}