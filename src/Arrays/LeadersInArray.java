/*
Leaders in array:
All the elements in an array whose right hand side is less than itself is the leader. Which means the rightmost element will always be a leader.
    Ex:
    I/P: arr[] = {5, 3, 20, 15, 8, 3}
    O/P: 20 15 8 3

    I/P: arr[] = {5, 3, 20, 15, 8, 3, 25}
    O/P: 25


 */
package Arrays;

import java.util.Scanner;

public class LeadersInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int len = sc.nextInt();
		int arr[] = new int[len];

		System.out.println("Enter elements in array");

		// Adding elements in the array
		for (int i = 0; i < len; i++)
			arr[i] = sc.nextInt();
		
		printingLeaders(arr,len);
		sc.close();
	}

	private static void printingLeaders(int[] arr, int len) {
		
		int max_from_right = arr[len-1];
		
		/* Rightmost element is always leader */
		System.out.print(max_from_right+" ");
		

		for(int i=len-2; i>=0;i--) {
			if(arr[i] > max_from_right) {
				max_from_right=arr[i];
				System.out.print(arr[i]+" "); // If you want to maintain the order while printing, then use stack to first store it then print the stack
			}
		}
	}

}
