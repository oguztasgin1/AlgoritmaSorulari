package homeworks6;

public class BelgeselKanali extends Kanal{
	private String belgeselTuru;
	
	public BelgeselKanali(String kanalAdi, int kanalNo,String belgeselTuru) {
		super(kanalAdi, kanalNo);
		this.belgeselTuru = belgeselTuru;
	}
	public String getBelgeselTuru() {
		return belgeselTuru;
	}
	public void setBelgeselTuru(String belgeselTuru) {
		this.belgeselTuru = belgeselTuru;
	}
	@Override
	public String toString() {
		return "BelgeselKanali belgeselTuru= " + belgeselTuru + ", KanalAdi= " + getKanalAdi() + ", getKanalNo= "
				+ getKanalNo();
	}
	
}
