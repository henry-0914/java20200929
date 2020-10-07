package chap05.textbook;

public class RorPrintFrom1To10Example {
	public static void main(String[] args) {
		
		
		// 실행순서
		//1 -> 2 ->  code -> 3 -> 2
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
		}
	
	// 11-20까지 출력
		//1-9까지 홀수만
		// 10-1까지 출력
        // 10-2까지 짝수만	
		
		for(int k = 11; k <=20; k++) {
			System.out.println(k);
		}
		
	    for(int l = 1; l <=9; l = l+2) { //i+=2
	    	System.out.println(l);
	    }
	    
	    for(int m = 10; m >=1; m--) {
	    	System.out.println(m);
	    }
	
        for(int n = 10; n>=2; n = n-2) { //n-=2
        	System.out.println(n);
        }
	}
	
}
