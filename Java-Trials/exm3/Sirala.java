package genel;

public class Sirala {
	
	public static void main(String[] args) {	
		
		
		Ders d1,d2,d3;
		Ogrenci o1,o2;
		
		d1 = new Ders("Matematik","Coraklik",60);
		d2 = new Ders("Biyoloji","Asli",65);
		d3 = new Ders("Tarih","Erol",55);
		
		d1.dersGoster();
		d2.dersGoster();
		d3.dersGoster();		
		
		o1 = new Ogrenci("Ali",123);
		o2 = new Ogrenci("Veli",456);
		
		o2.dersEkle(d1, 55);
		o2.dersEkle(d2, 30);
		o2.dersEkle(d3, 100);	
		
		o1.dersEkle(d1,70);
		o1.dersEkle(d2, 65);
		o1.dersEkle(d3, 20);
		
		o1.basariGoster();
		o2.basariGoster();
		
		o1.dersSil(d1);
		o1.basariGoster();
		
		o1.dersSil(d1);
		
	}
	
}
