package a06_조건;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 2;
		
		switch(select) { //셀렉한 해당 케이스부터 쭉 실행함.
			case 1 :
				System.out.println("1을 선택하셨습니다."); 
				break;
			case 2 : 
				System.out.println("2를 선택하셨습니다.");
				break;
			case 3 : 
				System.out.println("3을 선택하셨습니다.");
				break;
			default : 
				System.out.println("해당 case는 없습니다.");
		}
		
		String select2 = "이건호"; // case 뒤에는 셀렉에 들어간 자료형이 들어가야함(정수형, 문자열......)
		
		switch(select2) {
			case "이건호" :
				System.out.println("선택하신 이름은 이건호입니다.");
				break; // 넘어가지 않고 스위치문을 빠져나옴
			case "삼건호" :
				System.out.println("선택하신 이름은 삼건호입니다.");
				break;
			case "사건호" :
				System.out.println("선택하신 이름은 사건호입니다.");
				break;
		}
		
		int num = 0;
//		if(num == 0) {
//			System.out.println("0입니다.");
//		}else {
			switch(num == 0 ? 2 : num % 2 ) {
			case 0 : 
				System.out.println("짝수입니다.");
				break;
			case 1 : 
				System.out.println("홀수입니다.");
				break;
			default : 
				System.out.println("num이 0입니다.");
			}
		}
				

	}


