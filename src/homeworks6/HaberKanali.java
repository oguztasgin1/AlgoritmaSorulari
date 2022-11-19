package homeworks6;

public class HaberKanali extends Kanal{
	private String haberTuru;
	public HaberKanali(String kanalAdi, int kanalNo,String haberTuru) {
		super(kanalAdi, kanalNo);
		this.haberTuru = haberTuru;
	}
	public String getHaberTuru() {
		return haberTuru;
	}
	public void setHaberTuru(String haberTuru) {
		this.haberTuru = haberTuru;
	}
	@Override
	public String toString() {
		return "HaberKanali haberTuru= " + haberTuru + ", KanalAdi= " + getKanalAdi() + ", KanalNo= "
				+ getKanalNo();
	}
	

}
