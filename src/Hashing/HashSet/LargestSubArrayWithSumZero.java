package Hashing.HashSet;

import java.util.HashSet;
import java.util.Set;

public class LargestSubArrayWithSumZero {

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 3, 9, -4, -6, 7, -1 };
		int n = arr.length;

		System.out.println(ZeroSumSubarray(arr, n));
	}

	private static int ZeroSumSubarray(int[] arr, int n) {
		Set<Integer> s = new HashSet<Integer>();
		int prefix_sum = 0;

		s.add(0);

		for (int i = 0; i < n; i++) {
			prefix_sum += arr[i];
			if (s.contains(prefix_sum) == true)
				return 1;
			s.add(prefix_sum);
		}

		return 0;

	}

}
