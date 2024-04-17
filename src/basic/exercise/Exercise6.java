package basic.exercise;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Greet
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		sayHello(name);
		System.out.println("=============================");

		// Square
		System.out.print("숫자를 입력해주세요 : ");
		int squareNumber = sc.nextInt();
		System.out.println("입력된 수의 제곱 : " + square(squareNumber));
		System.out.println("=============================");

		// CheckAdult
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.println("성인여부 : " + checkAdult(age));
		System.out.println("=============================");

		// SignOfNumber
		System.out.print("숫자를 입력해주세요 : ");
		int number = sc.nextInt();
		System.out.println(signOfNumber(number)) ;
		System.out.println("=============================");

		// FindMax
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int number1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int number2 = sc.nextInt();
		System.out.println("두 수중 큰수는 : " + findMax(number1, number2));
		System.out.println("=============================");

	}

	// Greet
	static void sayHello(String greet) {
		System.out.println("안녕하세요, [" + greet + "]님!");
	}
 
	// Square
	static int square(int square) {
		int result1 = square * square;
		return result1;
	}

	// CheckAult
	static boolean checkAdult(int check) {
		boolean result2 = check >= 18;
		return result2;
	}

	// SignOfNumber
	static String signOfNumber(int sign) {
		String result3 = "";
		if (sign > 0) {
			result3 = "positive";
		} else if (sign < 0) {
			result3 = "negative";
		} else {
			result3 = "zero";
		}
		return result3;
		
	}

	// FindMax
	static int findMax(int finda, int findb) {
		int result4 = 0;
		result4 = finda > findb ? finda : findb;
		return result4;
	}
}
