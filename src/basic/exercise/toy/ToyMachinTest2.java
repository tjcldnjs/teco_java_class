package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMachinTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Lion lion = new Lion();
		Bear bear = new Bear();
		Airpods airpods = new Airpods();

		ToyMachine[] dolls = new ToyMachine[3];

		dolls[0] = lion;
		dolls[1] = bear;
		dolls[2] = airpods;

		// 도전 뽑기
		boolean flag = true;
		while (flag) {

			System.out.println("0. 사자인형 1. 곰인형 2. 에어팟");
			System.out.print("무엇을 뽑으시겠습니까? : ");
			int choice = sc.nextInt();
			dolls[choice].catchingdoll();
			if (makeNumber() == 1) {
				dolls[choice].showInfo();
				if (dolls[choice] instanceof Lion) {
					((Lion) dolls[choice]).addTiger();
				}
			}
			System.out.println("========================");
			System.out.println("또 도전하시겠습니까?");
			boolean flag2 = true;
			while (flag2) {
				System.out.print("1.네  2.아니오 : ");
				System.out.print("");
				int again = sc.nextInt();
				if (again == 2) {
					flag = false;
				}
			}
		}

		// 랜덤 뽑기
//		int a = number();
//		dolls[a].catchingdoll();
//		if (makeNumber() == 1) {
//			dolls[a].showInfo();
//			if (dolls[a] instanceof Lion) {
//				((Lion) dolls[a]).addTiger();
//			}
//		}
	}

	public static int makeNumber() {
		Random random = new Random();
		int resultNumber = random.nextInt(2);
		if (resultNumber == 1) {
			System.out.println("도전한 상품이 뽑혓습니다.");
		} else {
			System.out.println("도전한 상품이 뽑히지 않았습니다.");
		}
		return resultNumber;
	}

	public static int number() {
		Random random1 = new Random();
		int resultNumber = random1.nextInt(3);
		return resultNumber;
	}
}
