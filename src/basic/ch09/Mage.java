package basic.ch09;

public class Mage {
	
	String name;
	int power;
	int hp;
	
	public Mage(String myName, int myPower, int myHp) {
		name = myName;
		power = myPower;
		hp = myHp;
	}
	// 궁수를 공격하다
	public void attackArcher(Archer archer) {
		System.out.println("궁수를 공격합니다.");
		archer.hp = archer.hp - power; 
	}
	// 전사를 공격하다
	public void attackWarrior(Warrior warrior) {
		System.out.println("전사를 공격합니다.");
		warrior.hp = warrior.hp - power;
	}
}
