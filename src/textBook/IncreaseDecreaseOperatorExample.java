package textBook;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("___________________");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("___________________");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("___________________");
		z = x++;
		
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("___________________");
		z = ++x;
		
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("___________________");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}
}
