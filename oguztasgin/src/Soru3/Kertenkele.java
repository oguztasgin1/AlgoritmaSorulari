package Soru3;

public class Kertenkele extends Surungen{

	public Kertenkele(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		// TODO Auto-generated method stub
		System.out.println(getAd() + " surunuyor.");
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		System.out.println(getAd() + " ses cikariyor.");
	}

	@Override
	public String toString() {
		return "Kertenkele [ad=" + ad + ", kilosu=" + kilosu + ", uzunluk=" + uzunluk + ", tehlikeliMi=" + tehlikeliMi
				+ ", getAd()=" + getAd() + "]";
	}
	
	

}
