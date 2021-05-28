package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {
	static HashSet<String> hs = new HashSet<>();

	public static void main(String... args) {
		HashSetImpl.createHashSet();
		HashSetImpl.printHashSet();
		HashSetImpl.operations();
		HashSetImpl.printHashSet();
	}

	public static void createHashSet() {
		hs.add("India");
		hs.add("Australia");
		hs.add("South Africa");
		hs.add("USA");
		hs.add("India");
	}

	public static void printHashSet() {

		System.out.println(hs);

		Iterator<String> i = hs.iterator();

		while (i.hasNext())
			System.out.println(i.next());
	}

	public static void operations() {
		hs.remove("A");
		System.out.println("HashSet Contains India : " + hs.contains("India"));

	}

}
