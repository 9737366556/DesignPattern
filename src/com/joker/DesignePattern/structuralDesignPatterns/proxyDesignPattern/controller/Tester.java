package com.joker.DesignePattern.structuralDesignPatterns.proxyDesignPattern.controller;

import java.io.IOException;

import com.joker.DesignePattern.structuralDesignPatterns.proxyDesignPattern.dto.OfficeInternetAccess;
import com.joker.DesignePattern.structuralDesignPatterns.proxyDesignPattern.service.ProxyInternetAccess;
import com.joker.DesignePattern.utility.Utilities;

public class Tester {
	public static void main(String[] args) throws IOException {
		
		System.out.println(" Enter your name");
		String name = Utilities.stringInput();
		OfficeInternetAccess access = new ProxyInternetAccess(name);
		access.grantAccess();
	}
}
