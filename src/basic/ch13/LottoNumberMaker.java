package basic.ch13;

import java.lang.module.ModuleDescriptor.Version;
import java.util.Arrays;
// 가지고 오다, 수입하다
import java.util.Random;

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0";

	// main 함수
	public static void main(String[] args) {

//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
		
		int[] lottos = makeNumbers();
		Arrays.sort(lottos);
		for(int i = 0; i < lottos.length; i++) {
			System.out.println(lottos[i] + "\t");
		}

	} // end of main

	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !!
		// System.out.println("ver : " + version);

		// 자바 도구 -- 표준 API
		// 난수 발생기 -> 랜덤적인 값을 생성
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1; // 0 ~~~~~~~~~~~~44
		return resultNumber;
	}

	// 인스턴스에 속하지 않는 함수 만들기
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		// 중복된 랜덤 1 ~ 45 숫자가 나온다면
		// 다시 반복문을 돌려서 중복 안되게 만들어야 한다.
		// 0 --> 33
		// i --> 33
		for (int i = 0; i < 6; i++) {
			numbers[i] = random.nextInt(45) + 1;
			// j = 0, 0 < 0 <-- 동작 안함
			// j = 0, 0 < 1 <-- 한번 동작
			for (int j = 0; j < i; j++) {
				// j --> 0, i --> 1
				if (numbers[j] == numbers[i]) {
					i--;
					break;
				}
			}

		}

		return numbers;
	}

}
