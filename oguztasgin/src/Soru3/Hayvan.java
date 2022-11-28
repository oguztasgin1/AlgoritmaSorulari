package Soru3;

public abstract class Hayvan {
	public String ad;
	public int kilosu;
	public int uzunluk;
	public boolean tehlikeliMi;
	public Hayvan(String ad, int kilosu, int uzunluk, boolean tehlikeliMi) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunluk = uzunluk;
		this.tehlikeliMi = tehlikeliMi;
	}
	public Hayvan(String ad, int kilosu, int uzunluk) {
		// TODO Auto-generated constructor stub
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getKilosu() {
		return kilosu;
	}
	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}
	public int getUzunluk() {
		return uzunluk;
	}
	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}
	public boolean isTehlikeliMi() {
		return tehlikeliMi;
	}
	public void setTehlikeliMi(boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}
	
	
	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunluk=" + uzunluk + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}
	public abstract void sesCikar();
}
