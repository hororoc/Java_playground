package sec02_타입_변환과_다형성.exam04_객체_타입_확인;

import sec02_타입_변환과_다형성.exam02_매개_변수의_다형성.Taxi;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
