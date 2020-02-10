package com.joker.DesignePattern.creationalDesignPatterns.prototype.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Purpose : for prototype design problem
 * 
 * @author Nikunj Balar
 *
 */
public class EmployeeDTO {

	private List<String> employee;

	public EmployeeDTO(List<String> list) {
		employee = new ArrayList<String>();
		this.employee = list;
	}
	
	// function got return the list of all object
	public List<String> getList(){
		return employee;
	}
	
	// function for creating clone of object
	public Object clone() throws CloneNotSupportedException{
		List<String> clone = new ArrayList<String>();
		for (String s : employee)
			clone.add(s);
		return new EmployeeDTO(clone);
	}
}