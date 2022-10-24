package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vize notunu giriniz.");
		Scanner scanner = new Scanner(System.in);
		int vize = scanner.nextInt();
		float calvize = vize * 0.4f;
		System.out.println("Final notunu giriniz.");
		int final1 = scanner.nextInt();
		float calfinal = final1 * 0.6f;
		float toplam = (float) calvize + calfinal;
		if (toplam >=50) {
			System.out.println("geçti " + toplam);
		}
		else {
			System.out.println("kaldı " + toplam);
		}

	}

}
