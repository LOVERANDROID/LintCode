package com.lintcode;

public class MergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 2, 3, 4, 5 };
		mergeSortedArray(a, b);
	}

	public static void mergeSortedArray(int[] A, int[] B) {
		if (A == null || B == null) {
			System.out.println("");
		}
		int[] result = new int[A.length + B.length];
		int i = 0, j = 0, index = 0;
		while (i < A.length && j < B.length) {
			if (A[i] < B[j]) {
				result[index++] = A[i++];
			} else {
				result[index++] = B[j++];
			}
		}
		while (i < A.length) {
			result[index++] = A[i++];
		}
		while (j < B.length) {
			result[index++] = B[j++];
		}
		for (int k = 0; k < result.length; k++) {
			System.out.print(result[k] + ",");
		}
		System.out.println();
	}

}
