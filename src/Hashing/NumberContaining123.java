/*
 
Given an array arr[] of n numbers. The task is to print only those numbers whose digits are from set {1,2,3}.

Example 1:

Input:
n = 3
arr[] = {4,6,7}
Output: -1
Explanation: No elements are there in the 
array which contains digits 1, 2 or 3.
Example 2:

Input:
n = 4
arr[] = {1,2,3,4}
Output: 1 2 3
Explanation: 1, 2 and 3 are the only 
elements in the array which contains 
digits as 1, 2 or 3.

*/


package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberContaining123 {

	static HashMap<Integer, Integer> mp = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		findAll();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			Arrays.sort(arr);
			boolean flag = false;
			for (int x : arr) {
				if (mp.containsKey(x)) {
					System.out.print(x + " ");
					flag = true;
				}
			}

			if (flag == false)
				System.out.print(-1);
			System.out.println();
		}
		sc.close();
	}

	public static void findAll() {
		Set<Integer> set = new HashSet<>(Set.of(1, 2, 3));
		//So now we have a set of {1,2,3}
		
		//In below section we will check the each digits of the number to this set
		
		for (int i = 1; i <= 1000000; ++i) {
			int n = i;
			while (n > 0) {
				if (!set.contains(n % 10))
					break;
				n /= 10;
			}
			// N will be 0 only when all the digit of the number will be from set of {1,2,3}
			// i.e 12, 13, 321, 32123.  
			// But as soon as we see number like 421 or 4321 N value at the end will also be 4
			// and not 0 so we won't put that in the map
			if (n == 0)
				mp.put(i, 1);
		}
	}

}
