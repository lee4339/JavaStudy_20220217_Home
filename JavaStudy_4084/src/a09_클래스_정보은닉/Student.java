package a09_클래스_정보은닉;

public class Student {
	 private String schoolName;
	 private int studentCode;
	 private int studentYeaer;
	 private String studentName;
	 
	 public Student() {
	
	}
	 
	public Student(String schoolName, int studentCode, int studentYeaer, String studentName) {
		super();
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.studentYeaer = studentYeaer;
		this.studentName = studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}
	public int getStudentYeaer() {
		return studentYeaer;
	}
	public void setStudentYeaer(int studentYeaer) {
		this.studentYeaer = studentYeaer;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	 
	
	public void showStudentInfo() {
		System.out.println("학교명: " + schoolName);
		System.out.println("학번: " + studentCode);
		System.out.println("학년: " + studentYeaer);
		System.out.println("이름: " + studentName);
		System.out.println();
	}
	 
}
