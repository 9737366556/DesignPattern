package com.joker.DesignePattern.structuralDesignPatterns.proxyDesignPattern.service;

import com.joker.DesignePattern.structuralDesignPatterns.proxyDesignPattern.dto.OfficeInternetAccess;

public class RealInternetAccess	implements OfficeInternetAccess {

	private String empName;
	
	public String getEmpName() {
		return empName;
	}
	public RealInternetAccess(String empName) {
		this.empName = empName;
	}
	
	@Override
	public void grantAccess() {
		System.out.println("internet access granted for employee :"+ empName);
	}

	
}
