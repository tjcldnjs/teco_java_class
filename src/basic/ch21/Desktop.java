package basic.ch21;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("모니터로 화면출력");
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타자입력");
	}
}
