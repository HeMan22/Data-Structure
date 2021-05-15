package Arrays.PreFix_Sum;
/*
Equilibrium Point (Using PreFix Sum)

I/P: arr[] = {3, 4, 8, -9, 20, 6}
O/P: Yes 20
I/P: arr[] = {4, 2, -2}
O/P: Yes 4
I/P: arr[] = {4, 2, 2}
O/P: No
I/P: arr[] = {2, -2, 4}
O/P: Yes 4

 */

public class EquilibriumPoint {

	public static void main(String[] args) {

        int arr[] = {3, 4, 8, -9, 20, 6};
        int len = arr.length;

        System.out.println(equilibriumPoint(arr,len));
	}

	private static boolean equilibriumPoint(int[] arr, int len) {
		
		int sum = 0;        //Initialise sum of whole array
	    int leftSum = 0;    //Initialise sum of left array
		
	    //Find sum of whole array
	    for(int i=0;i<len;i++) {
			sum += arr[i];
		}

		
		for(int i=0;i<len;i++) {
			sum = sum - arr[i];
			if(leftSum == sum)
			{
				System.out.println(arr[i]);
				return true;
			}
			leftSum += arr[i];
		}
		
		return false;
	}

}
