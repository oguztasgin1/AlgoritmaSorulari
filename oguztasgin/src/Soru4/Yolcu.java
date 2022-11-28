package Soru4;

import java.util.Random;

public abstract class Yolcu {
	public int id;
	public String ad;
	public String Soyad;
	public int koltukNo;
	public boolean checkIn;
	public final static int BASEFIYAT= 100;
	
	Random random = new Random();
	
	public Yolcu(int id, String ad, String soyad, boolean checkIn) {
		super();
		this.id = id;
		this.ad = ad;
		Soyad = soyad;
		this.koltukNo = random.nextInt(1, 100);
		this.checkIn = checkIn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return Soyad;
	}
	public void setSoyad(String soyad) {
		Soyad = soyad;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}
	public boolean isCheckIn() {
		return checkIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	public static int getBasefiyat() {
		return BASEFIYAT;
	}
	@Override
	public String toString() {
		return "Yolcu [id=" + id + ", ad=" + ad + ", Soyad=" + Soyad + ", koltukNo=" + koltukNo + ", checkIn=" + checkIn
				+ "]";
	}
	
	
	abstract void yolcuBilgileriniGetir() ;
	abstract void biletAl(EFirmalar firmaAdi) ;
	abstract void checkInYap();
	abstract void ucagaBin() ; 
	
	
	
}
