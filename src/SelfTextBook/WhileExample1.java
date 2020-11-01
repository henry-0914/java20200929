package SelfTextBook;

import java.util.Scanner;

public class WhileExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //엔터로 값을 창에 입력(3을 써봐)
		int i = sc.nextInt();
		while (i <= 10) {
			System.out.println(i);
			i++; // 1씩 증가함
		}

		System.out.println("프로그램 종료");
	}
}
