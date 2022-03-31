package a09_클래스;

public class Student {
	//속성, 레퍼런스변수, 필드
	 String schoolName;
	 int studentYear;
	 int studentGroup; 
	 int studentNumber;
	 String studentName;
	 String studentAddress;
	 String studentPhone;
	 boolean graduationFlag;
	 
	 public Student() { // 기본 생성자 - 주소
		 System.out.println("기본생성자 호출");
		 
	}
	 
	 public Student(String schoolName, int studentYear, int studentGroup, int studentNumber, String studentName,
			String studentAddress, String studentPhone, boolean graduationFlag) {
		this(); // 자기자신의 주소
		this.schoolName = schoolName; // 자기자신의 대한 주소 this
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhone = studentPhone;
		this.graduationFlag = graduationFlag;
	}
	 public Student(String schoolName, String studentName) {
		 this.schoolName = schoolName;
		 this.studentName = studentName;
	 }


	public void showStudentInfo() {
		 System.out.println("학교명: " + schoolName);
		 System.out.println("학년: " + studentYear);
		 System.out.println("반: " + studentGroup);
		 System.out.println("번호: " + studentNumber);
		 System.out.println("이름: " + studentName);
		 System.out.println("주소: " + studentAddress);
		 System.out.println("연락처: " + studentPhone);
		 System.out.println("졸업구분: " + (graduationFlag == true ? "졸업" : "재학중"));
	 }
	 public void increamentYeaer() {
		 if(studentYear > 2 && graduationFlag == false) {
			 graduationFlag = true;
		 }else {
			 studentYear++;
		 }
	 }
}
