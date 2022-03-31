package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.print("수를 입력하세요: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println(n - i);
		}

	}

}
