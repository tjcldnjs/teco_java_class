package basic.exercise;

public class WhileExercise1 {

	// 코드의 시작점
	public static void main(String[] args) {

		int start = 1;
		int end = 10;
		int i = 0;

		while (start <= end) {
			i = i + start;
			start++;
		}
		System.out.println("1부터 10까지 덧셈의 값 : " + i);

	} // end of main

} // end of class
