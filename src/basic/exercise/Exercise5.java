package basic.exercise;

import java.util.Iterator;

public class Exercise5 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 1단계 - 세로 반복에 횟수 (for - 횟수)

		// * - 1
		// ** - 2
		// *** - 3
		// **** - 4
		// ***** - 5

		for (int i = 0; i < 5; i++) { // 5번

		}

		// 2단계
		System.out.print("*");
		System.out.println();
		System.out.print("**");
		System.out.println();
		System.out.print("***");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.print("*****");
		System.out.println();

		System.out.println("=============================");
		for (int j = 0; j < 1; j++) { // 1 번 동작
			System.out.print("*"); // print() 이다
		}
		System.out.println();

		for (int j = 0; j < 2; j++) { // 2 번 동작
			System.out.print("*"); // print() 이다
		}
		System.out.println();

		for (int j = 0; j < 3; j++) { // 3 번 동작
			System.out.print("*"); // print() 이다
		}

		System.out.println();
		for (int j = 0; j < 4; j++) { // 4 번 동작
			System.out.print("*"); // print() 이다
		}

		System.out.println();
		for (int j = 0; j < 5; j++) { // 5 번 동작
			System.out.print("*"); // print() 이다
		}
		System.out.println();

		System.out.println("=============================");
		// 3단계

		// outer for
		for (int i = 0; i < 5; i++) { // 5번

			// inner for
			// 첫번째 동작 j = 0, j < 0 -----> 한번 동작 -> * -> 줄바꿈
			// 두번째 동작 j = 0, j < 1 -----> 0,1 for 두번 동작 -> ** -> 줄바꿈
			// 세번째 동작 j = 0, j < 2 -----> 0,1,2 for 세번 동작 -> *** -> 줄바꿈
			// ...
			// ...
			for (int j = 0; j <= i; j++) { // 5 번 동작
				System.out.print("*"); // print() 이다
			}
			System.out.println();
		}

	} // end of main

} // end of class
