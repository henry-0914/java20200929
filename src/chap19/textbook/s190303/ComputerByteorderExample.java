package chap19.textbook.s190303;

import java.nio.ByteOrder;

public class ComputerByteorderExample {
	public static void main(String[] args) {
		System.out.println("�ü�� ���� :" + System.getProperty("os.name"));
		System.out.println("����Ƽ�� ����Ʈ ���� : " + ByteOrder.nativeOrder());
	}
}
