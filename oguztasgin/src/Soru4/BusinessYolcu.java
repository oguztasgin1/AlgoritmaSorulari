package Soru4;

import java.util.HashMap;

public class BusinessYolcu extends Yolcu {
	public BusinessYolcu(int id, String ad, String soyad, boolean checkIn) {
		super(id, ad, soyad, checkIn);
		// TODO Auto-generated constructor stub
	}
	boolean check = false;
	HashMap<String, Integer> businessMap = new HashMap<>();
	
	public final static int BUSINNESFIYAT = 200; 
	public final static int BUSINNESVIPFIYAT = 150;
	@Override
	void yolcuBilgileriniGetir() {
		System.out.println(toString());
	}
	@Override
	void biletAl(EFirmalar firmaAdi) {
		businessMap.put(firmaAdi.name(), BUSINNESFIYAT+ BUSINNESVIPFIYAT + getBasefiyat());
		System.out.println(businessMap);
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
		return "BusinessYolcu [businessMap=" + businessMap + ", id=" + id + ", ad=" + ad + ", Soyad=" + Soyad
				+ ", koltukNo=" + koltukNo + ", checkIn=" + checkIn + "]";
	}
	
}
