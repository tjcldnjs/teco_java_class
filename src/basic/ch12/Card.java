package basic.ch12;

public class Card {

	// 멤버변수
	private String cardName;
	private int number;
	static int cardSerialNumber = 1111;

	// 생성자
	public Card(String name) {
		this.cardName = name;
		this.number = cardSerialNumber++;
	}
	// 멤버 함수

	// get set 작성

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static int getCardSerialNumber() {
		return cardSerialNumber;
	}

	public static void setCardSerialNumber(int cardSerialNumber) {
		Card.cardSerialNumber = cardSerialNumber;
	}

	// 코드 테스트
	public static void main(String[] args) {

		Card card1 = new Card("우리은행");
		System.out.println(card1.getCardSerialNumber());

		Card card2 = new Card("dd은행");
		System.out.println(card2.getCardSerialNumber());
	}

}
