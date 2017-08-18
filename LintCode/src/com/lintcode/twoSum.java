package com.lintcode;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int numbers[] = { 3, 2, 7, 11, 15, 6 };
		int numbers[] = {1,2,33,23,2423,33,23,1,7,6,8787,5,33,2,3,-23,-54,-67,100,400};
		int target = 9;
		twoSum s = new twoSum();
		s.twoSum1(numbers, target);
	}

	public int[] twoSum1(int[] numbers, int target) {
		int position1 = 0;
		int position2 = 0;
		int num[] = new int[2];
		for (int i = 0; i < numbers.length; i++) {			
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					position1 = i;
					position2 = j;
					num[0] = (position1 + 1);
					num[1] = (position2 + 1);
					System.out.println((position1 + 1) + "," + (position2 + 1));
				}
			}
		}
		return num;
	}

}
