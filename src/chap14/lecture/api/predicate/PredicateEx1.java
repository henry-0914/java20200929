package chap14.lecture.api.predicate;

import java.util.function.Predicate;

public class PredicateEx1 {
	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x % 2 ==0; // 짝수인지 확인하는 것
		Predicate<Integer> isOdd = x -> x % 2 ==1; // 홀수 인지 확인하는 것
		boolean b = isEven.test(55);
		System.out.println(b);
		System.out.println(isOdd.test(33));
	}
}
