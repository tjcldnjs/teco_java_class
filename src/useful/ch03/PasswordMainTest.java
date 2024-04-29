package useful.ch03;

public class PasswordMainTest {

	public static void main(String[] args) {

		Password password = new Password();

		String inputPwd = null;
		inputPwd = "a";
		
		// 테스트 해보니깐 아래 코드는 실행 시점에 예외가 발생되는 코드다.
		// 해결
		// 1. 직접 예외 처리
		// 2. 던지기
		try {
			password.setPwd(inputPwd);
		} catch (PasswordException e) {
			System.out.println("우리가 정의한 password 예외가 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		password.setPwd(inputPwd);

	} // end of main

} // end of class
