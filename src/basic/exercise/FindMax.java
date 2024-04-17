package basic.exercise;

public class FindMax {

	public static void main(String[] args) {

		findMax(5, 3);
	}
	static int findMax(int finda, int findb) {
		int result = 0;
		
		if( finda > findb ) {
			System.out.println(finda);
		} else {
			System.out.println(findb);
		}
		return result;
	}

}
