package com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.service;

/**
 * Purpose : chat users interface
 * 
 * @author Nikunj Balar
 *
 */
public abstract class User {

	protected ChatMediator mediator;
	protected String name;
	
	public User(ChatMediator med , String name) {
		this.mediator = med;
		this.name = name;
	}
	
	// for send message in chate
	public abstract void send(String msg);
	
	// for receive msg from other sendor 
	public abstract void recive(String msg);
}
