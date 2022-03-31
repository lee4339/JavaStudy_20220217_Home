package a14_최상위클래스;

public class StringTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = computer1;
		Computer computer3 = new Computer();
		
		System.out.println(computer1 == computer2);
		System.out.println(computer1 == computer3);
		System.out.println(computer1.equals(computer3)); // 원래 equals는 주소값 비교
		
		Integer num = 10;
		int num2 = 10; 
		
		String name = "이건호";
		String name2 = "이건호";
		String name3 = new String("이건호");
		
		System.out.println(name3);
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name.equals(name3)); // --> 지금 경우는 문자열의 비교, 그렇기에 name3를 써도 true가 나옴
	}

}
