package chap06.lecture.accessModifier;

public class MyClass {
 // 접근 제한자
	// public, protected, private, (default/package private) 
	
	// public : 가장 넓은 범위, 모든 외부 클래스에서 사용가능
	// ()default : 같은 패키지 내의 외부 클래스에서 사용가능
	// private : 클래스 내에서만 사용가능(가장 좁은 범위)
	
	
	public int var1;
	int var2;
	private int var3;

	void method1() {
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}
