package useful.ch03;

public class NickNameException extends RuntimeException{
	
	public NickNameException(String nick) {
		super(nick);
	}

}
