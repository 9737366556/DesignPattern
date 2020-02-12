package com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto;

/**
 * Purpose : DTO for implementation base on user requirement
 * 
 * @author Nikunj Balar
 *
 */
public class Vivo implements MobileShope{

	@Override
	public void modelNo() {
		System.out.println("VIVO V7+");
	}

	@Override
	public void price() {
		System.out.println(21000);
	}
}
