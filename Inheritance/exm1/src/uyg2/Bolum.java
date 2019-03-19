package uyg2;

import java.util.ArrayList;

public class Bolum {
	
	private String bolumAdi;
	private String adres;
	private int kurulus;
	private ArrayList<Calisan> arr = new ArrayList<Calisan>();
	private int toplamMaas;
	
	public Bolum(String bolumAdi,String adres,int kurulus) {
		this.bolumAdi=bolumAdi;
		this.adres=adres;
		this.kurulus=kurulus;
	}
	public void calisanEkle(Calisan c1) {
		arr.add(c1);
		System.out.println("Yeni calisan eklenmistir.");
	}
	
	public void calisanToplamMaas() {
		toplamMaas=0;
		for(Calisan c:arr) {
			toplamMaas=toplamMaas+c.getMaas();			
		}
		System.out.println("Toplam maas = "+toplamMaas);		
	}
	
	
	
	

}
