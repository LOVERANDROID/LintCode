package com.lintcode;

public class addStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1298912891289189189898198291";
		String b = "19";
		addStrings add = new addStrings();
		System.out.println(add.addStrings1(a, b));
	}
	public String addStrings1(String a, String b){
		long x = Long.valueOf(a);
		long y = Long.valueOf(b);
		long sum = x + y;		
		return String.valueOf(sum);
	}

}
