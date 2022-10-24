package homeworks;

import java.util.Scanner;

public class GezegenShowContiune {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu(kg) giriniz.");
		int kilo = scanner.nextInt();
		
		System.out.println("Merkur için 1 , Venus için 2 , Mars için 3, Jupiter için 4 , Europa için 5");
		int gezegenismi = scanner.nextInt();
		
		if(gezegenismi == 1) {
			float agirlikmerkur = kilo * 0.378f;
			System.out.println("Merkur' de agirliginiz, " + agirlikmerkur);
		}
		else if (gezegenismi == 2) {
			float agirlikvenus = kilo * 0.907f;
			System.out.println("Venus' de agirliginiz, " + agirlikvenus);
		}
		else if (gezegenismi == 3) {
			float agirlikmars = kilo * 0.377f;
			System.out.println("Mars' de agirliginiz, " + agirlikmars);
		}
		else if (gezegenismi == 4) {
			float agirlikjupiter = kilo * 2.364f;
			System.out.println("Jupiter' de agirliginiz, " + agirlikjupiter);
		}
		else if (gezegenismi == 5) {
			float agirlikeuropa = kilo * 0.13358f;
			System.out.println("Europa' de agirliginiz, " + agirlikeuropa);
		}
	}

}
