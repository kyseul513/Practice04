package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

			int[] array = new int[5];
			int num;
			double total = 0;
	
			for (int i = 0; i < array.length; i++) {
				num = sc.nextInt();
				array[i] = num;
			}
	
			for (int i = 0; i < array.length; i++) {
				total = total + array[i];
			}
	
			System.out.println("평균은 " + total / array.length + " 입니다.");

		sc.close();

	}

	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * int num1 = sc.nextInt(); int num2 = sc.nextInt(); int num3 = sc.nextInt();
	 * int num4 = sc.nextInt(); int num5 = sc.nextInt();
	 * 
	 * double sum = num1 + num2 + num3 + num4 + num5;
	 * 
	 * System.out.println("평균은 " + sum / 5 + " 입니다.");
	 * 
	 * sc.close(); }
	 */

}