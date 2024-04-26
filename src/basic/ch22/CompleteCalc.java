package basic.ch22;

import basic.ch17.Cal;

public class CompleteCalc extends Calculator {

	@Override
	public int add(int n1, int n2) {
		int addvalue = n1 + n2;
		System.out.println("두수의 합은 : " + addvalue);
		return addvalue;
	}

	@Override
	public int substract(int n1, int n2) {
		int subvalue = n1 - n2;
		System.out.println("두수의 차는 : " + subvalue);
		return subvalue;
	}

	@Override
	public int times(int n1, int n2) {
		int timesvalue = n1 * n2;
		System.out.println("두수의 곱은 : " + timesvalue);
		return timesvalue;
	}

	public void showInfo() {
		System.out.println("계산완료");
	}

	// 코드 테스트 메인 함수
	public static void main(String[] args) {
		Calc calc = new CompleteCalc(); // 업캐스팅된 상태

		calc.add(10, 10);
		calc.divide(10, 0);
		System.out.println("========================");

		((CompleteCalc) calc).showInfo();
		// 반복문, 제어문 활용한다면 instanceof 연산자를 기억하자
		if (calc instanceof CompleteCalc) {
			((CompleteCalc) calc).showInfo();
		}
	}

}
