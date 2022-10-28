package homeworks2;

import java.util.Scanner;

public class ChangeIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.nextLine().toLowerCase();
		if(word.startsWith("a")) {
			System.out.println(word.charAt(word.length()-1));
		}
		else if (!(word.indexOf("b", 0) == -1)) {
			// String immutable degisken oldugundan yeni degiskene atadık degeri
			String changeBtoAt =  word.replace(word.charAt(0), '@'); 
			System.out.println("B degisti: " + changeBtoAt);
		}
		else {
			System.out.println(word + " birinci terim " + word.charAt(0));
		}
		
	}

}
