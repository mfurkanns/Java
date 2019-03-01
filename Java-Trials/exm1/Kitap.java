package uyg1;


public class Kitap {
	
	private String kitapAdi;
	private int rafNo;
	private int siraNo;
	
	public Kitap(String kitapAdi,int rafNo,int siraNo) {
		this.kitapAdi=kitapAdi;
		this.rafNo=rafNo;
		this.siraNo=siraNo;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public int getRafNo() {
		return rafNo;
	}

	public void setRafNo(int rafNo) {
		this.rafNo = rafNo;
	}

	public int getSiraNo() {
		return siraNo;
	}

	public void setSiraNo(int siraNo) {
		this.siraNo = siraNo;
	}
	
	
	
	
	
	
	

}
