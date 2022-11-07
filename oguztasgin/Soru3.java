package com.oguztasgin;

public class Soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cumle = "Bugun guzel bir gun";
		
		System.out.println(karakterSayici(cumle,'b'));
	}
	
	public static int karakterSayici (String cumle, char harf) {
		int harfSayisi = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.toLowerCase().charAt(i)== harf) {
				harfSayisi ++;
			}
		}
		return harfSayisi;
	}

}
