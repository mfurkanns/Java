package uyg1;

public class Kitaplik {
	
	
	private int rafSayisi;
	
	Raf raflar[];
	
	public Kitaplik(int rafSayisi) {
		raflar = new Raf[rafSayisi];
		for(int i=0;i<rafSayisi;i++) {
			raflar[i]= new Raf();
		}
		this.rafSayisi=rafSayisi;
	}
	
	public int getRafSayisi() {
		return this.rafSayisi;
	}
	public void setRafSayisi(int rafSayisi) {
		this.rafSayisi=rafSayisi;
	}
	
	public void KitapSil(Kitap ktp) {
		raflar[ktp.getRafNo()].kitapSil(ktp);
	}
	public void KitapEkle(Kitap ktp) {
		raflar[ktp.getRafNo()].kitapEkle(ktp);
	}
	
	public void goster(int gostRafNo) {
		
		for(Kitap i:raflar[gostRafNo].kitaplar) {
			System.out.println("isim = "+i.getKitapAdi());
			System.out.println("raf no = "+i.getRafNo());
			System.out.println("sira no = "+i.getSiraNo());
		}
		
		
	}
	
	
	
	

}
