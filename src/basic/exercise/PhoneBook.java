package basic.exercise;

public class PhoneBook {

	// 속성
	// 기능

	private String name;
	private String number;

	public PhoneBook(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {

		this.number = number;
	}

	public void showInfo() {
		System.out.println("===연락처 정보===");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
	}
}
