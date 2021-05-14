package Arrays.SlidingWindowTechnique;

/*
 * I/P: 
 * 		N = 3, M= 8 {N is window size, M is size of series}
 * O/P:
 * 		0 0 1 1 2 4 7 13
 * 
 * I/P:
 * 		N = 4, M= 10 {N is window size, M is size of series}
 * O/P:
 * 		0 0 0 1 1 2 4 8 15 29
 */

public class N_Fibonnaci {

	public static void main(String[] args) {

		int N = 4, M = 12;

		int arr[] = new int[M];

		//In this Fibonacci Series there would be N-1 number of 0's
		for (int i = 0; i < N - 1; i++)
			arr[i] = 0;

		//Adding 1 explicitly
		arr[N - 1] = 1;
		
		//Initialising the window sum to 0
		int winSum = 0;

		//Printing first N numbers and Calculating the sum of first window
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
			winSum += arr[i];
		}

		//For printing other numbers in the series based on the N window sum
		for (int i = N; i < M; i++) {
			//Initialising the next index of the array & printing it
			arr[i] = winSum;
			System.out.print(arr[i] + " ");

			// Calculating the next window sum by subtracting the i-N element in the array and adding arr[i]th element
			// which is the sum of the previous Nth window elements
			winSum = winSum - arr[i - N] + arr[i];
		}
	}

}
