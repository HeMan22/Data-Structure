package Hashing.HashSet;

import java.util.HashSet;

/*
 * Given an Unsorted array and a number 'x'. Find if there is a pair with sum 'x'.
 * 
 * I/P:
 * 		arr[] = {3, 5, 2, 8, 11, 7}
 * 		x = 16
 * O/P:
 * 		True
 * 
 * Explanation: 5 + 11 = 16
 */

public class PairWithSum {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 2, 8, 11, 7 };
		int x = 16;
		
		System.out.println(findThePair(arr,arr.length,x));
	}

	private static boolean findThePair(int[] arr, int length, int x) {
		
		HashSet<Integer> hs = new HashSet<>();	
		for(int i=0;i<length;i++)
		{
			if(hs.contains(x-arr[i]))
				return true;
			
			hs.add(arr[i]);
		}
		return false;
	}

}
