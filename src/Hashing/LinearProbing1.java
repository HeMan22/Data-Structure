package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProbing1 {

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

		int hashTable[] = new int[hash_size];

		// storing -1 at all indexes in the hash table
		Arrays.fill(hashTable, -1);

		// iterating over the array
		for (int i = 0; i < array_size; i++) {
			// if the value of hash table at index (arr[i]%hashSize) is -1
			// which means empty then, we insert arr[i] at that place.
			if (hashTable[arr[i] % hash_size] == -1)
				hashTable[arr[i] % hash_size] = arr[i];

			// else we move linearly from the filled position
			// to find an index with -1 in hash table.
			else {
				int c = 0;
				int k = arr[i] % hash_size;
				int flag = 0;

				// using a loop which runs until we find an index with -1
				// in hash table which means empty.
				while (c < hash_size && hashTable[k] != -1) {
					if (hashTable[k] == arr[i]) {
						flag = 1;
						break;
					}
					k = (k + 1) % hash_size;
					c++;
				}
				if (flag == 1)
					continue;

				// if we find a position where arr[i] can be inserted
				// then we insert the element.
				if (c < hash_size)
					hashTable[k] = arr[i];
			}
		}

		// returning the hash table.
		return hashTable;
	}
}
