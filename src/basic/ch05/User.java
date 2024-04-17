package basic.ch05;

public class User {

	public static void main(String[] args) {

		Order user1 = new Order();
		
		user1.id = "tjcldnjs";
		user1.password = 12345;
		user1.name = "서치원";
		user1.age = 25;
		
		
		System.out.println(user1.id);
		System.out.println(user1.password);
		System.out.println(user1.name);
		System.out.println(user1.age);
		
		System.out.println("============");
		
		Order user2 = new Order();
		
		user2.id = "ghdrlfehd";
		user2.password = 12345;
		user2.name = "홍길동";
		user2.age = 22;
		
		System.out.println(user2.id);
		System.out.println(user2.password);
		System.out.println(user2.name);
		System.out.println(user2.age);

	}

}
