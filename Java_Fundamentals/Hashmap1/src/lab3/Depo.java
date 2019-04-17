package lab3;

import java.util.HashMap;

public class Depo {
	
	private HashMap<Integer, Paket> map;
	private int count;
	
	
	public Depo() {
		map = new HashMap<Integer,Paket>();
		count = 0;
	}
	
	
	public void paketYerlestir(Paket p) {
		boolean cik = true;
		int i = 0;
		while(cik&&(i<count)) {
			if(map.containsKey(i))
				i++;
			else
				cik = false;
		}
		
		if(i>=count) {
			count++;
		}
		
		
		p.setAlanID(i);
		map.put(i, p);
		
		
			
	}
	
	public void paketCikar(int alanID) {
		int i = 0;
		boolean cik = true;
		
		while(cik&&(i<count)) {
			if(map.containsKey(i)) {
				if(map.get(i).getAlanId()==alanID) {
					map.remove(i);
					cik = false;
					
				}
			}
			i++;
			
		}
		
		
	}
	
	public void kendiniTanit() {
		System.out.println("Paketler : ");
		for(int i = 0;i<count;i++) {
			if(map.containsKey(i)) {
				System.out.println("Paket agirlik = "+map.get(i).getAgirlik()+" - Paket ID = "+map.get(i).getAlanId());
				
			}
			else {
					System.out.println(i+" numarali göz boþ.");
				
				
			}
		}
		System.out.println();
		
		
	}
	

}
