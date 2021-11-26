package Searching;

import java.util.Scanner;

public class RecursiveTernarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Array Length
		int len=sc.nextInt();
		int arr[]=new int[len];
		
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		
		//Number to be Searched
		int x= sc.nextInt();
		System.out.println(recursiveTernarySearch(arr, 0, len-1, x));
	}

	private static int recursiveTernarySearch(int[] arr, int l, int r, int x) {
		
		if(l>r) {
			// Find mid1 and mid2 
			int mid1 = l +(r-l)/3;
			int mid2 = r -(r-l)/3;
			
			// Check if key is present at any mid
			if(arr[mid1]==x)
				return mid1;
			
			if(arr[mid2]==x)
				return mid2;
			
			// Since key is not present at mid, 
	        // check in which region it is present 
	        // then repeat the Search operation in that region 
			if(arr[mid1]>x)
				recursiveTernarySearch(arr,l,mid1-1,x);	// The key lies in between l and mid1 
			
			else if(arr[mid2]<x)
				recursiveTernarySearch(arr,mid2+1,r,x); // The key lies in between mid2 and r 
			
			else
				recursiveTernarySearch(arr,mid1+1,mid2-1,x);	// The key lies in between l and mid1  
		}
		
		// Key not found
		return -1;
	}

	
}
