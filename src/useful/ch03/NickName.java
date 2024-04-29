package useful.ch03;

public class NickName {

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws NickNameException{
		if(name == null) {
			throw new NickNameException("닉네임은 null 값일 수 없습니다.");
		}
		//       t           ||     F
		if(name.length() < 2 || name.length() > 6) {
			throw new NickNameException("닉네임은 2자 이상,6자 이하 이어야 합니다");
		}
		
		if(name.matches("[a-zA-Z]+")) {
			throw new NickNameException("비밀번호는 숫자나 특수문자를 ??");
		}
		
		this.name = name; 
	}
	
}
