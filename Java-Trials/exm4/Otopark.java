package lab1;

import java.util.LinkedList;

public class Otopark {
	
	private String otoparkAdi;
	private int kapasite;
	private int mevcut = 0;
	private LinkedList<Araba> arabalar = new LinkedList<Araba>();
	
	
	public Otopark(String otoparkAdi, int kapasite) {
		this.otoparkAdi = otoparkAdi;
		this.kapasite = kapasite;
	}
	public String getOtoparkAdi() {
		return otoparkAdi;
	}
	public void setOtoparkAdi(String otoparkAdi) {
		this.otoparkAdi = otoparkAdi;
	}
	public int getKapasite() {
		return kapasite;
	}
	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}
	
	public boolean bosMu() {
		if (mevcut<kapasite)
			return true;
		else 
			return false;
	}
	public void arabaEkle(Araba araba) {
		if (mevcut<kapasite) {
			arabalar.add(araba);
			mevcut++;
			System.out.println(araba.getPlaka()+" plakali araba eklendi");
		}
		else
			System.out.println("Otopark dolu !");		
	}
	public void arabaCikar(String aplaka) {
		for(int i=0;i<arabalar.size();i++) {
			if(arabalar.get(i).getPlaka()==aplaka) {
				arabalar.remove(i);
				System.out.println(aplaka+" plakali arac cikartildi ..");			
				mevcut--;
			}
		}
		
		
	}
	public int kapasiteGoster() {
		return kapasite-mevcut;
	}
	
	public void otoparkGoster() {
		
		System.out.println("Otopark adi = "+otoparkAdi);
		System.out.println("Otopark kapasitesi = "+kapasite);
		System.out.println("Mevcut araba = "+mevcut);
		System.out.println();
		for(int i=0;i<arabalar.size();i++) {
			arabalar.get(i).arabaGoster();
			System.out.println();
		}
		System.out.println();
	}
	
	

	
	
	
}
