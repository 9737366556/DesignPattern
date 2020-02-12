package com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.controller;

import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.dto.Volt;
import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.service.SocketAdepter;
import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.service.SocketClassAdepterImpl;
import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.service.SocketObjectAdepterImpl;

/**
 * Purpose : To Test the Adapter Design pattern
 * 
 * @author Nikunj Balar
 *
 */
public class Tester {
	// main function
	public static void main(String[] args) {

		System.out.println("using SocketObjectAdepterImpl class implementation");
		SocketObjectAdepterImpl objectAdepter = new SocketObjectAdepterImpl();
		Volt oV3 = getVolt(objectAdepter, 3);
		Volt oV12 = getVolt(objectAdepter, 12);
		Volt oV120 = getVolt(objectAdepter, 120);
		System.out.println("V3 Volte = " + oV3.getVolt());
		System.out.println("V12 Volte = " + oV12.getVolt());
		System.out.println("V120 Volte = " + oV120.getVolt());

		System.out.println("using SocketClassAdepterImpl class implementation");
		SocketClassAdepterImpl classAdepter = new SocketClassAdepterImpl();
		Volt cV3 = getVolt(classAdepter, 3);
		Volt cV12 = getVolt(classAdepter, 12);
		Volt cV120 = getVolt(classAdepter, 120);
		System.out.println("V3 volte =" + cV3.getVolt());
		System.out.println("V12 volte =" + cV12.getVolt());
		System.out.println("V120 volte =" + cV120.getVolt());

	}

	// function for select the volt
	public static Volt getVolt(SocketAdepter adepter, int i) {
		switch (i) {
		case 3:
			return adepter.get3Volt();
		case 12:
			return adepter.get12Volt();

		case 120:
			return adepter.get120Volt();

		default:
			return adepter.get120Volt();
		}
	}
}
