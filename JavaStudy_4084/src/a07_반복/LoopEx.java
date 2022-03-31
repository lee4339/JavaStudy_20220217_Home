package a07_반복;

public class LoopEx {

	public static void main(String[] args) {
		int num = 0;
		int result = 0 ;
		
		while(num < 100) {
			result += (++num); // 바로 증가시키는 경우에만 선 증가 사용
			
			
		}
		System.out.println(result);
		
		int i = 0 ;
		
		while(i < 100) { // for문보다 조금 자유로움, 조건 수식 변경 가능
			System.out.println(i);
			
			i++; 
		}
		
		System.out.println("-----------------------------------------");
		
		
		for(int j = 0; j < 100; j++) { // 정해진 규칙이 있음, 1씩 증가하는 경우같은 경우 사용
			System.out.println(j);
		}
		
		int k = 0;
		for(; k < 100;) {
			System.out.println(k);
			k++;
		}
	}
	// 변수에는 지역 : 그 문장안에서만 사용가능		-->		for문(동일 변수를 사용 가능) - 전역에 설정된 변수는 또 사용 못함/
	//																						for문내의 사용한 변수는 다른 for문에서도 사용가능
	// 			전역 : 전 문장구간에서 사용가능		-->		while문(변수를 겹쳐 못씀)

}
