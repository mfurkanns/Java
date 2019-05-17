package proje;

import java.util.ArrayList;
import java.util.Vector;

public class AutoPark {
	
	private double hourlyFee;
	private double incomeDaily;
	private int capacity;
	private int currentCapacity;
	private ArrayList<SubscribedVehicle> subsVehicles;
	private Vector<Vehicle> vehicles;    				// otoparktaki park halindeki ara�lar� tutan vector dizisi
	private ArrayList<ParkRecord> parkRecords;
	
	public AutoPark(double hourlyFee,int capacity) {
		this.hourlyFee = hourlyFee;
		this.capacity = capacity;
		currentCapacity = 0;
		incomeDaily=0;
		subsVehicles = new ArrayList<SubscribedVehicle>();
		vehicles = new Vector<Vehicle>();
		parkRecords = new ArrayList<ParkRecord>();		
	}

	public ArrayList<SubscribedVehicle> getSubsVehicles() {
		return subsVehicles;
	}

	public void setSubsVehicles(ArrayList<SubscribedVehicle> subsVehicles) {
		this.subsVehicles = subsVehicles;
	}

	public Vector<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vector<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public ArrayList<ParkRecord> getParkRecords() {
		return parkRecords;
	}

	public void setParkRecords(ArrayList<ParkRecord> parkRecords) {
		this.parkRecords = parkRecords;
	}

	public double getHourlyFee() {
		return hourlyFee;
	}

	public void setHourlyFee(double hourlyFee) {
		this.hourlyFee = hourlyFee;
	}

	public double getIncomeDaily() {
		return incomeDaily;
	}

