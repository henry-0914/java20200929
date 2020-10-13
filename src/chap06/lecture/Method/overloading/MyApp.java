package chap06.lecture.Method.overloading;

public class MyApp {
	public static void main(String[] args) {
		
		MyClass o1 = new MyClass();
		o1.method1();
		o1.method1(3);
		o1.method1(3.14);
	}
	
	
	//int method1(double i, int j) {
		//System.out.println("method1 double, int, return int");
		//return 3;
	}
//}
