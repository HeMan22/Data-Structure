package Arrays;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();

		int arr[] = new int[len];

		System.out.println("Enter elements in array");

		// Adding elements in the array
		for (int i = 0; i < len; i++)
			arr[i] = sc.nextInt();

		reverse(arr, len - 1);

		// Printing the array
		int i = 0;
		while (i < len) {
			System.out.println(arr[i]);
			i++;
		}
		
		sc.close();
	}

	private static void reverse(int[] arr, int len) {
		int i=0;
		
		while(i<len) {
			int temp = arr[i];
			arr[i] = arr[len];
			arr[len] = temp;
			i++;
			len--;
		}
	}

}
