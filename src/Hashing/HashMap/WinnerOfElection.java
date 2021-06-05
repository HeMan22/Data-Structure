/*
Example 1:

Input:
n = 13
Votes[] = {john,johnny,jackie,johnny,john 
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for 
him, but so does johny. john is 
lexicographically smaller, so we print 
john and the votes he received.
Example 2:

Input:
n = 3
Votes[] = {andy,blake,clark}
Output: andy 1
Explanation: All the candidates get 1 
votes each. We print andy as it is 
lexicographically smaller.
*/

package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class WinnerOfElection {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			String arr[] = new String[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.next();

			String result[] = winner(arr, n);
			System.out.println(result[0] + " " + result[1]);

		}
		sc.close();

	}

	private static String[] winner(String[] arr, int n) {

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i], 0);
			}
			hm.put(arr[i], hm.get(arr[i]) + 1);
		}

		int max = 0;
		String winner = "";

		for (String temp : hm.keySet()) {
			int val = hm.get(temp);

			if (val > max) {
				winner = temp;
				max = val;
			} else if (val == max && winner.compareTo(temp) > 0) {
				winner = temp;
				max = val;
			}
		}
		
		String a[] = {winner, Integer.toString(max)};

		return a;
	}

}
