package com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.dto;

/**
 *Purpose : class for get the voltage of the main socket
 *
 *
 * @author Nikunj Balar
 *
 */
public class Socket {

	// return the volt object of 120Volt
	public Volt getVolt() {
		return new Volt(120);
	}
}
