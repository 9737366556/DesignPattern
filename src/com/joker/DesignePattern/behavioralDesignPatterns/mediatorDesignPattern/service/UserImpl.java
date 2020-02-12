package com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.service;

/**
 * Purpose : implementation of user interface
 * 
 * @author Nikunj Balar
 *
 */
public class UserImpl extends User{
	
	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	// for send message
	public void send(String msg) {
		System.out.println(this.name +" sending msg ="+msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	// for receive message from other user 
	public void recive(String msg) {
		System.out.println(this.name + " recived msg = "+ msg);
	}

}
