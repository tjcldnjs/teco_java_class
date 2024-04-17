package basic.ch07;

public class Book {
	
	int bookPrice;
	int bookPage;
	String bookTitle;
	
	public void library() {
		System.out.println(bookTitle + "책은 xx서점에 있습니다");
	}
	
	public void bookInfo() {
		System.out.println("====책의 정보====");
		System.out.println("책의 이름은 : " + bookTitle);
		System.out.println("책의 가격 : " + bookPrice);
		System.out.println("책의 페이지수 : " +bookPage);
	}

}
