package com.lintcode;

import java.util.HashSet;
import java.util.Set;

public class addDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(test(2));
	}
	public  static boolean test(int n){
		if (addDigits1(n) == 1) {
			return true;
		}
		return false;
	}
	public static int addDigits1(int num) {
//		int result = 0;
		Set<Integer> set = new HashSet<Integer>();
		if (num < 2 ) {
			return num;
		}
//		while(num/10 != 0){
//			result += num % 10; 
//			num = num / 10;
//		}		
//		return addDigits1((result + num));
		//大神算法，看不懂		
		//return num==0?0:(num%9==0?9:(num%9));  
		int result = 0;
		while(num != 0){
			result += Math.pow(num%10, 2);
			num /= 10;
		}
		
		return addDigits1(result);
    }
		
		

}
