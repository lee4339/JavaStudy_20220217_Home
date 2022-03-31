package a07_반복;

public class ContinueEx {
	
	/*
	 * continue -> 계속하다
	 */

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i != 0 && i % 2 == 0) {
				continue; 
				// 조건이 참이면은 밑으로 안가고 다시 i++로 감 : 결론 원래 참인 것을 출력해야하지만 continue가 옴으로 거짓인게 출력됨?
				// 원래 continue가 없을 시 0 1 2 3 4가 출력 continue가 있을시 참인 조건에서는 바로 다시 i++로 반복 그래서 출력되는건 0 1 3
			}
			if(i == 3) {
				break; // 명령을 아예 멈춰버림
			}
			System.out.println(i);
		}

	}

}
