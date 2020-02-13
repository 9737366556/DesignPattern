package com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.controller;

import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.dto.Volt;
import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.service.SocketAdepter;
import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.service.SocketClassAdepterImpl;
import com.joker.DesignePattern.structuralDesignPatterns.adepterDesignPattern.service.SocketObjectAdepterImpl;
import com.joker.DesignePattern.utility.Utilities;

/**
 * Purpose : To Test the Adapter Design pattern
 * 
 * @author Nikunj Balar
 *
 */
public class Tester {
	// main function
	public static void main(String[] args) {
		try {
			Volt v;
			System.out.println("using SocketObjectAdepterImpl class implementation");
			SocketObjectAdepterImpl objectAdepter = new SocketObjectAdepterImpl();
			int n = 0;
			do {
				System.out.println("Enter your choice");
				System.out.println("1.Exit \t2.3volt \t3.12volt \t4.120volt");
				n = Utilities.integerInput();
				
				switch (n) {
				case 2:
					v = getVolt(objectAdepter, 3);
					System.out.println("V3 Volte = " + v.getVolt());
					break;
					
				case 3:
					v = getVolt(objectAdepter, 12);
					System.out.println("V3 Volte = " + v.getVolt());
					break;

				case 4:
					v = getVolt(objectAdepter, 120);
					System.out.println("V3 Volte = " + v.getVolt());
					break;

				default:
					System.out.println("no such volte available");
					break;
				}
			} while (n != 1);
			

			System.out.println("using SocketClassAdepterImpl class implementation");
			SocketClassAdepterImpl classAdepter = new SocketClassAdepterImpl();
			int n1 = 0;
			do {
				System.out.println("Enter your choice");
				System.out.println("1.Exit \t2.3volt \t3.12volt \t4.120volt");
				n1 = Utilities.integerInput();
				
				switch (n1) {
				case 3:
					v = getVolt(classAdepter, 3);
					System.out.println("V3 Volte = " + v.getVolt());
					break;
					
				case 12:
					v = getVolt(classAdepter, 12);
					System.out.println("V3 Volte = " + v.getVolt());
					break;

				case 120:
					v = getVolt(classAdepter, 120);
					System.out.println("V3 Volte = " + v.getVolt());
					break;

				default:
					System.out.println("no such volte available");
					break;
				}
			} while (n != 1);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
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
