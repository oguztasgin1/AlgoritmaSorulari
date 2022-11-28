package Soru3;

public class Maymun extends MemeliHayvan{

	public Maymun(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		// TODO Auto-generated method stub
		System.out.println(getAd() + " zipliyor.");
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		System.out.println(getAd() + " bagiriyor.");
	}

	@Override
	public String toString() {
		return "Maymun [ad=" + ad + ", kilosu=" + kilosu + ", uzunluk=" + uzunluk + ", tehlikeliMi=" + tehlikeliMi
				+ ", getAd()=" + getAd() + "]";
	}
	

}
