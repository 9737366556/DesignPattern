package com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.controller;

import java.util.InputMismatchException;

import com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.service.ShopeKeeper;
import com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.service.ShopeKeeperImpl;
import com.joker.DesignePattern.utility.Utilities;

/**
 * Purpose : For Testing Facade pattern
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class Tester {
	public static void main(String[] args) {
		try {
			int choise = 0;
			do {
				System.out.println("========== Mobile Shope ==========");
				System.out.println("1.Vivo \t2.MI \t3.IPhone \t4.Samsung \t5.Exite");
				System.out.println("Enter your choise");

				ShopeKeeper sk = new ShopeKeeperImpl();
				choise = Utilities.integerInput();
				// Explain details of mobile base on user requirement
				switch (choise) {
				case 1:
					sk.saleVivo();
					break;
				case 2:
					sk.saleMI();
					break;

				case 3:
					sk.saleIPhone();
					break;

				case 4:
					sk.saleSamsung();
					break;

				default:
					System.out.println("nothing purchased");
					break;
				}
			} while (choise != 5);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
