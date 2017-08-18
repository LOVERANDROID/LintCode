package com.lintcode;

public class addDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addDigits add = new addDigits();
		System.out.println(add.addDigits1(538));
	}
	public int addDigits1(int num) {
		int result = 0;
		if (num < 10) {
			return num;
		}
		while(num/10 != 0){
			result += num % 10; 
			num = num / 10;
		}		
		return addDigits1((result + num));
		//大神算法，看不懂		
		//return num==0?0:(num%9==0?9:(num%9));        
    }
		
		

}
