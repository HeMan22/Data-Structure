package Hashing.HashSet;

/*
	You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.
	
	Example 1:
	
	Input:
	N = 10
	arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
	sum = 14
	Output: 
	1
	
	Explanation: 
	arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
	and sum = 14.  There is a pair {4, 10} 
	with sum 14.
	Example 2:
	
	Input:
	N = 2
	arr[] = {2, 5}
	sum = 10
	Output:
	0
	
	Explanation: 
	arr[]  = {2, 5} and sum = 10. 
	There is no pair with sum 10.

*/


import java.util.HashSet;
import java.util.Scanner;

public class HashingPair1 {
	
    public static void main (String[] args) {
        
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking count of testcases
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            //taking size of array
            int N = sc.nextInt();
            int arr[] =  new int[N];  //array declaration
            
            for(int i = 0; i < N; i++)
             arr[i] = sc.nextInt(); //Input the array
             
             
            int sum = 0; 
            
            //taking sum
            sum = sc.nextInt();
            
            
            //Calling sumExists method
            //and printing the result
            System.out.println(sumExists(arr, N, sum));
        }
    }

	private static int sumExists(int[] arr, int n, int sum) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<n;i++)
		{
			if(hs.contains(sum-arr[i]))
				return 1;
			else
				hs.add(arr[i]);
		}
		
		return 0;
	}

}
