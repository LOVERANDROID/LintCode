package com.lintcode;

/**
 * 给出一个具有重复数字的列表，找出列表所有不同的排列。
 * @author wei.zheng
 *
 */
public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "ADCB";
		String B = "CA";
//		int flag = 0;
//		for (int i = 0; i < B.length()-1; i++) {
//			for (int j = 0; j < A.length()-1; j++) {
//				if (B.substring(i, i+1).equals(A.substring(j, j+1)) && i < 2) {
//					i++;
//					flag ++;
//				}
//			}
//		}
//		if (flag == B.length()) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//		int i = 0, j = 0;
//		int flag = 0;
//		while(i < A.length() && j < B.length()){
//			if (A.substring(i, i+1).equals(B.substring(j, j+1))) {
//				j++;
//		
//				i = 0;
//				flag++;
//			}else{
//				i++;
//			}
//		}
//		if (flag == B.length()) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		int[] counts = new int[26];
        for (int i = 0; i < 26; i++) {
            counts[i] = 0;
        }
        for (int i = 0; i < A.length(); i++) {
            counts[A.charAt(i) - 'A'] ++;
        }
        for (int i = 0; i < B.length(); i++) {
            counts[B.charAt(i) - 'A'] --;
            if (counts[B.charAt(i) - 'A'] < 0) {
            	System.out.println("false");
            }
        } 
        System.out.println("true");
	}

}
