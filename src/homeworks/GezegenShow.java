package homeworks;

import java.util.Scanner;

public class GezegenShow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu(kg) giriniz.");
		int kilo = scanner.nextInt();
		float agirlikmerkur = kilo * 0.378f;
		float agirlikvenus = kilo * 0.907f;
		float agirlikmars = kilo * 0.377f;
		float agirlikjupiter = kilo * 2.364f;
		float agirlikeuropa = kilo * 0.13358f;

		
		System.out.println("Agirliginiz Merkur' de " + agirlikmerkur + "\n"
				+ "Agirliginiz Venus' de " + agirlikvenus + "\n"
				+ "Agirliginiz Mars' ta "+ agirlikmars + "\n"
				+ "Agirliginiz Jupiter' de " + agirlikjupiter + "\n"
				+ "Agirliginiz Europa' da " + agirlikeuropa + " N dur.");
		
		
	}

}
