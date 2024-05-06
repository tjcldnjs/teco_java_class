package basic.ch23;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	public synchronized void saveMoney(int money) {

		// 현재 잔액 10만원....
		int currentMoney = getMoney();

		// 시간이 걸림
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 10만원 + 1만원
		setMoney(currentMoney + money);

		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금
	public int withDraw(int money) {

		synchronized (this) {
			// 현재 잔액 10만원....
			int currentMoney = getMoney();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 방어적 코드 작성
			// 10만원 - 5천원 --> 9만 5천원
			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println(" 계좌 잔액이 부족합니다.");
				return 0;
			}
		}

	}

}
