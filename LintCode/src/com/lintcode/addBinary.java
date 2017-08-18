package com.lintcode;

public class addBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11";
		String b = "1";
		addBinary add = new addBinary();
		System.out.println(add.addBinary1(a, b));
		
	}
	public String addBinary1(String a, String b){
		int x = Integer.parseInt(a, 2);
		int y = Integer.parseInt(b, 2);
		int sum = x + y;		
		return Integer.toBinaryString(sum);
	}

}