	public void setIncomeDaily(double incomeDaily) {
		this.incomeDaily = incomeDaily;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public SubscribedVehicle searchVehicle(String plate) {	// �ye ara�lar�n i�inden verilen plakadaki arabay� bulan metoddur.
															// e�er bulursa arac�n kendisini d�nd�r�r.Bulmazsa null d�nd�r�r.
		for(SubscribedVehicle a:subsVehicles) {
			if(a.getPlate()==plate)
				return a;
		}
		return null;		
	}
	
	public boolean isParked(String plate) {	// plakas� verilen bir araban�n park halinde olup olmad���n� bulan metoddur.
											// eger arac park halindeyse true d�nd�r�r.de�ilse false d�nd�r�r.
		for( Vehicle a:vehicles) {
			if(a.getPlate()==plate) {
				System.out.println("Ara� zaten park edilmi� !\n");
				return true;
			}
				
		}
		return false;
	}
	
	public void enlargeVehicleArray(int a) {	// otopark�n kapasitesini artt�r�r.
		System.out.println("Otopark kapasitesi "+a+" artt�r�lm��t�r !");
		capacity+=a;		
	}
	
	public boolean addVehicle(SubscribedVehicle a) {	// otoparka yeni �ye ara� ekler.
		for(SubscribedVehicle b:subsVehicles) {			// e�er araba zaten �yeyse false d�nd�r�r,de�ilse true.
			if(b.getPlate()==a.getPlate()) {
				System.out.println("Ara� zaten abone !\n");
				return false;				
			}
		}
		System.out.println("Yeni �yelik olu�turuldu."+a.getPlate()+" plakal� ara� �yeli�e al�nd�.\n");
		subsVehicles.add(a);
		return true;
	}
	
	public boolean vehicleEnters(String plate,Time enter,boolean isOfficial) { //plakas� verilen arabay� otoparka ara� giri�i yapar
		
		if(currentCapacity>=capacity) {	// e�er otopark doluysa false d�nd�r�r.
			System.out.println("Otopark�n kapasite dolu.Arac�n�z park edilemedi !\n");
			return false;
		}
		
		if(isParked(plate)) {	// ara� zaten park edilmi�se false d�nd�r�r.
			System.out.println("Ara� zaten park edilmi� !\n");
			return false;
		}
			
		
		
		if(searchVehicle(plate)!=null) { // giri� yapan ara� aboneyse park record olu�turulur.
			ParkRecord pRecord = new ParkRecord(enter, searchVehicle(plate));
			pRecord.setVehicle(searchVehicle(plate));
			parkRecords.add(pRecord);
			vehicles.add(searchVehicle(plate));
			currentCapacity++;
			System.out.println("Abone ara�"+" ("+plate+") "+"park edildi !\n");
			return true;
		}
		else {
			
			if(isOfficial) { // giri� yapan ara� resmi ara� ise park record olu�turulur.
				Vehicle vhcl = new OfficialVehicle(plate);
				ParkRecord pRecord = new ParkRecord(enter, vhcl);
				pRecord.setVehicle(vhcl);
				parkRecords.add(pRecord);
				vehicles.add(vhcl);
				currentCapacity++;
				System.out.println("Resmi ara�"+" ("+plate+") "+"park edildi !\n");
				return true;
			}
			else { // giri� yapan ara� normal ise park record olu�turulur.
				Vehicle vhcl = new RegularVehicle(plate);
				ParkRecord pRecord = new ParkRecord(enter, vhcl);
				pRecord.setVehicle(vhcl);
				parkRecords.add(pRecord);
				vehicles.add(vhcl);
				currentCapacity++;
				System.out.println("Normal ara�"+" ("+plate+") "+"park edildi !\n");
				return true;
			}
		}
	}
	
	public boolean vehicleExits(String plate,Time exit) { // plakas� verilen ara� otoparktan ��kar�l�r.
		
		if(!isParked(plate)) { // araba e�er otoparkta de�ilse false d�nd�r�l�r.
			System.out.println("Araba bulunamadi !\n");
			return false;
		}
		
		for(ParkRecord a:parkRecords) { // park edilen ara�lar aras�ndan verilen plakadaki ara� aran�r.
			if(a.getVehicle().getPlate()==plate) {
				if(searchVehicle(a.getVehicle().getPlate())!=null) { // araba e�er aboneyse �cret �denmeden ��k�� yap�l�r.
					if(a.getVehicle().getSubscription().isValid()) { // araban�n abonelik s�resi ge�memi�se
						a.setExitTime(exit); // ��k�� s�resi park recorda yaz�l�r.
						currentCapacity--; 	 // otoparktaki ara� say�s� 1 azalt�l�r.
						vehicles.remove(a.getVehicle()); // ara� diziden ��kart�l�r.
						System.out.println("Abone ara�"+" ("+plate+") "+"��k�� yapt� !");
						return true;
					}
					else { // e�er abonelik s�resi dolduysa �cret hesaplan�r.
						double hesap;
						a.setExitTime(exit);
						hesap=a.getParkingDuration()*hourlyFee; // �cret hesaplan�r.
						incomeDaily+=hesap; // g�nl�k has�lata eklenir.
						subsVehicles.remove(a.getVehicle());
						currentCapacity--;
						vehicles.remove(a.getVehicle());
						subsVehicles.remove(a); //
						System.out.println("Abonelik s�resi dolan ara� ��k�� yapt�.Park bedeli = "+hesap+"\n");
						return true;
					}
					
				}
				else { // ��k�� yapan ara� e�er normal ise �cret hesaplan�r.
					double hesap;
					a.setExitTime(exit);
					hesap=a.getParkingDuration()*hourlyFee; // �cret hesaplan�r.
					incomeDaily+=hesap;  // g�nl�k has�lata eklenir.
					currentCapacity--;
					vehicles.remove(a.getVehicle());
					System.out.println("Normal ara�"+" ("+plate+") "+"��k�� yapt� ! Park bedeli = "+hesap);
					return true;	// i�lem tamamlan�r true d�nd�r�l�r.			
				}
					
			}
		}
		
		for(Vehicle a:vehicles) { // arac�n resmi olup olmad���na bak�l�r.
			if(a.isSpecial()) { // ara� resmi ise �cret hesaplanmaz.
				currentCapacity--;
				vehicles.remove(a);
				System.out.println("Resmi ara�"+" ("+plate+") "+"��k�� yapt� !");
				return true;   // i�lem tamamlan�r true d�nd�r�l�r.
			}
		}
		
		System.out.println("Araba bulunamadi !\n");
		return false;  // plakas� verilen ara� yoksa false d�nd�r�l�r.
		
	}
	
	public String toString() { // park eden arabalar ve kazan� yazd�r�l�r.
		int i=1;
		System.out.println("Bug�n park eden arabalar:");
		for(ParkRecord a:parkRecords) {
			System.out.println(i+")"+a.getVehicle().getPlate());	
			i++;
		}
		
		
		
		return "Mevcut kazan� = "+incomeDaily+"\n";
		
	}
	

}
