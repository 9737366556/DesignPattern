package com.joker.DesignePattern.behavioralDesignPatterns.observerDesignPattern.controller;

import com.joker.DesignePattern.behavioralDesignPatterns.observerDesignPattern.service.Channel;
import com.joker.DesignePattern.behavioralDesignPatterns.observerDesignPattern.service.Subscriber;

public class Tester {
	public static void main(String[] args) {
		Channel java = new Channel();

		Subscriber s1 = new Subscriber("nikunj");
		Subscriber s2 = new Subscriber("paras");
		Subscriber s3 = new Subscriber("marvin");
		Subscriber s4 = new Subscriber("sunny");
		Subscriber s5 = new Subscriber("abhishek");
		Subscriber s6 = new Subscriber("akash");

		java.subscribe(s1);
		java.subscribe(s2);
		java.subscribe(s3);
		java.subscribe(s4);
		java.subscribe(s5);
		java.subscribe(s6);

		java.unSubscribe(s3);

		s1.subscribeChannel(java);
		s2.subscribeChannel(java);
		s3.subscribeChannel(java);
		s4.subscribeChannel(java);
		s5.subscribeChannel(java);
		s6.subscribeChannel(java);

		java.upload("How to do programming in java");
	}
}
