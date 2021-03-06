package Searching;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		
		//Array Length
		int len=sc.nextInt();
		int arr[]=new int[len];
		
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		
		//Number to be Searched
		int x= sc.nextInt();
		System.out.println(recursiveBinarySearch(arr, 0, len-1, x));
	}
	
	public static int recursiveBinarySearch(int arr[],int l,int r,int x) {
		
		if(r>=l) {
			int mid = l+(r-l)/2;
			
			// If the element is present at the middle itself
			if(arr[mid]==x)
				return mid;
			
			// If element is smaller than mid, then 
	        // it can only be present in left subarray 
			if(arr[mid] >x)
				recursiveBinarySearch(arr,l,mid-1,x);
			
			if(arr[mid]<x)
				recursiveBinarySearch(arr, mid+1, r, x);
		}
		
		// We reach here when element is not 
	    // present in array
		return -1;
	
	}

}
