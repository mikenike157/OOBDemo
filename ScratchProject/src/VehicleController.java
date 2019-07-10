
public class VehicleController {
	
	static int staticNum = 5;
	
	public static void accelerateVehicles(Vehicle[] vehicleList) {
		for (int i = 0; i < vehicleList.length; i++) {
			increaseHelper(vehicleList[i]);
		}
	}
	
	private static void increaseHelper(Vehicle vehicleToAccelerate) {
		vehicleToAccelerate.increaseSpeed(10.00);
	}
}
