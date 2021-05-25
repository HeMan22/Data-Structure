package Hashing.HashMap;

/*

Example 1:

Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}

Output: 1

Explanation: 
89 is the only element 
in the intersection of two arrays.
Example 2:

Input:
n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 6}
b[] = {3, 4, 5, 6, 7} 

Output: 4

Explanation: 
3 4 5 and 6 are the elements 
in the intersection of two arrays.

 */

import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOf2Array {

	public static void main(String[] args) {

		// Taking input using class Scanner
		Scanner sc = new Scanner(System.in);

		// Taking count of total testcases
		/*
		 * int t=sc.nextInt();
		 * 
		 * while(t-->0) {
		 */
		int n, m;

		// taking count of elements in array a
		n = sc.nextInt();

		// taking count of elements in array b
		m = sc.nextInt();

		// Creating 2 arrays of n and m
		int a[] = new int[n];
		int b[] = new int[m];

		// inserting elements to array a
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// inserting elements to array b
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		// calling NumberofElementsInIntersection method
		// and printing the result
		System.out.println(NumberofElementsInIntersection(a, b, n, m));
		// }
	}

	// Function to return the count of the number of elements in
	// the intersection of two arrays.
	private static int NumberofElementsInIntersection(int[] a, int[] b, int n, int m) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (hm.get(a[i]) == null)
				hm.put(a[i], 1);
		}
		int c = 0;
		for (int i = 0; i < m; i++) {
			if (hm.get(b[i]) != null) {
				c++;
				hm.remove(b[i]);
			}
		}

		return c;

	}

}
