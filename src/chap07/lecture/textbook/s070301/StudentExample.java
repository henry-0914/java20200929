package chap07.lecture.textbook.s070301;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234564", 1);
		System.out.println("name:" + student.name);
		System.out.println("ssn :" + student.ssn);

		System.out.println("studentNo:" + student.studentNo);
	}
}
