package lab1;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Araba a1 = new Araba("34 abc 34","opel",2002);
		Araba a2 = new Araba();
		
		Scanner scan = new Scanner(System.in);
		
		String isim;
		int kapa;
		
		
		System.out.println("otopark adini gir = ");
		isim=scan.nextLine();
		System.out.println("kapasite gir = ");
		kapa=scan.nextInt();
		
		Otopark o1 = new Otopark(isim,kapa);
		a1.arabaGoster(); 
		a2.arabaGoster();
		
		o1.arabaEkle(a1);
		o1.arabaEkle(a2);
		o1.otoparkGoster();
		
		o1.arabaCikar(a1.getPlaka());
		o1.otoparkGoster();
		
	
		
	}
	

}
