package basic.ch21;

public class ComputerTest {

	public static void main(String[] args) {

		Desktop desktop = new Desktop();
		MyNoteBook myNoteBook = new MyNoteBook();

		desktop.turnOn();
		desktop.display();
		desktop.typing();
		desktop.turnOff();
		System.out.println("==========");
		myNoteBook.turnOn();
		myNoteBook.display();
		myNoteBook.typing();
		myNoteBook.turnOff();

	}

}
