package useful.ch05;

public class MyThreadMainTest {

	// 기본적으로 메인 작업자 하나를 가지고 있다. 메인 쓰레드라 한다.
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		// 필요하다면 추가 작업자를 사용할 수 있다.
		MyThread th1 = new MyThread();
		th1.start(); // start 호출되면 run() 메서드가 동작되게 약속 되어 있다.
		System.out.println(th1.currentThread());
		
		System.out.println("=============================");
		MyThread th2 = new MyThread();
		
		
	} // end of main
	
} // end of class
