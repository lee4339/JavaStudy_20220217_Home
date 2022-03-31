package a08_함수;

public class MethodEx1 {
	
	public static int outputNumber() {
		return 10;
	}
	
	public static void showName() {
		String name = "이건호";
		System.out.println("이름: " + name);
	}
	public static int outputNumber2(int number) {
		// int number = 100; 삽입
		return number;
	}
	public static int outputNumber3(int number) {
		if(number % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void showName2(String name) {
		if(name == null) {
			return; // 함수의 기능을 여기에서 멈춤
		}
		System.out.println(name); // 출력안됨
	}

	public static void main(String[] args) { // void는 return x
		int number = outputNumber();
		System.out.println(number);
		showName(); // void일시 값으로 넣지는 못함
//		if(number == 10) {
//			return; // 여기 이후 실행이 멈춤
//		}
		showName2(null);
		int number2 = outputNumber2(100);
		System.out.println(number2);

	}

}
