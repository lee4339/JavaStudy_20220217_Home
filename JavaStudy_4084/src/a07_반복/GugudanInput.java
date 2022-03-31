package a07_반복;

import java.util.Scanner;

public class GugudanInput {

	public static void main(String[] args) {
		/*
		 *  1. 몇단 부터 몇단 까지 출력할것인지 입력
		 *  Start index: 5
		 *  end index: 8
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		int startIndex = 0;
		int endIndex = 0;
		
		System.out.print("Start index: ");
		startIndex = sc.nextInt();
		System.out.print("end index: ");
		endIndex = sc.nextInt();
		
		/*		
		for(int i = startIndex; i < endIndex + 1; i++) {
			System.out.println(i + "단");
			//System.out.println((i + 2) + "단");
			for(int j = 0; j < 9; ) {
				System.out.println(i + " X " + (++j) + " = " + (i *j));
			//for(int j = 0; j < 9; j++) {
				//System.out.println((i+2) + " X " + (j+1) + " = " + ((i+2) *(j+1)));
			}
			System.out.println();
		}

		}
	*/
		int i = startIndex;
		
		
		while(i < endIndex + 1) {
			System.out.println(i + "단");
			
			int j = 0;
			
			while(j < 9) {
				System.out.println(i + " X " + (++j) + " = " + (i * j));
			}
			System.out.println();
			i++;
		}
	}
}
