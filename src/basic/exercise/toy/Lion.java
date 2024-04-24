package basic.exercise.toy;

public class Lion extends ToyMachine{
	
	String add;
	
	public Lion() {
		name = "사자인형";
		price = 2000;
		add = "호랑이인형";
	}
	
	public void addTiger() {
		System.out.println("=== 추가상품 ===");
		System.out.println(this.add +"를 추가로 줍니다.");
		
	}
	

}
