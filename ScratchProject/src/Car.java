
public class Car extends Vehicle implements VehicleInterface {
	int numDoors;
	String engineType;
	public Car() {
		super(4, 0, "Black");
		numDoors = 4;
		engineType = "V8";
	}
	
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public double calculatePrice() {
		double price = (100 * numDoors);
		
		return price;
		
	}
}
