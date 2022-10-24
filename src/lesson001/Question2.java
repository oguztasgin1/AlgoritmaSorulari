package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Verilen ürünün satış fiyatı içinde kdv miktarı %18 ve kar %15 kar
		// ürün fiyatı nedir?
		Scanner scanner = new Scanner (System.in);
		int fiyat = scanner.nextInt();
		float kdvsiz = fiyat / 1.18f;
		float ilkfiyat = kdvsiz / 1.15f;
		System.out.println("İlk fiyat= " + ilkfiyat);
	}

}