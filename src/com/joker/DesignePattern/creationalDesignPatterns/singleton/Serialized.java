package com.joker.DesignePattern.creationalDesignPatterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Purpose : Simple Example for Serialized singleton design pattern
 * 
 * @author Nikunj Balar
 *
 */
public class Serialized {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedPattern instance1 = SerializedPattern.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("serialised.ser"));
		out.writeObject(instance1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("serialised.ser"));
		SerializedPattern instance2 = (SerializedPattern) in.readObject();
		in.close();

		System.out.println("instance1 hashCode" + instance1.hashCode());
		System.out.println("instance2 hashCode" + instance2.hashCode());
	}
}

@SuppressWarnings("serial")
class SerializedPattern implements Serializable {
	private static final long uUID = 76047115L;

	// private constructor
	private SerializedPattern() {
		System.out.println("serialized singleton demo\nserial version uid is" + uUID);
	}

	// inner class for creating instance of class
	private static class Helper {
		private static final SerializedPattern instance = new SerializedPattern();
	}

	// getting instance of class
	public static SerializedPattern getInstance() {
		return Helper.instance;
	}

// the above implementation can destroy the instance of singleton design pattern
	// to over come with the above problem implement the below function
	protected Object readResolve() {
		return getInstance();
	}
}