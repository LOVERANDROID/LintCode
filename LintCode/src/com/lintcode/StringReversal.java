package com.lintcode;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos = 0;

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				pos = 0;
			}
			sb.insert(pos, c);
			if (c != ' ') {
				pos++;
			}
		}
		System.out.println(sb.toString());

	}

}
