package lesson001;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		// Kullanıcıdan girilen iki sayının çarpımını veren progam.
		Scanner scanner = new Scanner (System.in);
		int a, b, answer;
		System.out.println("İlk sayıyı giriniz");
		a = scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz");
		b = scanner.nextInt();
		answer = a*b;
		System.out.println("a x b= " + answer);
	}

}
