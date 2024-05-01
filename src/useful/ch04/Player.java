package useful.ch04;

public class Player {

	private static Player player;
	private String name;

	private void Player(String name) {
		this.name = name;
	}

	public static Player getInstance() {
		if (player == null) {
			player = new Player();
		}
		return player;
	}

	// 메인
	public static void main(String[] args) {
		
		Player player = Player.getInstance();
		player.name = "전사";
		System.out.println(player.name);
		
		Player player2 = Player.getInstance();
		player2.name = "마법사";
		System.out.println(player2.name);
		
	} // end of main
}
