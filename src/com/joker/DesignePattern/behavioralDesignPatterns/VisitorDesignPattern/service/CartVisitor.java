package com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.service;

import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto.Book;
import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto.Toys;

/**
 * Purpose : CartVisitor interface for abstract methods 
 * 			for return the object price
 * 
 * @author Nikunj Balar
 *
 */
public interface CartVisitor {
	// for add book object
	int visit(Book book);
	// for add toy object
	int visit(Toys toys);
}
