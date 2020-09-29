package chap02.type;

public class ByteType {
 public static void main(String[] args) {
	//byte : 정수형
	 // 크기 : 1byte(8bit)8개 0과 1 자리수
	 // -128  1000 0000(min)
	 // -2 :  1111 1110
	 // -1 :  1111 1111
	 // 0 :   0000 0000
	 // 1 :   0000 0001
	 // 2 :   0000 0010
	 // 127 : 0111 1111(max)
	 
	 byte byteValue;
	 byteValue = 0;
	 System.out.println(byteValue);
	 
	 byteValue = 127;
	 System.out.println(byteValue);
	 
	 
 }
}
