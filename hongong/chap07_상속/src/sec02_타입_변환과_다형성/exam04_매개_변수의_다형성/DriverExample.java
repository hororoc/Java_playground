package sec02_타입_변환과_다형성.exam04_매개_변수의_다형성;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(bus);
		driver.drive(texi);
	}
}
