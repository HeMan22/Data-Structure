/*
Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
If there are repetitions, then only one occurrence of element should be printed in union.
Example 1:

Input:
5 3
1 2 3 4 5
1 2 3

Output: 
5

Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 

Output: 
7

Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.

*/

package Hashing.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class UnionOf2Array {

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
		System.out.println(NumberofElementsInUnion(a, b, n, m));
		// }
		sc.close();
	}

	// Function to return the count of the number of elements in
	// the intersection of two arrays.
	private static int NumberofElementsInUnion(int[] a, int[] b, int n, int m) {

		HashSet<Integer> union = new HashSet<>();

		for (int i = 0; i < n; i++) {
			union.add(a[i]);
		}
		for (int i = 0; i < m; i++)
			union.add(b[i]);

		return union.size();
	}

}
