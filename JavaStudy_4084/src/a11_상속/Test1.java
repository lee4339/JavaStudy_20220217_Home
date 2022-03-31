package a11_상속;

public class Test1 extends Test {

	public Test1() {
		//super(); // 이게 생략되어 있음 --> 부모생성자 호출
		super("a");
		System.out.println("자식1번 클래스 생성");
	}
}
