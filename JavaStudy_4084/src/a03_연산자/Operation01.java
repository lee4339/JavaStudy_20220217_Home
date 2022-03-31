package a03_연산자;

public class Operation01 {

	public static void main(String[] args) {
		//증(가)감(소) 연산자
		int score = 10;
		//score = score + 1; 
		// 앞이나 뒤에 ++, --(1씩 더하고 빼짐) / 앞은 선증가(감소) 뒤는 후증가(감소)
		System.out.println(score--); // 선증가(감소)는 바로 +-1, 후증가(감소)는 그 다음 score에 +-1
		System.out.println(score);
		System.out.println(score++);
		System.out.println(score);
		
		

	}

}
