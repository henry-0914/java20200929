package chap18.textbook.exercises.p11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.59", 5001));
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = new Socket();
				
				InputStream is = socket.getInputStream();
				
				byte[ ] bytes = new byte[100];
				int readByteCount = -1;
				
				is.read(bytes, 0, 100);
				String fileName = new String(bytes, 0, 100, "UTF-8");
				
				fileName = fileName.trim();
				
				System.out.println("[파일 받기 시작]" + fileName);
				
				FileOutputStream fos = new FileOutputStream("이나영,jpg");
				
				while((readByteCount = is.read(bytes)) !=-1) {
					fos.write(bytes, 0, readByteCount);
				}
				
				System.out.println("[파일 받기 완료]");
				
				fos.close();
				is.close();
				socket.close();
			} catch(Exception e) {
				break;
			}
		}
		
		serverSocket.close();
		System.out.println("[서버 종료]");
	}
}
