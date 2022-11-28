package Soru3;

import java.util.ArrayList;

public class HayvanatBahcesi {
	private ArrayList<Hayvan> hayvanListesi; 
	private ArrayList<MemeliHayvan> memeliler;
	private ArrayList<Surungen> surungenler;
	
//	public void hayvanlariGoster() {
//		for (Hayvan hayvan : hayvanListesi) {
//			System.out.println(hayvan);
//		}
//		System.out.println("Memeliler");
//		for (MemeliHayvan memeli : memeliler) {
//			System.out.println(memeli);
//		}
//		System.out.println("Surungenler");
//		for (Surungen surungen : surungenler) {
//			System.out.println(surungen);
//		}
//	}
	
	public HayvanatBahcesi() {
		super();
		this.hayvanListesi = new ArrayList<Hayvan>();
		this.memeliler = new ArrayList<MemeliHayvan>();
		this.surungenler = new ArrayList<Surungen>();
	}

	public void bahceyeMemeliHayvanEkle(MemeliHayvan m){
		hayvanListesi.add(m);
		memeliler.add(m);
	}
	
	public void bahceyeSurungenEkle(Surungen s){
		hayvanListesi.add(s);
		surungenler.add(s);
	}
	
	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
	}
	
	public void hayvaninCinsiniBul(String hayvanAdi) {
			for (Hayvan hayvan : hayvanListesi) {
				if(hayvan.getAd()== hayvanAdi) {
					hayvan.getAd();
					System.out.println(hayvan.getAd() + " bir " + hayvan.getAd() + "'dır.");
				}
			}
	}
	
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		for (Hayvan hayvan : hayvanListesi) {
			if(hayvan.getAd()== hayvanAdi) {
				hayvan.toString();
				System.out.println(hayvan.toString());
			}
		}
	}
	
	public void hayvaniHareketEttir(String hayvanAdi) {
		for (MemeliHayvan memeli : memeliler) {
			if (memeli.getAd() == hayvanAdi) {
				memeli.yuru();
			}
			else {
				for (Surungen surungen : surungenler) {
					if (surungen.getAd() == hayvanAdi) {
						surungen.surun();
					}
				}
			}
		}
		
	}
	
	public ArrayList<Hayvan> getHayvanListesi() {
		return hayvanListesi;
	}

	public void setHayvanListesi(ArrayList<Hayvan> hayvanListesi) {
		this.hayvanListesi = hayvanListesi;
	}
	
}
