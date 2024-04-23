package basic.ch18;

public class Computer {

	String name;
	int price;
	CPU cpu;

	public Computer() {
		cpu = new CPU("씨피유", 11111);
	}

	public void startCom() {
		cpu.startCPU();
		System.out.println("컴퓨터가 켜졌습니다");
	}

	public void stopCom() {
		cpu.stopCPU();
		System.out.println("컴퓨터가 꺼졌습니다");
	}

	// 메인함수
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.startCom();
		com1.stopCom();
		System.out.println("=========");
		
		System.out.println(com1.cpu.name);
		
	} // end of main
}
