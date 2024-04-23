package basic.ch18;

public class Computer2Test {

	public static void main(String[] args) {

		Computer2 computer = new Computer2();

		CPU2 cpu1 = new CPU2();
		cpu1.setName("AMD");
		computer.setCPU2(cpu1);

		// 우리 컴퓨터에 장착 되어있는 CPU이름
		// 출력하고 싶다면??

		System.out.println(computer.getCPU().getName());
	}

}
