package com.lintcode;

import java.util.Scanner;

public class IdCardGroup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i == 6 || i == 14) {
				System.out.print(" ");
			}	
			System.out.print(s.charAt(i));
		}
	}

}
