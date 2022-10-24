package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// tek mi cift mi
		Scanner scanner  = new Scanner (System.in);
		System.out.println("Bir sayi giriniz.");
		int a = scanner.nextInt();
		if (a % 2 == 0) {
			System.out.println("Cifttir.");
		}
		else {
			System.out.println("Tektir.");	
		}

	}

}
