package basic.exercise;

public class CheckAdult {

	public static void main(String[] args) {

		System.out.println(checkAdult(18));
	}

	static boolean checkAdult(int check) {
		boolean result = check >= 18;
		return result;
	}
}
