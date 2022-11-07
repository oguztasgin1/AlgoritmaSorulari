package com.oguztasgin;


public class Soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 7;
		for (int i = 0; i < 3;i ++) {
			for (int j = 0; j < number; j++) {
				System.out.print("* ");
			}
			System.out.println();		
		}
		for (int i = 0; i < number; i ++) {
			for (int j = number; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();		
		}
		
	}

}
