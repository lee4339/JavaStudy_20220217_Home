package a08_함수;

import java.util.Scanner;

public class MethodEx2 {
	/*
	 * num = 숫자 입력
	 * 홀수면 홀수 입니다. 출력
	 * 짝수면 짝수 입니다. 출력
	 * 0이면 0입니다. 출력
	 * printOddAndEven
	 */
	public static void printOddAndEven(int num) {
		if(num == 0) {
			System.out.println("0입니다.");
		}else if(num % 2 == 0) {
				System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		System.out.print("숫자를 입력해주세요: ");
		number = sc.nextInt();
		
		printOddAndEven(number);
		
		

	}

}
