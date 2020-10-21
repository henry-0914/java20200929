package chap05.lecture;

public class WhilePrintFrom1To10 {
	public static void main(String[] args) {
		
		int i = 1;
		while(i <=10) {
			
			System.out.println(i);
			i++;
		System.out.println("===============");
		int j = 11;
		while(j <=20) {
			System.out.println(j);
			j++;
		}
		System.out.println("===============");
		int k = 1;
		while(k <=9) {
			System.out.println(k);
            k+=2;
		}
		System.out.println("===============");
		int l = 10;
		while(l >=1 ) {
			System.out.println(l);
			l--;
		}
		System.out.println("===============");
		int m = 10;
		while(m >=2) {
			System.out.println(m);
			m-=2;
		}
		}
	}
}
