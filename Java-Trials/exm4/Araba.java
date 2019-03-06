package lab1;

public class Araba {
	
	private String plaka;
	private String marka;
	private int model;
	
	public Araba() {		
	}
	public Araba(String plaka, String marka, int model) {
		this.plaka = plaka;
		this.marka = marka;
		this.model = model;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	public void arabaGoster() {
		System.out.println("Arabanin plakasi = "+getPlaka());
		System.out.println("Arabanin markasi = "+getMarka());
		System.out.println("Arabanin modeli = "+getModel());
		System.out.println();
	}
	
	
	
	
	
}
