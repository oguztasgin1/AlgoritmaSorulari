package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Girilen ortalamanın harf notunu yazan program.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ortlama notu giriniz.");
		float ortalama = scanner.nextFloat();
		if(ortalama >= 90) {
			System.out.println("AA");
		}
		else if(ortalama < 90 && ortalama >= 80) {
			System.out.println("BB");
		}
		else if (ortalama < 80 && ortalama >= 70 ) {
			System.out.println("CC");
		}
		else if (ortalama < 70 && ortalama >= 60 ) {
			System.out.println("DD");
		}
		else {
			System.out.println("FF");
		}
		
	}
	

}
