package com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto;

import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.service.CartVisitor;

/**
 * Purpose : BookDTO for data mapping of book object 
 * 
 * @author Nikunj Balar
 *
 */
public class Book implements Items{

	private int price;
	private String name;

	public Book(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int accept(CartVisitor visitor) {
		return visitor.visit(this);
	}
	
	
}
