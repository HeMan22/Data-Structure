package Hashing;

//Linear probing is a collision handling technique in hashing. 
//Linear probing says that whenever a collision occurs, search for the immediate next position.
/*
 * Example 1:

Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {4,14,24,44}
Output:
-1 -1 -1 -1 4 14 24 44 -1 -1
Explanation: 4%10=4. So put 4 in 
hashtable[4].Now, 14%10=4, but 
hashtable[4] is alreadyfilled so put 
14 in the next slot and so on.
Example 2:

Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {9,99,999,9999}
Output:
99 999 9999 -1 -1 -1 -1 -1 -1 9
Explanation: 9%10=9. So put 9 in 
hashtable[9]. Now, 99%10=9, but 
hashtable[9] is already filled so 
put 99 in the (99+1)%10 =0 slot so
99 goes into hashtable[0] and so on.
 */

import java.util.Scanner;
import java.util.Arrays;

public class LinearProbing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hash_size = sc.nextInt();
		int array_size = sc.nextInt();

		int arr[] = new int[array_size];
		for (int i = 0; i < array_size; i++)
			arr[i] = sc.nextInt();

		// int hash_table[] = new int[hash_size];
		// for(int i = 0; i < hash_size; i++)
		// hash_table[i] = -1;

		int hash_table[] = linearProbing(hash_size, arr, array_size);

		for (int i = 0; i < hash_size; i++)
			System.out.print(hash_table[i] + " ");

		System.out.println();
		sc.close();

	}

	private static int[] linearProbing(int hash_size, int[] arr, int array_size) {

		int hashArray[] = new int[hash_size];
		// storing -1 at all indexes in the hash table.
		Arrays.fill(hashArray, -1);

		for (int i : arr) {
			int res = i % hash_size;

			if (hashArray[res] != -1) {
				int c = 0;
				while (c < hash_size) {
					res = res + 1;
					res = res % hash_size;
					if (hashArray[res] == -1) {
						hashArray[res] = i;
						break;
					}
					c++;
				}
			} else {
				hashArray[res] = i;
			}
		}

		return hashArray;
	}

}
