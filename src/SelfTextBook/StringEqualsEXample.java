package SelfTextBook;

public class StringEqualsEXample {
	public static void main(String[] args) {
		
		String strVar1 = "김영한";
		String strVar2 = "김영한";
		String strVar3 = new String("김영한");
		
	    System.out.println( strVar1 == strVar2);
	    System.out.println( strVar1 == strVar3);
	    System.out.println();
	    System.out.println( strVar1 .equals(strVar2));
	    System.out.println( strVar1 .equals(strVar3));
	}
}
