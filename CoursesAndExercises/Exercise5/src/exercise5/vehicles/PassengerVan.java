package exercise5.vehicles;

public class PassengerVan extends Van implements PassengerVehicle {
	
	private int noOfPassengers;

	public PassengerVan(String registrationNo, String model, double height, int noOfPassengers) {
		super(registrationNo, model, height);
		this.noOfPassengers = noOfPassengers;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	@Override
	public String toString() {
		return super.toString() + ", noOfPassengers=" + noOfPassengers;
	}

	@Override
	public double getMaxPassengers() {
		return noOfPassengers;
	}
	
}
