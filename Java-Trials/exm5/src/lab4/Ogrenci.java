package lab4;

public class Ogrenci {
	
	private String id;
	private String ad;
	private String soyad;
	private int borc;
	
	public Ogrenci(String id, String ad, String soyad, int borc) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.borc = borc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getBorc() {
		return borc;
	}
	public void setBorc(int borc) {
		this.borc = borc;
	}
	
	public String toString() {
		return "Ad :"+getAd()+" Soyad :"+getSoyad()+" ID :"+getId()+" Borç :"+getBorc();
	}
	
	public boolean borcKontrol() {
		
		if(borc>0)
			return true;
		return false;
	}
	
	
	
	

}
