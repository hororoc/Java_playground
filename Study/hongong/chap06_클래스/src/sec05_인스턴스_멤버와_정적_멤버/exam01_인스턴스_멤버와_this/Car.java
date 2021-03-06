package sec05_인스턴스_멤버와_정적_멤버.exam01_인스턴스_멤버와_this;

public class Car {
	// Field
	String model;
	int speed;
	
	// Constructor
	Car(String model) {
		this.model = model;
	}
	
	// Method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 0; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속: " + this.speed + "km/h)");
		}
	}
}
