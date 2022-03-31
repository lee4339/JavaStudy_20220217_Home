package a05_입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		String name = "이건호";
		Scanner in = new Scanner(System.in);
		//String str = in.next(); // String 반환
		String str = in.nextLine();
		// next는 엔터나 스페이스를 만나면 입력이 멈춰진다. 띄워쓰기를 포함하기위해서는 nextLine을 사용
		System.out.println(str);
//		int studentCode = in.nextInt(); // int 반환
//		System.out.println(studentCode + 10);
//		System.out.println();

	}

}
