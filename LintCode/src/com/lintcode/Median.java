package com.lintcode;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 4, 5, 1, 2, 3 };
		int temp = 0;
		for (int j = 0; j < nums.length-1; j++) {
			for (int i = 0; i < nums.length - j -1; i++) {
				if (nums[i] > nums[i + 1]) {
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}				
			}
		}

		if (nums.length % 2 == 0) {
			System.out.println((nums[nums.length / 2 - 1]));
		} else {
			System.out.println(nums[nums.length / 2]);
		}

	}

}
