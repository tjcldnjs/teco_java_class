package basic.exercise.toy2;

import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {

		Product product1 = new LionDoll();
		Product product2 = new BearDoll();
		Product product3 = new AirPot();
		
		ToyMachine toyMachine = new ToyMachine();
		toyMachine.price = 10000;
		
		LionDoll liondoll = new LionDoll();
		liondoll.showInfo();
		System.out.println("******************");
		BearDoll beardoll = new BearDoll();
		beardoll.showInfo();
		System.out.println("******************");
		AirPot airpot = new AirPot();
		airpot.showInfo();
		System.out.println("******************");

		Product[] product = new Product[3];

		product[0] = liondoll;
		product[1] = beardoll;
		product[2] = airpot;
		

		boolean flag = true;
		while (flag) {

			final String LION = "1";
			final String BEAR = "2";
			final String AIRPOT = "3";
			final String END = "0";

			Scanner sc = new Scanner(System.in);
			System.out.println("어떤 인형을 뽑으시겠습니까?");
			String selectNum = sc.nextLine();

			// 사자 1번을 누르면 사자가 뽑히고 남은 가격 출력
//			for (int i = 0; i < product.length; i++) {
				if (selectNum.equals(LION)) {
					selectLion(product);
					toyMachine.price -= product[0].price;
					toyMachine.showInfo();
//					break;
//				}
			}

		}

	}// end of main

	public static void selectLion(Product[] product) {
		System.out.println("사자인형을 뽑습니다.");
		for (int i = 0; i < product.length; i++) {
			if (product[i] != null) {
				if (i == 0) {
					product[i].showInfo();
					System.out.println("사자인형을 뽑았습니다.");
				}
			}
		}

	}

}// end of class