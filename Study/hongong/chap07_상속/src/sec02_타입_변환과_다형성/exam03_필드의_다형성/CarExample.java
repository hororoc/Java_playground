package sec02_타입_변환과_다형성.exam03_필드의_다형성;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("Front-Left HankookTire로 교체");
					car.frontLeftTire = new HankookTire("Front-Left", 15);
					break;
				case 2:
					System.out.println("Front-Right KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("Front-Right", 13);
					break;
				case 3:
					System.out.println("Back-Left HankookTire로 교체");
					car.backLeftTire = new HankookTire("Back-Left", 14);
					break;
				case 4:
					System.out.println("Back-Right KumhoTire로 교체");
					car.backRightTire = new KumhoTire("Back-Right", 17);
					break;
			}
			
			System.out.println("----------------------------------");
		}
	}

}
