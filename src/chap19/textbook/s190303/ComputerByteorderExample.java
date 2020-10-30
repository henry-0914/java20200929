package chap19.textbook.s190303;

import java.nio.ByteOrder;

public class ComputerByteorderExample {
	public static void main(String[] args) {
		System.out.println("운영체제 종류 :" + System.getProperty("os.name"));
		System.out.println("네이티브 바이트 순서 : " + ByteOrder.nativeOrder());
	}
}
