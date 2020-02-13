package com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.controller;

import com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.service.ChatMediator;
import com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.service.ChatMediatorImpl;
import com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.service.User;
import com.joker.DesignePattern.behavioralDesignPatterns.mediatorDesignPattern.service.UserImpl;
import com.joker.DesignePattern.utility.Utilities;


/**
 * Purpose : Mediator Design pattern
 * 
 * @author Nikunj Balar
 *
 */
public class Chat {
	public static void main(String[] args) {
		try {
			ChatMediator mediator = new ChatMediatorImpl();
			// adding user
			User user1 = new UserImpl(mediator, "nikunj");
			User user2 = new UserImpl(mediator, "marvin");
			User user3 = new UserImpl(mediator, "abhishek");
			User user4 = new UserImpl(mediator, "paras");
			mediator.addUser(user1);
			mediator.addUser(user2);
			mediator.addUser(user3);
			mediator.addUser(user4);
			int n = 0;
			// select user and send message
			do {
				System.out.println("Enter usernumber");
				System.out.println("1.nikunj \t2.marvin \t3.abhishek \t4.paras \t5.Exite");
				n = Utilities.integerInput();
				if (n > 0 && n < 5) {
					System.out.println("Enter msg");
					String msg = Utilities.stringInput();
					switch (n) {
					case 1:
						user1.send(msg);
						break;
					case 2:
						user2.send(msg);
						break;
					case 3:
						user3.send(msg);
						break;
					case 4:
						user4.send(msg);
						break;
					}
				} else if (n == 5)
					System.out.println("===== Exit =====");
				else
					System.out.println("user not found");
			} while (n != 5);
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.err.println("Exite because of exception");
		}
	}
}
