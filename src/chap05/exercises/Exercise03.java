package chap05.exercises;

public class Exercise03 {
	public static void main(String[] args) {
		
int sum = 0;
		
		int i = 3;
		
		while(i <= 100) {
			sum += i;
			i+=3;
		}
	System.out.println("3~" + (i-2) + " 합 : " + sum);
	}
}
