package chap14.lecture.operator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class OperatorEx2 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		
		Supplier<Double> sup = () -> Math.random();
		
		while(list.size () < 10 ) {
			list.add(sup.get());
		}
		
		System.out.println("=========== 값 확인");
		list.forEach(e -> System.out.println(e));
		
		list.replaceAll(x -> x * 2); // 각 엘리먼트를 연산하여 값을 바꾸는 기능
		
		System.out.println("=========== 값 확인");
		list.forEach(e -> System.out.println(e));
		
	}
}
