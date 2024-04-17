package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	public static void main(String[] args) {
		boolean flag = true;

		// 설계된 클래스를 가지고 본인이 의도한 대로
		// 실행에 흐름을 만들어보자

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서
		// 실행에 흐름 만들기
		// 2번을 누르면 지하철을 태우는 실행에 흐름 만들어 보자.
		Bus bus1 = new Bus(100); // 선언만 했음
		Bus bus2 = new Bus(200); // 선언만 했음
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("베인", 80_000);
		
		Scanner scan = new Scanner(System.in);

		while (flag) {

			System.out.print("버스타기 1번 지하철타기 2번 : ");
			int ride = scan.nextInt();

			if (ride == 1) {
				System.out.println("버스를 선택하였습니다");
				System.out.println("몇번 버스를 타시겠습니까?");
				System.out.println("100번 / 200번");

				s1.takeBus(bus1);
				s1.showInfo();
				System.out.println("----------------");
				bus1.showInfo();
				bus1.take(1500);
				System.out.println("----------------");
			} else if (ride == 2) {
				System.out.println("지하철을 선택하였습니다");
				s1.takeSubway(subway2);
				s1.showInfo();
				System.out.println("-----------------");
				subway1.take(ride);
				subway1.showInfo();

			}

			// end of while
		}
	} // end of mai

} // end of class
