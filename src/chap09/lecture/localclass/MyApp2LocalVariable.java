package chap09.lecture.localclass;

public class MyApp2LocalVariable {
	public static void main(String[] args) {
	 int i = 1; // final만 가능
		class LocalClass {
			void method1() {
				System.out.println(i);
				System.out.println(args);
			//	i += 1; //지역변수의 값을 바꿀 수 없다.
			}
		}
	//	args = new String[3]
	//	i += 1;
	}
}
