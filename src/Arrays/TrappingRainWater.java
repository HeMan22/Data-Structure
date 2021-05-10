/*
Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.

*/

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrappingRainWater {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {

			// size of array
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");

			// adding elements to the array
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			// calling trappingWater() function
			System.out.println(findTrappedWater(arr, n));
		}
	}

	// Method for maximum amount of water
	private static int findTrappedWater(int[] arr, int n) {

		// left[i] contains height of tallest bar to the
		// left of i'th bar including itself
		int left[] = new int[n];

		// Right [i] contains height of tallest bar to
		// the right of ith bar including itself
		int right[] = new int[n];

		// Initialize result
		int trappedWater = 0;

		// Fill left array
		left[0] = arr[0];
		for (int i = 1; i < n; i++)
			left[i] = Math.max(left[i - 1], arr[i]);

		// Fill right array
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], arr[i]);

		// Calculate the accumulated water element by element
		// consider the amount of water on i'th bar, the
		// amount of water accumulated on this particular
		// bar will be equal to min(left[i], right[i]) - arr[i] .

		for (int i = 0; i < n; i++) {
			trappedWater += Math.min(left[i], right[i]) - arr[i];
		}
		return trappedWater;

	}
}
