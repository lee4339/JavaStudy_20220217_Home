package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String, Student>());
		
		service.showStudentAll();
		service.addStudent("일번이", "aaa@gamil.com", "부산 남구");
		service.addStudent("이번이", "bbb@gamil.com", "부산 연제구");
		service.addStudent("삼번이", "ccc@gamil.com", "부산 사하구");
		service.showStudentAll();
		
		service.updateStudentByName("일번이", "ddd@kakao.com", "부산 북구");
		service.showStudentByName("일번이");
		
		service.deleteStudentbyName("이번이");
		service.showStudentAll();

	}

}
