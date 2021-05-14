
/*
 * 
 * JAVA Code for Find maximum (or minimum) 
 * sum of a subarray of size k 
 * I/P:
 * 		int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20}; 
		int k = 4;
 *	O/P: 24
 * 3+1+0+20 =24 is the maximum sum in this array with window size 4
 *
 * I/P:
 * 		int arr[] = {1, 8, 30, -5, 20, 7}; 
		int k = 3;
 *	O/P: 45
 * 30+(-5)+20 = 45 is the maximum sum in this array with window size 3
 */


package Arrays.SlidingWindowTechnique;

import java.util.Scanner;

public class FindingMaximumSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter window size");
		int k = sc.nextInt();
		
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		System.out.println(maxSum(arr, n, k));
		sc.close();
	}

	// Returns maximum sum in a subarray of size k. 
	private static int maxSum(int[] arr, int n, int k) {

		// k must be smaller than the size of array 
		if(n<k) {
			System.out.println("Invalid "+"Window size can't be greater than array Size");
			return -1;
		}
		int currSum = 0;
		for (int i = 0; i < k; i++)
			currSum += arr[i];

		int maxSum = currSum;

		for (int i = k; i < n; i++) {
			currSum += arr[i] - arr[i - k];
			if (currSum > maxSum)
				maxSum = currSum;
		}

		return maxSum;

	}

}
