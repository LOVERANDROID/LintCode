package com.lintcode;

public class threeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-1, 0, 1, 2, -1, -4};
		int position1 = 0, position2 = 0, position3 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					if (a[i] + a[j] +a[k] == 0) {
						position1 = i;
						position2 = j;
						position3 = k;
						System.out.println(a[position1]+","+a[position2]+","+a[position3]);
					}
					
				}
			}
			
		}
		
	}

}
