package homeworks6;

import java.util.ArrayList;

public class Televizyon {
	private String marka;
	private String boyut;
	private int volume;
	private ArrayList<Kanal> kanallar;
	
	
	//kanallar Televizyon nesnesi oluşturulunca otomatik olarak initilaze edilsin.

	public Televizyon(String marka, String boyut) {
		this.marka = marka;
		this.boyut = boyut;
		this.kanallar = new ArrayList<>();
		kanallariOlustur();
	}
	
	public void kanallariOlustur(){
		kanallar.add(new HaberKanali("CnnTurk", 0, "Asparagas"));
		kanallar.add(new BelgeselKanali("TRT Belgesel", 1, "Vahşi Yaşam"));
		kanallar.add(new MuzikKanali("MTV", 2, "Pop"));
		kanallar.add(new HaberKanali("BBC", 3, "Daily News"));
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getBoyut() {
		return boyut;
	}
	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}
	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}
	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
