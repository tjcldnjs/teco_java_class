package starcraft.ver02;

public class StarCraftTest1 {

	// 메인함수
	public static void main(String[] args) {

		// 질럿2
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		// 마린2
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		// 저글링2
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		
		for(int i = 0; i < 15; i++) {
			zealot1.attack(marine2);
		}
		marine2.showInfo();
		
	} // end of main

} // end of class
