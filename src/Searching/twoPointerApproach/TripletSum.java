package Searching.twoPointerApproach;

public class TripletSum {
	
	public static void main (String[] args) {
        int arr[] = new int[]{2, 3, 7, 8, 11};
        int n = arr.length;
        int sum = 22;
        
        System.out.println(triplet(arr, n, sum));
        
    }
	
	private static boolean triplet(int[] arr, int n, int sum) {
		
		for(int i=0;i<n;i++)
			if(isPair(arr, i+1,n-1, sum-arr[i]))
				return true;
		
		return false;
	}

	static boolean isPair(int arr[],int l,int r,int sum) {
		
		while(l<r){
			if(arr[l]+arr[r]==sum)
				return true;
			else if(arr[l]+arr[r]>sum)
				r--;
			else
				l++;
		}
		
		return false;
	}
}
