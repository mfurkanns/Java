package uyg1;

import java.util.LinkedList;

public class Raf {
	
	LinkedList<Kitap> kitaplar;
	
	public Raf() {
		this.kitaplar = new LinkedList<Kitap>();
		
	}
	
	public void kitapEkle(Kitap ktp) {
		kitaplar.add(ktp);
	}
	
	public void kitapSil(Kitap ktp) {
		kitaplar.remove(ktp);
		
	}
	
	
	
	

}
