package basic.exercise;

public class signOfNumber {

	public static void main(String[] args) {
		signOfNumber(1);

	}

	static int signOfNumber(int sign) {
		int result =0;
		if(sign > 0) {
			System.out.println("positive");
		} else if( sign < 0 ) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
		return result;
	}
}
