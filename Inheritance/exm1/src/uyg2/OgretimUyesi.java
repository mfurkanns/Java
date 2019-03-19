package uyg2;

public class OgretimUyesi extends Calisan{
	
	private String unvan;
	
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
		
	}
	
	public OgretimUyesi(String ad, int yas,int maas,int kidem) {
		super(ad, yas);
		setMaas(maas);
		setKidem(kidem);
	}
	
	public void kendiniTanit() {
		System.out.println("Isim = "+this.ad);
		System.out.println("Kidem = "+this.kidem);
		System.out.println("Maas = "+this.maas);
		System.out.println("Unvan = "+this.unvan);
		System.out.println("Yas = "+this.yas);
	}
	

}
