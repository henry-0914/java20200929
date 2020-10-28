package chap18.textbook.s180603;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) throws java.net.UnknownHostException {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터 IP주소:" + local.getHostAddress());

		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for (InetAddress remote : iaArr) {
			System.out.println("www.naver.com IP 주소:" + remote.getHostAddress());
		}
	}
}
