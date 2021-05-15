package Arrays.PreFix_Sum;

/*
	PreFix Sum
		I/P: arr[] = {2, 8, 3, 9, 6, 5, 4}
		getsum(0 2)
		getsum(1 3)
		getsum(2 6)
	
		O/P: 13 20 27

 */

public class PreFixSum {

	public static void main(String[] args) {

		int arr[] = { 2, 8, 3, 9, 6, 5, 4 };

		prefixSum(arr, arr.length);
	}

	private static void prefixSum(int[] arr, int length) {

		int prefix_Sum[] = new int[length];
		prefix_Sum[0] = arr[0];

		for (int i = 1; i < length; i++)
			prefix_Sum[i] = prefix_Sum[i - 1] + arr[i];

		System.out.println(getSum(prefix_Sum, 0, 2));
		System.out.println(getSum(prefix_Sum, 1, 3));
		System.out.println(getSum(prefix_Sum, 2, 6));
	}

	private static int getSum(int[] prefix_Sum, int i, int j) {

		if (i == 0)
			return prefix_Sum[j];
		else
			return prefix_Sum[j] - prefix_Sum[i - 1];
	}

}
