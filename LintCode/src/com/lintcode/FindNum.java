package com.lintcode;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = System.currentTimeMillis();
		int target = 5;
		int[][] array = { { 1, 2, 3, 0 }, { 4, 5, 6, 0 }, { 7, 8, 9, 0 } };
		// int[][] array = { {} };
		System.out.println(Find(target, array));
		long b = System.currentTimeMillis();
		System.out.println(b - a);
		// System.out.println(array);
		// System.out.println(array.length);//行
		// System.out.println(array[0].length);//列
		System.out.println(Math.sqrt(81));
	}

	public static boolean Find(int target, int[][] array) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[0].length; j++) {
//				if (array[i][j] == target) {
//					return true;
//				}
//			}
//		}
//		return false;

		// int len = array.length - 1;
		// int i = 0;
		// while ((len >= 0) && (i < array[0].length)) {
		// if (array[len][i] > target) {
		// len--;
		// } else if (array[len][i] < target) {
		// i++;
		// } else {
		// return true;
		// }
		// }
		// return false;
		
		int row = array.length-1; 
		int col = 0;
		while(row > 0 && col < array[0].length){
			if (target < array[row][col]) {
				row--;
			}
			if (target > array[row][col]) {
				col++;
			}
			if (target == array[row][col]) {
				return true;
			}
		}
		return false;
		
	}

}
