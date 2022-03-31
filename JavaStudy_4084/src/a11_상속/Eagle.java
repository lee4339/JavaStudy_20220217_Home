package a11_상속;

public class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다."); 
	}
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘로 날아 올라갑니다.");
	}
	
	/*
	@Override//어노테이션
	public void move() {
		super.move(); //super: 부모의 주소
	} //원래 상속을 하게 된다면 생략되어 있다고 보면됨.
	*/
	/*
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	*/
}
