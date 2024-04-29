package useful.ch03;

import java.util.Scanner;

public class NickNameTest {

	public static void main(String[] args) {

		NickName nickName = new NickName();
		
		String inputnickname = null;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("닉네임을 입력해주세요");
//		inputnickname = sc.nextLine();
		inputnickname = "a";
		
		
		try {
			nickName.setName(inputnickname);
		} catch (NickNameException e) {
			System.out.println("우리가 정의한 예외 발생");
		} catch (Exception e) {
			System.out.println(" 예외 발생 : " + e.getMessage());
		}
		
		nickName.setName(inputnickname);
		
	} // end of main

} // end of class
