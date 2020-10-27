package chap18.lecture.filterstream;

import java.io.FileInputStream;


public class BufferedInputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "이나영.jpg";
		FileInputStream fis = new FileInputStream(path);
		
		
		while(fis.read() !=-1) {
			
		}
		long end = System.currentTimeMillis();
		long start = System.currentTimeMillis();
		System.out.println("총 읽는 시간" + (end-start ) + "ms");
		fis.close();
				
	}
}
