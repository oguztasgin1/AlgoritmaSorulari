package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Kenarları verilen üçgenin hangi tipte oldugunu yazan program
		Scanner scanner = new Scanner(System.in);
		int kenar1 = 13; int kenar2=13; int kenar3 = 13;
		if(kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eşkenar Ucgen");
		}
		else if (kenar1==kenar2 || kenar2==kenar3 || kenar1==kenar3) {
			System.out.println("Ikızkener Ucgen");
		}
		else {
			System.out.println("Cesitkenar Ucgen");
		}
	}

}
