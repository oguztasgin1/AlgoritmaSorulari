package homeworks6;

import java.util.ArrayList;
import java.util.Scanner;
	
public class Main {
	static Televizyon televizyon;
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuGoster();
		boolean check = true;
		while(check) {
			System.out.println("Seçimiz (Menüyü Görmek için 8)");
			int secim = scanner.nextInt();
			
			switch (secim) {
			case 1:
				televizyonKur();
				break;
			case 2:
				televizyonuAc();
				break;
			case 3:
				televizyonunSesiniArttir();
				break;
			case 4:
				televizyonunSesiniAzalt();
				break;
			case 5:
				kanalDegistir();
				break;
			case 6:
				kanalBilgisiGoster();
				break;
			case 7:
				televiyonuKapat();
				break;
			case 8:
				menuGoster();
				break;
			case 0:
				System.out.println("Exiting the Matrix...");
				check = false;
				break;
			default:
				System.out.println("Lütfen 0-8 arasında bir sayi giriniz.");
				menuGoster();
				break;
			}
		}
		
	}
	public static void menuGoster() {
		System.out.println("***MENU****");
		System.out.println(
				"0- Çıkış \n" + 
						"1-- Televizyon Kur\n" +
						"2-- Televizyonu Aç\n" + 
						"3-- Sesini Artır\n" +
						"4-- Sesi Azalt\n" +
						"5-- Kanal Değiştir\n" +
						"6-- Kanal Bilgisi Goster\n" +
						"7-- Televizyonu Kapat\n" +
						"8-- Menüyü Goster\n"
				);
	}
	
	public static void televizyonKur() {
		if(televizyon == null) {
			System.out.println("Bir marka giriniz.");
			String marka = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Televizyon' un boyutunu giriniz.(Inch)");
			String boyut = scanner.nextLine();
			
			televizyon = new Televizyon(marka, boyut);
			
			System.out.println("Televizyon " + televizyon.getMarka() + " ile " + televizyon.getBoyut() + 
								" inch boyutlariyla olsuturuldu.");
		}
		else {
			System.out.println("Televizyon " + televizyon.getMarka() + " ile " + televizyon.getBoyut() + 
					" boyutlariyla zaten olusturuldu.");
		}

	}
	
	public static void televizyonuAc() {
		if(televizyon != null) {
			System.out.println("Televizyon acildi");
			System.out.println(televizyon.getKanallar().get(0) + "' yu izliyorsunuz.");
		}
		else {
			System.out.println("Televiyon kurulu değil önce televizyonunuzu kurmalisiniz.");
		}
	}

	
	public static void televizyonunSesiniArttir() {
		if(televizyon != null ) {
			televizyon.setVolume(televizyon.getVolume() + 1);
			System.out.println("Ses artiyor: " + televizyon.getVolume());
		}
		else {
			System.out.println("Televizyon kurulu ya da acik degil.");
		}
	}
	
	public static void televizyonunSesiniAzalt() {
		if(televizyon != null) {
			if(televizyon.getVolume()>= 0) {
				televizyon.setVolume(televizyon.getVolume() - 1);
				System.out.println("Ses azaliyor: " + televizyon.getVolume());
			}
			else {
				televizyon.setVolume(0);
			}
		}
		else {
			System.out.println("Televizyon kurulu ya da acik degil.");
		}
	}
	
	public static void kanalDegistir() {
		if(televizyon != null) {
			System.out.println("Kanal No giriniz: " );
			int kanalNo = scanner.nextInt();
			System.out.println(televizyon.getKanallar().get(kanalNo) + "' yu izliyorsunuz.");
		}
		else {
			System.out.println("Televizyon kurulu ya da acik degil.");
		}
	}
	
	public static void kanalBilgisiGoster() {
		if(televizyon != null) {
			System.out.println("Kanal No giriniz: " );
			int kanalNo = scanner.nextInt();
			System.out.println(televizyon.getKanallar().get(kanalNo).toString());
		}
		else {
			System.out.println("Televizyon kurulu ya da acik degil.");
		}
	}
	
	public static void televiyonuKapat() {
		if(televizyon != null) {
			System.out.println("Televiyon kapatılıyor...");
		}
		else {
			System.out.println("Televizyon kurulu degil.");

		}
	}
	
}
