package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {

		
		Hero hero = new Hero("영웅", 100);
		
		Warrior warrior1 = new Warrior("전사", 100);
		Archer archer1 = new Archer("궁수", 100);
		Wizard wizard1 = new Wizard("마법사", 100);
		
		warrior1.attack();
		
	}

}
