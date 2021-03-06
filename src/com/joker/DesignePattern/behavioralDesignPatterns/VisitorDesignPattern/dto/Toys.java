package com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto;

import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.service.CartVisitor;

/**
 * Purpose : ToyDTO for data mapping of Toys object 
 * 
 * @author Nikunj Balar
 *
 */
public class Toys implements Items{

	private int price;
	private String name;
	
	public Toys(int price , String name) {
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
