package basic.ch09;

public class Archer {

	String name;
	int power;
	int hp;
	
	public Archer(String myName, int myPower, int myHp) {
		name = myName;
		power = myPower;
		hp = myHp;
	}
	
	// 마법사를 공격하다
	public void attackMage(Mage mage) {
		System.out.println("마법사를 공격합니다.");
		mage.hp = mage.hp - power; 
	}
	// 전사를 공격하다
	public void attackWarrior(Warrior warrior) {
		System.out.println("전사를 공격합니다.");
		warrior.hp = warrior.hp - power;
	}
}