package uyg1;

public class Main {
	
	public static void main(String [] args) {
		
		Kitap ktp1,ktp2,ktp3;
		Kitaplik kitaplik = new Kitaplik(4);
		
		ktp1 = new Kitap("A",3,1);
		ktp2 = new Kitap("B",3,2);
		ktp3 = new Kitap("C",3,3);
		
		kitaplik.KitapEkle(ktp3);
		kitaplik.KitapEkle(ktp2);
		kitaplik.KitapEkle(ktp1);
		
		kitaplik.goster(3);
		System.out.println();
		kitaplik.KitapSil(ktp3);
		kitaplik.goster(3);
		
		
	}

}
