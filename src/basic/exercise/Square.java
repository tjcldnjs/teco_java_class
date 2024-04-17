package basic.exercise;

public class Square {

	public static void main(String[] args) {

		System.out.println("입력된 수의 제곱 : " + square(4));
	}

	static int square(int square) {
		int result = square * square;
		return result;
	}
}
