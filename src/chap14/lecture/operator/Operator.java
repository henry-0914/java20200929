package chap14.lecture.operator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Operator {
	public static void main(String[] args) {
		UnaryOperator<Integer> op1 = x -> x * x;
		int r = op1.apply(3);
		System.out.println(r);
		
		BinaryOperator<Integer> op2 = (x, y) -> x + y;
		System.out.println(op2.apply(10, 20));
	}
}
