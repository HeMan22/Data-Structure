package Hashing.HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountNonRepeatedElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		countNonRepeated(arr,size);
	}

	private static void countNonRepeated(int[] arr, int size) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i=0;i<size;i++)
		{
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}
			else
			{
				int a = hm.get(arr[i]);
				hm.put(arr[i], a+1);
			}
		}
		
		int count=0;
		for(int key:hm.keySet())
		{
			if(hm.get(key)==1)
				count++;
		}
		System.out.println(count);
		
		//System.out.println(hs.size());
	}

}
