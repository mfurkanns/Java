package lab4Deneme2;

public class Elit implements Musteri {
	
	
	private int id;
	private String adSoyad;
	private int puan;
	private int avSayisi;
	private int bonus;
	
	public Elit(int id,String adSoyad,int puan,int avSayisi) {
		this.id = id;
		this.adSoyad = adSoyad;
		this.avSayisi = avSayisi;
		this.puan = puan;
		bonus=0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getAvSayisi() {
		return avSayisi;
	}

	public void setAvSayisi(int avSayisi) {
		this.avSayisi = avSayisi;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	public String toString() {
		return "Ad-Soyad : "+getAdSoyad()+" ID : "+getId()+" Musteri tipi : "+getClass().getSimpleName()+" Puan : "+getPuan();
	}
	
	
	@Override
	public void alisverisYap(int tutar) {
		setPuan(getPuan() + tutar*4);
		setAvSayisi(getAvSayisi()-1);
		setBonus(getBonus()+tutar*4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
