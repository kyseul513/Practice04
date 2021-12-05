package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {

		// double[] number = { 1.2, 3.3, 6.7 };
		// double[] number = new double[] {1.2, 3.3, 6.7}
	
		
		double[] number = new double[3];
			number[0] = 1.2;;
			number[1] = 3.3;
			number[2] = 6.7;
			
		for (int i = number.length-1; i>=0; i--) {		// 3-1=2(i) 부터 역순으로 출력.
			System.out.println(number[i]);
		}

	}
}
