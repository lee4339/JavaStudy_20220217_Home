package a08_함수;

public class FunctionEx { 
// 클래스 안에 만들어둔 함수를 메소드라고 부름.(자바는 클래스자체 파일이기(클래스 로딩방식)에 함수라는 개념 x -> 메소드)
// 다른 언어는 클래스가 없는 경우 클래스가 있는 경우도 있어서 일반함수(독립된 함수)와 메소드(클래스안에) 둘다 존재
	
	public static int calc(int x, int y, int z) { 
		// return : 결과 반환  -> int : 리턴되는 값이 (int : 자료형)이다. calc : 함수이름 calc(변수들)
		int result = x + y; 
		int result2 = result * z;
		return result2;
		
	}

	public static void main(String[] args) {
		
		System.out.println(calc(10, 20, 30));
		System.out.println(calc(11, 20, 30));
		System.out.println(calc(12, 20, 30));
		System.out.println(calc(13, 20, 30));
		System.out.println(calc(14, 20, 30));
		System.out.println(calc(15, 20, 30));
		
		
		/*
		int result = 10 + 20; 
		int result2 = result * 10;
		System.out.println(result2);
		
		result = 30 + 5;
		result2 = result * 5;
		System.out.println(result2);
		*/

	}

}
