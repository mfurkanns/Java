package proje;

public class OfficialVehicle implements Vehicle{
	
	private String plate;
	private boolean formality;
	private ParkRecord parkRecord;
	
	public OfficialVehicle(String plate) {
		this.plate = plate;
		formality = true;
		parkRecord=null;
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
