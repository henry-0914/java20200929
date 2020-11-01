package SelfTextBook;

public class ForExample1 {
	public static void main(String[] args) {
		String str[] = {"하나", "둘", "셋"};
		System.out.println(str);
		for (int i = 0; i < 3; i++) {
			System.out.println("닥터 헨리");
		}
		System.out.println("프로그램 종료");
		
		for(int i = 0; i<str.length; i++) {
			System.out.println("진짜?");
		}
	}
}
