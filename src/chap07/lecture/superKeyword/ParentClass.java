package chap07.lecture.superKeyword;

public class ParentClass {
	@Override
	void method1() {
		super.method1();
		System.out.println("child method1");
	}
}
