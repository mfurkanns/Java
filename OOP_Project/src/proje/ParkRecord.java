package proje;

public class ParkRecord {
	
	private Time enterTime;
	private Time exitTime;
	private Vehicle vehicle;
	
	
	public ParkRecord(Time enterTime, Vehicle vehicle) {
		this.enterTime = enterTime;
		this.vehicle = vehicle;
	}
	
	public Time getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(Time enterTime) {
		this.enterTime = enterTime;
	}
	public Time getExitTime() {
		return exitTime;
	}
	public void setExitTime(Time exitTime) {
		this.exitTime = exitTime;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	public int getParkingDuration() {
		return enterTime.getDifference(exitTime);
	}
	

}
