package basic.ch03;

public class Operation2 {
	
	// 코드의 시작점
	public static void main(String[] args) {

		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		// int result4 = 5 / 3;
		double result4 = 5.0 / 3;		
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		System.out.println("----------------------------");
		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요
		//변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요
		int resultA = (12 + 3) / 3;
		System.out.println("resultA : " + resultA);
		
		// 2. (25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		int resultB = 25 % 2;
		System.out.println("resultB : " + resultB);
		
		// 3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요
		double resultC = 15.0 / 4;
		
		System.out.println("resultC : " + Math.abs(resultC));
		
		System.out.println("------------------------------");
		// 도전 문제
		// 직접 산술 연산자 문제 만들기 - (2문제 생성)
		
		// 사과 33개와 토마토 22개를 7명에게 나누어준다면
		// 몇개씩 나누어주고 몇개씩 남는지 계산하기
		int apple = 33;
		int tomato = 22;
		int give_apple = apple / 7;
		int give_tomato = tomato / 7;
		System.out.println("1인당 사과 갯수 : " +give_apple);
		System.out.println("1인당 토마토 갯수 : " +give_tomato);
		
		int left_apple = apple % 7;
		int left_tomato = tomato % 7;
		System.out.println("남은 사과 갯수 : " + left_apple);
		System.out.println("남은 토마토 갯수 : " + left_tomato);
		
	} // end of main

} // end of class
