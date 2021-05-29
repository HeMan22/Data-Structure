package Hashing;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImpl {
	static LinkedHashSet<String> lhs = new LinkedHashSet<>();

	public static void main(String... args) {
		LinkedHashSetImpl.createLinkedHashSet();
		LinkedHashSetImpl.printLinkedHashSet();
		LinkedHashSetImpl.operations();
		LinkedHashSetImpl.printLinkedHashSet();
	}

	public static void createLinkedHashSet() {
		lhs.add("India");
		lhs.add("Australia");
		lhs.add("South Africa");
		lhs.add("USA");
		lhs.add("India");
	}

	public static void printLinkedHashSet() {

		Iterator<String> i = lhs.iterator();

		//Printing through While-loop
		while (i.hasNext())
			System.out.println(i.next());

		//Printing through Advanced For-loop
		for (String s : lhs) {
			System.out.println("Printing using For Each loop");
			System.out.println(s);
		}

	}

	public static void operations() {
		System.out.println(lhs.size());
		System.out.println(lhs.remove("UK"));
		System.out.println(lhs.remove("USA"));
	}
}
