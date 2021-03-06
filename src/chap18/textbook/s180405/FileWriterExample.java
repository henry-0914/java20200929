package chap18.textbook.s180405;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("file txt");
		FileWriter fw = new FileWriter(file, true);

		fw.write("FileWriter는 한글로 된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n"); //윈도우 타입의 새로운 줄 표시

		fw.flush();
		fw.close();
		System.out.println("파일에 저장했지롱!!!");
	}
}
