package com.joker.DesignePattern.creationalDesignPatterns.factory.controller;

import com.joker.DesignePattern.creationalDesignPatterns.factory.dto.Animal;
import com.joker.DesignePattern.creationalDesignPatterns.factory.service.AnimalFactory;


/**
 * Purpose : Tester
 * 			for testing the client program that use the own implimentation
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class FactoryTester {
	public static void main(String[] args) {
		// testing with multiple object
		Animal animal1=AnimalFactory.getAnimal("Herbivores", "horse", 30);
		System.out.println(animal1);
		Animal animal2 = AnimalFactory.getAnimal("Ominvores", "bear", 20);
		System.out.println(animal2);
		Animal animal3 = AnimalFactory.getAnimal("Carnivores", "Lion", 14);
		System.out.println(animal3);
		Animal animal4 = AnimalFactory.getAnimal("animal", "dog", 20);
		System.out.println(animal4);
		
	}
}
