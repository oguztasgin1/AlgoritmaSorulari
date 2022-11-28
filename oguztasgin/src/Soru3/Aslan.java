package Soru3;

public class Aslan extends MemeliHayvan{

	public Aslan(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		// TODO Auto-generated method stub
		System.out.println(getAd() + " yuruyor.");
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		System.out.println(getAd() + " kukruyor.");
	}

	@Override
	public String toString() {
		return "Aslan [ad=" + ad + ", kilosu=" + kilosu + ", uzunluk=" + uzunluk + ", tehlikeliMi=" + tehlikeliMi
				+ ", getAd()=" + getAd() + "]";
	}
	

}
