package a07_반복;

public class GugudanFor {

	public static void main(String[] args) {
		int dan = 2;
		for(int i = 0; i < 9; i++) {
			System.out.println(dan + " X " + (i+1) + " = " + (dan * (i+1)));
		}
		for(int i = 0; i < 9;) { // 이렇게는 잘 안씀
			System.out.println(dan + " X " + ++i + " = " + (dan * i));
		}

	}

}
