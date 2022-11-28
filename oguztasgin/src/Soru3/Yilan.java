package Soru3;

public class Yilan extends Surungen{

	public Yilan(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		// TODO Auto-generated method stub
		System.out.println(this.getAd() + " surunuyor.");
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		System.out.println(this.getAd() + " tısliyor");
	}

	@Override
	public String toString() {
		return "Yilan [ad=" + ad + ", kilosu=" + kilosu + ", uzunluk=" + uzunluk + ", tehlikeliMi=" + tehlikeliMi
				+ ", getAd()=" + getAd() + "]";
	}

}
