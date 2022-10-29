package homeworks2;

import java.util.Scanner;

public class SwitchCaseMehmet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz.");
		String name = scanner.nextLine();

		System.out.println("\1- Kelimeleri Büyük Harf Yap" + "\n2- kelimenin harflerini Küçük yap"
				+ "\n3- kelimenin harflerinin arasına ? koy" + "\n4- kelimenin başındaki ve sonundaki boşlukları silin"
				+ "\n5- kelimenin içindeki bütün a harflerini ? ile değiştirin"
				+ "\n6- kelimenin ilk üç indexinin alıp sonuna ... koyun");

		int number = scanner.nextInt();

		switch (number) {
		case 1:
			// to do upper case
			System.out.println(name.toUpperCase());
			break;
		case 2:
			// to do lower case
			System.out.println(name.toLowerCase());
			break;
		case 3:
			// to add question mark between each letter
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
				if (!(i == name.length() - 1)) {
					System.out.print("?");
				}
			}
			break;
		case 4:
			// to erase space
			System.out.println("\n" + name.trim());
			break;
		case 5:
			// To change all letter 'A' 'a' to '?'
			System.out.println((name.toLowerCase()).replace('a', '?'));
			break;
		case 6:
			// To take first three char of word and than add it three point
			System.out.println(name.substring(0, 3) + "...");
			break;
		default:
			System.out.println("Geçerli bir sayi girmediniz");
			break;
		}
	}

}
