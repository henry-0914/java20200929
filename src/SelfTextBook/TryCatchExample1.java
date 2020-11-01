package SelfTextBook;

public class TryCatchExample1 {
	public static void main(String[] args) {
		int intArray[] = new int[5]; // 5만큼 공간을 만들어라(0,1,2,3,4,5)
		try {
			intArray[3] = 10;
			intArray[6] = 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("배열 범위 초과");
			System.exit(0); // 강제 프로그램 종료됨(밑 구문이 실행되지 않음)
		}

		System.out.println("프로그램 종료");
	}
}
