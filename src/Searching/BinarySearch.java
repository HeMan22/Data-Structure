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
		System.out.println(search(arr, 0, len-1, x));
	}
	
	public static int search(int arr[],int l,int r,int x) {
		
		if(r>=l) {
			int mid = l+(r-l)/2;
			
			if(arr[mid]==x)
				return mid;
		}
	
		return 0;
	}

}
