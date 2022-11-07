package com.oguztasgin;


public class Soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sayiDizisi[] = {9, 3, 7, 2, 1, 4, 3, 9, 5, 3, 8, 4, 3, 7, 5, 2, 7, 3, 18, 2, 0, 7, 9};
		//int sayiDizisi[] = { 0, 1, 2, 5, 3, 4, 7};
		//int sayiDizisi[] = { 0, 1, 2, 5, 3, 4, 7, 4 ,2};
		int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
		tekrarEdensayi(sayiDizisi);	
	}
	
	public static void tekrarEdensayi (int [] sayiDizisi) {
		int kacinci = 0;
		int kacinciTemp = Integer.MAX_VALUE;
		int temp = 0;
		int counter = 0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			for (int j = i + 1; j < sayiDizisi.length; j++) {
				if(sayiDizisi[i] != sayiDizisi[j]) {
					kacinci++;
				}
				else {
					if(kacinci < kacinciTemp) {
						temp = sayiDizisi[i];
						kacinciTemp = kacinci;
					}
				}
			}
			kacinci = 0;
		}
		//System.out.println(temp); // Kontrol tekrar eden sayi için 
		for (int i = 0; i < sayiDizisi.length; i++) {
			if(sayiDizisi[i] == temp) {
				counter++;
			}
		}
		if(counter <= 1) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		}
		else {
			System.out.println(temp + " sayisi " + counter + " kere tekrar etmiştir.");
		}
		
	}
}

