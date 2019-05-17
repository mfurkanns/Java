package proje;

public class SubscribedVehicle implements Vehicle{
	
	private String plate ;
	private Subscription subs;
	private boolean formality;
	
	

	public SubscribedVehicle(String plate) {		
		this.plate = plate;
		formality = false;
		subs = null;
	}
	
	
	public boolean getFormality() {
		return formality;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public Subscription getSubscription() {
		return subs;
	}
	
	public void setSubscription(Subscription subs) {
		this.subs = subs;
	}
	
	
	public boolean isSpecial() {
		return formality;
	}
	
	
	
	
	
	
	
	
	

}
