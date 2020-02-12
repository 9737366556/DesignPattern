package com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Purpose : implementation of ChatMediator interface
 * 
 * @author Nikunj Balar
 *
 */
public class ChatMediatorImpl implements ChatMediator {
	List<User> users;

	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
	}
	@Override
	// for add new user
	public void addUser(User user) {
		this.users.add(user);
	}
	
	@Override
	// for sending msg to other user
	public void sendMessage(String msg, User user) {
		for (User u : this.users) {
			if (u != user)
				u.recive(msg);
		}
	}
}
