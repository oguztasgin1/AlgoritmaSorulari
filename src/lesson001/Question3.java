package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// verilen iki sayıdan hangisinin büyük oldğunu bulan program.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int a, b;
		a= scanner.nextInt();
		System.out.println("Bir sayı daha giriniz: ");

		b= scanner.nextInt();
		if (a==b) {
			System.out.println("a ve b eşittir.");
		}
		else if (a > b) {
			System.out.println("a b' den büyüktür.");
		}
		else {
			System.out.println("a b' den küçüktür.");
		}

	}

}
