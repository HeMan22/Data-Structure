package Hashing;

import java.util.HashMap;

public class HashMapImpl {

	public static void main(String[] args) {

		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
		createHashMap(arr);
	}

	private static void createHashMap(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int c = 0;

		/*
		 * for (int i = 0; i < arr.length; i++) { if (hm.containsKey(arr[i]))
		 * hm.put(arr[i], hm.get(arr[i]) + 1); else hm.put(arr[i], 1);
		 *  }
		 */
		
		for(int i=0;i<arr.length;i++) {
			if(hm.get(arr[i])==null)
				hm.put(arr[i], 1);
			else
				hm.put(arr[i], ++c);
		}
		
		System.out.println(hm);
		
	}

}
