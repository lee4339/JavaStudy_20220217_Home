package a09_클래스;
/**
 * Student(클래스)
 * 속성
 * schoolName
 * studentYear
 * studentGroup 
 * studentNumber
 * studentName
 * studentAddress
 * studentPhone
 * graduationFlag(boolean)
 * 
 * 기능(메소드)
 * showStudentInfo()
 * 학교명: 부산고등학교
 * 학년: 3
 * 반: 2
 * 번호: 10
 * 이름: 홍길동
 * 주소: 부산 사하구
 * 연락처: 010-0000-0000
 * 졸업구분: 재학중 [true(졸업), false(재학중)];
 * 
 * incrementYear()
 * 학년 + 1
 * 학년 3학년을 넘어서면 graduationFlag = true;
 */

public class StudentTest { //인스턴스

	public static void main(String[] args) {
		Student s1 = new Student("부산고등학교", 1, 2, 10, "홍길동", "부산 사하구", "010-0000-0000", false);
		
//		s1.schoolName = "부산고등학교";
//		s1.studentYear = 1;
//		s1.studentGroup = 2;
//		s1.studentNumber = 10;
//		s1.studentName = "홍길동";
//		s1.studentAddress = "부산 사하구";
//		s1.studentPhone = "010-0000-0000";
//		s1.graduationFlag = false;
		
		s1.increamentYeaer();
		s1.increamentYeaer();
		s1.increamentYeaer();		
		s1.showStudentInfo();
		
		
		System.out.println();
		
		Student s2 = new Student("서울고등학교", "강감찬");
		s2.showStudentInfo();
		
		

	}

}
