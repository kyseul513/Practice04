package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int d = 0; d<i; d++) {
				if(lotto[i] == lotto[d]) {
					i--;
					break;
				}
			}
		}
		
		for(int j = 0; j<lotto.length; j++) {
			System.out.print(lotto[j] + " ");
		}
		

	}

}
