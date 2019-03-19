package uyg2;

public class ArastirmaGorevlisi extends Calisan {

	
	private String durum;
	
	public void doktoraDurumGoster(String durum) {
		this.durum=durum;
	}
	
	
	public ArastirmaGorevlisi(String ad, int yas,int kidem,int maas) {
		super(ad, yas);
		setKidem(kidem);
		setMaas(maas);
	}
	public void kendiniTanit() {
		System.out.println("Ýsim = "+this.ad);
		System.out.println("Doktora durumu = "+this.durum);
		System.out.println("Kidem = "+this.kidem);
		System.out.println("Maas = "+this.maas);
		System.out.println("Yas = "+this.yas);
		
	}
	
	
	

}
