package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		
		//논리연산자
		//&&, & and : 양변이 true 일 때만 true
		//||, |  or : 양변이 false일 때만 false
		//^ xor (exclusive or 배타적 논리합) : 값이 다를 때면 true
		
		System.out.println("======= xor =======");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("======= or =======");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("======= and =======");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
	}
}
