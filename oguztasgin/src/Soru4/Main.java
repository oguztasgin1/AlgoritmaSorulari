package Soru4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yolcu yolcu1 = new EkonomiYolcu(554433, "Oguz", "TASGIN", true);
		Yolcu yolcu2 = new BusinessYolcu(998877, "Elena", "CANSU", true);
		Yolcu yolcu3 = new BusinessYolcu(998877, "Ozde", "SEYK", true);
		
		System.out.println("***BusinessYolcu VIP Yolcu***");
		yolcu3.biletAl(EFirmalar.AAW);
		yolcu3.biletAl(EFirmalar.THY);
		System.out.println("***");
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();
		yolcu3.yolcuBilgileriniGetir();
		
		
		System.out.println("***EkomomiYolcu VIP Yolcu***");
		yolcu1.biletAl(EFirmalar.ADJ);
		yolcu1.biletAl(EFirmalar.KAW);
		System.out.println("***");
		yolcu1.ucagaBin();
		yolcu1.ucagaBin();
		yolcu1.checkInYap();
		yolcu1.checkInYap();
		yolcu1.ucagaBin();
		yolcu1.yolcuBilgileriniGetir();
	}

}
