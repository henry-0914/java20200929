package chap14.lecture.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		MyInterface o1 = () -> {
			System.out.println("Hello");
			System.out.println("World");
		};
	
		MyInterface o2 = () -> System.out.println("Java");
		MyInterface o3 = () -> System.out.println("Bava");
		
		o1.method();
		o2.method();
		o3.method();
		
		}
		
}