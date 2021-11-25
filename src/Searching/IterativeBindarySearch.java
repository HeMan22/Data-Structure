package Searching;

import java.util.Scanner;

public class IterativeBindarySearch {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		
		//Array Length
		int len=sc.nextInt();
		int arr[]=new int[len];
		
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		
		//Number to be Searched
		int x= sc.nextInt();
		System.out.println(iterativeBinarySearch(arr, 0, len-1, x));
	}
	
	public static int iterativeBinarySearch(int arr[],int l,int r,int x) {
		
		while(r>=l) {
			
			int mid = l+(r-l)/2;
			
			// Check if x is present at mid 
			if(arr[mid]==x)
				return mid;
			
			// If x is smaller, ignore right half 
			if(arr[mid] > x)
				r=mid-1;
			
			// If x greater, ignore left half 
			if(arr[mid]<x)
				l=mid+1;
		}
		
	    // if we reach here, then element was not present
		return -1;
	}
}
