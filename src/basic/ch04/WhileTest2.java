package basic.ch04;

public class WhileTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 1부터 5까지 덧셈 연산을 하라
		// 1 + 2 + 3 + 4 + 5

		int start = 1; // 시작값은 1
		int end = 5; // 5번
		int sum = 0;

		// 첫번째 반복
		// 6번째
		// 6 <=5 --> 거짓 --> 반복문 종료

		// 특정 조건식을 만들어 반복문을 멈추게 해야 한다.
		// 만약 start 값이 10일 때 종료 하라
		boolean flag = true;
		while (flag) {

			if (start == 10) {
				// 실행에 제어권을 반납한다.
				flag = false; // 여기서 멈추는게아니라 밑으로 넘어감
				// return;  // 여기서 멈춤
			}
			// 1: 0 = 0 + 1 ==> sum : 1
			// 2: 3 = 1 + 2 ==> sum : 3
			// 3: 6 = 3 + 3 ==> sum : 6
			// 4: 10 = 6 + 4 ==> sum : 10
			// 5: 15 = 10 + 5 ==> sum : 15
			sum = sum + start;
			System.out.println("sum(" + start + ") : " + sum);

			start++; // 1씩 증가
		}

	} // end of main

} // end of class
