package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberContaining123 {

	static HashMap<Integer, Integer> mp = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		findAll();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			Arrays.sort(arr);
			boolean flag = false;
			for (int x : arr) {
				if (mp.containsKey(x)) {
					System.out.print(x + " ");
					flag = true;
				}
			}

			if (flag == false)
				System.out.print(-1);
			System.out.println();
		}
		sc.close();
	}

	public static void findAll() {
		Set<Integer> set = new HashSet<>(Set.of(1, 2, 3));
		for (int i = 1; i <= 1000000; ++i) {
			int n = i;
			while (n > 0) {
				if (!set.contains(n % 10))
					break;
				n /= 10;
			}
			if (n == 0)
				mp.put(i, 1);
		}
	}

}
