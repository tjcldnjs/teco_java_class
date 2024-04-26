package basic.ch22;

public abstract class Calculator implements Calc {

	// 예상 테스트 값 n1 - 10, n2 - 0
	@Override
	public double divide(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("어떤 수 를 0 으로 나눌수 없습니다.");
			return 0.0;
		}
		int dividevalue = n1 / n2;
		System.out.println("두수를 나눈 값은 : " + dividevalue);
		return dividevalue;
	}

}
