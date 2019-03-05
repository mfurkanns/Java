package genel;

public class Ders {
	
	private int gecmeNotu ;
	private String isim;
	private String hoca;
	
	public Ders(String isim,String hoca,int gecmeNotu) {
		this.gecmeNotu = gecmeNotu;
		this.isim = isim;
		this.hoca = hoca;
	}
	public int getGecmeNotu() {
		return gecmeNotu;
	}
	public void setGecmeNotu(int gecmeNotu) {
		this.gecmeNotu = gecmeNotu;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getHoca() {
		return hoca;
	}
	public void setHoca(String hoca) {
		this.hoca = hoca;
	}
	public void dersGoster() {
		System.out.println("ders ismi = "+isim);
		System.out.println("ders hocasý = "+hoca);
		System.out.println("gecme notu = "+gecmeNotu);
		System.out.println();
	}	
	

}
