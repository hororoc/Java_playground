package sec02_타입_변환과_다형성.exam01_필드의_다형성;

public class KumhoTire implements Tire {
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}
