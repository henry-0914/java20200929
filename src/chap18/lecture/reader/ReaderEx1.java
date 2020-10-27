//한글
package chap18.lecture.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;

import org.omg.CORBA.portable.InputStream;

public class ReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/reader/ReaderEx1.java";
		Reader reader = new FileReader(path);

		int ch = reader.read();
		System.out.println(ch);
		System.out.println((char) ch);
		
		
		reader.read();
		ch = reader.read();
		System.out.println((char) ch);
		
		reader.close();
		
		// inputStream 작성
		
		FileInputStream is = new FileInputStream(path);
		
		is.read();
		is.read();
		ch = is.read();
		System.out.println((char) is.read() );
		System.out.println((char) is.read() );
		System.out.println((char) is.read() );


	}

}
