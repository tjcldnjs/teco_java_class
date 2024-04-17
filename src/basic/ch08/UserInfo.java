package basic.ch08;

public class UserInfo {
	
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	// 생성자 오버로딩이란
	// 생성자의 개수가 여러개 있다
	
	// 기본 생성자 형태 만들어보기
//	public UserInfo() {}
	
	public UserInfo(String id, String pwd, String name) {
		this.userId = id;
		this.userPassword = pwd;
		this.userName = name;
		showInfo1();
	}
	
	public UserInfo(String id, String pwd, String name, String address) {
		userId = id;
		userPassword = pwd;
		userName = name;
		userAddress = address;
		showInfo2();
	}
	
	public UserInfo(String id, String pwd, String name, String address, String number) {
		userId = id;
		userPassword = pwd;
		userName = name;
		userAddress= address;
		phoneNumber = number;
		showInfo3();
	}

	
	public void showInfo1() {
		System.out.println("============================");
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPassword);
		System.out.println("이름 : " + userName);
	}
	public void showInfo2() {
		System.out.println("============================");
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPassword);
		System.out.println("이름 : " + userName);
		System.out.println("주소 : " + userAddress);
	}
	public void showInfo3() {
		System.out.println("============================");
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPassword);
		System.out.println("이름 : " + userName);
		System.out.println("주소 : " + userAddress);
		System.out.println("번호 : " + phoneNumber);
	}
	
	// 연습 문제 -
	// 1 - 매개변수 3개를 받는 생성자를 만들어 주세요
	
	// 2- 매개 변수 4개를 받는 생성자를 만들어 주세요

	// 3- 매개 변수 5개를 받는 생성자를 만들어 주세요
} //end of class
