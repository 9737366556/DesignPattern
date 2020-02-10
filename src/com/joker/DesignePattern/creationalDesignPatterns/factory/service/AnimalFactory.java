package com.joker.DesignePattern.creationalDesignPatterns.factory.service;

import com.joker.DesignePattern.creationalDesignPatterns.factory.dto.Animal;
import com.joker.DesignePattern.creationalDesignPatterns.factory.dto.Carnivores;
import com.joker.DesignePattern.creationalDesignPatterns.factory.dto.Herbivores;
import com.joker.DesignePattern.creationalDesignPatterns.factory.dto.Ominvores;

/**
 * Purpose : Factory class 
 * 			for basic implementation 
 * 
 * @author Nikunj Balar
 *
 */
public class AnimalFactory {

	// function to get the animal 
	// its return different implementation base on user requirement 
	public static Animal getAnimal(String type, String name, int life) {
		// if type if equals to the than its return that class object
		if ("Herbivores".equalsIgnoreCase(type) || "herbivores".equalsIgnoreCase(type))
			return new Herbivores(name, life);
		else if ("Ominvores".equalsIgnoreCase(type) || "ominvores".equalsIgnoreCase(type))
			return new Ominvores(name, life);
		else if ("Carnivores".equalsIgnoreCase(type) || "carnivores".equalsIgnoreCase(type))
			return new Carnivores(name, life);
		// if type is not match any of the above than its return null
		return null;
	}
}
