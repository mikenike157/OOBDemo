
public class Bicycle extends Vehicle implements VehicleInterface {
	boolean isMountainBike;
	
	public Bicycle(boolean isMountainBike) {
		super(2, 0, "Blue");
		this.isMountainBike = isMountainBike;
	}

	public double calculatePrice() {
		
		if (isMountainBike) {
			return 400.00;
		}
		else {
			return 300.00;
		}
	}
}
