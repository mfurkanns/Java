package ders1;

public class Car {
	
	private String marka;
	private String plaka;
	private Insan sahip;
	
	public Car(String marka,String plaka,Insan sahip) {
		this.marka=marka;
		this.plaka=plaka;
		this.sahip=sahip;
		
	}
	public Car(String marka,String plaka) {
		this.marka=marka;
		this.plaka=plaka;
		
	}
	public String getMarka() {
		return marka;		
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public Insan getSahip() {
		return sahip;
	}

	public void setSahip(Insan sahip) {
		this.sahip = sahip;
		if(sahip.getAraba()!=this) {
			sahip.setAraba(this);
		}
	}
	
	public void araba_goster() {
		System.out.println("marka = "+this.getMarka());
		System.out.println("plakam = "+this.getPlaka());
		System.out.println("sahibim = "+this.getSahip().getIsim());
		
	}
	
	
	
	
	
	

}
