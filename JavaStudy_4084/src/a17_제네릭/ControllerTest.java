package a17_제네릭;

import a13_인터페이스2.model.User;
import a17_제네릭.User.CompanyUser;
import a17_제네릭.User.PersonalUser;

public class ControllerTest {
	
	public CMRespDto<? extends User> getProfile(String username){ // ? extends --> 제한
		PersonalUser personalUser = new PersonalUser("aaaa", "1234", "이건호", "aaaa@gmail.com", "a20220001");
		CompanyUser companyUser = new CompanyUser("apple", "1234", "애플", "apple@gmail.com", "220-81-47821");
		
		if(username.equals(personalUser.getUsername())) {
			return new CMRespDto<PersonalUser>(1, "개인회원프로필", personalUser);
		}else if(username.equals(companyUser.getUsername())) {
			return new CMRespDto<CompanyUser>(1, "기업회원프로필", companyUser);
		}else {
			return new CMRespDto<User>(-1, "프로필로드 실패", new User());
		}
	}
	
	public CMRespDto<?> login(String username, String password){ 		// ? -----> 와일드카드
		User userEntity = User.builder()
								.username("aaaa")
							  	.password("1234")
							  	.name("이건호")
						  		.email("aaaa@gmail.com") // -----> 안넣은 나머지는 자동 null처리 , 빌드는 순서 상관없음
						  		.build();
		
//		User user = new User("aaaa", "1234", null, null);  -----> null값을 넣어줘야함, 순서를 지켜야함
		
		if(userEntity.getUsername().equals(username)) {
			if(userEntity.getPassword().equals(password)) {
				return new CMRespDto<User>(1, "로그인 성공", userEntity);
			}else {
				return new CMRespDto<String>(-1, "비밀번호가 틀렸습니다.", password);
			}
		}else {
			return new CMRespDto<String>(-1, "아이디가 틀렸습니다.", username);
		}
	}

	public static void main(String[] args) {
		ControllerTest test = new ControllerTest();
		System.out.println(test.login("aaaa", "1234"));
		System.out.println(test.getProfile("apple"));
	}

}
