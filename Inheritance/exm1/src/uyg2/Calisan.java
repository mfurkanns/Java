package uyg2;

public class  Calisan {
	
	protected String ad;
	protected int yas;
	protected int kidem;
	protected int maas;
	
	
	public  int getKidem() {
		return kidem;
	}
	public void setKidem(int kidem) {
		this.kidem = kidem;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	public  Calisan(String ad,int yas) {
		this.ad=ad;
		this.yas=yas;
	}
	
	public void kendiniTanit() {
		System.out.println("Calisan");
	}
	
	
	
	

}
