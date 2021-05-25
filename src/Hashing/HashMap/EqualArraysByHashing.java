package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class EqualArraysByHashing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long t = sc.nextLong();

		while (t-- > 0) {
			int n = sc.nextInt();
			long arr[] = new long[n];
			long brr[] = new long[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}

			for (int i = 0; i < n; i++) {
				brr[i] = sc.nextLong();
			}

			System.out.println(check(arr, brr, n) == true ? "1" : "0");
		}
		sc.close();
	}

	private static boolean check(long[] arr, long[] brr, int n) {

		HashMap<Long, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (!hm.containsKey(arr[i]))
				hm.put(arr[i], 1);
			else
				hm.put(arr[i], hm.get(arr[i]) + 1);
		}

		for (int i = 0; i < n; i++) {
			if (!hm.containsKey(brr[i]))
				return false;
			else {
				hm.put(brr[i], hm.get(brr[i]) - 1);
			}
		}

		for (int i = 0; i < n; i++)
			if (hm.get(arr[i]) != 0)
				return false;

		return true;
	}

}
