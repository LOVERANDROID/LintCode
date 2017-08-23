package com.lintcode;

public class RemoveArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 0, 4, 4, 0, 0, 2, 4, 4 };
		int elem = 4;
		RemoveArrayElement remove = new RemoveArrayElement();
		remove.removeElement(a, elem);

	}

	public int removeElement(int[] A, int elem) {
		int x = A.length - 1;
		int y = 0;
		while (y <= x) {
			if (A[y] == elem) {
				A[y] = A[x];
				x--;
			} else {
				y++;
			}
		}
		for (int i = 0; i <= x; i++) {
			System.out.println(A[i] + ",");
		}
		
		return x + 1;
	}
}
