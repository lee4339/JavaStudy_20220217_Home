package a05_입력;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		/**
		 * username(아이디)
		 * password(비밀번호)
		 * year(년도)
		 * month(월)
		 * day(일)
		 * name(이름)
		 * address(주소) 부산 사하구
		 */
		Scanner sc = new Scanner(System.in);
		//1. import 단축키 Ctrl + Shift + o
		//2. Scann입력 후 Ctrl + Space(자동완성)을 통해 import 연결
		//3. 마우스를 이용한 방법
		String username = null;
		String password = null;
		int year = 0;
		int month = 0;
		int day = 0;
		String name = null;
		String address = null;
		
		System.out.print("아이디를 입력해주세요 : ");
		username = sc.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		password = sc.next();
		System.out.print("년도를 입력해주세요 : ");
		year = sc.nextInt();
		System.out.print("월을 입력해주세요 : ");
		month = sc.nextInt();
		System.out.print("일을 입력해주세요 : ");
		day = sc.nextInt();
		System.out.print("이름을 입력해주세요 : ");
		name = sc.next(); 
		// 마지막 엔터나 스페이스가 버퍼에 남아있는 상태에서 엔터와 스페이스를 사용할 수 있는 nextLine 만남으로 공백이 생겨버림
		sc.nextLine(); //위에 next의 버퍼를 공백으로 소모
		// 버퍼를 사용하는 이유 : 끊기지 않고 재생하기위해
		System.out.print("주소를 입력해주세요 : ");
		address = sc.nextLine();
		
		System.out.println(); // Ctrl + Alt + 위, 아래 현문장 복사
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("생년월일 : " + year + "년 "+ month + "월 " + day + "일");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		

	}

}
