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
			
			if(arr[mid]==x)
				return mid;
			
			if(arr[mid] > x)
			{
				iterativeBinarySearch(arr, mid+1, r, x);
			}
			if(arr[mid]<x) {
				iterativeBinarySearch(arr, l, mid-1, x);
			}
		}
		return -1;
	}
}
