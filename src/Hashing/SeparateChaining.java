package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SeparateChaining {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int t = Integer.parseInt(br.readLine().trim()); //Inputting the test cases
		// while(t-->0){
		int hashSize = Integer.parseInt(br.readLine().trim());
		int n = Integer.parseInt(br.readLine().trim());
		int arr[] = new int[n];
		String inputLine[] = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(inputLine[i]);
		}

		ArrayList<ArrayList<Integer>> res = separateChaining(arr, n, hashSize);

		for (int i = 0; i < res.size(); i++) {
			if (res.get(i).size() > 0) {
				System.out.print(i + "->");
				for (int j = 0; j < res.get(i).size() - 1; j++) {
					System.out.print(res.get(i).get(j) + "->");
				}
				System.out.print(res.get(i).get(res.get(i).size() - 1));
				System.out.println();
			}
		}
		// }
	}

	private static ArrayList<ArrayList<Integer>> separateChaining(int[] arr, int n, int hashSize) {

		ArrayList<ArrayList<Integer>> hashTable = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < hashSize; i++) {
			hashTable.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n; i++)
			hashTable.get(arr[i] % hashSize).add(arr[i]);

		//using Advanced For loop
		//for(int i:arr)
	    //    hashTable.get(i%hashSize).add(i);
		
			/*
			 * for(int i=0;i<hashSize;i++) { 
			 * ArrayList<Integer> temp = new ArrayList<Integer>();
			 * for(int j=0;j<n;j++)
			 *   if(arr[j]%hashSize==i)
			 * temp.add(arr[j]); hashTable.add(i,temp);
			 *  }
			 */
			return hashTable;
	}

}
