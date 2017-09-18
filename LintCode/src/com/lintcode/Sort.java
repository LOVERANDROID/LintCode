package com.lintcode;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 6, 2, 1, 4, 5, 0 };
		int b[] = { 3, 9, 1, 6, 0, 7, 5, 8, 4, 2 };
		int c[] = { 22, 11, 99, 55, 66, 44, 88, 77, 33 };
		int sort1[] = new int[] {1, 3, 5, 7, 9};
		int sort2[] = {2, 4, 6, 8, 10};
		 //maopaoSort(c);
		//kuaisuSort(a, 0, a.length - 1);
		selectSort(a);
		//InsertSort(a);
		//MergerArray(sort1, sort2);
	}

	// 冒泡排序
	public static void maopaoSort(int a[]) {
		for (int j = 0; j < a.length - 1; j++) {
			for (int i = 0; i < a.length - j - 1; i++) { // 这样写比a.length-1
															// 更节省时间，每一趟都已经将最大的数沉到低，就不需要再去比较最大的数了，
				int temp = a[i];
				if (a[i] < a[i + 1]) {
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}

			}
			displayDetail(j, a);
		}
		display(a);
	}

	// 快速排序
	public static void kuaisuSort(int s[], int l, int h) {
		if (l < h) {
			int i = l, j = h, key = s[l];
			while (i < j) {
				while (i < j && s[j] >= key) // 从右向左找第一个小于key的数
					j--;
				if (i < j) {
					s[i++] = s[j];
				}
				while (i < j && s[i] < key) // 从左向右找第一个大于等于key的数
					i++;
				if (i < j) {
					s[j--] = s[i];
				}
			}
			s[i] = key;
			kuaisuSort(s, l, i - 1); // 递归调用
			kuaisuSort(s, i + 1, h);
		}
		display(s);

	}

	// 简单选择排序
	public static void selectSort(int a[]) {
		int temp2 = 0;
		for (int j = 0; j < a.length - 1; j++) {
			// int temp = a[j];
			int position = j;
			for (int i = j; i < a.length - 1; i++) {
				// if (temp > a[i + 1]) {
				// temp = a[i + 1];
				// position = i + 1;
				// }
				if (a[position] > a[i + 1]) {
					position = i + 1;
				}
			}
			if (j != position) {
				temp2 = a[j];
				a[j] = a[position];
				a[position] = temp2;
			}
			displayDetail(j, a);
		}
		display(a);
	}

	// 插入排序
	public static void InsertSort(int a[]) {
		int insertNum = 0, j;
		for (int i = 1; i < a.length; i++) { // 在无序待排列的数里面选择一个要插入的数
			insertNum = a[i]; //需要插入的数
			j = i - 1;
			while (j >= 0 && insertNum < a[j]) { //在有序已排列的数里面为待插入的数查找一个合适的位置
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = insertNum; //将待插入的数放在合适的位置
		}
		display(a);
	}
	
	public static void display(int array[]) {
		System.out.println("排序的输出结果：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}

	public static void displayDetail(int j, int a[]) {
		System.out.println("第" + (j + 1) + "趟的输出结果：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
}
