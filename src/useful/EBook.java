package useful;

public class EBook {

	private int bookTypeId;
	private String title;
	private String author;

	public EBook(int bookTyId, String title, String author) {
		this.bookTypeId = bookTyId;
		this.title = title;
		this.author = author;
	}

	// Object 클래스에 있는 메서드를 재정의
	@Override
	public String toString() {
		return bookTypeId + ", " + title + ", " + author;
	}

	// Object 클래스에 있는 메서드를 재정의
//	@Override
//	public boolean equals(Object obj) {
//		// 1. EBook 클래스의 인스턴스가 맞다면
//		if (obj instanceof EBook) {
//			// 2. Ebook 의 제목과 저자의 이름이 같다면 true 반환시켜라
//			if (this.title.equals(((EBook)obj).title)) {
//				return true;
//			} else {
//				return false;
//			}
//		}
//		return false;
//	}
	
	@Override
	public boolean equals(Object obj) {
		// 1. EBook 클래스의 인스턴스가 맞다면 
		if(obj instanceof EBook) {
			EBook tBook = (EBook)obj;
			// 2. EBook 의 제목과 저자의 이름이 같다면 true 반환 시켜라
			if(this.title.equals(tBook.title)) {
				return true; 
			} else {
				return false; 
			}
		}
		return false;
	}
	
	// 메인 시작
	public static void main(String[] args) {
		
		Book book10 = new Book("11", "aa");
		
		EBook ebook1 = new EBook(1, "홍길동전", "허균");
		EBook ebook2 = new EBook(1, "홍길동전", "허균");

		System.out.println("=======================================================");

		boolean result1 = ebook1 == ebook2;
		System.out.println("result1 : " + result1);

		boolean result2 = ebook1.equals(ebook2);
		System.out.println("result2 : " + result2);

	}
}
