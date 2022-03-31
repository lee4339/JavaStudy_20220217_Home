package a10_배열;

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[0] = new Student("고양일", 1);
		students[1] = new Student("고양이", 4);
		students[2] = new Student("고양삼", 3);
		students[3] = new Student("고양사", 1);
		students[4] = new Student("고양오", 2);

		/*
		 * 1학년: 2명(고양일, 고양사)
		 * 2학년: 1명(고양오)
		 * 3학년: 1명(고양삼)
		 * 4학년: 1명(고양이)
		 * 
		 */
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;

		String n1 = null;
		String n2 = null;
		String n3 = null;
		String n4 = null;

		for(int i = 0; i < students.length; i++) {
			if(students[i].getStudentYear() == 4) {
				c4++;
				if(n4 == null) {
					n4 = students[i].getStudentName();
				}else {
					n4 += ", " + students[i].getStudentName();
				}
			}else if(students[i].getStudentYear() == 3) {
				c3++;
				if(n3 == null) {
					n3 = students[i].getStudentName();
				}else {
					n3 += ", " + students[i].getStudentName() + ", ";
				}
			}else if(students[i].getStudentYear() == 2) {
				c2++;
				if(n2 == null) {
					n2 = students[i].getStudentName();
				}else {
					n2 += ", " + students[i].getStudentName() + ", ";
				}
			}else {
				c1++;
				if(n1 == null) {
					n1 = students[i].getStudentName();
				}else {
					n1 += ", " + students[i].getStudentName();
				}
			}
		}
		System.out.println("1학년: " + c1 + "명(" + n1 + ")");
		System.out.println("2학년: " + c2 + "명(" + n2 + ")");
		System.out.println("3학년: " + c3 + "명(" + n3 + ")");
		System.out.println("4학년: " + c4 + "명(" + n4 + ")");
		// 1시간 38분 58초 부근

		/*			int c = students[i].getStudentYear();
			if(c == 1) {
				c1++;
			}else if(c == 2) {
				c2++;
			}else if(c == 3) {
				c3++;
			}else if(c == 4) {
				c4++;
			}
		}
		System.out.println("1학년: " + c1 + "명");
		System.out.println("2학년: " + c2 + "명");
		System.out.println("3학년: " + c3 + "명");
		System.out.println("4학년: " + c4 + "명");
		 */
	}

}
