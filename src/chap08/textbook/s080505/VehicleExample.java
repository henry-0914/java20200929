package chap08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); : 체크페어가 없음
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
		System.out.println("===========================");
		
		Driver driver = new Driver();
		driver.driver(new Bus());
		driver.driver(new Taxi());
	}
}
