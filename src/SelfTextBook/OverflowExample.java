package SelfTextBook;

public class OverflowExample {
	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		// long 타입으로 변경 해야 됨(4byte 초과됨)
		System.out.println(z);
		
	}
}
