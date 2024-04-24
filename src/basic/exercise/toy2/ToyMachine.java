package basic.exercise.toy2;

// 클래스 - 인형뽑기
// 상품들 존재 가능
// 사자인형, 곰인형, 에어팟

// 요구조건
// 배열을 활용해서 객체들을 담아주세요.
public class ToyMachine extends Product {

	public ToyMachine() {
		System.out.println("인형을 뽑습니다.");
	}

	public void showInfo() {
//		System.out.println(productName + "을 뽑습니다.");
		System.out.println("자판기에 남은 가격 : " + price);
	}

}