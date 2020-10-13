package chap06.lecture.Method;

public class MyClassReturn {
	int var1;

	void method1() {
		System.out.println("메소드 1 실행");
	}

	int method2() {
		System.out.println("메소드 2 실행");
		return var1 * 2;

		// return : 메소드 종료, 오른쪽에 있는 값을 호출한 곳으로 돌려줌
		//
	}

}
