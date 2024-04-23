package starcraft.ver02;

public class SpawningPool {

	private int spawningPoolNumber;
	private int count;
	
	public SpawningPool(int number) {
		this.spawningPoolNumber = number;
		count = 0;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public int getSpawningPool() {
		return spawningPoolNumber;
	}
	
	public Zergling createZergling(String name) {
		count++;
		return new Zergling(name);
	}
}
