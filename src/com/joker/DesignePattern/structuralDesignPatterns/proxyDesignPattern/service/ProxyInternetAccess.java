package com.joker.DesignePattern.structuralDesignPatterns.proxyDesignPattern.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joker.DesignePattern.structuralDesignPatterns.proxyDesignPattern.dto.OfficeInternetAccess;

public class ProxyInternetAccess implements OfficeInternetAccess {

	private String empName;
	private RealInternetAccess real;
	ObjectMapper mapper = new ObjectMapper();
	File file = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DesignPattern/src/com/joker/DesignePattern/structuralDesignPatterns/proxyDesignPattern/proxy.json");

	public ProxyInternetAccess(String empName) {
		this.empName = empName;
	}

	@Override
	public void grantAccess() throws IOException {
		if (getRole(empName) > 4) {
			real = new RealInternetAccess(empName);
			real.grantAccess();
		} else {
			System.out.println("No internate is granted .your job is non teqnical");
		}
	}

	public int getRole(String empName) throws IOException {
		List<RealInternetAccess> list = readFile();
		int count = 0;
		for (RealInternetAccess name : list) {
			if (name.getEmpName().equals(empName)) {
				count++;
			}
		}
		if (count > 0)
			return 9;
		else
			return 3;
	}

	// function to read json file
	public List<RealInternetAccess> readFile() throws IOException {
		List<RealInternetAccess> list = mapper.readValue(file, new TypeReference<List<RealInternetAccess>>() {
		});
		return list;
	}
}
