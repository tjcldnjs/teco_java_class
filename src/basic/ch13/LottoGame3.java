package basic.ch13;

public class LottoGame3 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		int tempBox1 = 0;
		// 테스트 값 : 5, 1, 9, 7, 2, 3
		// 반복 횟수 - 6번
		// 첫번째 결과 : 1, 5, 7, 2, 3, 9 반복	
		// 두번째 결과 : 1, 5, 2, 3, 7, 9 반복
		// 세번째 결과 : 1, 2, 3, 5, 7, 9 반복
		// 네번째 부터 6개 if문 모두 false
		// 최종 결과 : 1, 2, 3, 5, 7, 9
		for (int pass = 1; pass <= 6; pass++) {
			//		5			1
			//		1			5
			//		1			5
			if (gameNumber1 > gameNumber2) {
				// 5
				tempBox1 = gameNumber1;
				// 1
				gameNumber1 = gameNumber2;
				// 5
				gameNumber2 = tempBox1;
			}
			// 1, 5, 9, 7, 2, 3
			// 1, 5, 7, 2, 3, 9
			// 1, 5, 2, 3, 7, 9
			
			//		5			9
			//		5			7
			//		5			2
			if (gameNumber2 > gameNumber3) {
				// 5
				tempBox1 = gameNumber2;
				// 2
				gameNumber2 = gameNumber3;
				// 5
				gameNumber3 = tempBox1;
			}
			// 1, 5, 9, 7, 2, 3
			// 1, 5, 7, 2, 3, 9
			// 1, 2, 5, 3, 7, 9

			//		9			7
			//		7			2
			//		5			3
			if (gameNumber3 > gameNumber4) {
				// 9
				// 7
				// 5
				tempBox1 = gameNumber3;
				// 7
				// 2
				// 3
				gameNumber3 = gameNumber4;
				// 9
				// 7
				// 5
				gameNumber4 = tempBox1;
			}
			// 1, 5, 7, 9, 2, 3
			// 1, 5, 2, 7, 3, 9
			// 1, 2, 3, 5, 7, 9

			//		9			2
			//		7			3
			// 세번째 반복문 작동안함
			if (gameNumber4 > gameNumber5) {
				// 9
				// 7
				tempBox1 = gameNumber4;
				// 2
				// 3
				gameNumber4 = gameNumber5;
				// 9
				// 7
				gameNumber5 = tempBox1;
			}
			// 1, 5, 7, 2, 9, 3
			// 1, 5, 2, 3, 7, 9 
			// 1, 2, 3, 5, 7, 9
			
			//		9			3
			if (gameNumber5 > gameNumber6) {
				// 9
				tempBox1 = gameNumber5;
				// 3
				gameNumber5 = gameNumber6;
				// 9
				gameNumber6 = tempBox1;
			}
			// 첫번째 결과 : 1, 5, 7, 2, 3, 9 반복	
			// 두번째 결과 : 1, 5, 2, 3, 7, 9 반복
			// 세번째 결과 : 1, 2, 3, 5, 7, 9 반복
		} // end of for

		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);

	} // end of main
}
