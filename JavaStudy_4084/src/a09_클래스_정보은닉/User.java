package a09_클래스_정보은닉;

/*
 * username(아이디)
 * password(비밀번호)
 * name(이름)
 * email(이메일)
 * 
 */


// 정보들만 담는 객체를 Bean이라고 부름, 또는 Entity객체라고 부른다. -- 정보들을 담는 객체

public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User() {
	}
	
	public User(String username, String password, String name, String email) { 
		// 기본 생성자를 안만들어 주면 생략된 생성자가 이 생성자로 덮힘
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
