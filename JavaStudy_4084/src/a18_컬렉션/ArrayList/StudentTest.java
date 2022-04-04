package a18_컬렉션.ArrayList;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new ArrayList<Student>());
		
		service.showStudentAll();
		service.addStudent("하나", "aaa@gamil.com", "부산 남구");
		service.addStudent("두리", "bbb@gamil.com", "부산 연제구");
		service.addStudent("석삼", "ccc@gamil.com", "부산 사하구");
		service.showStudentAll();
		
		service.updateStudentByName("하나", "ddd@kakao.com", "부산 북구");
		service.showStudentByName("하나");
		
		service.deleteStudentbyName("두리");
		service.showStudentAll();

	}

}
