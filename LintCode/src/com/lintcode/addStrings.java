package com.lintcode;

import java.math.BigInteger;

public class addStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1298912891289189189898198291";
		String b = "19";
	
		
	}
	public static String addStrings1(String a, String b){
		BigInteger x = new BigInteger(a);
		BigInteger y = new BigInteger(b);
		return (x.add(y)).toString();
	}

}
