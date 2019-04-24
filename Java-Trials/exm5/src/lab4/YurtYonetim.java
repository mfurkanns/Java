package lab4;

import java.util.*;

public class YurtYonetim {
	
	private int yurtKapasite;
	private ArrayList<Ogrenci> ogrenciler;
	
	public YurtYonetim(int yurtKapasite) {
		this.yurtKapasite = yurtKapasite;
		ogrenciler = new ArrayList<Ogrenci>();
	}
	
	public int getYurtKapasite() {
		return yurtKapasite;
	}

	public void setYurtKapasite(int yurtKapasite) {
		this.yurtKapasite = yurtKapasite;
	}

	public Ogrenci ogrenciBul(String id) {
		for(Ogrenci a:ogrenciler) {
			if(a.getId()==id) {
				return a;
			}
		}
		return null;		
	}
	
	public void borcEkle(int aidat) {
		for(Ogrenci a:ogrenciler) {
			a.setBorc(a.getBorc()+aidat);
		}
	}
	
	public void bordOde(String id,int aidat) {
		ogrenciBul(id).setBorc(ogrenciBul(id).getBorc()-aidat);
	}
	
	public void listeyazdir() {
		for(Ogrenci a:ogrenciler) {
			System.out.println(a.toString());
			System.out.println("\n");
		}
	}
	
	public void OgrenciEkle(Ogrenci a) throws YurtKapasiteException,AyniIDOgrenciException {
		
		for(Ogrenci k:ogrenciler) {
			if(k.getId()==a.getId()) {
				throw new AyniIDOgrenciException("Ayni ID'ye sahip ogrenci eklenemez !");
			}
		}
		
		if(ogrenciler.size()<yurtKapasite) {
			ogrenciler.add(a);
			System.out.println("Ogrenci basariyla eklenmistir !\n");
		}
		else {
			throw new YurtKapasiteException("Yurt kapasitesi dolu !");
		}
	}
	
	public void OgrenciCikar(String id)throws BorcuOlanOgrenciException {
		if(ogrenciBul(id).getBorc()<=0) {
			ogrenciler.remove(ogrenciBul(id));
		}
		else {
			throw new BorcuOlanOgrenciException("Borcu Olan Öðrenci yurttan ayrýlamaz !");
		}
		
		
	}
	
	
	
	
	
	

}
