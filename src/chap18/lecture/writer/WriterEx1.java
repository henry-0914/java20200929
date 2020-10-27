package chap18.lecture.writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "writer.txt";
		Writer writer = new FileWriter(path);
		
		writer.write('한');
		
		char[] arr = new char[5];
		arr[0] = '자';
		arr[1] = '바';
		arr[2] = '꽉';
		arr[3] = '잡';
		arr[4] = '아';
		
		writer.write(arr);
		
		writer.write(arr, 2, 3);
		writer.write("\n이것이자바다."); // 다음줄로 할때 \n 사용
		writer.close();		
	}
}
