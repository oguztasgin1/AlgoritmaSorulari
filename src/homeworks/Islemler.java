package homeworks;

import java.util.Scanner;

public class Islemler {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Toplama islemi icin 1 e \n"
				+ "Cikarma islemi icin 2 ye \n"
				+ "Carpma islemi icin 3 e \n"
				+ "Bolme islemi icin 4 e basiniz.");
		int operator = scanner.nextInt();
		
		System.out.println("İki adet sayi giriniz.");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		float answer;
		
		if (operator == 1) {
			answer = number1 + number2;
		}
		else if (operator == 2) {
			answer = number1 - number2;
		}
		else if (operator == 3) {
			answer = number1 * number2;
		}
		else {
			answer = (float) number1 / number2;
		}
		System.out.println("Cevap= " + answer);
	}

}
