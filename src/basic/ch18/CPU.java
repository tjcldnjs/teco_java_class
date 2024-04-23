package basic.ch18;

public class CPU {
	
	String name;
	int price;
	
	public CPU(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void startCPU() {
		System.out.println("CPU가 동작합니다");
	}
	
	public void stopCPU() {
		System.out.println("CPU가 멈춥니다");
	}
}
