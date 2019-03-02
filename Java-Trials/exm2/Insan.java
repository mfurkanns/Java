package ders1;

public class Insan {
	
	private String isim;
	private Car araba;
	
	public Insan(String isim,Car araba) {
		this.isim=isim;
		this.araba=araba;		
	}
	public Insan(String isim) {
		this.isim=isim;
	}
	public String getIsim() {
		return isim;
	}
	public Insan() {
		
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Car getAraba() {
		return araba;
	}

	public void setAraba(Car araba) {
		this.araba = araba;
		if(araba.getSahip()!=this) {
			araba.setSahip(this);
		}
	}

	public void insan_goster() {
		System.out.println("adim = "+this.getIsim());
		System.out.println("arabam = "+this.getAraba().getPlaka());
	}

}
