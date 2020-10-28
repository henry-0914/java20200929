package chap18.textbook.s180702;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.41", 5001));
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getLocalSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				
			}
		} catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();  // 기다리면 서버, 연결시도하면 클라이언트
			} catch (IOException e1) {}
		}
	}
}
