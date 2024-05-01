package useful.ch03;

import java.util.Iterator;

public class ArrayExceptionHandling {

	// 메인 쓰래드
	public static void main(String[] args) {

		// 런타임 에러
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			// 예외가 발생할 수 있는 코드를 넣어서 수행 시킨다.
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에 크기를 인덱스가 벗어 났습니다.");
//			 System.out.println(e.getMessage());
		}
		
		System.out.println("비정상 종료 되지 않았어요!");

	} // end of main

} // end of class
