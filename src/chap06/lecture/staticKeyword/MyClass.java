package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2; // 클래스 필드(스테틱 필드)
	int var1;

	static {
		System.out.println("static block");
		var2 = 3000;
	}

	void method1() {
		System.out.println(var1);
	}

	static void method2() {
		System.out.println(var2);
	}
}
