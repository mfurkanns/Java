package ders1;

public class Dene {
	
	public static void main(String [] args) {
		
		Car a1 = new Car("opel","34 abc 34");
		Insan i1 = new Insan("ali");
		
	//	a1.setSahip(i1);
		i1.setAraba(a1);
		
		i1.insan_goster();		
		a1.araba_goster();
			
	}
}
