package Soru4;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu {

	public EkonomiYolcu(int id, String ad, String soyad, boolean checkIn) {
		super(id, ad, soyad, checkIn);
		// TODO Auto-generated constructor stub
	}
	public final static int EKONOMIFIYAT = 100; 
	boolean check = false;
	HashMap<String, Integer> ekonomiMap = new HashMap<>();
	
	@Override
	void yolcuBilgileriniGetir() {
		System.out.println(toString());
	}

	@Override
	void biletAl(EFirmalar firmaAdi) {
		ekonomiMap.put(firmaAdi.name(), EKONOMIFIYAT + getBasefiyat());
		System.out.println(ekonomiMap);
	}

	@Override
	void checkInYap() {
		if(check= true) {
			System.out.println("Zaten checkIn yaptirmissiniz.");
			System.out.println(getAd() + " " + getKoltukNo() + " koltukta ucaga binebilirsiniz.");
		}
		else {
			System.out.println("CheckIn onaylandi");
			System.out.println(getAd() + " " + getKoltukNo() + " koltukta ucaga binebilirsiniz.");
			check= true;
		}
	}

	@Override
	void ucagaBin() {
		if(check) {
			System.out.println(getAd() + " " + getKoltukNo() + " lutfen kemerlerinizi baglayin");
		}
		else {
			System.out.println("Oncelikle Check in yaptırmalisiniz.");
		}
	}

	@Override
	public String toString() {
		return "EkonomiYolcu [check=" + check + ", ekonomiMap=" + ekonomiMap + ", id=" + id + ", ad=" + ad + ", Soyad="
				+ Soyad + ", koltukNo=" + koltukNo + ", checkIn=" + checkIn + "]";
	}
	

}
