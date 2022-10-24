package homeworks;

import java.util.Scanner;

public class BoyKutle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Boyunuzu(cm) giriniz");
		int boy = scanner.nextInt();
		
		System.out.println("Kilonuzu(kg) giriniz");
		int kilo = scanner.nextInt();
		
		System.out.println("Cinsiyetinizi belirtin. Erkek için 1, Kadın için 0 ı tuşlayınız.");
		int cinsiyet = scanner.nextInt();
		
		float indeks = (float) kilo * 10000 / (boy * boy);
		System.out.println(indeks);
		
		if(cinsiyet == 1) {
			if(indeks < 20) {
				System.out.println("Zayıf");
			}
			else if (indeks >=20 && indeks <26) {
				System.out.println("Normal");
			}
			else if (indeks >=26 && indeks <30) {
				System.out.println("Şişman");
			}
			else{
				System.out.println("Obez");
			}
		}
		else {
			if(indeks < 19) {
				System.out.println("Zayıf");
			}
			else if (indeks >=19 && indeks <25) {
				System.out.println("Normal");
			}
			else if (indeks >=25 && indeks <30) {
				System.out.println("Şişman");
			}
			else{
				System.out.println("Obez");
			}
		}

	}

}
