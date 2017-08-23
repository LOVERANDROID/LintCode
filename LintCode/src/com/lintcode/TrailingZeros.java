package com.lintcode;

public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 设计一个算法计算n阶乘的尾部的零的个数
		 * 如：11！= 39916800，因此应该返回 2
		 */
		long n = 11;
		long sum = 0;
		while(n != 0){
			sum += n / 5;
			n /= 5;
		}
		System.out.println(sum);
	}

}
