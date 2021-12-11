package Searching.twoPointerApproach;

public class PairSumSortedArray {
	
	public static void main (String[] args) {
        int arr[] = new int[]{2, 3, 7, 8, 11};
        int n = arr.length;
        int sum = 22;
        
        System.out.println(isPresent(arr, n, sum));
        
    }

	private static boolean isPresent(int[] arr, int n, int sum) {
		
		int l=0,r=n-1;
		
		while(l<r) {
			if(arr[l]+arr[r]==sum)
				return true;
			else if(arr[l]+arr[r] >sum)
				r=r-1;
			else
				l=l+1;
		}
		
		return false;
	}
}
