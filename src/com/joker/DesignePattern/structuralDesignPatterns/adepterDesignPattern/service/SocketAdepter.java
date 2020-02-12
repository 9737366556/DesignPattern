package com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.service;

import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.dto.Volt;


/**
 *Purpose : Interface for abstract methods  
 *
 *
 * @author Nikunj Balar
 *
 */
public interface SocketAdepter {

	// for return the object of 120V 
	public Volt get120Volt();

	// for return the object of 12V 
	public Volt get12Volt();
	
	// for return the object of 3V 
	public Volt get3Volt();
}
