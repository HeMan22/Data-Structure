package Arrays;

/*
Here the tricky solution is in 3 steps

    Ex: {1,2,3,4,5,6} Rotate by 3.
    1) Reverse the first 'd' elements.   {3,2,1,4,5,6}
    2) Reverse the remaining array.      {3,2,1,6,5,4}
    3) Reverse the whole array now.      {4,5,6,1,2,3}

This solution doesn't require any extra buffer space.
*/

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Array Size");
		int len = sc.nextInt();

		int arr[] = new int[len];

		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the index by which you want to rotate");
		int rotate = sc.nextInt();

		arrayRotate(arr, len, rotate);

		// Printing Array
		printArray(arr, len);
		
		sc.close();
	}

	private static void printArray(int[] arr, int len) {

		int i = 0;
		while (i < len) {
			System.out.println(arr[i]);
			i++;
		}
	}

	private static void arrayRotate(int[] arr, int len, int index) {

		reverse(arr, 0, index - 1);
		reverse(arr, index, len - 1);
		reverse(arr, 0, len - 1);
	}

	private static void reverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
