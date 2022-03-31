package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번 : 20220001					-> studentCode(정수)
		 * 이름 : 이건호					-> name1, name2, name3(문자)	
		 * 학년 : 1							-> studentYear(정수)
		 * 성적 : 85.5						-> score(실수)
		 * 평점 : B							-> grade(문자)
		 * 성별 : 남성(true), 여성(false)	-> gender(boolean)
		 */
		int num = 10;
		System.out.println(num);
		System.out.println();
		
		int studentCode = 20220001;
		char name1 = '이';
		char name2 = '건';
		char name3 = '호';
		int studentYear = 1;
		double score = 85.5;
		char grade = 'B';
		boolean gender = true;
		
		System.out.print("학번 : ");
		System.out.println(studentCode);
		System.out.print("이름 : ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.print("학번 : ");
		System.out.println(studentYear);
		System.out.print("성적 : ");
		System.out.println(score);
		System.out.print("평점 : ");
		System.out.println(grade);
		System.out.print("성별 : ");
		System.out.println(gender);
		
		System.out.println();
		
		//간소화
		System.out.println("학번 : " + studentCode);
		System.out.println("이름 : " + name1 + name2 + name3);
		System.out.println(name1 + name2 + name3); 
		// '이', '건', '호'는 기본값이 유니코드값(숫자)이기에 3개가 더해짐(+연산자는 숫자에 사용) / 묵시적 형변환이 일어남
		// 모든 자료형은 문자열에 업캐스팅됨 그렇기에 앞에 비어있는 문자열을 넣어줌
		System.out.println(""+ name1 + name2 + name3);
		System.out.println(score + 5); // 5는 업캐스팅되서 5.0로 더해진거임
		

	}

}
