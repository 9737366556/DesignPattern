package com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.service;

import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.dto.Socket;
import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.dto.Volt;

/**
 * Purpose : Implementation of SocketAdapter using inheritance
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class SocketClassAdepterImpl extends Socket implements SocketAdepter {

	// override methods of SocketAdapter interface
	// return volt object

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = getVolt();
		return convertVolt(v, 40);
	}

	// converting 120Volte into respective type
	public Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolt() / i);
	}
}
