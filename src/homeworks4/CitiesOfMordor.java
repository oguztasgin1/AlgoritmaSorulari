package homeworks4;

public class CitiesOfMordor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		// String i split metodu ile ; den sonra ayırıp arraye çeivrdik.
		String[] arrayOfCities = sehirler.split(";");

		for (String city : arrayOfCities) {
			 System.out.print(city + " ");
		}
		System.out.println();

		// Şuanda halihazırda elimizde bir şehirler stringi var ";" den ayrılmış.
		// Arrayin her value si "arrayOfCities[0]" aslında bir string olduğundan
		// split metodunu herbiri için kullanabiliriz.
		for (int i = 0; i < arrayOfCities.length; i++) {
			String[] array = arrayOfCities[i].split("-");

			for (int j = 1; j < array.length; j++) {
				System.out.println(array[j - 1] + " adlı şehirin plaka kodu: " + array[j]);
			}
		}
	}
}
