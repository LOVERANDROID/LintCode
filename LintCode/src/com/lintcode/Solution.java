package com.lintcode;

public class Solution {
	// 冒泡排序
	public void sortIntegers(int[] A) {
		// write your code here
		int temp = 0;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}

			}

		}
		for (int z = 0; z < A.length; z++) {
			System.out.print(A[z] + ", ");
		}
		System.out.println();
	}

	// 选择排序
	public void sortIntegers2(int[] a) {

		int temp = 0;
		for (int j = 0; j < a.length; j++) {
			int position = j;
			for (int i = j; i < a.length - 1; i++) {
				if (a[position] > a[i + 1]) {
					position = i + 1;
				}
			}
			if (j != position) {
				temp = a[position];
				a[position] = a[j];
				a[j] = temp;
			}

		}
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + ", ");
		}
		System.out.println();

	}

	// 快速排序
	public void sortIntegers3(int[] a, int l, int h) {
		if (l < h) {
			int key = a[l];
			int i = l, j = h;
			while (i < j) {
				while (a[j] >= key && i < j)
					j--;
				if (i < j){
					a[i] = a[j];
					i++;
				}
				while (a[i] <= key && i < j)
					i++;
				if (i < j) {
					a[j] = a[i];
					j--;
				}
			}
			a[i] = key;
			sortIntegers3(a, l, i-1);
			sortIntegers3(a, j + 1, h);
		}
		
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + ", ");
		}
		System.out.println();
	}

	//插入排序
	public void sortIntegers4(int[] a){
		int j = 0;
		for(int i = 1; i < a.length; i ++){
			int insertNum = a[i];
			j = i-1;
			while(j >= 0 && a[j] > insertNum){
				a[j + 1] = a[j];
				a[j] = insertNum;
				j--;
			}
				
		}
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + ", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 2, 1, 4, 5 };
		Solution s = new Solution();
		s.sortIntegers4(a);
	}

}
