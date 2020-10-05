package chap03.ternary;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//  a ? b : c 
		//1항 ? 2항 : 3항
		//위 연산 결과는 b 혹은 c(1항이 True면 B, 1항이 false면 C가 나옴)
		boolean a = true;
		int b = 3;
		int c = 5;
		
		System.out.println(a ?  b : c); 
	}
}
