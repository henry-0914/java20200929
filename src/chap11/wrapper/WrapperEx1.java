package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		//byte, short, int, long
		//float, double, char, boolean
		
		//Byte, Shout, Integer, Long
		//Float, Double, Character, Boolean
		// 기본 타입을 참조 타입으로 변환 할 때 사용함
		
		int i = 1;
		
		Integer in = Integer.valueOf(i);
		
		method1(in);
		
		int j = 2;
		method1(j);
		
		int l = in.intValue();
		int k = in;
		
		Integer in2 = 3;
		int m = in2;
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}
}
