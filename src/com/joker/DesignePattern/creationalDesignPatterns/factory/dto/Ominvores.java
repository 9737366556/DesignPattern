package com.joker.DesignePattern.creationalDesignPatterns.factory.dto;

/**
 * Purpose : DTO for implementation base on user requirement
 * 
 * @author Nikunj Balar
 *
 */
public class Ominvores implements Animal {

	private String name;
	private String type = this.getClass().getSimpleName();
	private int life;

	public Ominvores(String name, int life) {
		this.name = name;
		this.life = life;
		System.out.println("invoking Ominvores");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public int getLife() {
		return life;
	}

	@Override
	public String toString() {
		return " name=" + name + ",\n type=" + type + ",\n life=" + life;
	}
}
