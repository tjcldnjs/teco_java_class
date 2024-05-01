package basic.ch23;

public class Mother extends Thread {

	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 5천원 출금 요철 - 다른 작업자
		account.withDraw(5_000);
	}

}
