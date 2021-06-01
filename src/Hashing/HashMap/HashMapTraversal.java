/*
HashMap is a part of the java collections framework. It internally uses hashing technique.

This program contains different ways of traversing through a HashMap, which are given below:

1)	Using an Iterator: Iterator is an interface in java.util package which is used to iterate through a collection.
	hm.entrySet() is used to retrieve all the key-value pairs called Map.Entries and stores internally into a set.
	hm.entrySet().iterator() returns a iterator which acts as a cursor and points at the first element of the set and moves on till the end.
	hmIterator.hasNext() checks for the next element in the set and returns a boolean
	hmIterator.next() returns the next element(Map.Entry) from the set.
	mapElement.getKey() returns the key of the associated Map.Entry
	mapElement.getValue() return the value of the associated Map.Entry

2)	Using for-each loop:

3)	Using forEach() method: forEach() is a method of HashMap which is introduced in java 8. 
	It is used to iterate through the HashMap and also reduces the number of lines of code.
*/

package Hashing.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTraversal {

	public static void main(String[] args) {
		// Consider the HashMap contains
		// student name and their marks
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// Adding mappings to HashMap
		hm.put("GeeksforGeeks", 54);
		hm.put("A computer portal", 80);
		hm.put("For geeks", 82);

		// Printing the HashMap
		System.out.println("Created hashmap is" + hm);

		usingAnIterator(hm);
		usingForEachLoop(hm);
		usingForEachMethod(hm);
	}

	// Java program to traverse through
	// a HashMap using iterator

	private static void usingAnIterator(HashMap<String, Integer> hm) {

		// Getting An Iterator
		Iterator<Entry<String, Integer>> hmIterator = hm.entrySet().iterator();

		// Iterate through the HashMap
		// and add some bonus marks for every student
		System.out.println("HashMap after adding bonus marks:");

		while (hmIterator.hasNext()) {
			Map.Entry<String, Integer> mapElement = (Map.Entry<String, Integer>) hmIterator.next();
			int marks = (int) mapElement.getValue() + 10;

			System.out.println(mapElement.getKey() + " " + marks);
		}
	}

	// Java program for traversing
	// through a HashMap using for-each loop

	private static void usingForEachLoop(HashMap<String, Integer> hm) {

		// Using for-each loop
		System.out.println("Traversing Map using For Each Loop");

		for (Map.Entry<String, Integer> mapElement : hm.entrySet()) {
			String key = mapElement.getKey();

			// Add some bonus numbers
			// to all the keys and print it
			int value = mapElement.getValue() + 10;

			System.out.println(key + " : " + value);
		}

	}

	// Java program for traversing
	// through a HashMap using for-each loop

	private static void usingForEachMethod(HashMap<String, Integer> hm) {

		// Using forEach()
		System.out.println("Traversing Map using ForEach() ");

		// Using Hashmap.forEach()
		hm.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
