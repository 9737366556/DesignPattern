package com.joker.DesignePattern.creationalDesignPatterns.prototype.controller;

import java.util.ArrayList;
import java.util.List;

import com.joker.DesignePattern.creationalDesignPatterns.prototype.dto.EmployeeDTO;

/**
 * Purpose : for testing prototype design problem
 * 
 * @author Nikunj Balar
 *
 */
public class Tester {
	public static void main(String[] args) throws CloneNotSupportedException {
		try {
			// list of object
			List<String> list = new ArrayList<String>();
			list.add("Nikunj");
			list.add("kunj");
			list.add("akash");
			list.add("marvin");
			list.add("paras");

			EmployeeDTO dto = new EmployeeDTO(list);

			// creating clones with the help of clone method
			EmployeeDTO dto1 = (EmployeeDTO) dto.clone();
			EmployeeDTO dto2 = (EmployeeDTO) dto.clone();

			// add object into first cloned object
			List<String> list1 = dto1.getList();
			list1.add("abhishek");
			// removing object from secong cloned object
			List<String> list2 = dto2.getList();
			list2.remove("Nikunj");

			// printing all the Employee type object with modification
			System.out.println("emp list :" + list);
			System.out.println("dto1 list :" + list1);
			System.out.println("dto2 list :" + list2);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
	}
}
