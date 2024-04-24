package basic.exercise.toy;

import java.util.Random;

// 클래스 - 인형뽑기
// 상품들이 존재가능
// 사자 인형, 곰인형, 에어팟
// 요구조건
// 배열을 활용해서 객체들을 담아 주세요
public class ToyMachine {

	String name;
	int price;

	public void catchingdoll() {
		System.out.println(name + "뽑기 도전 !");
		System.out.println();
	}

	public void showInfo() {
		System.out.println("=======================");
		System.out.println("상품 이름 : " + name);
		System.out.println("가격 : " + price + "원 짜리");
	}

	public static int makeNumber() {
		Random random = new Random();
		int resultNumber = random.nextInt(2);
		if (resultNumber == 1) {
			System.out.println("도전한 상품이 뽑혓습니다.");
		} else {
			System.out.println("도전한 상품이 뽑히지 않았습니다.");
		}
		return resultNumber;
	}

	public static int number() {
		Random random1 = new Random();
		int resultNumber = random1.nextInt(3);
		return resultNumber;
	}

}
