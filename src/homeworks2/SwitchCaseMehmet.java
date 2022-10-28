package homeworks2;

public class SwitchCaseMehmet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Mehmet";
		
		// to do upper case
		System.out.println(name.toUpperCase());
		
		// to do lower case
		System.out.println(name.toLowerCase());
		
		// to add question mark between each letter
		for (int i = 0; i<name.length(); i++) {
			System.out.print(name.charAt(i));
			if(!(i == name.length()-1)) {
				System.out.print("?");
			}
		}
		
		// to erase space
		String nameWithSpace = "   Mehmet  ";
		System.out.println("\n" + nameWithSpace.trim());
		
		// To change all  letter 'A' 'a' to '?'
		String changeAllEys = "Adana";
		System.out.println((changeAllEys.toLowerCase()).replace('a', '?'));
		
		// To take first three char of word and than add it three point
		System.out.println(name.substring(0, 3) + "...");
		
	}

}
