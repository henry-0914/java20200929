package SelfTextBook;

public class MethodExample {
	public static void main(String[] args) {// void는 실행형 메스드
//		String a = "Hello";
//		String b = "닥터 헨리";
//		System.out.println(a + b);
		
		MethodExample methodExample = new MethodExample();
		methodExample.StrCombine("a:Hello", "b: 닥터 헨리");
		
		System.out.println(methodExample.StrDrhenry("a:hello", "b: 닥터헨리"));
	}
	
	public void StrCombine(String a, String b) {
		String result = a + b;
		System.out.println(result);
	}
	
	public String StrDrhenry(String k, String u) {
		String result = k + u;
		return result;
		
	}
}
