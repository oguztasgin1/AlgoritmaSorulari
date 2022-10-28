package homeworks2;

import java.util.Scanner;

public class GuessWhichNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number;
		
		int randomNumber = (int) (Math.random() * 100);
		// Kaybolmamak için aşağıdaki satırı çalıştırabiliriz.
		// System.out.println(randomNumber);
		
		int counter = 0;		
		
		do {
			System.out.println("Sayıyı tahmin ediniz.");
			number = scanner.nextInt();
			counter++;
		} while (!(number == randomNumber));
		
		if (number==randomNumber) {
			System.out.println("Tebrikler " + counter + " denemede sayıyı buldunuz.");
		}
	}

}
