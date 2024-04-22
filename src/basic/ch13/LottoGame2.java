package basic.ch13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

		// 전체 1~6까지 나온 결과 값을 오름 차순으로 정렬
		// 단, 중복값 제외

		// 수식을 작성해주세요
		// 만약 if --> 반복문 사용금지 if문 6개로

			
		int tempBox1 = 0;
		// 5, 1, 9, 7, 2, 3

		// 5 1
		if (gameNumber1 > gameNumber2) {
			// 5
			tempBox1 = gameNumber1;
			// 1
			gameNumber1 = gameNumber2;
			// 5
			gameNumber2 = tempBox1;
		}
		// 1, 5, 9, 7, 2, 3

		// 5 9
		if (gameNumber2 > gameNumber3) {
			tempBox1 = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = tempBox1;
		}
		// 1, 5, 9, 7, 2, 3

		// 9 7
		if (gameNumber3 > gameNumber4) {
			// 9
			tempBox1 = gameNumber3;
			// 7
			gameNumber3 = gameNumber4;
			// 9
			gameNumber4 = tempBox1;
		}
		// 1, 5, 7, 9, 2, 3

		// 9 2
		if (gameNumber4 > gameNumber5) {
			// 9
			tempBox1 = gameNumber4;
			// 2
			gameNumber4 = gameNumber5;
			// 9
			gameNumber5 = tempBox1;
		}
		// 1, 5, 7, 2, 9, 3

		// 9 3
		if (gameNumber5 > gameNumber6) {
			// 9
			tempBox1 = gameNumber5;
			// 3
			gameNumber5 = gameNumber6;
			// 9
			gameNumber6 = tempBox1;
		}
		// 1, 5, 7, 2, 3, 9

		
		System.out.println();
		System.out.println("============");
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);

	} // end of main
}
