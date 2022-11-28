package Soru2;

public class CustomStringTR {

	public String metin;

	public CustomStringTR(String metin) {
		super();
		this.metin = metin;
	}

	public int uzunluk() {
		 return metin.length();
	}

	public String bosluklariSil() {
		return metin.trim();
	}

	public String harfleriKucult() {
		return metin.toLowerCase();
	}

	public String UcKeretekrarEt() {
		return metin.repeat(3);
	}

	public String harfleriBuyut() {
		return metin.toUpperCase();
	}

	public boolean icerirMi() {
		return metin.contains(metin);
	}

	public boolean bosMu() {
		return metin.isEmpty();
	}

}
