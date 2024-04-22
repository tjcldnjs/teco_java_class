package basic.ch15;

public class BookTest {

	public static void main(String[] args) {

		// 배열이란 - 연관된 데이터를 하나의 변수의 통으로 관리하고 싶다면 - 자료구조
		// 배열을 사용할때 반드시 크기가 지정되어야 한다.
		Book[] books = new Book[10]; // 배열에 메모리 공간 선언

		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		books[9] = new Book("홍길동전", "허균");

		// 배열은 반복문과 함께 많이 활용된다.
		// 배열에 크기와 요소에 크기는 꼭 동일한것은 아니다.

		// books[3] --> Book
		
		// System.out.println(books[3].getTitle());
		// System.out.println(books[3].getAuthor());
		
		// System.out.println(books[5].getTitle()); <-- null pointer 에러
		
		for(int i = 0;  i < books.length; i ++) {
			// 방어적 코드를 작성해주어야 한다.
			if(books[i] != null) {
				System.out.println(books[i].getTitle());
				System.out.println(books[i].getAuthor());
				System.out.println("=====================");
			}
		}
		
	} // end of main

} // end of class
