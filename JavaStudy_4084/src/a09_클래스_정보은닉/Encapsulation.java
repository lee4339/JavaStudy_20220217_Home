package a09_클래스_정보은닉;

public class Encapsulation { // 캡슐화
	private String username; // 아이디
	private String password; // 비밀번호
	private String provider; // 서비스회사 google, kakako, naver ...
	
	
	public Encapsulation(String password, String provider) {
		super();
		this.password = password;
		this.provider = provider;
	}
	
	public void setUsername(String username) {
		if(provider.equals("kakao")) { // equals는 문자열을 비교할때 같으면 true(provider과 "kakao"를 비교)
			this.username = username + "@kakao.com";
		}else if(provider.equals("google")) {
			this.username = username + "@google.com";
		}else if(provider.equals("naver")) {
			this.username = username + "@naver.com";
		}else {
			this.username = username;
		}
	}
	
	public String getUsername() {
		return username;
	}
	
	// getter
	// public 
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);
	}
	

}
