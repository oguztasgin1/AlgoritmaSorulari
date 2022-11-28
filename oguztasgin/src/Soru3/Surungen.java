package Soru3;

public abstract class Surungen extends Hayvan{
	public Surungen(String ad, int kilosu, int uzunluk, boolean tehlikeliMi) {
		super(ad, kilosu, uzunluk, tehlikeliMi);
	}

	public abstract void surun();
	
}
