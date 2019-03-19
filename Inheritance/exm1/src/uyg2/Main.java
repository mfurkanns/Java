package uyg2;

public class Main {

	public static void main(String[] args) {
		
		ArastirmaGorevlisi a1 = new ArastirmaGorevlisi("Ali",25,2,3500);
		OgretimUyesi o1 = new OgretimUyesi("Veli", 34, 6500, 10);
		Bolum b1 = new Bolum("Bilgisayar Muh", "Ýstanbul", 1999);
		
		a1.doktoraDurumGoster("Bitti");
		a1.kendiniTanit();
		
		
		o1.setUnvan("Yar Doç.");
		o1.kendiniTanit();
		
		
		
		b1.calisanEkle(a1);
		b1.calisanEkle(o1);
		
		b1.calisanToplamMaas();
		
		
		
	}
	
	
	
}
