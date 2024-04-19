package basic.ch12;

public class Account {
	
	private String name;
	private static int number;
	
	public Account(String name) {
		this.name = name;
		number = 11111111;
	}
	
	public void accountNumber() {
		System.out.println(name + "님의 계좌번호는 "+ number + " 입니다. ");
		number = number + 11111111;
	}

}
