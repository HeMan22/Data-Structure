package Hashing.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class EqualArraysByHashing2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long t = sc.nextLong();

		while (t-- > 0) {
			int n = sc.nextInt();
			long arr[] = new long[n];
			long brr[] = new long[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}

			for (int i = 0; i < n; i++) {
				brr[i] = sc.nextLong();
			}

			System.out.println(check(arr, brr, n) == true ? "1" : "0");
		}
		sc.close();
	}

	private static boolean check(long[] arr, long[] brr, int n) {

		HashMap<Long, Integer> hm = new HashMap<>();
		
		for(long e: arr)
			hm.put(e, hm.getOrDefault(e, 0)+1);
		
		for(long e: brr)
		{
			if(!hm.containsKey(e))
				return false;
			
			hm.put(e, hm.get(e)-1);
			if(hm.get(e)==0)		//Here it can be if(hm.get(e)<=0) also. It's same thing for here as value will never go below 0 it will be 0 and then it will be removed and in above condition 'false will be returned.
				hm.remove(e);
		}

		return hm.size()==0;
	}

}
