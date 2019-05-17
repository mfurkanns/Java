package proje;

public class RegularVehicle implements Vehicle{
	
	private String plate;
	public boolean formality;
	
	public RegularVehicle(String plate) {
		this.plate = plate;
		formality = false;
	}
	

	public boolean getFormality() {
		return formality;
	}
	
	@Override
	public String getPlate() {
		return plate;
	}

	@Override
	public Subscription getSubscription() {
		return null;
	}

	@Override
	public boolean isSpecial() {
		return formality;
	}
	

}
