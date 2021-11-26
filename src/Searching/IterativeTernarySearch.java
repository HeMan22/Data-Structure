package Searching;

import java.util.Scanner;

public class IterativeTernarySearch {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);

		// Array Length
		int len = sc.nextInt();
		int arr[] = new int[len];

		for (int i = 0; i < len; i++)
			arr[i] = sc.nextInt();

		// Number to be Searched
		int x = sc.nextInt();
		System.out.println(iterativeTernarySearch(arr, 0, len - 1, x));
	}

	private static int iterativeTernarySearch(int[] arr, int l, int r, int x) {

		while (l < r) {

			int mid1 = l + (r - l) / 3;
			int mid2 = r - (r - l) / 3;

			if (arr[mid1] == x)
				return mid1;
			if (arr[mid2] == x)
				return mid2;

			if (arr[mid1] > x)
				r = mid1 - 1;
			
			else if (arr[mid2] < x)
				l = mid2 + 1;

			else {
				l = mid1 + 1;
				r = mid2 - 1;
			}
		}

		return -1;
	}
}
