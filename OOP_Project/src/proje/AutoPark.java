package proje;

import java.util.ArrayList;
import java.util.Vector;

public class AutoPark {
	
	private double hourlyFee;
	private double incomeDaily;
	private int capacity;
	private int currentCapacity;
	private ArrayList<SubscribedVehicle> subsVehicles;
	private Vector<Vehicle> vehicles;    				// otoparktaki park halindeki araçlarý tutan vector dizisi
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
	
	public SubscribedVehicle searchVehicle(String plate) {	// üye araçlarýn içinden verilen plakadaki arabayý bulan metoddur.
															// eðer bulursa aracýn kendisini döndürür.Bulmazsa null döndürür.
		for(SubscribedVehicle a:subsVehicles) {
			if(a.getPlate()==plate)
				return a;
		}
		return null;		
	}
	
	public boolean isParked(String plate) {	// plakasý verilen bir arabanýn park halinde olup olmadýðýný bulan metoddur.
											// eger arac park halindeyse true döndürür.deðilse false döndürür.
		for( Vehicle a:vehicles) {
			if(a.getPlate()==plate) {
				System.out.println("Araç zaten park edilmiþ !\n");
				return true;
			}
				
		}
		return false;
	}
	
	public void enlargeVehicleArray(int a) {	// otoparkýn kapasitesini arttýrýr.
		System.out.println("Otopark kapasitesi "+a+" arttýrýlmýþtýr !");
		capacity+=a;		
	}
	
	public boolean addVehicle(SubscribedVehicle a) {	// otoparka yeni üye araç ekler.
		for(SubscribedVehicle b:subsVehicles) {			// eðer araba zaten üyeyse false döndürür,deðilse true.
			if(b.getPlate()==a.getPlate()) {
				System.out.println("Araç zaten abone !\n");
				return false;				
			}
		}
		System.out.println("Yeni üyelik oluþturuldu."+a.getPlate()+" plakalý araç üyeliðe alýndý.\n");
		subsVehicles.add(a);
		return true;
	}
	
	public boolean vehicleEnters(String plate,Time enter,boolean isOfficial) { //plakasý verilen arabayý otoparka araç giriþi yapar
		
		if(currentCapacity>=capacity) {	// eðer otopark doluysa false döndürür.
			System.out.println("Otoparkýn kapasite dolu.Aracýnýz park edilemedi !\n");
			return false;
		}
		
		if(isParked(plate)) {	// araç zaten park edilmiþse false döndürür.
			System.out.println("Araç zaten park edilmiþ !\n");
			return false;
		}
			
		
		
		if(searchVehicle(plate)!=null) { // giriþ yapan araç aboneyse park record oluþturulur.
			ParkRecord pRecord = new ParkRecord(enter, searchVehicle(plate));
			pRecord.setVehicle(searchVehicle(plate));
			parkRecords.add(pRecord);
			vehicles.add(searchVehicle(plate));
			currentCapacity++;
			System.out.println("Abone araç"+" ("+plate+") "+"park edildi !\n");
			return true;
		}
		else {
			
			if(isOfficial) { // giriþ yapan araç resmi araç ise park record oluþturulur.
				Vehicle vhcl = new OfficialVehicle(plate);
				ParkRecord pRecord = new ParkRecord(enter, vhcl);
				pRecord.setVehicle(vhcl);
				parkRecords.add(pRecord);
				vehicles.add(vhcl);
				currentCapacity++;
				System.out.println("Resmi araç"+" ("+plate+") "+"park edildi !\n");
				return true;
			}
			else { // giriþ yapan araç normal ise park record oluþturulur.
				Vehicle vhcl = new RegularVehicle(plate);
				ParkRecord pRecord = new ParkRecord(enter, vhcl);
				pRecord.setVehicle(vhcl);
				parkRecords.add(pRecord);
				vehicles.add(vhcl);
				currentCapacity++;
				System.out.println("Normal araç"+" ("+plate+") "+"park edildi !\n");
				return true;
			}
		}
	}
	
	public boolean vehicleExits(String plate,Time exit) { // plakasý verilen araç otoparktan çýkarýlýr.
		
		if(!isParked(plate)) { // araba eðer otoparkta deðilse false döndürülür.
			System.out.println("Araba bulunamadi !\n");
			return false;
		}
		
		for(ParkRecord a:parkRecords) { // park edilen araçlar arasýndan verilen plakadaki araç aranýr.
			if(a.getVehicle().getPlate()==plate) {
				if(searchVehicle(a.getVehicle().getPlate())!=null) { // araba eðer aboneyse ücret ödenmeden çýkýþ yapýlýr.
					if(a.getVehicle().getSubscription().isValid()) { // arabanýn abonelik süresi geçmemiþse
						a.setExitTime(exit); // çýkýþ süresi park recorda yazýlýr.
						currentCapacity--; 	 // otoparktaki araç sayýsý 1 azaltýlýr.
						vehicles.remove(a.getVehicle()); // araç diziden çýkartýlýr.
						System.out.println("Abone araç"+" ("+plate+") "+"çýkýþ yaptý !");
						return true;
					}
					else { // eðer abonelik süresi dolduysa ücret hesaplanýr.
						double hesap;
						a.setExitTime(exit);
						hesap=a.getParkingDuration()*hourlyFee; // ücret hesaplanýr.
						incomeDaily+=hesap; // günlük hasýlata eklenir.
						subsVehicles.remove(a.getVehicle());
						currentCapacity--;
						vehicles.remove(a.getVehicle());
						subsVehicles.remove(a); //
						System.out.println("Abonelik süresi dolan araç çýkýþ yaptý.Park bedeli = "+hesap+"\n");
						return true;
					}
					
				}
				else { // cikis yapan araç eðer normal ise ücret hesaplanýr.
					
					if(isOfficial) { // giriş yapan araç resmi araç ise park record oluşturulur.
						Vehicle vhcl = new OfficialVehicle(plate);
						ParkRecord pRecord = new ParkRecord(enter, vhcl);
						pRecord.setVehicle(vhcl);
						parkRecords.add(pRecord);
						vehicles.add(vhcl);
						currentCapacity++;
						System.out.println("Resmi araç"+" ("+plate+") "+"park edildi !\n");
						return true;
					}		
					else { // giriş yapan araç normal ise park record oluşturulur.
						Vehicle vhcl = new RegularVehicle(plate);
						ParkRecord pRecord = new ParkRecord(enter, vhcl);
						pRecord.setVehicle(vhcl);
						parkRecords.add(pRecord);
						vehicles.add(vhcl);
						currentCapacity++;
						System.out.println("Normal araç"+" ("+plate+") "+"park edildi !\n");
						return true;
					}			
				}
					
			}
		}
		
		for(Vehicle a:vehicles) { // aracýn resmi olup olmadýðýna bakýlýr.
			if(a.isSpecial()) { // araç resmi ise ücret hesaplanmaz.
				currentCapacity--;
				vehicles.remove(a);
				System.out.println("Resmi araç"+" ("+plate+") "+"çýkýþ yaptý !");
				return true;   // iþlem tamamlanýr true döndürülür.
			}
		}
		
		System.out.println("Araba bulunamadi !\n");
		return false;  // plakasý verilen araç yoksa false döndürülür.
		
	}
	
	public String toString() { // park eden arabalar ve kazanç yazdýrýlýr.
		int i=1;
		System.out.println("Bugün park eden arabalar:");
		for(ParkRecord a:parkRecords) {
			System.out.println(i+")"+a.getVehicle().getPlate());	
			i++;
		}
		
		
		
		return "Mevcut kazanç = "+incomeDaily+"\n";
		
	}
	

}
