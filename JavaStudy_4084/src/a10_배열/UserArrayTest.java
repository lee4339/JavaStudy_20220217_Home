package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5]; // 유저클래스로 생성한 주소값만 들어감
		
		users[0] = new User("aaaa", "1234");
		users[1] = new User("aaaa2", "12345");
		users[2] = new User("aaaa3", "12346");
		users[3] = new User("aaaa4", "12347");
		users[4] = new User("aaaa5", "12348");
		
		
		for(int i = 0; i < users.length; i++) {
			/*
			if(users[i] != null) {
			users[i].showInfo(); // 참조할 주소값이 없으면 오류가 뜸
			}
			*/
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}
		System.out.println("==========================================");
		
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
