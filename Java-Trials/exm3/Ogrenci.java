package genel;

import java.util.*;

public class Ogrenci {
	
	
	private String isim;
	private int ogrNo;
	private LinkedList<Ders> alinanDersler = new LinkedList<Ders>();
	private LinkedList<Integer> notlar = new LinkedList<Integer>();
	
	public Ogrenci(String isim,int ogrNo) {
		this.isim = isim;
		this.ogrNo = ogrNo;
	}
	public String getIsim() {
		return isim;
	}
	public int getOgrNo() {
		return ogrNo;
	}	
	public void dersEkle(Ders ders1,int not) {
		notlar.add(not);
		alinanDersler.add(ders1);
	}	
	public void dersSil(Ders ders1) {
		int aa = alinanDersler.indexOf(ders1);
		if(alinanDersler.remove(ders1)) {
			notlar.remove(aa);
			System.out.println(ders1.getIsim()+" dersi silindi ...");			
		}			
		else
			System.out.println("Ders bulunamadi ...");
	}
	public void basariGoster() {
		for(int i=0;i<alinanDersler.size();i++) {
			if(alinanDersler.get(i).getGecmeNotu()<=notlar.get(i))
				System.out.println(alinanDersler.get(i).getIsim()+" dersi basarili ... ");
			else
				System.out.println(alinanDersler.get(i).getIsim()+" dersi basarisiz ...");
		}
		System.out.println();
		
	}

}
