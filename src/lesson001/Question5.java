package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("TL cinsinden paranızı giriniz: ");
		int turklirasi = scanner.nextInt();
		float dolar = turklirasi / 18.25f;
		System.out.println("TL to Dolar >>> " + dolar);
	}

}
