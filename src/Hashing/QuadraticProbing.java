package Hashing;
/*
 *	Example 1:

	Input:
	hashSize = 11
	N = 4
	Array[] = {21,10,32,43}
	Output: 
	10 -1 -1 32 -1 -1 -1 -1 43 -1 21
	Explanation: 21%11=10 so 21 goes into 
	hashTable[10] position. 10%11=10. 
	hashTable[10] is already filled so we try 
	for (10+12)%11=0 position. hashTable[0] 
	is empty so we put 10 there. 32%11=10. 
	hashTable[10] is filled. We try 
	(32+12)%11=0. But hashTable[0] is also 
	already filled. We try (32+22)%11=3. 
	hashTable[3] is empty so we put 32 in 
	hashTable[3] position. 43 uses 
	(43+33)%11=8. We put it in hashTable[8].
	
	Example 2:
	
	Input:
	hashSize = 11
	N = 4
	Array[] = {880,995,647,172 }
	Output:
	880 -1 -1 -1 -1 995 -1 172 -1 647 -1 
	Explanation: Using the similar approach 
	as used in above explanation we will get 
	the output like 
	880 -1 -1 -1 -1 995 -1 172 -1 647 -1.
 */

import java.util.Arrays;
import java.util.Scanner;

public class QuadraticProbing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hash_size = sc.nextInt();
		int array_size = sc.nextInt();

		int arr[] = new int[array_size];
		for (int i = 0; i < array_size; i++)
			arr[i] = sc.nextInt();

		int hash_table[] = quadraticProbing(hash_size, arr, array_size);

		for (int i = 0; i < hash_size; i++)
			System.out.print(hash_table[i] + " ");

		System.out.println();
		sc.close();
	}

	private static int[] quadraticProbing(int hash_size, int[] arr, int array_size) {

		int hashTable[] = new int[hash_size];

		Arrays.fill(hashTable, -1);

		for (int i = 0; i < array_size; i++) {
			int res = arr[i] % hash_size;

			if (hashTable[res] != -1) {
				int c = 0;
				int t;

				while (c < hash_size) {
					t = (res + (c * c)) % hash_size;
					if (hashTable[t] == -1) {
						hashTable[t] = arr[i];
						break;
					}
					c++;
				}
			} else
				hashTable[res] = arr[i];
		}

		return hashTable;
	}

}
