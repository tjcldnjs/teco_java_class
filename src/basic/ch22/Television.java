package basic.ch22;

public class Television extends HomeAppliances implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}

}
