package basic.ch09;

public class Warrior {
	
	String name;
	int power;
	int hp;
	
	public Warrior(String myName, int myPower, int myHp) {
		name = myName;
		power = myPower;
		hp = myHp;
	}
	// 궁수를 공격하다
	public void attackArcher(Archer archer) {
		System.out.println("궁수를 공격합니다.");
		archer.hp = archer.hp - power; 
	}
	// 마법사를 공격하다
	public void attackMage(Mage mage) {
		System.out.println("전사를 공격합니다.");
		mage.hp = mage.hp - power;
	}
}

