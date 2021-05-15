/*
 * Find sub array with given sum
 * This following approach is for non-negative array. it can't work when array have negative elements
 * 
 *  I/P:
 *  	arr[] = {1, 4, 20, 3, 10, 5}
 *  Sum: 33
 *  O/P:
 *  	Yes
 *  
 *  Explanation: Elements {20 + 3 + 10 = 33}
 */

package Arrays.SlidingWindowTechnique;

public class FindingSubArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;
		System.out.println(isSubArrayThere(arr, arr.length, sum));
	}

	private static boolean isSubArrayThere(int arr[], int len, int sum) {

		int curr_sum = arr[0];
		int start = 0;

		for (int i = 1; i < len; i++) {

			// clear the previous window
			while (curr_sum > sum && start < len - 1) {
				curr_sum -= arr[start];
				start++;
			}
			if(curr_sum == sum)
				return true;
			if(i<len)
				curr_sum += arr[i];
		}

		//checking sum of last window explicitly
		return (curr_sum == sum);
	}

}
