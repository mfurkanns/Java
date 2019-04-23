package lab4Deneme2;

import java.util.LinkedList;

public class BankaYonetim {
	
	private int musteriKapasite;
	private LinkedList<Musteri> musteriler;
	
	public BankaYonetim() {
		musteriler = new LinkedList<Musteri>();
		musteriKapasite = 5;
	}
	
	
	public void musteriEkle(Musteri m) throws MaxMusteriSayisiException {
		
		if(musteriler.size()<musteriKapasite) {
			musteriler.add(m);
		}
		else {
			throw new MaxMusteriSayisiException("Kampaya kontejan� dolmustur !");
		}
		
	}
	
	public void musteriSil(Musteri m) throws TaahhutSuresiException,YetersizPuanException{
		for(Musteri a:musteriler) {
			if(a==m) {
				if(m.getAvSayisi()<=0) {
					musteriler.remove(m);
					System.out.println("Kampanyadan basariyla ��kt�n�z !");
					return;
				}
				else {
					if(m.getPuan()>=m.getBonus()*2) {
						musteriler.remove(m);
						throw new TaahhutSuresiException("Taahhut sureniz dolmadi ! "+m.getBonus()*2+" Bonus puan� kadar ceza yediniz.");					
					}
					else {
						throw new YetersizPuanException("Kampanyadan ��kmak i�in yeterli puan�n�z bulunmamaktad�r.");
					}
				}
				
			}
		}
		System.out.println("Musteri bulunamadi !");
		
	}
	
	public void musteriGoster() {
		for(Musteri a:musteriler) {
			System.out.println(a.toString()+"\n");
		}
	}
	
	
	
	
	

}
