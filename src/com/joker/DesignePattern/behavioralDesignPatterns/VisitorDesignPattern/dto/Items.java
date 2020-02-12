package com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto;

import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.service.CartVisitor;

/**
 * Purpose : Items interface for adding different item into the cart 
 * 
 * @author Nikunj Balar
 *
 */
public interface Items {
	
	public int accept(CartVisitor visitor);
	
}
