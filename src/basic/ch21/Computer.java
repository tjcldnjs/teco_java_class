package basic.ch21;

public abstract class Computer {

	public abstract void display();

	public abstract void typing();

	public void turnOn() {
		System.out.println("켜짐");
	}

	public void turnOff() {
		System.out.println("꺼짐");
	}

}
