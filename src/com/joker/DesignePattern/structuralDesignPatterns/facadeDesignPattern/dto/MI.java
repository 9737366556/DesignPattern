package com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto;

/**
 * Purpose : DTO for implementation base on user requirement
 * 
 * @author Nikunj Balar
 *
 */
public class MI implements MobileShope{

	@Override
	public void modelNo() {
		System.out.println("Redmi 8A");
	}

	@Override
	public void price() {
		System.out.println(6999);
	}

}
