package com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto;

/**
 * Purpose : DTO for implementation base on user requirement
 * 
 * @author Nikunj Balar
 *
 */
public class Samsung implements MobileShope{

	@Override
	public void modelNo() {
		System.out.println("Samsung Galaxy Note 10");
	}

	@Override
	public void price() {
		System.out.println(60000);
	}

	
}
