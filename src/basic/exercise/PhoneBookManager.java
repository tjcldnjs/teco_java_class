package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 스캐너 사용
		// 배열 선언 100개
		// while()

		Scanner sc = new Scanner(System.in);
		PhoneBook[] numbers = new PhoneBook[100];

		numbers[0] = new PhoneBook("김가가", "010-111-111");
		numbers[1] = new PhoneBook("김나나", "010-222-222");
		numbers[2] = new PhoneBook("김다다", "010-333-333");
		numbers[3] = new PhoneBook("김라라", "010-444-444");
		numbers[4] = new PhoneBook("김마마", "010-555-555");
		LAST_INDEX_NUMBER = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_NUMBER = "3";
		final String RENUMBER = "4";
		final String DELETE = "5";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("== 메뉴 선택 ==");
			System.out.println("1.저장하기 2.전체조회 3.선택조회 4.수정하기 5.삭제하기 0.종료");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(" [ 저장 하기 ] ");
				save(sc, numbers);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(" [ 전체 조회 ] ");
				readAll(numbers);

			} else if (selectedNumber.equals(SEARCH_BY_NUMBER)) {
				System.out.println(" [ 선택 조회 ] ");
				readByNumber(sc, numbers);
			} else if (selectedNumber.equals(RENUMBER)) {
				System.out.println(" [ 수정 하기 ] ");
				reNumber(sc, numbers);
			} else if (selectedNumber.equals(DELETE)) {
				System.out.println(" [ 삭제 하기 ] ");
				delete(sc, numbers);
			} else if (selectedNumber.equals(END)) {
				System.out.println(" [ 종료 ] ");
				flag = false;

			} else {
				System.out.println("잘못된 선택입니다");

			}
		}

//		- **저장**: 사용자가 이름과 전화번호를 입력하여 전화번호부에 저장할 수 있어야 합니다.
//		- **조회**: 전체 연락처 목록을 조회하거나, 특정 이름으로 연락처를 검색하여 조회할 수 있어야 합니다.
//		- **수정**: 기존 연락처의 전화번호를 변경할 수 있어야 합니다.
//		- **삭제**: 전화번호부에서 연락처를 삭제할 수 있어야 합니다.
//		- **선택 조회** : 이름을 입력하면 해당 전화번호가 출력 되어야 합니다.
//		- **Scanner 활용, 입력 받는 데이터 타입은 전부 String 으로 처리**
//		- **전화번호 저장은 100까지 한정.**

	} // end of main

	// 저장하기
	public static void save(Scanner sc, PhoneBook[] numbers) {
		System.out.println(">>> 저장 하기 <<<");
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("번호를 입력하세요");
		String number = sc.nextLine();
		PhoneBook phone = new PhoneBook(name, number);

		if (LAST_INDEX_NUMBER >= numbers.length) {
			System.out.println("더이상 저장할 공간이 없습니다.");
			return;
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == null) {
				numbers[i] = phone;
				LAST_INDEX_NUMBER++;
				break;
			}
		}
		System.out.println("번호가 저장 되었습니다.");
	}

	// 전체조회
	public static void readAll(PhoneBook[] numbers) {
		System.out.println(">> 전체 조회 하기 <<");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null) {
				System.out.println("이름 : " + numbers[i].getName() + " , " + "전화번호 : " + numbers[i].getNumber());
			}
		}

	}

	// 선택조회
	public static void readByNumber(Scanner sc, PhoneBook[] numbers) {
		System.out.println(">> 선택 조회 하기 <<");
//		System.out.println("1. 이름으로 조회하기 2. 전화번호로 조회하기");
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null) {
				if (numbers[i].getName().equals(name)) {
					System.out.println("이름 : " + numbers[i].getName() + "," + "전화번호 : " + numbers[i].getNumber());
					isFind = true;
					break;
				}
			}
		}
		if (isFind == false) {
			System.out.println("해당되는 이름이 존재 하지않습니다.");
		}
	}

	// 수정하기
	public static void reNumber(Scanner sc, PhoneBook[] numbers) {
		System.out.println(">> 수정하기 <<");
		System.out.println("수정하고싶은 연락처 입력하기");
		String reName = sc.nextLine();
		boolean reFind = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null) {
				if (numbers[i].getName().equals(reName)) {
					System.out.println("수정할 이름으로 입력하기");
					String reName1 = sc.nextLine();
					numbers[i].setName(reName1);
					System.out.println("수정할 번호로 입력하기");
					String reNumber = sc.nextLine();
					numbers[i].setNumber(reNumber);
					System.out.println("수정 되었습니다.");
					reFind = true;
					break;
				}
			}
		}
		if (reFind == false) {
			System.out.println("해당되는 이름이 존재 하지않습니다.");

		}
	}

	// 삭제하기
	public static void delete(Scanner sc, PhoneBook[] numbers) {
		System.out.println(">> 삭제하기 <<");
		System.out.println("삭제할 이름을 입력해주세요");
		String deleteName = sc.nextLine();
		boolean findDelete = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null) {
				if (numbers[i].getName().equals(deleteName)) {
					numbers[i] = null;
					System.out.println("[ 삭제 되었습니다 ]");
					findDelete = true;
					break;
				}
			}
		}
		if (findDelete == false) {
			System.out.println("해당되는 이름이 존재 하지 않습니다.");
		}
	}

} // end of class
