package useful;

import basic.ch19.Student;

public class EBookMain {
	
	public static void main(String[] args) {
		
		Student student = new Student("1", 11);
		
		EBook ebook1 = new EBook(1, "홍길동전", "허균");
		EBook ebook2 = new EBook(1, "홍길동전", "허균");
		
		// 논리적으로 같은 객체 인지 아닌지 판별하는 기능 
		// ---> 제목, 작가 --> 물리적으로 다른 객체라도 이 메서드 안에서는 같은 객체라고 판별(true, false) 
		//ebook1.equals(ebook2);
		
		ebook1.equals(student);
	}

}
