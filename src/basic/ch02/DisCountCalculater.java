package basic.ch02;

public class DisCountCalculater {

	// 메인 함수 - 코드의 시작점
	public static void main(String[] args) {
		
		// 상수 선언 - 원가, 할인율
		final double PRICE = 59.99;
		final double DISCOUNT = 0.3;
		
		// 할인된 가격 = 원가 × (1 − 할인율)
		// 할인된 가격 계산 하기 (비지니스 로직 )
		double discountedprice = PRICE * (1 - DISCOUNT);
		
		// 최종된 가격을 정수형으로 형 변환 처리
		int value = (int)discountedprice;
		
		//결과 출력
		System.out.println("최종 가격 : "+ value);
		System.out.println("최종 가격(소수점) : "+ discountedprice);
		
	} // end of main

} // end of class
