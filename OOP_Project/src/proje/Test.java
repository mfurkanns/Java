package proje;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		AutoPark otopark = new AutoPark(3.5, 10);
		
		Vehicle a1 = new RegularVehicle("34 R 1");
		Vehicle a2 = new RegularVehicle("34 R 2");
		Vehicle a3 = new RegularVehicle("34 R 3");
		Vehicle a4 = new RegularVehicle("34 R 4");
		
		Vehicle a5 = new OfficialVehicle("34 O 5");
		
		SubscribedVehicle a6 = new SubscribedVehicle("34 S 6");
		SubscribedVehicle a7 = new SubscribedVehicle("34 S 7");
		SubscribedVehicle a8 = new SubscribedVehicle("34 S 8");
		SubscribedVehicle a9 = new SubscribedVehicle("34 S 9");
		SubscribedVehicle a10 = new SubscribedVehicle("34 S 10");
		SubscribedVehicle a11 = new SubscribedVehicle("34 S 11");
		
		Time t1 = new Time(12, 30);
		Time t2 = new Time(14, 30);
		
		Date d1 = new Date(10,1,2019);
		Date d2 = new Date(14,5,2019);
		
		Subscription sub1 = new Subscription(d1, d2, a6.getPlate());
		Subscription sub2 = new Subscription(d1, d2, a7.getPlate());
		Subscription sub3 = new Subscription(d1, d2, a8.getPlate());
		Subscription sub4 = new Subscription(d1, d2, a9.getPlate());
		Subscription sub5 = new Subscription(d1, d2, a10.getPlate());
		Subscription sub6 = new Subscription(d1, d2, a11.getPlate());
		
		a6.setSubscription(sub1);
		a7.setSubscription(sub2);
		a8.setSubscription(sub3);
		a9.setSubscription(sub4);
		a10.setSubscription(sub5);
		a11.setSubscription(sub6);
		
		
		
		otopark.addVehicle(a6);
		otopark.addVehicle(a7);
		otopark.addVehicle(a8);
		otopark.addVehicle(a9);
		otopark.addVehicle(a10);
		otopark.addVehicle(a11);
		
		
		otopark.vehicleEnters(a1.getPlate(), t1, a1.isSpecial());
		otopark.vehicleEnters(a2.getPlate(), t1, a2.isSpecial());
		otopark.vehicleEnters(a3.getPlate(), t1, a3.isSpecial());
		otopark.vehicleEnters(a4.getPlate(), t1, a4.isSpecial());
		otopark.vehicleEnters(a5.getPlate(), t1, a5.isSpecial());
		otopark.vehicleEnters(a6.getPlate(), t1, a6.isSpecial());
		otopark.vehicleEnters(a7.getPlate(), t1, a7.isSpecial());
		otopark.vehicleEnters(a8.getPlate(), t1, a8.isSpecial());
		otopark.vehicleEnters(a9.getPlate(), t1, a9.isSpecial());
		otopark.vehicleEnters(a10.getPlate(), t1, a10.isSpecial());
		
		otopark.enlargeVehicleArray(11);
		
		otopark.vehicleEnters(a11.getPlate(), t1, a11.isSpecial());
		
		otopark.vehicleExits(a1.getPlate(), t2);
		otopark.vehicleExits(a2.getPlate(), t2);
		otopark.vehicleExits(a3.getPlate(), t2);
		otopark.vehicleExits(a4.getPlate(), t2);		
		otopark.vehicleExits(a5.getPlate(), t2);
		otopark.vehicleExits(a6.getPlate(), t2);
		otopark.vehicleExits(a7.getPlate(), t2);
		otopark.vehicleExits(a8.getPlate(), t2);
		otopark.vehicleExits(a9.getPlate(), t2);
		otopark.vehicleExits(a10.getPlate(), t2);
		otopark.vehicleExits(a11.getPlate(), t2);
		
		
		
		
		otopark.vehicleEnters(a11.getPlate(), t1, a11.isSpecial());
		
		System.out.println(otopark.toString());
		
		
		
		
	}
	
	
	
	
	
	

}
