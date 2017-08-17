package com.lintcode;

public class Filbonacci {
	public int fibonacci(int n) {
		// write your code here
		int a[] = new int[n];
		if (n > 2) {
			for (int i = 0; i < a.length - 2; i++) {
				a[i + 2] = a[i] + a[i + 1];
			}
		} else{
			a[n - 1] = n - 1;
		}
		System.out.println(a[n-1]);
		return a[n - 1];
		
	}

	public static void main(String argc[]) {
		Filbonacci s = new Filbonacci();
		s.fibonacci(1);
	}
}
