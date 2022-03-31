package a14_최상위클래스;

import java.util.Objects;

public class Student {
	private int studentYear;
	private int studentGroup;
	private int studentNumber;
	private String name;

	public Student(int studentYear, int studentGroup, int studentNumber, String name) {
		super();
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.name = name;
	}

	/*
	 * 물리적 주소: 실질적으로 메모리에 저장되는 실질적인 주소(우리가 직접 못 만든다.)
	 * 논리적 주소: 수학적 계산, 문법을 가지고 우리가 만들어낸 주소 
	 * 
	 * Object클래스에 정의되어있는 hashCode() 메소드는 물리적 주소값을 리턴하는 기능.
	 * hashCode() 메소드를 재정의(Override)한다는 것은 '논리적 주소를 만들겠다'는 의미이다.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(name, studentGroup, studentNumber, studentYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentGroup == other.studentGroup
				&& studentNumber == other.studentNumber && studentYear == other.studentYear;
	}

	@Override
	public String toString() {
		return "Student [studentYear=" + studentYear + ", studentGruop=" + studentGroup + ", studentNumber="
				+ studentNumber + ", name=" + name + "]";
	}





}
