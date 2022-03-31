package a01_HelloJava; // ;(세미클론)은 명령의 끝을 말한다.

// :  주석 및 실행에서 제외시키기 위해 사용

/**
 * 
 * 여러줄 주석(클래스 또는 메소드를 설명하는 주석)
 *
 */

/*
 * 
 * 여러줄 주석(여러줄 메모용)
 * 
 */

// 한줄 주석

// 주석의 단축키 Ctrl + /

// fonts - D2Coding 장점 : 간격일정, l. 1. I. |(구별 가능)

public class HelloJava { // 클래스의 시작 문자는 대문자(약속)
	
	/**
	 * 
	 *  프로그램의 시작지점
	 * 
	 */

	public static void main(String[] args) { // 앞에 빈 공간을 들여쓰기 - TAB을 통해 사용
		// main 프로그램 실행부분
		// '문자' => 'ㅁ'
		// "문자열" => "ㅁㅁㅁㅁㅁㅁ" hello, java
		// 프로그램 실행(Run) 단축키 : Ctrl + F11
		// 클래스 저장 : Ctrl + s
		
		System.out.print("hello, java"); // -ln 이나 \n이 줄바꿈 역활
		System.out.println("이건호\n"); // -ln(line의 약자)
		System.out.println(); // 한줄 띄울때 \n 이나 ()
		
		/*
		 * 이름 : 이건호
		 * 연락처 : 010-0000-0000
		 * 주소 : 부산광역시 사하구
		 * 
		 */
		System.out.print("이름 : ");
		System.out.println("이건호");
		System.out.print("연락처 : ");
		System.out.println("010-0000-0000");
		System.out.print("주소 : ");
		System.out.println("부산광역시 사하구");
		

	}

}
