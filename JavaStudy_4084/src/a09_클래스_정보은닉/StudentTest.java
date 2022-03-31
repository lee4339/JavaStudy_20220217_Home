package a09_클래스_정보은닉;

/*
 *Student 클래스 정의
 *속성
 *schoolName
 *studentCode(학번) 20220000
 *studentYear
 *studentName
 *
 * 
 * 생성자(기본, 전체)
 * getter, setter
 * 
 * 메소드 showStudentInfo
 * 학교명: 코리아아이티아카데미
 * 학번: 20220001
 * 학년: 1
 * 이름: 홍일동 
 * 
 * 학교명: 코리아아이티아카데미
 * 학번: 20220002
 * 학년: 3
 * 이름: 홍이동
 * 
 * 
 */

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setSchoolName("코리아아이티아카데미");
		s1.setStudentCode(20220001);
		s1.setStudentYeaer(1);
		s1.setStudentName("홍일동");
		s1.showStudentInfo();
		
		
		Student s2 = new Student("코리아아이티아카데미", 20220002, 3, "홍이동");
		s2.showStudentInfo();
		

	}

}
