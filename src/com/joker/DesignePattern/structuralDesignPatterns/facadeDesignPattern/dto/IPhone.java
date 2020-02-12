package com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto;

/**
 * Purpose : DTO for implementation base on user requirement
 * 
 * @author Nikunj Balar
 *
 */
public class IPhone implements MobileShope{

	@Override
	public void modelNo() {
		System.out.println("Iphone 6");
	}

	@Override
	public void price() {
		System.out.println(65000);
	}

}
