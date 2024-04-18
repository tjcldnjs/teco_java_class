package basic.ch09;

import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {

		Archer archer1 = new Archer("궁수", 15, 120);
		Warrior warrior1 = new Warrior("전사", 10, 150);
		Mage mage1 = new Mage("마법사", 20, 100);

		Scanner sc = new Scanner(System.in);
		System.out.println("캐릭터를 선택해주세요 1.아처 2.전사 3.마법사");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("아처가 공격할 대상을 고르세요 1.전사 2.마법사");
			int achoice = sc.nextInt();
			if (achoice == 1) {
				System.out.println("전사를 몇번 공격 하시겠습니까?");
				int attack = sc.nextInt();
				for (int i = 0; i < attack; i++) {
					archer1.attackWarrior(warrior1);
				}
				System.out.println("전사의 HP : " + warrior1.hp);
			} else if (achoice == 2) {
				System.out.println("마법사를 몇번 공격하시겠습니까?");
				int attack = sc.nextInt();
				for (int i = 0; i < attack; i++) {
					archer1.attackMage(mage1);
				}
				System.out.println("마법사의 HP : " + mage1.hp);
			}
		} else if (choice == 2) {
			System.out.println("전사가 공격할 대상을 고르세요 1.궁수 2.마법사");
			int achoice = sc.nextInt();
			if (achoice == 1) {
				System.out.println("궁수를 몇번 공격 하시겠습니까?");
				int attack = sc.nextInt();
				for (int i = 0; i < attack; i++) {
					warrior1.attackArcher(archer1);
				}
				System.out.println("궁수의 HP : " + archer1.hp);
			} else if (achoice == 2) {
				System.out.println("마법사를 몇번 공격하시겠습니까?");
				int attack = sc.nextInt();
				for (int i = 0; i < attack; i++) {
					warrior1.attackMage(mage1);
				}
				System.out.println("마법사의 HP : " + mage1.hp);
			}
		} else if (choice == 3) {
			System.out.println("마법사가 공격할 대상을 고르세요 1.궁수 2.마법사");
			int achoice = sc.nextInt();
			if (achoice == 1) {
				System.out.println("궁수를 몇번 공격 하시겠습니까?");
				int attack = sc.nextInt();
				for (int i = 0; i < attack; i++) {
					mage1.attackArcher(archer1);
				}
				System.out.println("궁수의 HP : " + archer1.hp);
			} else if (achoice == 2) {
				System.out.println("전사를 몇번 공격하시겠습니까?");
				int attack = sc.nextInt();
				for (int i = 0; i < attack; i++) {
					mage1.attackWarrior(warrior1);
				}
				System.out.println("전사의 HP : " + mage1.hp);
			}
		}
	}

}
