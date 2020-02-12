package com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.service;

/**
 * Purpose : Mediator of the chat module 
 * 
 * @author Nikunj Balar
 *
 */
public interface ChatMediator {

	// for send msg to all user
	public void sendMessage(String msg , User user);
	// for add user into chat
	void addUser(User user);
	
}
