package chap08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {

		MyClass o1 = new MyClass();
		MyInterface i1 = o1;
		i1.method1();

		// i1.method2(); // 가지고 있긴 하나 타입으론 쓸 수 없음
		MyClass o2 = (MyClass) i1;
		o2.method2();

		System.out.println(i1 instanceof MyInterface);
		System.out.println();

	}
}
