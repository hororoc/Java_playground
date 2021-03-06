package sec02_타입_변환과_다형성.exam04_객체_타입_확인;

import sec02_타입_변환과_다형성.exam02_매개_변수의_다형성.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
