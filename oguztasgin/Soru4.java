package com.oguztasgin;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		menu ();
		int sayi;
		do {
			System.err.println("Yapmak istediğiniz işlemi seçiniz.");
			sayi = scanner.nextInt();
			hesaplayici(sayi);
		} while (sayi!=7);
		
	}
	public static void menu () {
		System.out.println("******************************");
		System.out.println("*Geometrik Alan Hesaplayıcısı*");
		System.out.println("******************************");
		System.out.println("1. Kare alan hesaplama");
		System.out.println("2. Kare çevre hesaplama");
		System.out.println("3. Dikdörtgen alan hesaplama");
		System.out.println("4. Dikdörtgen çevre hesaplama");
		System.out.println("5. Daire alan hesaplama ");
		System.out.println("6. Daire Çevre hesaplama");
		System.out.println("7. Çıkış");
	}
	
	public static void hesaplayici (int number) {
		Scanner scanner = new Scanner(System.in);
		switch (number) {
		case 1:
			System.out.println("Karenin bir kenarının uzunluğunu giriniz.");
			int kareKenar = scanner.nextInt();
			int kareAlan = kareKenar * kareKenar;
			System.err.println("Karenin Alanı= " + kareAlan);
			menu ();
			break;
		case 2:
			System.out.println("Karenin bir kenarının uzunluğunu giriniz.");
			int kareKenar1 = scanner.nextInt();
			int kareCevre = kareKenar1 * 4;
			System.err.println("Karenin Cevresi= " + kareCevre);
			menu ();
			break;
		case 3:
			System.out.println("Dikdörtgenin kenar uzunluklarını giriniz.");
			System.out.println("Kısa kenarı giriniz= ");
			int dıkdortkenKısa = scanner.nextInt();
			System.out.println("Uzun kenarı giriniz= ");
			int dıkdortkenUzun = scanner.nextInt();
			int dıkdortkenAlan = dıkdortkenKısa * dıkdortkenUzun;
			System.err.println("Dikdörtgenin Alanı= " + dıkdortkenAlan);
			menu ();
			break;
		case 4:
			System.out.println("Dikdörtgenin kenar uzunluklarını giriniz.");
			System.out.println("Kısa kenarı giriniz= ");
			int dıkdortkenKısa2 = scanner.nextInt();
			System.out.println("Uzun kenarı giriniz= ");
			int dıkdortkenUzun2 = scanner.nextInt();
			int dıkdortkenCevre = (2*dıkdortkenKısa2) + (2*dıkdortkenUzun2);
			System.err.println("Dikdörtgenin Cevresi= " + dıkdortkenCevre);
			menu ();
			break;
		case 5:
			System.out.println("Dairenin yarıçapını giriniz.");
			int daireyaricap = scanner.nextInt();
			double daireyariAlan = daireyaricap * daireyaricap * 3.14;
			System.err.println("Dairenin Alanı= " + daireyariAlan);
			menu ();
			break;
		case 6:
			System.out.println("Dairenin yarıçapını giriniz.");
			int daireyaricap2 = scanner.nextInt();
			double daireyariCevresi = 2 * daireyaricap2 * 3.14;
			System.err.println("Dairenin Alanı= " + daireyariCevresi);
			menu ();
			break;
		case 7:
			System.err.println("Çıkılıyor...");
			break;

		default:
			System.err.println(" Lutfen 1 ve 7 arasında bir sayı giriniz.");
			menu ();
			break;
		}
	}
	

}
