package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayRangeWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int sum = sc.nextInt();
			System.out.println(subArraySum(arr, n, sum));
		}
		sc.close();
	}

	private static int subArraySum(int[] arr, int n, int sum) {

		// using map to store the prefix sum which has appeared already.
		HashMap<Integer, Integer> prevSum = new HashMap<>();

		int c = 0;
		int currSum = 0;

		for (int i : arr) {
			// storing prefix sum which is sum of elements till current element.
			currSum += i;

			// checking if sum up to current element is equal to the given sum.
			if (currSum == sum)
				c++;
			
			//if map contains (currSum - sum) i.e. difference of current and 
    		//given sum, it means there is a subArray with sum of elements 
    		//equal to sum given.
			if(prevSum.containsKey(currSum-sum))
				//adding number of times (curr_sum - sum)has
                //appeared in map to the counter.
				c += prevSum.get(currSum-sum);
			
			Integer count = prevSum.get(currSum);
            if (count == null) 
                prevSum.put(currSum, 1); 
            else
                prevSum.put(currSum, count + 1); 

		}
        //returning the count of subArrays.
        return c; 
	}
}
