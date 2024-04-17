package basic.ch10;

public class BankTest {

	// 코드의 시작점
	public static void main(String[] args) {

		Bank bank1 = new Bank();

		// bank1.name = "우리은행";
		bank1.deposit(10_000); // deposit 리턴타입 --> void --> 값을 받을수 없음 why?

		int getMoney = bank1.withdraw(5_000); // withdraw 리턴 타입 --> int --> 값을 받을 수 있음
		// int getMoney = bank1.withdraw(5_000); // withdraw 리턴 타입 --> int --> 값을 받을 수
		// 있음
		System.out.println(">>>>>>>>>>>> 출금 >>>>>>>>>>");
		System.out.println("금액 : " + getMoney);

		// 신입 개발자가 실수로 멤버 변수에 접근해서 수정...
		// Bank에 돈을 넣어야 --> deposit() 기능으로 만들어져 있다.
		// bank1.balance = 100_000; <-- private 변경 후 정보 은닉 이 되었다.
		// 10만 5천원이 있어야 정상
		// 의도 하지 않은 실수를 발생 시킬 수 있다.
		bank1.deposit(100_000);

		// 실행에 흐름을 만들 예정
		// 현재 은행에 전체 잔고가 200_000 이하라면 본점에 금액 요청사황...
		System.out.println(bank1.getBalance());
		int money = bank1.getBalance();
		if(money <= 200_000) {
			System.out.println("본점에 금액을 요청해");
		}
		
		
		System.out.println("========================");
		// setter 메서드 활용하기
		bank1.setName("그린은행");
		System.out.println(bank1.getName());
		
		bank1.setBalance(-1000000);
		System.out.println(bank1.getBalance());
		

	} // end of main

} // end of class
