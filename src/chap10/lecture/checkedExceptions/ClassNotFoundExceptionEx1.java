package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("프로그램 실행1");
		try {
			System.out.println("프로그램 실행 try 1");
			Class.forName("java.lang.String");
			System.out.println("프로그램 실행 try 2");
		} catch (ClassNotFoundException e) {
			System.out.println("익셥션 발생!!!! 확인 바랍니다.");
		} finally {
			System.out.println("무조건 실행해~");
		}
		System.out.println("프로그램 실행2");
	}
}
