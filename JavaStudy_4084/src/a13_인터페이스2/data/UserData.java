package a13_인터페이스2.data;

import a13_인터페이스2.model.User;
import lombok.Data;


@Data

public class UserData {
	private static UserData instance;
	private User[] users;
	
	public UserData(User[] users) {
		this.users = users;
	}
	
	public static UserData getInstnace(User[] users) { // 배열 채우기용
		if(instance == null) {
			instance = new UserData(users);
		}
		return instance;
	}
	
	public static UserData getInstance() { // 오버로드 가져다 쓰기용
		return instance;
	}
	
	public void showUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				continue;
			}
			System.out.println(users[i]);
		}
	}
}
