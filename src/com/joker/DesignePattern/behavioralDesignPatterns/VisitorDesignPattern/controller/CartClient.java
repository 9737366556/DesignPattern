package com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.controller;

import java.util.ArrayList;
import java.util.List;

import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto.Book;
import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto.Items;
import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.dto.Toys;
import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.service.CartVisitor;
import com.joker.DesignePattern.behavioralDesignPatterns.VisitorDesignPattern.service.CartVisitorImpl;
import com.joker.DesignePattern.utility.Utilities;

/**
 * Purpose : Main function of visitor pattern for testing the pattern
 * 
 * @author Nikunj Balar
 *
 */
public class CartClient {
	public static void main(String[] args) {
		try {
			// creating ArrayList object for adding items into cart
			List<Items> list = new ArrayList<Items>();
			int choise = 0;

			do {
				System.out.println("1.AddBook \t2.AddToy \t3.total");
				System.out.println("Enter ypour choise");
				choise = Utilities.integerInput();

				switch (choise) {
				case 1:
					System.out.println("Enter book prise");
					int bPrice = Utilities.integerInput();
					System.out.println("Enter book name");
					String name = Utilities.stringInput();
					list.add(new Book(bPrice, name));
					break;

				case 2:
					System.out.println("Enter toy prise");
					int tPrice = Utilities.integerInput();
					System.out.println("Enter toy name");
					String tName = Utilities.stringInput();
					list.add(new Toys(tPrice, tName));
					break;
				}
			} while (choise != 3);
			// calculating total cart value
			int total = calculateTotal(list);
			System.out.println("total cart value is " + total);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
	}

	// for calculate total of cart
	private static int calculateTotal(List<Items> items) {
		int sum = 0;
		CartVisitor visitor = new CartVisitorImpl();
		for (Items item : items)
			sum = sum + item.accept(visitor);
		return sum;
	}

}
