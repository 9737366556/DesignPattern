package com.joker.DesignePattern.creationalDesignPatterns.factory.controller;

import com.joker.DesignePattern.creationalDesignPatterns.factory.dto.Animal;
import com.joker.DesignePattern.creationalDesignPatterns.factory.service.AnimalFactory;
import com.joker.DesignePattern.utility.Utilities;

/**
 * Purpose : Tester for testing the client program that use the own
 * implimentation
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class FactoryTester {
	public static void main(String[] args) {
		try {
			int n=0;
			Animal animal;
			// testing with multiple object
			do {
				System.out.println("Enter type of animal");
				System.out.println("1.Herbivores \t2.Ominvores \t3.Carnivores \t4.Exit");
				n = Utilities.integerInput();
				if (n <5 && n>0) {
					switch (n) {
					case 1:
						System.out.println("Enter name of animal");
						String name1 = Utilities.stringInput();
						System.out.println("Enter avg life of animal");
						int life1 = Utilities.integerInput();
						animal = AnimalFactory.getAnimal("Herbivores", name1, life1);
						System.out.println(animal);
						break;

					case 2:
						System.out.println("Enter name of animal");
						String name2 = Utilities.stringInput();
						System.out.println("Enter avg life of animal");
						int life2 = Utilities.integerInput();
						animal = AnimalFactory.getAnimal("Ominvores", name2, life2);
						System.out.println(animal);
						break;
						
					case 3:
						System.out.println("Enter name of animal");
						String name3 = Utilities.stringInput();
						System.out.println("Enter avg life of animal");
						int life3 = Utilities.integerInput();
						animal = AnimalFactory.getAnimal("Carnivores", name3, life3);
						System.out.println(animal);
						break;
					}
				}else System.out.println("Enter valid type of animal");
				
			} while (n != 4);
		} catch (Exception e) {
			System.err.println(e.getClass());
		}
	}
}
