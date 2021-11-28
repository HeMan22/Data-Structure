package Searching;

public class OccurenceOfXinSortedArray {

	public static void main(String[] args) {
		int arr[]= new int[]{0,1,4,4,33,64,64,64,78};
		int n = arr.length;
        int X = 64;
        
        int leftOccur= leftIndex(arr,n,X);
        int rightOccur= rightIndex(arr,n,X);
        
        System.out.println(rightOccur-leftOccur +1);
	}

	static int leftIndex(int[] arr, int n, int x) {
		
		int l=0, r=n-1,mid;
		
		while(l<=r) {
			mid = l + (r-l)/2;
			
			if(arr[mid]==x && (mid==0||arr[mid-1]!=x))
				return mid;
			else if(arr[mid]>=x) // because on left side there can be other same elements too
				r=mid-1;
			else
				l=mid+1;
		}
		
		return -1;
	}

	static int rightIndex(int[] arr, int n, int x) {
		int l=0,r=n-1,mid;
		
		while(l<=r) {
			
			mid = l +(r-l)/2;
			if(arr[mid]==x &&(mid==n-1 || arr[mid+1]!=x))
				return mid;
			else if(arr[mid]<=x) //Because in right side there can be many other same elements
				l=mid+1;
			else
				r=mid-1;
		}
		return -1;
	}

}
