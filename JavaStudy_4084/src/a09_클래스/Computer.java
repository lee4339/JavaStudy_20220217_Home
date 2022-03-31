package a09_클래스;

public class Computer {
	String model; // 변수
	
	public Computer() { // 생성자
		// 생성자의 리턴값은 생략되어 있다 --> 생성자의 return 값은 무조건 주소값이다.
		System.out.println("컴퓨터 객체를 생성합니다.");
	}
	
	public void printInfo() { // 메소드
		System.out.println("컴퓨터 모델: " + model);
	}
}
