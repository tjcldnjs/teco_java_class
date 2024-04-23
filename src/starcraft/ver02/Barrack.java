package starcraft.ver02;

public class Barrack {

	private int barrackNumber;
	private int count;
	
	public Barrack(int number) {
		this.barrackNumber = number;
		count = 0;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public int getBarrackNumber() {
		return barrackNumber;
	}
	
	public Marine createMarine(String name) {
		count++;
		return new Marine(name);
	}
}
