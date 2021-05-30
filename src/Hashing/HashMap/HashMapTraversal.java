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

public class HashMapTraversal {

}
