package com.lintcode;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scanner1 = new Scanner(System.in);
		int n = scanner1.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		int num = scanner2.nextInt();
		for (int i = 0; i < num; i++) {
			sum = sum + n;
			n = (int) Math.sqrt(n);
		}
		System.out.println(sum);
	}
	
}
