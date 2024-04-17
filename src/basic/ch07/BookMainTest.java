package basic.ch07;

public class BookMainTest {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.bookTitle = "어린왕자";
		book1.bookPrice = 12000;
		book1.bookPage = 200;
		
		book1.library();
		book1.bookInfo();
	}

}
