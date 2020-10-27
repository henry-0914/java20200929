package chap18.lecture.filterstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception{
		String path = "src/chap18/lecture/filterstream/BufferedReaderEx1.java"; // 윈도우 스타일 "\\"로 변경가능
		FileReader fr = new FileReader(path);
		
		BufferedReader br = new BufferedReader(fr);
	
		String  line = br.readLine();
		System.out.println(line); // 한줄씩 읽고 싶을때 사용
		
		br.close();
		fr.close();
	}
} 
