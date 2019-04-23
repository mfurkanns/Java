package lab4Deneme2;


public class Test {
	
	public static void main(String[] args) {
		
		
		Musteri[] musteri = new Musteri[5];
		BankaYonetim b = new BankaYonetim();
		
		musteri[0] = new Standart(1,"Ali Deniz",100,15);
		musteri[1] = new Elit(2,"Ayþe Türk",100,10);
		musteri[2] = new Elit(3,"Kubilay Koyuncuoðlu",100,20);
		musteri[3] = new Standart(4, "Merve Yýlmaz", 200, 20);
		
		
		
		try {
			b.musteriEkle(musteri[0]);
			b.musteriEkle(musteri[1]);
			b.musteriEkle(musteri[2]);
			b.musteriEkle(musteri[3]);
		}catch(MaxMusteriSayisiException e) {
			e.printStackTrace();
		}
		for(int i=0;i<15;i++) {
			musteri[0].alisverisYap(100);
		}
	
		
		try {
			b.musteriSil(musteri[0]);
		}
		catch(TaahhutSuresiException e) {
			e.printStackTrace();
		}
		catch(YetersizPuanException e) {
			e.printStackTrace();
		}
		
		b.musteriGoster();
		
		
		
		
		
	}

}
