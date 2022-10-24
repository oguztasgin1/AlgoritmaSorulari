package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Dairenin alanı ve çevresini buan program.
		Scanner scanner = new Scanner(System.in);
		System.out.println("dairenin yaricapini giriniz.");
		int r = scanner.nextInt();
		float pi = 3.14f;
		float cevre= 2 * pi * r ;
		float alan = pi * r * r;
		System.out.println("Cevre= " + cevre + "\n" + "Alan=  " + alan);
				

	}

}
