package Hashing.HashSet;

import java.util.HashSet;

public class LargestSubArrayWithSumX {

	public static void main(String[] args) {

		int arr[] = new int[] { 8, 3, -7, -4, 1 };
		int n = arr.length;
		int sum = -8;

		System.out.println(largestSubarrayWithSumX(arr, n, sum));
	}

	private static int largestSubarrayWithSumX(int[] arr, int n, int sum) {

		int prefix_Sum = 0;
		HashSet<Integer> hs = new HashSet<>();
		hs.add(0);
		for (int i = 0; i < n; i++) {
			prefix_Sum += arr[i];

			if (hs.contains(prefix_Sum - sum))
				return 1;
 
			hs.add(prefix_Sum);
		}

		return 0;
	}

}
