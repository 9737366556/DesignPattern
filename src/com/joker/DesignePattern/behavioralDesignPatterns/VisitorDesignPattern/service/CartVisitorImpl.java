package com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.service;

import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto.Book;
import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto.Toys;


/**
 * Purpose : for implementation of the interface
 *  
 * @author Nikunj Balar
 *
 */
public class CartVisitorImpl implements CartVisitor{

	@Override
	// implementation of book object 
	// return the price of book object 
	public int visit(Book book) {
		int total = book.getPrice();
		System.out.println("Book Name : "+book.getName()+"\t price : "+book.getPrice());
		return total; 
	}

	@Override
	// implementation of toy object
	// return the price if toy object
	public int visit(Toys toys) {
		int total= toys.getPrice();
		System.out.println("Toys name : "+toys.getName() +"\t price : "+toys.getPrice());
		return total;
	}
}
