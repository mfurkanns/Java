package proje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2 {

	AutoPark otopark = new AutoPark(3.5, 10);
	
	Time t1 = new Time(12, 30);
	Time t2 = new Time(14, 30);
	
	Date d1 = new Date(10,1,2019);
	Date d2 = new Date(14,5,2020);
	
	Date d3 = new Date(9,8,2017);
	Date d4 = new Date(9,8,2018);
	
	Vehicle a1 = new RegularVehicle("34 R 1");
	Vehicle a2 = new RegularVehicle("34 R 2");
	Vehicle a3 = new RegularVehicle("34 R 3");
	Vehicle a4 = new RegularVehicle("34 R 4");
	Vehicle a5 = new OfficialVehicle("34 O 5");
	
	
	Vehicle a8 = new OfficialVehicle("34 O 8");
	Vehicle a9 = new OfficialVehicle("34 O 9");
	
	SubscribedVehicle a6 = new SubscribedVehicle("34 S 6");
	SubscribedVehicle a7 = new SubscribedVehicle("34 S 7");
	SubscribedVehicle a10 = new SubscribedVehicle("34 S 10");
	SubscribedVehicle a11 = new SubscribedVehicle("34 S 11");
	
	
	Subscription sub1 = new Subscription(d1, d2, a6.getPlate());
	Subscription sub2 = new Subscription(d1, d2, a7.getPlate());
	
	Subscription sub5 = new Subscription(d1, d2, a10.getPlate());
	Subscription sub6 = new Subscription(d3, d4, a11.getPlate());
	
	
	
	
	
	@Test
	void kapasiteDoluTest() {
		
		a6.setSubscription(sub1);		
		a7.setSubscription(sub2);
		a10.setSubscription(sub5);
		a11.setSubscription(sub6);
		
		assertTrue(otopark.addVehicle(a6));		
		assertTrue(otopark.addVehicle(a7));				
		assertTrue(otopark.addVehicle(a10));		
		assertTrue(otopark.addVehicle(a11));
		
		assertTrue(otopark.vehicleEnters(a1.getPlate(), t1, a1.isSpecial()));
		assertTrue(otopark.vehicleEnters(a2.getPlate(), t1, a2.isSpecial()));
		assertTrue(otopark.vehicleEnters(a3.getPlate(), t1, a3.isSpecial()));
		assertTrue(otopark.vehicleEnters(a4.getPlate(), t1, a4.isSpecial()));
		assertTrue(otopark.vehicleEnters(a5.getPlate(), t1, a5.isSpecial()));
		assertTrue(otopark.vehicleEnters(a6.getPlate(), t1, a6.isSpecial()));
		assertTrue(otopark.vehicleEnters(a7.getPlate(), t1, a7.isSpecial()));
		assertTrue(otopark.vehicleEnters(a8.getPlate(), t1, a8.isSpecial()));
		assertTrue(otopark.vehicleEnters(a9.getPlate(), t1, a9.isSpecial()));
		assertTrue(otopark.vehicleEnters(a10.getPlate(), t1, a10.isSpecial()));
		
		assertFalse(otopark.vehicleEnters(a11.getPlate(), t1, a11.isSpecial()));
		
		assertTrue(otopark.vehicleExits(a10.getPlate(),t2));
		
		assertTrue(otopark.vehicleEnters(a11.getPlate(), t1, a11.isSpecial()));
	}
	
	@Test
	void aboneSuresiBittiTest() {
		
		a11.setSubscription(sub6);
		assertTrue(otopark.addVehicle(a11));
		
		assertTrue(otopark.vehicleEnters(a11.getPlate(), t1, a11.isSpecial()));
		assertTrue(otopark.vehicleExits(a11.getPlate(),t2));
		
	}
	
	@Test
	void resmiAraçTest() {
		
		assertTrue(otopark.vehicleEnters(a5.getPlate(), t1, a5.isSpecial()));
		assertTrue(otopark.vehicleExits(a5.getPlate(),t2));
	
	}
	
	@Test
	void uyelikAlmaTest() {
		
		a11.setSubscription(sub6);
		assertTrue(otopark.addVehicle(a11));
		
	
	}
	
	@Test
	void aracParkHalindeMiTest() {
		
		assertTrue(otopark.vehicleEnters(a5.getPlate(), t1, a5.isSpecial()));
		assertTrue(otopark.isParked(a5.getPlate()));
		
	
	}
	
	
	
	
	

}
