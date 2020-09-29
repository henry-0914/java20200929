package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8개
		
		// 1byte    2byte    4byte   8byte
		// boolean  char
		//byte      short     int     long    
		//                   float    double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		// 자동 타입(형) 변환 
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		// 강제 타입(형)  변환
		longValue = 3333;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		
		
		
	}
}
